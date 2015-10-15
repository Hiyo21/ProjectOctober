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
			
			select: function(start, end, allDay){
				
				//여기는 사용자가 입력한 값이 체인으로 등장해야 하는거지만 일단...				
					var reservation = '';
					var str = ""; 
					str += "<form action='test' id='inputForm'>";
					str += "<label for='inputTitle'>일정: </label><input type='text' id='inputTitle' name='reservation.rsvTitle'><br>";
					str += "<label for='inputDescription'>서비스 Description: </label><input type='text' id='inputDescription' name='reservation.service.svcDescription'/><br>";
					str += "<input type='text' id='inputStartTime' name='reservation.start' value='" + start.toISOString().split(".")[0] + "'></input><br>";
					str += "<input type='hidden' id='inputEndTime' name='reservation.end' value='" + end.toISOString().split(".")[0] + "'/><br>";
					str += "<input type='hidden' id='inputStatus' name='reservation.rsvStatus' value='1'/><br>";
					str += "<input type='checkbox' checked data-toggle='toggle' data-on='female' data-off='male' data-onstyle='primary' data-offstyle='warning' id='inputEmployeeGenderCheckBox' name='reservation.employeeGender'/><br>";
					str += "</form>";
					$('#insertModalBody').html(str);
					$('#insertModal').modal();
				
					$('#insertReservationBtn').click(function(){
						reservation = {
								title: $('#inputTitle').val(),
								description: $('#inputDescription').val(),
								start: $('#inputStartTime').val(),
								end: $('#inputEndTime').val()
							/* 	etpNum: , */	
							}
						calendar.fullCalendar('renderEvent', reservation, true);
						
						$.ajax({
							url: "${pageContext.request.contextPath}/enterprise/insertReservation.action",
							dataType: 'json',
							type: 'POST',
							data: $('#inputForm').serialize(),
							contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
							success: function(doc){
								alert(doc == null);
							},
							error: function(doc){
								console.log("insert Error");
							}
						});
					});
				calendar.fullCalendar('unselect');
			},
			
			themeButtonIcons: {
				prev: 'circle-triangle-w',
				next: 'circle-triangle-e',
				
			},
			weekNumbers: true,
			fixedWeekCount: true,
			slotLabelFormat: 'a h(:mm)시',
			minTime: '10:00:00',
			maxTime: '23:00:00',
			businessHours : {
				start: '11:00',
				end: '23:00',
				dow: [0,1,2,3,4,5,6,7]
			},
			aspectRatio : 1.1,
			editable: true,
			eventLimit: true,
			timezone: 'local',
			selectble: false,
			selectHelper: true,
			eventSources: function(start, end, timezone, callback){
				$.ajax({
					url: '${pageContext.request.contextPath}/enterprise/retrieveReservations.action',
					type: 'GET',
					dataType: 'json',
					success: function(doc){
						var resList = doc.reservationList;
						var events = [];
		
						for(var i = 0; i < resList.length; i++){
							events.push({
								etpNum: resList[i].etpNum,
								id: resList[i].rsvNum,
								title: resList[i].title,
								start: resList[i].start,
								end: resList[i].end,
								description: resList[i].service.svcTitle,
								customerEmail: resList[i].customer.cstEmail 
							});
							console.log(events[0].etpNum);
						}
						callback(events);
					},
					error: function(doc){
						console.log("Error");
					}
				});

			},
			
			/* dayClick: function(date, jsEvent, view){
				$(this).html(
						'Clicked on: ' + date.format() + '<br>' +
						'Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY + '<br>' + 
						'Current View: ' + view.name	
				);
			}, */
			eventRender: function (event, element) {
		        element.attr('href', 'javascript:void(0);');
		        element.click(function() {
		        	$("#updateModalTitle").html(event.title);
		        	$("#updateModalEventId").html("예약 일련번호: " + event.id);
		        	$("#updateModalCustomerEmail").html("회원 이메일: " + event.customerEmail);
		            $("#updateModalStartTime").html("시작 시간: " + moment(event.start).format('MMM Do A h:mm '));
		            $("#updateModalEndTime").html("종료 시간: " + moment(event.end).format('MMM Do A h:mm '));
		            $("#updateModalEventInfo").html(event.description);
		            $('#updateModal').modal();
		        });
		        
		        $("#updateReservationBtn").button('toggle').click(function(){
		        	$('#reservationUpdateField').html("<input type='date'></input>").toggle('slow');
		        }); 
		    }
			
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
	                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	               	<button class="btn btn-primary" id="updateReservationBtn">예약 정보 수정</button>
	            </div>
	        </div>
		</div>
	</div>
</body>
</html>