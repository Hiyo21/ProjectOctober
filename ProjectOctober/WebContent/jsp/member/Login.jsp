<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/jejugothic.css"/>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style type="text/css">
	body {   
    font-size: 12px;
     font-family: "Helvetica Neue", "Jeju Gothic", Helvetica,Arial,sans-serif;
  }
  .main {
    max-width: 360px;
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
  
  .colorgraph {
  height: 5px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
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


$(function(){
	$('#loginBtn').click(function(){
		var errorMessage = '';
		if($("#email").val().length == 0) errorMessage += '이메일을 입력하세요!\r\n';
		if($("#pwd").val().length == 0) errorMessage += '패스워드를 입력하세요!\r\n';
		if(errorMessage.length != 0){
			alert(errorMessage);
			return false;
		}
	});
});

</script>

<title>로그인</title>

</head>
<body>
<s:include value="../Header.jsp" ></s:include>

<div class="container">
  <div class="row">
    <div class="main">
      <h2>a.#에 오신 것을 환영합니다!</h2>
	<hr class="colorgraph">
      <form role="form" action="loginProcess" method="post">
        <div class="form-group">
          <label for="email">Email</label>
          <input type="text" class="form-control" id="email" name="email" placeholder="이메일 주소를 입력하세요.">
        </div>
        <div class="form-group"> 
          <label for="inputPassword">Password</label>
          <input type="password" class="form-control" id="pwd" name="password" placeholder="패스워드를 입력하세요.">
        </div>
        <s:if test="#session.invalid != null">
        		<p style="color: red;"> 아이디 혹은 비밀번호가 틀렸습니다. 다시 입력해 주시기 바랍니다.</p>
		</s:if>
        <div class="checkbox pull-right">
         	
        </div>
        
 
        <hr class="colorgraph"> 
        	<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6">
                       <input type="submit" class="btn btn-lg btn-success btn-block" id="loginBtn" value="Sign In">
				</div>
				<div class="col-xs-6 col-sm-6 col-md-6">
					<a data-toggle="modal" href="#myModal" class="btn btn-lg btn-primary btn-block">Register</a>
				</div>
			</div>
		</form>
		</div>
	</div>
</div>

</body>
</html>
