<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Refresh" content="3;url=${pageContext.request.contextPath}">
<title>Welcome!</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="../Header.jsp" />
	<div class="container-fluid">
		<div class="jumbotron">
			<p>회원 가입을 환영합니다! 관리자의 승인 이후 사용 가능합니다. 조금만 기다려 주세요. =D</p>
			<p>3초 후 메인 화면으로 이동합니다...</p>
		</div>
	</div>
</body>
</html>