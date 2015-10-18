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
		1. 비밀번호 3자리 이하면 경고. complete!!
		2. 이메일 주소 5자리 이하면 경고. complete!!
		3. 사업자 번호 10자리 아니면 경고. complete!!
		4. 주소는 새 창 띄워서 ZIPCODE에서 받아오도록. 주소는 기본 주소 (ZIPCODE 창에서 받아오는거 ) + 상세 주소 -> readonly에서 입력 가능하게 변경.

		5. 연락처 7자리 이하 아니면 경고.
		6. 업체 대표 연락처 7자리 이하면 경고

		5. 연락처 7자리 이하 아니면 경고
		6. 업체 대표 연락처 7자리 이하면 경고

	*/

	function check() {
		var email = document.getElementById('email');
		var password = document.getElementById('password');
		var passwordck = document.getElementById('passwordck');
		var owner = document.getElementById('owner');
		var etpNum = document.getElementById('etpNum');
		var title = document.getElementById('title');
		var zipcode = document.getElementById('zipcode');
		var address = document.getElementById('address2');
		var phone = document.getElementById('phone');
		var phone1 = document.getElementById('phone1');
		var phone2 = document.getElementById('phone2');
		var etpPhone = document.getElementById('etpPhone');
		var etpPhone1 = document.getElementById('etpPhone1');
		var etpPhone2 = document.getElementById('etpPhone2');
		
		if (email.value.length < 6) {
			alert('이메일을 6자 이상 입력해주세요');
			email.focus();
			email.select();
			return false;
		}
		if (password.value.length < 4) {
			alert('비밀번호를 4자 이상 입력해주세요');
			password.focus();
			password.select();
			return false;
		}
		if (passwordck.value.length < 4) {
			alert('비밀번호를 4자 이상 입력해주세요');
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
		if (etpNum.value.length != 10) {
			alert('사업자번호를 10자로 입력해주세요');
			etpNum.focus();
			etpNum.select();
			return false;
		}
		if (title.value.length < 1) {
			alert('점포명을 입력해주세요');
			title.focus();
			title.select();
			return false;
		}
		if (zipcode.value.length < 1) {
			alert('우편번호를 검색하여 입력해주세요');
			zipcode.focus();
			zipcode.select();
			return false;
		}
		if (address.value.length < 1) {
			alert('상세주소를 입력해주세요');
			address.focus();
			address.select();
			return false;
		}
		if (phone.value.length < 1) {
			alert('연락처를 선택해주세요');
			phone.focus();
			phone.select();
			return false;
		}
		if (phone1.value.length < 3) {
			alert('연락처를 3자 이상 입력해주세요');
			phone1.focus();
			phone1.select();
			return false;
		}
		if (phone2.value.length < 4) {
			alert('연락처를 4자 이상 입력해주세요');
			phone2.focus();
			phone2.select();
			return false;
		}
		if (etpPhone.value.length < 1) {
			alert('업체 연락처를 입력해주세요');
			etpPhone.focus();
			etpPhone.select();
			return false;
		}
		if (etpPhone1.value.length < 3) {
			alert('업체 연락처를 3자 이상 입력해주세요');
			etpPhone1.focus();
			etpPhone1.select();
			return false;
		}
		if (etpPhone2.value.length < 4) {
			alert('업체 연락처를 4자 이상 입력해주세요');
			etpPhone2.focus();
			etpPhone2.select();
			return false;
		}
		
			$("#toSecondPage").submit();
	}
	
	
/* 	$(function(){
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
			
	}); */
	
	function zipcodeOpen() {
		window.open("${pageContext.request.contextPath}/member/toZipcodePage.action","newwin","top=200,left=400,width=500,height=500,resizable=no,scrollbars=yes");
	}	
	
</script>
</head>
<body>
	<s:include value="../Header.jsp"></s:include>
	<div align="center">
	<h1><b>사업자 회원가입</b></h1>
	<h4>모두 필수 입력사항입니다</h4>
	<br>
	

	<form action="${pageContext.request.contextPath}/member/toEnterpriseRegistraionSecondPage" id="toSecondPage" name="joinform">
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
					
					<br><label for="title">업체명</label>
					<s:textfield class="form-control" id="title" name="member.enterprise.etpTitle"/>
					
					<br><label for="address">주소</label>
					<div class="form-inline">
					<s:textfield class="form-control" id="zipcode" name="zipcode" readonly="true" size="22" placeholder="클릭해서 우편번호를 검색" onclick="zipcodeOpen()"/>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<s:textfield class="form-control" id="address1" name="address1" readonly="true" size="40"/>
					</div>
					<s:textfield class="form-control" id="address2" name="address2" placeholder="상세주소를 입력하세요"/>
					
					<br><label for="phone">업체 대표 연락처</label>
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
						<s:textfield class="form-control" id="phone1" name="phone1"/>
						&nbsp;&nbsp;-&nbsp;&nbsp;
						<s:textfield class="form-control" id="phone2" name="phone2"/>
					</div>
					
					<br><label for="etpPhone">업체 연락처</label>
					<div class="form-inline">
						<div class="form-group">
							<select id="etpPhone" name="etpPhone" class="form-control">
								<option value="">번호선택</option>
								<option value="02">02</option>
								<option value="031">031</option>
								<option value="032">032</option>
								<option value="033">033</option>
								<option value="041">041</option>
								<option value="042">042</option>
								<option value="043">043</option>
								<option value="051">051</option>
								<option value="052">052</option>
								<option value="053">053</option>
								<option value="055">055</option>
								<option value="061">061</option>
								<option value="062">062</option>
								<option value="063">063</option>
								<option value="064">064</option>
							</select>
						</div>
						&nbsp;&nbsp;-&nbsp;&nbsp;
						<s:textfield class="form-control" id="etpPhone1" name="etpPhone1"/>
						&nbsp;&nbsp;-&nbsp;&nbsp;
						<s:textfield class="form-control" id="etpPhone2" name="etpPhone2"/>
					
					<br><label for="certificate">사업증명서 업로드</label>
					<!-- TODO: 사업 증명서 업로드는 파일 업로드 되어야 함! -->
					<%-- <s:textfield class="form-control" id="etpRegCard" name=""/> --%>
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
			</div>
		</div>
	</div>
	</form>
	</div>
</body>
</html>