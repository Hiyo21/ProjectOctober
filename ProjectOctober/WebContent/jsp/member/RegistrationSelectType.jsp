<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>회원 등록 어느 타입인지 선택</title>
</head>
<body>
	<jsp:include page="../Header.jsp">
	<div class = "container" id="selectType">
		<div class="well well-lg" align="center">
			<div class="btn-group">
				<h1><a class="btn btn-primary btn-lg" href="EnterpriseRegistration1.jsp" role="button" style="vertical-align:center">사업자</a></h1>
				<h1><a class="btn btn-success btn-lg" href="CustomerRegistration.jsp" role="button" style="vertical-align:center">이용자</a></h1>
			</div>
		</div>
	</div>
</body>
</html>