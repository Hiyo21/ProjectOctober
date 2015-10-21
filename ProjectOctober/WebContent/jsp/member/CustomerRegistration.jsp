<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/moment.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script>
	var year = 1920;
	var month = 0;
	var date = 0;
	
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});	
	
	for(int i = 1920; i < 2015 ; i++){
		$('#year').append("<option value='" + i + "'>" + i + "</option>");
	};
	
	for(int i = 0; i<12; i++){
		$("#month").append("<option value='" + i + "'>" + (i+1) + "</option>");
	}
	
	$("#month").change(function(){
		month = $(this).val();
		(month == 2) ? for(int i= 1 ; i <=28 ; i++){$("#date").append("<option value='" + i + "'>" + i++ + "</option>")} : ((month == 4 || month == 6 || month == 9 || month == 11) ? for(int i= 1 ; i <=30 ; i++){$("#date").append("<option value='" + i + "'>" + i++ + "</option>")} :for(int i= 1 ; i <=31 ; i++){$("#date").append("<option value='" + i + "'>" + i++ + "</option>")});  
	});
	
	$('#date').change(function(){
		date = $(this).val();
	});
	
	$('#year').change(function(){
		year = $(this).val();
	};
	
	
	$('#send').click(function(){
		var errorMessage = '';
		if($('#name').val().trim().length == 0) errorMessage += "이름을 입력하세요!\r\n";
		if($('#email').val().trim().length == 0) errorMessage += "이메일을 입력하세요!\r\n";
		if($('#password').val().trim().length == 0) errorMessage += "패스워드를 입력하세요!\r\n";
		if($('#passwordck').val().trim().length == 0) errorMessage += "패스워드 확인란을 입력하세요!\r\n";
		if($('#password').val().trim() != $('#passwordck').val().trim) errorMessage += "패스워드가 확인란과 일치하지 않습니다.\r\n";
		if($('#phoneResult').val().trim().length == 0) errorMessage += "전화번호를 입력하세요!\r\n");
	 	if($('#addressResult').val().trim().length == 0) errorMessage += "주소를 입력하세요! \r\n");
		if($('#bdayResult').val().trim().length == 0) errorMessage += "생년월일을 입력하세요! \r\n");

	$(document).ready(function(){

		if(errorMessage.length != 0){
			alert(errorMessage);
			return false;
		}else{
			$('#send').submit();
		}
	});
	
	
		var cstBirthday = document.getElementById('year').val+document.getElementById('month').val+document.getElementById('day').val;
		
		$("#button1").click(function(){    	
			alert(cstBirthday);			
    });
		
	});
	
	function zipcodeOpen() {
		window.open("${pageContext.request.contextPath}/member/toZipcodePage.action","newwin","top=200,left=400,width=500,height=500,resizable=no,scrollbars=yes");
	}
</script>

<title>이용자 회원가입</title>

</head>
<body>
<%@include file="../Header.jsp"%>

<h2 align="center">이용자 회원가입</h2>

<!-- 본문 시작 -->
<form name="customerRegistration" action="${pageContext.request.contextPath}/member/customerRegistration.action" method="post" >
<div class="section">
      <div class="container">
        <div class="row">
        <!-- 오른쪽 -->
          <div class="col-md-6">
			<label for="member.memName">이름</label>
			<s:textfield class="form-control" id="name" name="member.memName"/>          	

          	<br>
          	<label for="memEmail">이메일 주소</label>
			<s:textfield class="form-control" id="email" name="member.memEmail" placeholder="ID로 사용됩니다."/>
			<br>
			<label for="memPassword">비밀번호</label>
			<s:password class="form-control" id="password" name="member.memPassword"/>					
			<br>
			<label for="passwordck">비밀번호 확인</label>
			<s:password class="form-control" id="passwordck"/>
			<br>

			<label for="member.memGender">성별</label><br>
			<input type="radio" name="member.memGender" value="M">남&nbsp;&nbsp;&nbsp;<input type="radio" name="member.memGender" value="F" selected>여			
			<br>							
          </div>
          
          <!-- 왼쪽 -->
          <div class="col-md-6" >
          		<label for="cstBirthday">생년월일</label>
					<div class="form-inline">
						<div class="form-group">
							<select id="year" class="form-control">
								<option disabled selected hidden>년도선택</option>

							</select>&nbsp;&nbsp;
							
							<select id="month" class="form-control">
		          			
		          			</select>&nbsp;&nbsp;
		          			
		          			<select id="date" class="form-control">
									
		          			</select>
		          			<br>
		          			<input type="hidden" id="bdayResult" name="customer.cstBirthday" value=""></input>
		          			<br>
		          			
		          			<label for="phone">전화번호</label>
							<div class="form-inline">
								<div class="form-group">
									<select id="phone" class="form-control">
										<option value="">번호선택</option>
										<option value="010">010</option>
										<option value="011">011</option>
										<option value="016">016</option>
										<option value="017">017</option>
										<option value="018">018</option>
										<option value="019">019</option>
										<option value="070">070</option>
									</select>
								</div>
								&nbsp;&nbsp;-&nbsp;&nbsp;
								<s:textfield class="form-control" size="10" id="phone1"/>
								&nbsp;&nbsp;-&nbsp;&nbsp;
								<s:textfield class="form-control" size="10" id="phone2"/>
								<input type="hidden" id="phoneResult" name="member.memPhone" value=""></input>
							</div>
		          			
		          			<br><label for="address">주소</label>
						<div class="form-inline">
						<s:textfield class="form-control" id="zipcode" name="customer.cstZipcode" readonly="true" size="20" placeholder="클릭해서 우편번호를 검색" onclick="zipcodeOpen()"/>
						</div>
						<div class="form-inline">
						<s:textfield class="form-control" id="address1" readonly="true" size="70"/><br>
						</div>
						<div class="form-inline">
						<s:textfield class="form-control" id="address2" placeholder="상세주소를 입력하세요" size="70"/>		         
						</div>				
					</div>
<<<<<<< HEAD
						<input type="hidden" id="addressResult" name="customer.cstAddress" value=""></input>
				</div>
			</div>
		</div>
	</div>
</div>

<br><br><br>
       
<div class="section">
	<div class="container">
		<div class="row" align="center">
			<h1 align="center">이용약관</h1>
				<div class="col-sm-12" style="background-color:lavender;">
					<p>회원 이용약관</p><br>				      
				</div>
				<br>
				<br>
				<br>
				
				<input type="submit" class="btn btn-info" id="send" onclick="return sendForm()" value="회원가입">&nbsp;&nbsp;&nbsp;<input type="button" class="btn btn-warning" value="취소">
     		 	
     		</div>
     	</div>
     </div>
		<input type="hidden" id="memberCode" name="member.memCode" value="1">

          </div>
          </div>
        </div>
        </div>
        <br><br><br>
        <!--  -->
        <div class="section">
	      <div class="container">
	      	 <div class="row" align="center">
	      	  	<h1 align="center">이용약관</h1>
				    <div class="col-sm-12" style="background-color:lavender;">
				      <p>회원 이용약관</p><br>				      
				    </div>
				    <br>
				    <br>
				    <br>
				   <center> <input type="submit" id="send" value="회원가입">&nbsp;&nbsp;&nbsp;<input type="button" id="button1" value="취소" onclick=""></center>
     		 	</div>
	    	  </div>
	      </div>
       </form> 
</body>
</html>