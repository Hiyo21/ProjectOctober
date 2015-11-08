<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사업자 이용내역</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
function goBack() {
	history.back();
}
</script>

  
<!-- 페이징 처리 -->
<script src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css"></script>
<!-- 페이징처리 -->
  
 <script>
//페이징처리
$(document).ready(function() {
    $('#example').DataTable( {
        "order": [[ 3, "desc" ]]
    } );
} );

//페이징처리
</script>
<style type="text/css">
#example_paginate {
	text-align: center;
	 cursor: pointer; 
}

</style>
>>>>>>> refs/remotes/origin/master
</head>
<body>
	<s:include value="../Header.jsp"></s:include>
	<div class="container">
		<h1><s:property value="#session.loginName"/>님의 고객 예약 내역</h1>
		<table id="example" class="display" cellspacing="0" width="100%" border="1">
			<thead>
				<tr>
					<th>매출번호</th>
					<th>예약번호</th>
					<th>고객아이디</th>
					<th>서비스이름</th>
					<th>예약날짜</th>
					<th>가격</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="saleRecords">
				<tr>
					<td><s:property value="saleNum"/></td>
					<td><s:property value="reservation.rsvNum"/></td>
					<td><s:property value="reservation.cstEmail"/></td>
					<td><s:property value="service.svcTitle"/></td>
					<td><s:property value="reservation.rsvStartDate"/></td>
					<td><s:property value="saleAmount"/></td>
				</tr>
				</s:iterator>
			</tbody>
		</table>
		<div align="right">
			<button type="button" class="btn btn-default" onclick="goBack()">뒤로가기</button>
		</div>
	</div>
</body>
</html>