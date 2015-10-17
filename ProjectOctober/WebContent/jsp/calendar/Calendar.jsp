<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendar Page</title>
<link rel="stylesheet" href="fullcalendar/lib/cupertino/jquery-ui.min.css" />
<link rel="stylesheet" href="fullcalendar/fullcalendar.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link href="https://gitcdn.github.io/bootstrap-toggle/2.2.0/css/bootstrap-toggle.min.css" rel="stylesheet">

<script src="fullcalendar/lib/jquery.min.js"></script>
<script src="fullcalendar/lib/moment.min.js"></script>
<script src="fullcalendar/jquery-ui.min.js"></script>
<script src="fullcalendar/fullcalendar.min.js"></script>
<script src="fullcalendar/lang-all.js"></script>
<script src="fullcalendar/listview.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.min.js"></script>
<script src="fullcalendar/jquery.json.js"></script>
<script src="fullcalendar/json2.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.0/js/bootstrap-toggle.min.js"></script>


<script>
	$(function(){
		var currentMousePos = {x: -1, y: -1};
		
		$(document).mousemove(function (event) {
			currentMousePos.x = event.pageX;
		 	currentMousePos.y = event.pageY;
		});
		
		$('.datepickers').datepicker();
			
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
			minTime: '10:00:00',
			maxTime: '23:00:00',
			businessHours : {
				start: '11:00',
				end: '23:00',
				dow: [0,1,2,3,4,5,6,7]
			},
			
			eventClick: function(event, jsEvent, view){
				$("#updateReservationBtn").unbind();
				$(this).attr('href', 'javascript:void(0);');
		        $(this).click(function() {
		        	$("#updateModalTitle").html(event.title);
		        	$("#updateModalEventId").html(event.id);
		        	$("#updateModalCustomerEmail").html(event.customerEmail);
		            $("#updateModalStartTime").html(moment(event.start).format('MMM Do A h:mm '));
		            $("#updateModalEndTime").html(moment(event.end).format('MMM Do A h:mm '));
		            $("#updateModalEventInfo").html(event.description);
		            $('#updateModal').modal();
		        });
		        
		        $("#updateReservationBtn").click(function(){
		        	/* $('#reservationUpdateField').html("<input type='date'></input>").toggle('slow'); */
		        	$('#reservationUpdateSelectService').attr('list',function(index){
		        		$.ajax({
		        			url: '${pageContext.request.contextPath}/enterprise/receiveServiceList.action',
		        			dataType: 'json',
		        			type: 'GET',
		        			success: function(data){
		        				var serviceList = [];
		        				var services = data.reservation.services;
		        				for(item in services){
		        					serviceList.push(item.svcTitle);
		        				}
		        				return serviceList;
		        			}
		        		});
		        	});
		        	$('#reservationUpdateField').toggle('slow');
		        });
		        
		        $("#updateReservationBtnGo").click(function(){
		        	console.log($("#reservationUpdateDateStartTime").val());
					/* var reservation = {
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
					}); */
		        });
		      
			},
			
			//select: 빈 칸에 눌렀을 때 
			select: function(start, end, allDay){				
				  //여기는 사용자가 입력한 값이 체인으로 등장해야 하는거지만 일단...	누르면 창 보여주기 ---------------------//			
					var reservation = '';
					var str = ""; 
					str += "<form action='test' id='inputForm' data-toggle='validator' role='form'>";
					str += "<table class='table table-striped table-bordered'>";
					str += "<div class='form-group'>"
					str += "<tr>";
					str += "<td><label for='inputTitle' class='control-label'>일정: </label></td><td><input type='text' id='inputTitle' name='reservation.rsvTitle' required class='form-control'></td>";
					str += "</tr>";
					str += "</div>"
					str += "<div class='form-group'>"
					str += "<tr>";
					str += "<td><label for='inputDescription' class='control-label'>서비스 Description: </label></td><td><input type='text' id='inputDescription' name='reservation.service.svcDescription' required class='form-control'/><span class='glyphicon form-control-feedback' aria-hidden='true'></span>"
					str += "</tr>";
					str += "</div>"
					str += "<div class='form-group'>"
					str += "<tr>";
					str += "<td><label for='inputDescription' class='control-label'>서비스 시작 시간: </label></td><td><input type='text' id='inputStartTime' name='reservation.start' value='" + start.format("MM월 DD일 a hh시 mm분") + "' readonly class='form-control'/></td>";
					str += "</tr>";
					str += "</div>"
					str += "<div class='form-group'>"
					str += "<tr>";
					str += "<td><label for='inputDescription' class='control-label'>서비스 끝 시간: </label></td><td><input type='text' id='inputEndTime' name='reservation.end' value='" + end.format("MM월 DD일 a hh시 mm분") + "' readonly class='form-control'/></td>";
					str += "</tr>";
					str += "<div class='form-group'>"
					str += "<tr>";
					str += "<td><label for='inputPrice' class='control-label'>결제금: </label></td><td><input type='text' id='inputPrice' name='reservation.service.svcPrice' class='form-control'/></td>";
					str += "</tr>";
					str += "</div>"
					str += "</div>"
					str += "<div class='form-group'>";
					str += "<tr>";
					str += "<td><label for='inputEmployeeGenderCheckBox' class='control-label'>종업원 성별: </label></td><td><input type='checkbox' checked data-toggle='toggle' data-on='여성' data-off='남성' data-onstyle='primary' data-offstyle='warning' id='inputEmployeeGenderCheckBox' class='form-control'/></td>";
					str += "</tr>";
					str += "</div>";
					str += "<div class='form-group'>";
					str += "<tr>";
					str += "<td colspan='2' align='center'><textarea rows='4' cols='50' id='insertAgreementTextArea' class='form-control'>Lorem Ipsum </textarea></td>";
					str += "</tr>";
					str += "</div>";
					str += "<div class='form-group'>";
					str += "<tr>";
					str += "<td align='center' colspan='2'>서비스 약관에 동의합니다.<input type='checkbox' id='insertAgreementCheckbox'/></td>";
					str += "</tr>";
					str += "</div>";
					str += "<input type='hidden' id='genderCheckField' name='reservation.employeeGender' value=''></p>";
					str += "<input type='hidden' id='inputStatus' name='reservation.rsvStatus' value='1'/>";
					str += "</table>";
					str += "</form>";
					
					$('#insertModalBody').html(str);
					$('#insertModal').modal();
					
					$('#inputEmployeeGenderCheckBox').bootstrapToggle().change(function(){
						if($(this).prop('checked')){
							$('#genderCheckField').html($(this).attr('data-on'));
						}else{
							$('#genderCheckField').html($(this).attr('data-off'));
						}
						
					});
					//Insert 기능 ----------------------------//
				
					$('#insertReservationBtn').click(function(){
						if($('#insertAgreementCheckbox').prop('checked') == false){
							alert('동의해라!');
							return false;
						}
						
						//폼에서 받은 값 대응하는 그릇에 집어 넣기.
						var inputTitle = $('#inputTitle').val();
						var inputDescription = $('#inputDescription').val();
						var inputStartTime = $('#inputStartTime').val();
						var inputEndTime = $('#inputEndTime').val();
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
						
						//각각의 그릇을 reservation이라는 객체 안에 담기.
						reservation = {
								title: inputTitle,
								description: inputDescription,
								start: inputStartTime,
								end: inputEndTime,
								employeeGender: inputEmployeeGender,
								rsvStatus : inputStatus
						}
						
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
					
					//----------------------------//
					
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
			
			//이벤트들 불러오는 기능 -------------------------------------------//
			events: function(start, end, timezone, callback){
				$.ajax({
					url: '${pageContext.request.contextPath}/enterprise/retrieveReservations.action',
					type: 'GET',
					dataType: 'json',
					success: function(doc, index, value){
						var resList = doc.reservationList;
						var events = [];
						console.log(doc);
		
						$(resList).each(function(index,item){
							events.push({
								etpNum: item.etpNum,
								etpEmail: item.etpEmail,
								cpnNum: item.cpnNum,
								startDate: item.rsvStartDate,
								endDate: item.rsvEndDate,
								status: item.rsvStatus,
								employeeGender: item.employeeGender,
								svcCost: item.service.svcCost,
								svcDescription: item.service.svcDescription,
								id: item.rsvNum,
								title: item.rsvTitle,
								start: item.start,
								end: item.end,
								description: item.service.svcTitle,
								customerEmail: item.customer.cstEmail
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
				   	
				    if (currentMousePos.x >= x1 && currentMousePos.x <= x2 && currentMousePos.y >= y1 && currentMousePos.y <= y2) {
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
	<jsp:include page="CalHeader.jsp"></jsp:include>
	<h1>Calendar for testing</h1>
	<br>
	<div id='external-events'>
    <h4>Delete Events</h4>
    <div class='fc-event'>New Event</div>
    <p>
      <img src="../../image/trash-can1.jpg" id="trash" alt="쓰레기통">
    </p>
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
		            	<%-- *메뉴: <span id="insertModalEventTitle"> </span><br>
		   	 			*예약 시작: <span id="insertModalStartTime"> </span><br>
		   				*예약 소요시간:<span id="insertModalDuration"> </span><br>
		   				*쿠폰 :<span id="insertModalCoupon"> </span><br>
		   				*총 결제금:<span id="insertModalPrice"> </span><br>
		   				<span id="insertModalCheckBox"></span>예약 수정/ 취소 관련 주의사항<br>
		   				<span id="insertModalTextArea"></span><br>
		   				<p id="insertModalEventInfo"></p> --%>
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
		            		<td><label for="updateModalEventInfo">상세 내용:</label></td>
		            		<td><p id="updateModalEventInfo"></p></td>
		            		<!-- TODO: 여기에 HTML 에디터 넣기!!!!! -->
		            	</tr>
	   				</table>
	   				<hr>
	   				<div id="reservationUpdateField" class="form-group" style="display: none;">
	   					<table class="table table-condensed">
	   						<!-- TODO: 시간은 바꾸는 방법 다른 거 있으니까 이거 말고, 다른 정보 변경가능하도록 하자. -->
	   						<%-- tr>
	   							<td><label for="reservationUpdateDateStartTime">시작시간을 변경해 주세요!</label>
	   							<td><input type='datetime-local' id="reservationUpdateDateStartTime" class="form-control"></input></td>
	   						</tr>
	   						<tr>
	   							<td><label for="reservationUpdateDateEndtime">종료시간을 변경해 주세요!</label>
	   							<td>
	   								<s:select headerkey="-1" headerValue="종료 시간" list="#{'1':'09:00','2':'09:30'}" value="2" name="" class="select"/>
	   							</td>
	   						</tr> --%>
	   						
	   						<!-- TODO: 그 업체가 제공하는 서비스 목록을 AJAX로 받아오고, select로 뿌려주고,  -->
	   						<tr>
	   							<td><label for="reservationUpdateSelectService">변경하실 서비스를 선택해 주세요!</label></td>
	   							<td><s:select list="" headerKey="-1" headerValue="선택하세요" id="reservationUpdateSelectService"></s:select></td>
	   						<tr>
	   							<td><label for="reservationUpdateTitle">제목을 변경해 주세요!</label>
	   							<td><input type='text' id="reservationUpdateTitle" class="form-control" value=""></input></td>
	   						</tr>
	   					</table>
	   				</div>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal" id="closeReservationBtn">Close</button>
	               	<button class="btn btn-primary" id="updateReservationBtn">예약 정보 수정란 활성화</button>
	               	<button class="btn btn-warning" id="updateReservationBtnGo">예약 정보 수정 확인</button>
	            </div>
	        </div>
		</div>
	</div>
</body>
</html>