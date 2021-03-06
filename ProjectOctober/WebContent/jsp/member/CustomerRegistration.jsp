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
	var cstBirthday = '';
	
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	
		for(var i = 1920; i < 2015 ; i++){
			$('#year').append("<option value='" + i + "'>" + i + "</option>");
		}
	
		for(var i = 0; i<12; i++){
			$("#month").append("<option value='" + i + "'>" + (i+1) + "</option>");
		}
	
		$("#month").change(function(){
			console.log($(this).val());
			month = $(this).val();
			$("#date option").remove();
			if(month == 2){
				for(var i= 1 ; i <=28 ; i++){
					$("#date").append("<option value='" + i + "' class='yearselect'>" + i + "</option>")
				}
			}else if(month == 4 || month == 6 || month == 9 || month == 11){
				for(var i= 1 ; i <=30 ; i++){
					$("#date").append("<option value='" + i + "' class='monthselect'>" + i + "</option>");
				}
			}else{
				for(var i= 1 ; i <=31 ; i++){
					$("#date").append("<option value='" + i + "' class='dateselect'>" + i + "</option>");  
				}
			}
			$("#bdayResult").attr('value',document.getElementById('year').value + '-' + (parseInt(document.getElementById('month').value)+1) + '-' + document.getElementById('date').value);
		});
	
		$('#date').change(function(){
			console.log($(this).val());
			date = $(this).val();
			$("#bdayResult").attr('value',document.getElementById('year').value + '-' + (parseInt(document.getElementById('month').value)+1) + '-' + document.getElementById('date').value);
		});
	
		$('#year').change(function(){
			console.log($(this).val());
			year = $(this).val();
			$("#bdayResult").attr('value',document.getElementById('year').value + '-' + (parseInt(document.getElementById('month').value)+1) + '-' + document.getElementById('date').value);
		});
		
		$('#phone').change(function(){
			$("#phoneResult").attr('value', document.getElementById('phone').value + '-' + document.getElementById('phone1').value + '-' + document.getElementById('phone2').value);
		});
		$('#phone1').keyup(function(){
			$("#phoneResult").attr('value', document.getElementById('phone').value + '-' + document.getElementById('phone1').value + '-' + document.getElementById('phone2').value);
		});
		$('#phone2').keyup(function(){
			$("#phoneResult").attr('value', document.getElementById('phone').value + '-' + document.getElementById('phone1').value + '-' + document.getElementById('phone2').value);
		});
		$('#phone1').click(function(){
			$("#phoneResult").attr('value', document.getElementById('phone').value + '-' + document.getElementById('phone1').value + '-' + document.getElementById('phone2').value);
		});
		$('#phone2').click(function(){
			$("#phoneResult").attr('value', document.getElementById('phone').value + '-' + document.getElementById('phone1').value + '-' + document.getElementById('phone2').value);
		});
		$('#address1').click(function(){
			$("#addressResult").attr('value',document.getElementById('address1').value + ' ' + document.getElementById('address2').value);
		});
		$('#address2').click(function(){
			$("#addressResult").attr('value',document.getElementById('address1').value + ' ' + document.getElementById('address2').value);
		});
		$('#address1').keyup(function(){
			$("#addressResult").attr('value',document.getElementById('address1').value + ' ' + document.getElementById('address2').value);
		});
		$("#address2").keyup(function(){
			$("#addressResult").attr('value',document.getElementById('address1').value + ' ' + document.getElementById('address2').value);
		});
	});
	
	function sendB(){
			$("#phoneResult").attr('value', document.getElementById('phone').value + '-' + document.getElementById('phone1').value + '-' + document.getElementById('phone2').value);
			$("#addressResult").attr('value',document.getElementById('address1').value + ' ' + document.getElementById('address2').value);
			
			var errorMessage = '';
			if($('#name').val().trim().length == 0) errorMessage += "이름을 입력하세요!\r\n";
			if($('#email').val().trim().length == 0) errorMessage += "이메일을 입력하세요!\r\n";
			if($('#password').val().trim().length == 0) errorMessage += "패스워드를 입력하세요!\r\n";
			if($('#passwordck').val().trim().length == 0) errorMessage += "패스워드 확인란을 입력하세요!\r\n";
			if($('#password').val().trim() != $('#passwordck').val().trim()) errorMessage += "패스워드가 확인란과 일치하지 않습니다.\r\n";
			if($('#phoneResult').val().trim().length == 0) errorMessage += "전화번호를 입력하세요!\r\n";
		 	if($('#addressResult').val().trim().length == 0) errorMessage += "주소를 입력하세요!\r\n";
		 	if($('#address2').val().trim().length == 0) errorMessage += "상세주소를 입력하세요!\r\n";
			if($('#bdayResult').val().trim().length == 0) errorMessage += "생년월일을 입력하세요!\r\n";
	
			if(errorMessage.length != 0){
				alert(errorMessage);
				return false;
			}else{
				$(this).submit();
			}
		//document.getElementById('year').value + '-' + document.getElementById('month').value + '-' + document.getElementById('date').value;
		//$("#year").val() + "-" + $("#month").val() + $("#date"	1.val();
	};
	
	$(function(){
		$("#email").click(function(){
			console.log($('#email').val());
			var tempEmail = $('#email').val();
			$.ajax({
				url:"member/checkCustomerDuplicateEmail.action",
				type: "POST",
				data: {"emailInput" : tempEmail},
				cache: false,
				success: function(data){
					if(tempEmail.length == 0){
						$('#duplicateCheckResultEmail').html('');
					}
					else{
						if(data.emailExists){
							$('#duplicateCheckResultEmail').html('사용 가능합니다.').css('color', 'green');
							$('#send').attr('disabled', false);
						}
						else{
							$('#duplicateCheckResultEmail').html('사용 불가능합니다.').css('color', 'red');
							$('#send').attr('disabled', true);
						}
					}
				}			
			});
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
<form name="customerReg" action="customerRegistration.action" method="post" onsubmit="return sendB();">
<div class="section">
      <div class="container">
        <div class="row">
        <!-- 왼쪽 -->
          <div class="col-md-6">
			<label for="member.memName">이름</label>
			<s:textfield class="form-control" id="name" name="member.memName"/>          	

          	<br>
          	<label for="memEmail">이메일 주소</label>
			<s:textfield class="form-control" id="email" name="member.memEmail" placeholder="ID로 사용됩니다."/>
			<p id="duplicateCheckResultEmail"></p>
			<br>
			<label for="memPassword">비밀번호</label>
			<s:password class="form-control" id="password" name="member.memPassword"/>					
			<br>
			<label for="passwordck">비밀번호 확인</label>
			<s:password class="form-control" id="passwordck"/>
			<br>

			<label for="member.memGender">성별</label><br>
			<input type="radio" name="customer.cstGender" value="m" checked>남&nbsp;&nbsp;&nbsp;
			<input type="radio"  name="customer.cstGender" value="f">여			
			<br>							
          </div>
          
          <!-- 오른쪽 -->
          <div class="col-md-6" >
          		<label for="cstBirthday">생년월일</label>
					<div class="form-inline">
						<div class="form-group">
							<select id="year" class="form-control">
								<option disabled selected>년도선택</option>

							</select>&nbsp;&nbsp;
							
							<select id="month" class="form-control">
								<option disabled selected>월 선택</option>
		          			</select>&nbsp;&nbsp;
		          			
		          			<select id="date" class="form-control">
		          				<option disabled selected>일 선택</option>
									
		          			</select>
		          			<br>
		          			<input type="hidden" id="bdayResult" name="customer.cstBirthdayTemp" value=""></input>
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
				
				<input type="submit" class="btn btn-info" id="send" value="회원가입">&nbsp;&nbsp;&nbsp;<input type="button" id="button1" class="btn btn-warning" value="취소">
     		 	<input type="hidden" id="memberCode" name="member.memCode" value="1">   		 	
     			</div>
     		</div>
     	</div>
     </form>	
</body>
</html>