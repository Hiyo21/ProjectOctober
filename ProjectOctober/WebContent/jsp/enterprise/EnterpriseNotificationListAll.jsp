<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>EnterpriseNotificationListAll</title>

<link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/jejugothic.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/jquery-2.1.4.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style>
*, h1{
	font-family: "Helvetica Neue", "Jeju Gothic", Helvetica,Arial,sans-serif;
}
</style>

</head>
<body>
	<s:include value="../Header.jsp"/>
	<h1 style="text-align: center;"><s:property value="#session.loginId"/>님의 전체 알림 내역</h1>
	<br>
	<br>
	
	<div class="table-responsive">
		<table class="table table-compact table-hover">
			<tr>
				<th>에약번호</th>
				<th>예약 메시지</th>
				<th>고객 이메일</th>
				<th>알림 발생 일시</th>
			</tr>
			<s:iterator var="allNotifications" value="notificationList">
				<tr>
					<td><s:property value="rsvNum"/></td>
					<td><s:property value="ntfMessage"/></td>
					<td><s:property value="cstEmail"/></td>
					<td><s:property value="ntfTime"/></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>