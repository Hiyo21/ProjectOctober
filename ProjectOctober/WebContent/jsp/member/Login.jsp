<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


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
	
	.form-inline {
		text-align: left;
	}

</style>

<script>

$(document).ready(function() {
	$('#enterprise').on('click', enter);
	$('#customer').on('click', cust);
});
function enter() {
	$('#type').attr('value', 'enterprise');
}
function cust() {
	$('#type').attr('value', 'customer');
}

</script>

<title>로그인</title>

</head>
<body>
<s:include value="../Header.jsp"></s:include>

	<div class = "container" id="joinWindow">
		<div class="well well-lg" align="center">
			<br><br><br>
			<h1>Login</h1>
			<form class="form-inline" role="form" onsubmit="return check()" action="${pageContext.request.contextPath}/member/loginProcess" method="post">
    			<div class="form-group">
    				<table>
    					<tr>
    						<td width="100px">
			    				<label for="email">Email:</label>
			    			</td>
			    			<td>
			    				<input type="email" class="form-control" id="email" name="email" placeholder="Enter email">
			    			</td>
			    		<tr>
			    		<tr>
			    			<td width="100px">
					    		<label for="password">Password:</label>
			    			</td>
			    			<td>
					    		<input type="password" class="form-control" id="pwd" name="password" placeholder="Enter password">
			    			</td>
			    			<td rowspan="2" width="100px" align="center">
			    				<input type="submit" class="btn btn-default" value="Login">
			    			</td>
			    		</tr>
			    	</table>
			    </div>
			<input type="hidden" id="type" value="">
			</form>
		</div>
	</div>
</body>
</html>
</html>