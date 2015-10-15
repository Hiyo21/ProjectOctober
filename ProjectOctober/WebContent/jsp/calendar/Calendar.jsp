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
			//minTime: '10:00:00',
			//maxTime: '23:00:00',
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
		        	$("#updateModalEventId").html("예약 일련번호: " + event.id);
		        	$("#updateModalCustomerEmail").html("회원 이메일: " + event.customerEmail);
		            $("#updateModalStartTime").html("시작 시간: " + moment(event.start).format('MMM Do A h:mm '));
		            $("#updateModalEndTime").html("종료 시간: " + moment(event.end).format('MMM Do A h:mm '));
		            $("#updateModalEventInfo").html(event.description);
		            $('#updateModal').modal();
		        });
		        
		        $("#updateReservationBtn").click(function(){
		        	$('#reservationUpdateField').html("<input type='date'></input>").toggle('slow');
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
					str += "<td><label for='inputDescription' class='control-label'>서비스 시작 시간: </label></td><td><input type='text' id='inputStartTime' name='reservation.start' value='" + start.toISOString() + "' readonly class='form-control'/></td>";
					str += "</tr>";
					str += "</div>"
					str += "<div class='form-group'>"
					str += "<tr>";
					str += "<td><label for='inputDescription' class='control-label'>서비스 끝 시간: </label></td><td><input type='text' id='inputEndTime' name='reservation.end' value='" + end.toISOString() + "' readonly class='form-control'/></td>";
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
							$('#calendar').fullCalendar('removeEvents');
							$('#calendar').fullCalendar('refetchEvents');
							$('#insertModal').modal('destroy').remove();
							$(this).unbind();
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
								
								$('#insertModal').modal('hide');
							},
							error: function(doc){
								console.log("insert Error");
							}
						});
						$(this).unbind();
						$('#calendar').fullCalendar('removeEvents');
						$('#calendar').fullCalendar('refetchEvents');
					});
					
					//----------------------------//
					
				calendar.fullCalendar('unselect');
				$(this).unbind();
				calendar.fullCalendar('refetchEvents');
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
		
						$(resList).each(function(index,item){
							events.push({
								etpNum: item.etpNum,
								id: item.rsvNum,
								title: item.title,
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
				calendar.fullCalendar('unselect');
				calendar.fullCalendar('deleteEvents');
				calendar.fullCalendar('refetchEvents');
				$(this).unbind();
				alert(event.title + " was dropped on " + event.start.format());
				if (!confirm("Are you sure about this change?")) {
					revertFunc();
				}else{
					console.log(event);
					var reservation = {
						"reservation.rsvNum" : event.id, 
						"reservation.rsvTitle": event.description,
						"jsonString": event.description,
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
						},
						error: function(){
							console.log('fail!');
							$('#calendar').fullCalendar('refetchEvents');							
						}
					});
				}
				calendar.fullCalendar('unselect');
				calendar.fullCalendar('deleteEvents');
				calendar.fullCalendar('refetchEvents');
			},
		});
	});	
</script>

</head>
<body>
	<jsp:include page="CalHeader.jsp"></jsp:include>
	<h1>Calendar for testing</h1>
	<br>
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
	            	<span id="updateModalEventId"></span><br>
	   	 			<span id="updateModalStartTime"></span><br>
	   				<span id="updateModalEndTime"></span><br>
	   				<span id="updateModalCustomerEmail"></span><br>
	   				<p id="updateModalEventInfo"></p>
	   				
	   				<br>
	   				<hr>
	   				<br>
	   				<p id="reservationUpdateField"></p>
	            </div>
	            <div class="modal-footer">
	                <button type="button" class="btn btn-default" data-dismiss="modal" id="closeReservationBtn">Close</button>
	               	<button class="btn btn-primary" id="updateReservationBtn">예약 정보 수정</button>
	            </div>
	        </div>
		</div>
	</div>
</body>
</html>