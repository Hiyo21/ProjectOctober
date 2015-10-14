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

<script src="fullcalendar/lib/jquery.min.js"></script>
<script src="fullcalendar/lib/moment.min.js"></script>
<script src="fullcalendar/lib/jquery-ui.custom.min.js"></script>
<script src="fullcalendar/fullcalendar.min.js"></script>
<script src="fullcalendar/lang-all.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


<script>
	$(function(){
		var date = new Date();
		var dat = date.getDate();
		var mon = date.getMonth();
		var yr = date.getFullYear();
		var min = date.getMinutes();
		var hr = date.getHours();
		
		
		
		var calendar = $('#calendar').fullCalendar({
			header: {
				left:'prev,next today',
				center: 'title',
				right: 'month, agendaWeek, agendaDay'
			},
			lang: 'ko',
			theme: true,
			defaultView : 'agendaWeek',
			selectable: true,
			selectHelper: true,
			
			select: function(start, end, allDay){
				var title = prompt('일정 : ');
				
				if(title){
					calendar.fullCalendar('renderEvent', {
						title: title,
						start: start,
						end: end,
					}, true);
				}
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
			maxTime: '24:00:00',
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
						var enterprise = doc.enterprise;
						alert(enterprise);
						var events = [];
		
						for(var i = 0; i < enterprise.reservations.length; i++){
							events.push({
								id: enterprise.reservations[i].rsvNum,
								title: enterprise.reservations[i].title,
								start: enterprise.reservations[i].start,
								end: enterprise.reservations[i].end
							});
						}
						callback(events);
					},
					error: function(doc){
						console.log("Error");
					}
				});
			
			},
			
			dayClick: function(date, jsEvent, view){
				$(this).html(
						'Clicked on: ' + date.format() + '<br>' +
						'Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY + '<br>' + 
						'Current View: ' + view.name	
				);
			}
			});
		});
</script>

</head>
<body>
	<jsp:include page="CalHeader.jsp"></jsp:include>
	<h1>Calendar for testing</h1>
	<br>
	<div id='calendar' class='container'>
	
	</div>
	
</body>
</html>