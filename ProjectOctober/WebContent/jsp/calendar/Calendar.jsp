<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar Page</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/cupertino/jquery-ui.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/fullcalendar.css" />
<link href="https://gitcdn.github.io/bootstrap-toggle/2.2.0/css/bootstrap-toggle.min.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/calendar/FontTest.css"/>

<style>
	* {font-family: 'Spoqa Han Sans', 'Spoqa Han Sans JP', 'Sans-serif'; }
</style>

<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/fullcalendar.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lang-all.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/listview.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.0/js/bootstrap-toggle.min.js"></script>


<script>
	var enterpriseInfo = {};
	$(function(){
		
		//--------------삭제시, event 객체 드래그 할 때 좌표 읽는 데 사용 -------------//
		
		var currentMousePos = {x: -1, y: -1};
		
		$(document).mousemove(function (event) {
			currentMousePos.x = event.pageX;
		 	currentMousePos.y = event.pageY;
		});
		
		//----------------------datepicker 활성화. 사용할 수도 있고 안 할 수도 있음.-------------------------//
		
		$('.datepickers').datepicker();
		
		//-----------------------사전에 정보 불러오기 : Enterprise 정보 --------------------------------//
		
		
		enterpriseInfo = $.ajax({
			url: '${pageContext.request.contextPath}/enterprise/retrieveEnterpriseInfoForCalendar.action',
			type: 'POST',
			data: {"etpNum":${etpNum}},
			async: false,
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
			success: function retrieveEnt(data){
				enterpriseInfo = data.enterprise;

			},error: function(){
				console.log('retrieveEnterpriseInfoForCalendar failed!');
			}
		});
		
		console.log(enterpriseInfo.responseJSON.enterprise.workingDays.dow);
		
		//업체 영업 시작 시간 설정
		var startTT = enterpriseInfo.responseJSON.enterprise.start;
		//업체 영업 끝 시간 설정
		var endTT = enterpriseInfo.responseJSON.enterprise.end;
		//업체 휴무일 설정
		var dowTT = enterpriseInfo.responseJSON.enterprise.workingDays.dow;
		
		//----------------------------------Full Calendar 시작.------------------------------------//
		
		//TODO: session 검사해서, 사업자 일때랑, 일반 이용자일 때, 그리고 아무것도 안 했을 때 구분.
		
		var calendar = $('#calendar').fullCalendar({
			header: {
				left:'prev,next today',
				center: 'title',
				right: 'month, agendaWeek, agendaDay,list'
			},
			
			lang: 'ko',
			theme: true,
			defaultView : 'agendaWeek',
			selectable: true,
			selectHelper: true,
			scrollTime: '09:00:00',	
			minTime: startTT,
			maxTime: endTT,
			businessHours : {
				start: startTT,
				end: endTT,
				dow: dowTT,
			},
			
			//----------------- 기존 존재하는 이벤트 클릭 시 -----------------------//
			
			eventClick: function(event, jsEvent, view){
				$("#updateReservationShowBtn").unbind();
				$(this).attr('href', 'javascript:void(0);');
				$("#reservationUpdateBody").hide();
		        
				//---------------------각 예약당 회원 정보  가지고 오기 ----------------//
				$(this).click(function(index){
		        	$.ajax({
	        			url: '${pageContext.request.contextPath}/member/retrieveCustomerInfoPerReservation.action',
	        			dataType: 'json',
	        			async: false,
	        			data: {"cstEmail": event.cstEmail,
	        					"rsvNum": event.id
	        				},
	        			success: function(data){
							event.cstPhone = data.member.memPhone;
							event.cstAddress = data.member.customer.cstAddress;
							event.cstZipcode = data.member.customer.cstZipcode;
							event.cstOneclick = data.member.customer.cstOneclick;
							event.cstGender = data.member.customer.cstGender;
							event.cstName = data.member.memName;
	        			},
	        			error: function(){
	        				console.log("receive service list error");
	        			}
	        		});
		        	
		        	//--------------- 업체 당 변경 가능한 서비스 리스트 가져오기 --------------//
		        	
		        	$.ajax({
	        			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
	        			dataType: 'json',
	        			data: {"etpNum":${etpNum}},
	        			success: function(data){
	        				var serviceList = [];
	        				var services = data.serviceList;
	        				$("#reservationUpdateSelectService").append("<option value='' disabled selected hidden>선택하세요.</option>");
	        				$.each(services, function(i, d){
	        					$("#reservationUpdateSelectService").append("<option value='" + d.svcNum + "'>" + d.svcTitle + "</option>");
	        				});   				
	        			},
	        			error: function(){
	        				console.log("receive service list error");
	        			}
	        		});
		        	
		        	//--------------------- 받아온 값들로 기존 예약 상세내용 리스트 뿌리기 -----------------------//
		        	
		        	console.log(event);
		        	$("#updateModalTitle").html(event.title);
		        	$("#updateModalEventId").html(event.id);
		        	$("#updateModalCustomerEmail").html(event.cstEmail);
		        	$('#updateModalCustomerPhone').html(event.cstPhone);
		            $("#updateModalStartTime").html(moment(event.start).format('MMM Do A h:mm '));
		            $("#updateModalEndTime").html(moment(event.end).format('MMM Do A h:mm '));
		            $('#updateModalCustomerName').html(event.cstName);
		            $("#updateModalSvcTitle").html(event.svcTitle);
		            $('#updateModalSvcCost').html(event.svcCost + "원");
		            $("#reservationUpdateTitle").attr("value", event.title);
		            $("#reservationUpdateDescription").html(event.svcDescription);
		            $('#updateModal').modal();
		        });

				
				//----------------------변경 가능한 내용들 토글로 보이게 하기 --------------------------//
				
		        $("#updateReservationShowBtn").click(function(){
		        	var options ={};
		            $("#reservationUpdateBody").toggle("clip",options,500);
		        });
				
				//---------------------- 변경 내용 중 서비스 리스트 클릭 하면 그 값 가져가는 거 확인 하는 곳 ----------------//
		        
		        $("#reservationUpdateSelectService").change(function(){
		        	console.log($(this).val());
		        	console.log($("#reservationUpdateTitle").val());
		        });
				
				
		        //--------------------- 예약 내용 변경 신청 AJAX로 하는 기능 ---------------------------------//
     
		        $("#updateReservationBtnGo").click(function(){
		        	console.log($("#reservationUpdateDateStartTime").val());
		        	
					 var reservation = {
							"reservation.rsvNum" : event.id,
							"reservation.svcNum" : $("#reservationUpdateSelectService").val(),
							"reservation.cpnNum" : event.cpnNum,
							"reservation.etpNum" : event.etpNum,
							"reservation.etpEmail" : event.etpEmail,
							"reservation.cstEmail" : event.cstEmail,
							"reservation.rsvStatus" : event.rsvStatus,
							"reservation.rsvTitle": $("#reservationUpdateTitle").val(),
							"reservation.start" : event.start.toISOString(),
							"reservation.end" : event.end.toISOString(),
							"reservation.status" : event.status,
							"reservation.employeeGender" : event.employeeGender,
						}
					
					console.log(reservation);
					$.ajax({
						url: '${pageContext.request.contextPath}/enterprise/updateReservationDetailsByEnterprise.action',
						dataType: 'json',
						data: reservation,
						contentType: 'application/json; charset=UTF-8',
						success: function(data){
							alert('success!');
							//$('#calendar').fullCalendar('removeEvents');
							//$('#calendar').fullCalendar('addEventSource', event);
							$('#calendar').fullCalendar('refetchEvents');
							$('#updateModal').modal('hide');
						},
						error: function(){
							console.log('fail!');
						}
					});
		        });
			},
			//----------------------------------------------------------------------------------------//
			
			
			
			
			//select: 빈 칸에 눌렀을 때  
			select: function(start, end, allDay){				
				  //여기는 사용자가 입력한 값이 체인으로 등장해야 하는거지만 일단...	누르면 창 보여주기 ---------------------//	
				  //이용자 이메일 => 내가 입력. 사업자 이메일, 번호 => 가지고 있음. 쿠폰 선택가능하도록 하기.
				  //서비스 일련번호 => 서비스창 받을 때 같이 가져오기.
					
	
					$('#insertModalBody').html(str);
					$('#insertModal').modal();
					
					$('#inputEmployeeGenderCheckBox').bootstrapToggle().change(function(){
						if($(this).prop('checked')){
							$('#genderCheckField').html($(this).attr('data-on'));
						}else{
							$('#genderCheckField').html($(this).attr('data-off'));
						}
						
					});
					
					
					//------------------------------Insert 기능 시작 ----------------------------//
				
					
					// ----------------------- 약관 동의 안 하면, 못하게 하기 -------------------------//
					
					$('#insertReservationBtn').click(function(){
						if($('#insertAgreementCheckbox').prop('checked') == false){
							alert('동의해라!');
							$(this).unbind();
							return false;
							
						};
						
					//-------------------------------------------//
						
			//-------------------------------- 폼에서 받은 값 대응하는 그릇에 집어 넣기. -------------------------//
						var inputTitle = $('#inputTitle').val();
						var inputDescription = $('#inputDescription').val();
						var inputStartTime = $('#inputStartTimeHidden').val();
						var inputEndTime = $('#inputEndTimeHidden').val();
						var inputEmployeeGender = ''; 
							if($('#genderCheckField').html() == '남성') {
								$('#genderCheckField').val('m');
								inputEmployeeGender = 'm';
							}else{
								$('#genderCheckField').val('f');
								inputEmployeeGender = 'f';
							}
							console.log(inputEmployeeGender);
							console.log()
						var inputStatus = $('#inputStatus').val();
							var reservation = {};
							
			//---------------각각의 그릇을 reservation이라는 객체 안에 담기.-----------------------//
						reservation = {
								title: inputTitle,
								description: inputDescription,
								start: inputStartTime,
								end: inputEndTime,
								employeeGender: inputEmployeeGender,
								rsvStatus : inputStatus
						}
						
			//----------------------------- Form 안의 값들을 Java로 보내는 기능 --------------------------------//
						$.ajax({
							url: "${pageContext.request.contextPath}/enterprise/insertReservation.action",
							dataType: 'json',
							type: 'POST',
							data: $('#inputForm').serialize(),
							contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
							success: function(doc){
					            $('#calendar').fullCalendar('refetchEvents');
								$('#insertModal').modal('hide');
							},
							error: function(doc){
								console.log("insert Error");
							}
						});
						$(this).unbind();
					});
					
			//------------------------------ insert 마무리 작업  -----------------------------------//
					
				calendar.fullCalendar('unselect');
				$(this).unbind();
			},
			
			themeButtonIcons: {
				prev: 'circle-triangle-w',
				next: 'circle-triangle-e',
				
			},
			weekNumbers: true,
			fixedWeekCount: true,
			slotLabelFormat: 'a h(:mm)시',
			aspectRatio : 1.1,
			editable: true,
			eventLimit: true,
			timezone: 'UTC',
			selectble: false,
			selectHelper: true,
			
			//------------------------------------- 각 사업자당 예약들 불러오는 기능  -------------------------------------------//
			events: function(start, end, timezone, callback){
				$.ajax({
					url: '${pageContext.request.contextPath}/enterprise/retrieveReservations.action',
					type: 'POST',
					data: {"etpNum":${etpNum}},
					dataType: 'json',
					success: function(doc, index, value){
						var resList = doc.reservationList;
						var events = [];
						
						$(resList).each(function(index,item){
							events.push({
								id: item.rsvNum,
								start: item.start,
								end: item.end,
								title: item.rsvTitle,
								
								svcNum: item.svcNum,
								cpnNum: item.cpnNum,
								etpNum: item.etpNum,
								etpEmail: item.etpEmail,
								cstEmail: item.cstEmail,
								startDate: item.rsvStartDate,
								endDate: item.rsvEndDate,
								status: item.rsvStatus,
								employeeGender: item.employeeGender,
								
								etpOwner: item.enterprise.etpOwner,
								etpSuperclass: item.enterprise.etpSuperclass,
								etpAddress: item.enterprise.etpAddress,
								etpZipcode: item.enterprise.etpZipcode,
								etpTitle: item.enterprise.etpTitle,
								etpPhone: item.enterprise.etpPhone,
								etpMaleStaff: item.enterprise.etpMaleStaff,
								etpFemaleStaff: item.enterprise.etpFemalStaff,
								etpCapacity: item.enterprise.etpCapacity,
								etpRsvDeadline: item.enterprise.etpRsvDeadline,
								etpSelfNotification: item.enterprise.etpSelfNotification,
								etpCstNotification: item.enterprise.etpCstNotification,
								etpTemplateType: item.enterprise.etpTemplateType,
								etpSvcOfffered: item.enterprise.etpSvcOffered,
								etpSubclass: item.enterprise.etpSubclass,
								etpSpecialize: item.enterprise.specialize,
								etpDescription: item.enterprise.etpDescription,
								
								svcTitle: item.service.svcTitle,
								svcCost: item.service.svcCost,
								svcDescription: item.service.svcDescription,
								svcCategory: item.service.svcCategory,
								svcSpecialize: item.service.svcSpecialize,
								svcCount: item.service.svcCount,
								svcCode: item.service.Code,
							});
						});
						callback(events);
						$(this).unbind();
					},
					error: function(doc){
						console.log("Error");
					}
				});

			},
			eventDrop: function(event, delta, revertFunc, jsEvent, view) {
				$(this).unbind();
				if (!confirm("시간대를 변경하시겠습니까?")) {
					revertFunc();
				}else{
					var reservation = {
						"reservation.rsvNum" : event.id, 
						"reservation.rsvTitle": event.description,
						"reservation.start" : event.start.toISOString(),
						"reservation.end" : event.end.toISOString(),
					}
					
					console.log(reservation);

					$.ajax({
						url: '${pageContext.request.contextPath}/enterprise/changeReservationTime.action',
						dataType: 'json',
						data: reservation,
						contentType: 'application/json',
						success: function(data){
							alert('success!'); //이거 popup으로 변경...
							$('#calendar').fullCalendar('refetchEvents');
						},
						error: function(){
							console.log('fail!');
							$('#calendar').fullCalendar('refetchEvents');							
						}
					});
				}
				calendar.fullCalendar('unselect');
				//$('#calendar').fullCalendar('removeEvents');
				//$('#calendar').fullCalendar('addEventSource', event);
				//$('#calendar').fullCalendar('rerenderEvents');
				 
			},
			eventResize: function(event, delta, revertFunc, jsEvent, ui, view){
				$(this).unbind();
				if(! confirm("시간대를 변경하시겠습니까?")){
					revertFunc();
				}else{
					var reservation = {
							"reservation.rsvNum" : event.id, 
							"reservation.rsvTitle": event.description,
							"reservation.start" : event.start.toISOString(),
							"reservation.end" : event.end.toISOString(),
						}
					
					console.log(reservation);
					$.ajax({
						url: '${pageContext.request.contextPath}/enterprise/changeReservationTime.action',
						dataType: 'json',
						data: reservation,
						contentType: 'application/json',
						success: function(data){
							alert('success!');
							//$('#calendar').fullCalendar('removeEvents');
							//$('#calendar').fullCalendar('addEventSource', event);
							$('#calendar').fullCalendar('refetchEvents');
						},
						error: function(){
							console.log('fail!');
							
						}
					});
				}
				calendar.fullCalendar('unselect');
			},
		 	eventDragStop: function(event, jsEvent, ui, view){
				console.log(currentMousePos);
				
				var isElementOverDiv = function(){
					var trashEl = $('#trash');
					var ofs = trashEl.offset();
					console.log(ofs);
					console.log(trashEl);
				    var x1 = ofs.left;
				    var x2 = ofs.left + trashEl.outerWidth(true);
				    var y1 = ofs.top;
				    var y2 = ofs.top + trashEl.outerHeight(true);
				   	
				    if (currentMousePos.x>=x1 && currentMousePos.x<=x2 && currentMousePos.y>=y1 && currentMousePos.y<=y2) {
				    	return true;
				    }else{
						return false;
				    }
				}
				console.log(event);
				if(isElementOverDiv()){
					if(confirm('지우시겠습니까?')){
						$.ajax({
							url: '${pageContext.request.contextPath}/enterprise/deleteReservation.action',
							dataType: 'json',
							data: {"reservation.rsvNum" : event.id},
							contentType: 'application/json',
							success: function(data){
								alert('삭제되었습니다.');
								$('#calendar').fullCalendar('removeEvents');
								$('#calendar').fullCalendar('addEventSource', event);
								$('#calendar').fullCalendar('refetchEvents');
							},
							error: function(){
								console.log("deletion error");
							},
						});
						$(this).unbind();
					};
				};
				$(this).unbind();
			},	
		});
	});	
</script>

</head>
<body>
	<jsp:include page="/jsp/Header.jsp"></jsp:include>
	<h1>Calendar for testing</h1>
	<br>
	<div id='external-events'>
		<input type="hidden" id="starttt" />
		<input type="hidden" id="endtt" />
    	<div class="nav nav-tabs nav-stacked" data-spy="affix" data-offset-top="195">
      		<img src="${pageContext.request.contextPath}/image/trash-can1.jpg" id="trash" alt="쓰레기통" style="width: 100px; height: 100px;">
    	</div>
	</div>
	
	<div id='calendar' class='container'></div>
	
	<div id="insertModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span> <span class="sr-only">close</span></button>
	                <h4 id="insertModalTitle" class="modal-title"></h4>
	            </div>
		            <div id="insertModalBody" class="modal-body">
		            	<form action='test' id='inputForm' data-toggle='validator' role='form'>
		            		<table class='table table-striped table-bordered'>
							<tr>
							<div class='form-group'>
								<td><label for='inputTitle' class='control-label'>일정 제목: </label></td><td><input type='text' id='inputTitle' name='reservation.rsvTitle' required class='form-control'></td>
							</div>
					</tr>
					
				
					<div class='form-group'>
					<tr>
					<td><label for='inputDescription' class='control-label'>서비스 Description: </label></td><td><input type='text' id='inputDescription' name='reservation.service.svcDescription' required class='form-control'/><span class='glyphicon form-control-feedback' aria-hidden='true'></span>
					</tr>
					</div>
				
					<div class='form-group'>
					<tr>
					<td><label for='inputDescription' class='control-label'>서비스 시작 시간: </label></td><td><input type='text' id='inputStartTime' value='" + start.format("MM월 DD일 a hh시 mm분") + "' readonly class='form-control'/><input type='hidden' name='reservation.start' id='inputStartTimeHidden' value='" + start.toISOString() + "'/></td>
					</tr>
					</div>
					
					<div class='form-group'>
					<tr>
					<td><label for='inputDescription' class='control-label'>서비스 끝 시간: </label></td><td><input type='text' id='inputEndTime' value='" + end.format("MM월 DD일 a hh시 mm분") + "' readonly class='form-control'/><input type='hidden' name='reservation.end' id='inputEndTimeHidden' value='" + end.toISOString() + "'/></td>
					</tr>
					
					//서비스 버튼 클릭시 받아오는 값이 된다 : 서비스 비용
					<div class='form-group'>
					<tr>
					<td><label for='inputPrice' class='control-label'>결제금: </label></td><td><input type='text' id='inputPrice' name='reservation.service.svcPrice' class='form-control'/></td>
					</tr>
					</div>
					
					//성별
					<div class='form-group'>
					<tr>
					<td><label for='inputEmployeeGenderCheckBox' class='control-label'>종업원 성별: </label></td><td><input type='checkbox' checked data-toggle='toggle' data-on='여성' data-off='남성' data-onstyle='primary' data-offstyle='warning' id='inputEmployeeGenderCheckBox' class='form-control'/></td>
					</tr>
					</div>
					
					
					//약관 동의
					<div class='form-group'>
					<tr>
					<td colspan='2' align='center'><textarea rows='4' cols='50' id='insertAgreementTextArea' class='form-control'>Lorem Ipsum </textarea></td>
					</tr>
					</div>
					
					<div class='form-group'>
					<tr>
					<td align='center' colspan='2'>서비스 약관에 동의합니다.<input type='checkbox' id='insertAgreementCheckbox'/></td>
					</tr>
					</div>
					
					<input type='hidden' id='genderCheckField' name='reservation.employeeGender' value=''></p>
					<input type='hidden' id='inputStatus' name='reservation.rsvStatus' value='1'/>
					</table>
					</form>
		            	
		            	
		            	*메뉴: <span id="insertModalEventTitle"> </span><br>
		   	 			*예약 시작: <span id="insertModalStartTime"> </span><br>
		   				*예약 소요시간:<span id="insertModalDuration"> </span><br>
		   				*쿠폰 :<span id="insertModalCoupon"> </span><br>
		   				*총 결제금:<span id="insertModalPrice"> </span><br>
		   				<span id="insertModalCheckBox"></span>예약 수정/ 취소 관련 주의사항<br>
		   				<span id="insertModalTextArea"></span><br>
		   				<p id="insertModalEventInfo"></p>
		   				<hr>
		   				<br>
		            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	                <button class="btn btn-primary" id="insertReservationBtnOneClick">One-click 예약</button>
	                <button class="btn btn-info" id="insertReservationBtn">예약 결제</button>
	            </div>
	        </div>
		</div>
	</div>
	
	
	<div id="updateModal" class="modal fade">
	    <div class="modal-dialog">
	        <div class="modal-content">
	            <div class="modal-header">
	                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span> <span class="sr-only">close</span></button>
	                <h4 id="updateModalTitle" class="modal-title"></h4>
	            </div>
	            <div id="updateModalBody" class="modal-body">
	            	<table class="table table-condensed">
	            		<tr>
	            			<td><label for="updateModalEventId">예약 일련번호:</label></td>
	            			<td><span id="updateModalEventId"></span></td>
	            		</tr>
		            	<tr>
		            		<td><label for="updateModalStartTime">시작 시간:</label></td>
		            		<td><span id="updateModalStartTime"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalEndTime">종료 시간:</label></td>
		            		<td><span id="updateModalEndTime"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalCustomerEmail">회원 이메일:</label></td>
		            		<td><span id="updateModalCustomerEmail"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalCustomerName">회원 이름:</label></td>
		            		<td><p id="updateModalCustomerName"></p></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalCustomerPhone">회원 전화번호:</label></td>
		            		<td><p id="updateModalCustomerPhone"></p></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalSvcTitle">서비스 명:</label></td>
		            		<td><span id="updateModalSvcTitle"></span></td>
		            	</tr>
		            	<tr>
		            		<td><label for="updateModalSvcCost">서비스 가격:</label></td>
		            		<td><span id="updateModalSvcCost"></span></td>
		            	</tr>
		            	<tr>
		   					<td><label for="reservationUpdateDescription">서비스 상세 설명:</label>
		   					<td><span id="reservationUpdateDescription"></span></td>
		   				</tr>
		            	<!-- TODO: 여기에 HTML 에디터 넣기!!!!! -->
	   				</table>
	   				<hr>
	   				<div id="reservationUpdateField" class="form-group">
 	   					<div class="panel" id="reservationUpdateBody" >
	 	   					<table class="table table-condensed">
		   						<!-- TODO: 그 업체가 제공하는 서비스 목록을 AJAX로 받아오고, select로 뿌려주고,  -->
		   						<tr>
		   							<td><label for="reservationUpdateTitle">예약건 제목을 변경해 주세요:</label>
		   							<td><input type="text" id="reservationUpdateTitle" class="form-control"></input></td>
		   						</tr>
		   						<tr>
		   							<td><label for="reservationUpdateSelectService">변경하실 서비스를 선택해 주세요:</label></td>
		   							<td><select id="reservationUpdateSelectService" class="form-control"></select></td>
		   						</tr>
		   					</table>
	   					</div>
	   				</div>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal" id="closeReservationBtn">Close</button>
	               	<button class="btn btn-primary" id="updateReservationShowBtn">예약 정보 수정란 활성화</button>
	               	<button class="btn btn-warning" id="updateReservationBtnGo">예약 정보 수정 확인</button>
	            </div>
	        </div>
		</div>
	</div>
</body>
</html>