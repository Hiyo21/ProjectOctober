<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


<style type="text/css">
	body {
    padding-top: 15px;
    font-size: 12px
  }
  .main {
    max-width: 320px;
    margin: 0 auto;
  }
  .login-or {
    position: relative;
    font-size: 18px;
    color: #aaa;
    margin-top: 10px;
            margin-bottom: 10px;
    padding-top: 10px;
    padding-bottom: 10px;
  }
  .span-or {
    display: block;
    position: absolute;
    left: 50%;
    top: -2px;
    margin-left: -25px;
    background-color: #fff;
    width: 50px;
    text-align: center;
  }
  .hr-or {
    background-color: #cdcdcd;
    height: 1px;
    margin-top: 0px !important;
    margin-bottom: 0px !important;
  }
  h3 {
    text-align: center;
    line-height: 300%;
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

function check() {
	var email = document.getElementById('email');
	var pwd = document.getElementById('pwd');
	var type = document.getElementById('type');
	
	if (type.value == '') {		
		alert('회원 유형을 선택해주세요');
		return false;
	}
	if (email.value == '') {
		alert('이메일을 입력하세요');
		email.focus();
		email.select();
		return false;
	}
	if (pwd.value == '') {
		alert('비밀번호를 입력하세요');
		pwd.focus();
		pwd.select();
		return false;
	}
	return true;
}
</script>

<title>로그인</title>

</head>
<body>
<s:include value="../Header.jsp"></s:include>
<div class="container">
  <div class="row">

    <div class="main">

      <h3><a href="#">로그인</a></h3>
      <div class="row">
        <div class="col-xs-6 col-sm-6 col-md-6">
          <a href="#" class="btn btn-lg btn-primary btn-block" role="button" style="vertical-align:center" id="enterprise">사업자</a>
        </div>
        <div class="col-xs-6 col-sm-6 col-md-6">
          <a href="#" class="btn btn-lg btn-info btn-block" role="button" style="vertical-align:center" id="customer">이용자</a>
        </div>
      </div>
      <div class="login-or">
        <hr class="hr-or">
        <span class="span-or">AND</span>
      </div>

      <form role="form" onsubmit="return check()" action="${pageContext.request.contextPath}/member/loginProcess" method="post">
        <div class="form-group">
          <label for="email">Email</label>
          <input type="text" class="form-control" id="email" name="email" placeholder="Enter email">
        </div>
        <div class="form-group">          
          <label for="pwd">Password</label>
          <input type="password" class="form-control" id="pwd" name="password" placeholder="Enter password">
        </div>
        <div class="checkbox pull-right">          
        </div>
        <button type="submit" class="btn btn btn-primary">
          Log In
        </button>
      </form>
    
    </div>
    
  </div>
</div>
        
        
	<%-- <div class = "container" id="joinWindow">
		<div class="well well-lg" align="center">
			<div class="btn-group">
				<h1><a class="btn btn-default btn-lg btn-block" href="#" role="button" style="vertical-align:center" id="enterprise">사업자</a></h1>
				<h1><a class="btn btn-default btn-lg btn-block" href="#" role="button" style="vertical-align:center" id="customer">이용자</a></h1>
			</div>
			<br><br><br>
			<form class="form-inline" role="form" onsubmit="return check()" action="${pageContext.request.contextPath}/member/loginProcess" method="post">
    			<div class="form-group">
    				 <div class="section">
					      <div class="container">
					        <div class="row">
					          <div class="col-md-12">
					          		<label for="email">Email:</label>
					    			<input type="email" class="form-control-static" id="email" name="email" placeholder="Enter email"><br>
							    	<label for="password">Password:</label>
							    	<input type="password" class="form-control-static" id="pwd" name="password" placeholder="Enter password">
							    	<input type="submit" class="btn btn-default btn-lg" value="Login">					          
					          </div>
					        </div>
					      </div>
					    </div>
			    </div>
			<input type="hidden" id="type" value="">
			</form>
		</div>
	</div>  --%>
</body>

</html>