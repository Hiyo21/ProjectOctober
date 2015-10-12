<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="css/switch/css/bootstrap3/bootstrap-switch.css" />

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="css/switch/js/bootstrap-switch.js"></script>
<script>
	$('input[name="my-checkbox"]').bootstrapSwitch('state', true, true);
</script>

<style type="text/css">
	#joinWindow {
		vertical-align : center;
		width: 500px;
	}
	
	.btn-lg {
		width: 200px;
		height: 100px;	
		text-align: center;
	}
	
	
	#clause {
		overflow-y: scroll;
	}

</style>

<title>회원가입</title>



</head>
<body>
<s:include value="Header.jsp"></s:include>

<h1><a href="../jsp/Main.jsp">메인화면</a></h1>

	<div class = "container" id="joinWindow">
		<div class="well well-lg" align="center">
			<div class="btn-group">
				<input type="checkbox" name="my-checkbox"/>
				<a class="btn btn-primary btn-lg" href="member/toEnterpriseRegistrationPage.action" role="button" style="vertical-align:center"><h1>사업자</h1></a>
				<a class="btn btn-success btn-lg" href="member/toCustomerRegistrationPage.action" role="button" style="vertical-align:center"><h1>이용자</h1></a>
			</div>
			<br><br>
			<h3><b>약관</b></h3>
			<div class="panel panel-default">
				<div class="panel body" style="height: 100px" id="clause">
					이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 
					이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱
					이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 
					이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱
					이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 
					이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱 이거슨 약관이지롱 너는 이 약관을 지켜야 하지롱
				</div>
				<div class="radio-inline">
					<label><input type="radio" name="optradio">네</label>
				</div>
				<div class="radio-inline">
					<label><input type="radio" name="optradio">아니오</label>
				</div>
			</div>
		</div>
	</div>
</body>
</html>