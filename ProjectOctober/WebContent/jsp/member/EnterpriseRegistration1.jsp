<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/Polymer/components/bower_components/webcomponentsjs/webcomponents.min.js"></script>
<title>사업자 회원가입 1</title>
<script>
	/* TODO 밑의 제약조건 메소드에 추가할 것.
		1. 비밀번호 3자리 이하면 경고.
		2. 이메일 주소 5자리 이하면 경고.
		3. 사업자 번호 10자리 아니면 경고.
		4. 주소는 새 창 띄워서 ZIPCODE에서 받아오도록. 주소는 기본 주소 (ZIPCODE 창에서 받아오는거 ) + 상세 주소 -> readonly에서 입력 가능하게 변경.
		5. 연락처 7자리 이하 아니면 경고
		6. 업체 대표 연락처 7자리 이하면 경고
		using form-validation!
	*/

	function check() {
		var email = document.getElementById('email');
		var password = document.getElementById('password');
		var passwordck = document.getElementById('passwordck');
		var owner = document.getElementById('owner');
		var etpNum = document.getElementById('etpNum');
		var title = document.getElementById('title');
		var address = document.getElementById('address');
		var phone = document.getElementById('phone');
		var etpPhone = document.getElementById('etpPhone');
		
		if (email.value.length < 1) {
			alert('이메일을 입력해주세요');
			email.focus();
			email.select();
			return false;
		}
		if (password.value.length < 1) {
			alert('비밀번호를 입력해주세요');
			password.focus();
			password.select();
			return false;
		}
		if (passwordck.value.length < 1) {
			alert('비밀번호를 입력해주세요');
			passwordck.focus();
			passwordck.select();
			return false;
		}
		if (password.value != passwordck.value) {
			alert('비밀번호를 동일하게 입력해주세요');
			passwordck.focus();
			passwordck.select();
			return false;
		}
		if (owner.value.length < 1) {
			alert('사업자명을 입력해주세요');
			owner.focus();
			owner.select();
			return false;
		}
		if (etpNum.value.length < 1) {
			alert('사업자번호를 입력해주세요');
			etpNum.focus();
			etpNum.select();
			return false;
		}
		if (title.value.length < 1) {
			alert('업체명을 입력해주세요');
			title.focus();
			title.select();
			return false;
		}
		if (address.value.length < 1) {
			alert('주소를 입력해주세요');
			address.focus();
			address.select();
			return false;
		}
		if (phone.value.length < 1) {
			alert('연락처를 입력해주세요');
			phone.focus();
			phone.select();
			return false;
		}
		if (etpPhone.value.length < 1) {
			alert('업체 연락처를 입력해주세요');
			etpPhone.focus();
			etpPhone.select();
			return false;
		}
		
			$("#toSecondPage").submit();
	}
	
	
	$(function(){
		//Email주소 입력시 중복 체크하는 AJAX 기능.
		$('#email').keyup(function(){
			var tempEmail = $('#email').val();
			$.ajax({
				url:"member/checkEnterpriseDuplicateEmail.action",
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
							$('#toNextPageBtn').attr('disabled', false);
						}
						else{
							$('#duplicateCheckResultEmail').html('사용 불가능합니다.').css('color', 'red');
							$('#toNextPageBtn').attr('disabled', true);
						}
					}
				}			
			});
		});
		
		//사업자번호 입력시 중복 체크하는 AJAX 기능.
		$('#etpNum').keyup(function(){
			var tempNum = $('#etpNum').val();
			$.ajax({
				url:"member/checkEnterpriseDuplicateEtpNum.action",
				type: "POST",
				data: {"etpNumInput" : tempNum},
				cache: false,
				success: function(data){
					if(tempNum.length == 0){
						$('#duplicateCheckResultEtpNum').html('');
					}
					else{
						if(data.etpNumExists){
							$('#duplicateCheckResultEtpNum').html('사용 가능합니다.').css('color', 'green');
							$('#toNextPageBtn').attr('disabled', false);
						}
						else{
							$('#duplicateCheckResultEtpNum').html('사용 불가능합니다.').css('color', 'red');
							$('#toNextPageBtn').attr('disabled', true);
						}
					}
				}			
			});
		});
	});
</script>
</head>
<body>
	<s:include value="../Header.jsp"></s:include>
	<div align="center">
	<h1><b>사업자 회원가입</b></h1>
	<h4>모두 필수 입력사항입니다</h4>
	<br>
	<form action="toEnterpriseRegistraionSecondPage" method="post" id="toSecondPage">
	<div class="container">
		<div class="form-group" align="left">
			<div class="row">
				<div class="col-lg-6">
					<label for="email">이메일 주소</label>
					<s:textfield class="form-control" id="email" name="member.memEmail" placeholder="ID로 사용됩니다."/>
					<p id="duplicateCheckResultEmail"></p>
					
					<br>
					<label for="password">비밀번호</label>
					<s:password class="form-control" id="password" name="member.memPassword"/>
					
					<br>
					<label for="passwordck">비밀번호 확인</label>
					<s:password class="form-control" id="passwordck"/>
				</div>
				<div class="col-lg-6">
					<label for="owner">사업자 대표명</label>
					<s:textfield class="form-control" id="owner" name="member.memName"/>
					<br><label for="etpNum">사업자 번호</label>
					<s:textfield class="form-control" id="etpNum" name="member.enterprise.etpNum" placeholder="- 는 없이 입력해 주세요. (10자리)"/>
					<p id="duplicateCheckResultEtpNum"></p>
					
					<br><label for="title">점포명</label>
					<s:textfield class="form-control" id="title" name="member.enterprise.etpTitle"/>
					<br><label for="address">주소</label>
					<s:textfield class="form-control" id="address" name="member.enterprise.etpAddress"/>
					<br><label for="phone">업소 연락처</label>
					<s:textfield class="form-control" id="phone" name="member.enterprise.etpPhone"/>
					<br><label for="etpPhone">업체 대표 연락처</label>
					<s:textfield class="form-control" id="etpPhone" name="member.memPhone"/>
					<br><label for="certificate">사업증명서 업로드</label>
					<!-- TODO: 사업 증명서 업로드는 파일 업로드 되어야 함! -->
					<s:
				</div>
			</div>
		</div>	
	</div>
	<br>
	<div class="container" align="center">
		<div class="row">
			<div class="col-lg-6" align="right">
				<h3>1 / 3</h3>
			</div>
			<div class="col-lg-6" align="right">
				<button type="button" class="btn btn-primary" onclick="return check()" id="toNextPageBtn" >다음</button>
				</a>
			</div>
		</div>
	</div>
	</form>
	</div>
</body>
</html>