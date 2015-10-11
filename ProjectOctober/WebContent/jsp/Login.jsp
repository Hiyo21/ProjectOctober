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

<title>로그인</title>

</head>
<body>
<s:include value="Header.jsp"></s:include>

<h1><a href="../jsp/Main.jsp">메인화면</a></h1>

	<div class = "container" id="joinWindow">
		<div class="well well-lg" align="center">
			<div class="btn-group">
				<a class="btn btn-primary btn-lg" href="#" role="button" style="vertical-align:center"><h1>사업자</h1></a>
				<a class="btn btn-success btn-lg" href="#" role="button" style="vertical-align:center"><h1>이용자</h1></a>
			</div>
			<br><br><br>
			<form class="form-inline" role="form">
    			<div class="form-group">
    				<table>
    					<tr>
    						<td width="100px">
			    				<label for="email">Email:</label>
			    			</td>
			    			<td>
			    				<input type="email" class="form-control" id="email" placeholder="Enter email">
			    			</td>
			    		<tr>
			    		<tr>
			    			<td width="100px">
					    		<label for="pwd">Password:</label>
			    			</td>
			    			<td>
					    		<input type="password" class="form-control" id="pwd" placeholder="Enter password">
			    			</td>
			    			<td rowspan="2" width="100px" align="center">
			    				<button type="submit" class="btn btn-default">Login</button>	
			    			</td>		
			    		</tr>
			    	</table>
			    </div>
			</form>
		</div>
	</div>
</body>
</html>
</html>