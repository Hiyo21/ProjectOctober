<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<s:include value="../Header.jsp"></s:include>
	<div class="container">
		<h1> 님의 고객 예약 내역</h1>
		<p>The .table-hover class enables a hover state on table rows:</p>            
		<table class="table table-hover">
			<thead>
				<tr>
					<th>결제번호</th>
					<th>예약번호</th>
					<th>서비스이름</th>
					<th>예약날짜</th>
					<th>가격</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="paymentRecords">
				<tr>
					<td><s:property value="pmtNum"/></td>
					<td><s:property value="reservation.rsvNum"/></td>
					<td><s:property value="service.svcTitle"/></td>
					<td><s:property value="reservation.rsvStartDate"/></td>
					<td><s:property value="pmtAmount"/></td>
				</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>