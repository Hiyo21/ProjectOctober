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
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script>
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});
	
	$('body').on('click','#send', function(){
		var year = $("#year option:selected").text();
		var month = $("#month option:selected").text();
		var day = $("#day option:selected").text();
		$.ajax({
			url : "<s:url value='/member/customerRegistration.action'/>",
			type : "post",
			data : {
				year : year,
				month : month,
				day : day
			},
			success : end
		});
		
		function end(){
			alert('다녀왔음');
		}
	}) 
	
	
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
<form name="customerRegistration" action="/member/customerRegistration.action" method="post" >
<div class="section">
      <div class="container">
        <div class="row">
        <!-- 오른쪽 -->
          <div class="col-md-6">
			<label for="member.memName">이름</label>
			<s:textfield class="form-control" id="custom.cstName" name="member.memName"/>          	
          	<br>
          	<label for="member.memEmail">이메일 주소</label>
			<s:textfield class="form-control" id="email" name="member.memEmail" placeholder="ID로 사용됩니다."/>
			<br>
			<label for="member.memPassword">비밀번호</label>
			<s:password class="form-control" id="password" name="member.memPassword"/>					
			<br>
			<label for="passwordck">비밀번호 확인</label>
			<s:password class="form-control" id="passwordck"/>
			<br>
			<label for="member.memGender">성별</label><br>
			<input type="radio" name="member.memGender" value="M">남&nbsp;&nbsp;&nbsp;<input type="radio" name="member.memGender" value="F">여			
			<br>							
          </div>
          
          <!-- 왼쪽 -->
          <div class="col-md-6" >
          		<label for="member.cstBirthday">생년월일</label>
					<div class="form-inline">
						<div class="form-group">
							<select id="year" name="customer.cstBirthday" class="form-control">
								<option value="">년도선택</option>
		          				<option value="1961">1961년</option>
		          				<option value="1962">1962년</option>
		          				<option value="1963">1963년</option>
		          				<option value="1964">1964년</option>
		          				<option value="1965">1965년</option>
		          				<option value="1966">1966년</option>
		          				<option value="1967">1967년</option>
		          				<option value="1968">1968년</option>
		          				<option value="1969">1969년</option>
		          				<option value="1970">1970년</option>
		          				<option value="1971">1971년</option>
		          				<option value="1972">1972년</option>
		          				<option value="1973">1973년</option>
		          				<option value="1974">1974년</option>
		          				<option value="1975">1975년</option>
		          				<option value="1976">1976년</option>
		          				<option value="1977">1977년</option>
		          				<option value="1978">1978년</option>
		          				<option value="1979">1979년</option>
		          				<option value="1980">1980년</option>
		          				<option value="1981">1981년</option>
		          				<option value="1982">1982년</option>
		          				<option value="1983">1983년</option>
		          				<option value="1984">1984년</option>
		          				<option value="1985">1985년</option>
		          				<option value="1986">1986년</option>
		          				<option value="1987">1987년</option>         
							</select>&nbsp;&nbsp;
							
							<select id="month" name="month" class="form-control">
								<option value="">월</option>
								<option value="1">1월</option>
		          				<option value="2">2월</option>
		          				<option value="3">3월</option>
		          				<option value="4">4월</option>
		          				<option value="5">5월</option>
		          				<option value="6">6월</option>
		          				<option value="7">7월</option>
		          				<option value="8">8월</option>
		          				<option value="9">9월</option>
		          				<option value="10">10월</option>
		          				<option value="11">11월</option>
		          				<option value="12">12월</option>          				
		          			</select>&nbsp;&nbsp;
		          			
		          			<select id="day" name="day" class="form-control">
								<option value="">일</option>
								<option value="01">01일</option>
			          			<option value="02">02일</option>
			          			<option value="03">03일</option>
			          			<option value="04">04일</option>
			          			<option value="05">05일</option>
			          			<option value="06">06일</option>
			          			<option value="07">07일</option>
			          			<option value="08">08일</option>
			          			<option value="09">09일</option>
			          			<option value="10">10일</option>
			          			<option value="11">11일</option>
			          			<option value="12">12일</option>
			          			<option value="13">13일</option>
			          			<option value="14">14일</option>
			          			<option value="15">15일</option>
			          			<option value="16">16일</option>
			          			<option value="17">17일</option>
			          			<option value="18">18일</option>
			          			<option value="19">19일</option>
			          			<option value="20">20일</option>
			          			<option value="21">21일</option>
			          			<option value="22">22일</option>
			          			<option value="23">23일</option>
			          			<option value="24">24일</option>
			          			<option value="25">25일</option>
			          			<option value="26">26일</option>
			          			<option value="27">27일</option>
			          			<option value="28">28일</option>
			          			<option value="29">29일</option>
			          			<option value="30">30일</option>
			          			<option value="31">31일</option>  				
		          			</select>
		          			<br>
		          			
		          			<br>
		          			<label for="phone">전화번호</label>
							<div class="form-inline">
								<div class="form-group">
									<select id="phone" name="phone" class="form-control">
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
								<s:textfield class="form-control" size="10" id="phone1" name="phone1"/>
								&nbsp;&nbsp;-&nbsp;&nbsp;
								<s:textfield class="form-control" size="10" id="phone2" name="phone2"/>
							</div>
		          			
		          			<br><label for="address">주소</label>
						<div class="form-inline">
						<s:textfield class="form-control" id="customer.cstZipcode" name="zipcode" readonly="true" size="20" placeholder="클릭해서 우편번호를 검색" onclick="zipcodeOpen()"/>
						</div>
						
						<s:textfield class="form-control" id="customer.cstAddress" name="customer.cstAddress" readonly="true" size="70"/><br>
						
						<s:textfield class="form-control" id="address2" name="customer.cstAddress" placeholder="상세주소를 입력하세요" size="70"/>		         
						</div>				
					</div>
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
				   <center> <input type="submit" id="send" value="회원가입">&nbsp;&nbsp;&nbsp;<input type="button" value="취소"></center>
     		 	</div>
	    	  </div>
	      </div>
       </form> 
</body>
</html>