<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사업자 등록증 업로드</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
	$(function(){
		$('#backBtn').click(function(){
			if($('#etpEmailHidden').val().length != 0){
				location.assign('backToFirstRegistrationPage.action?email=' + $('#etpEmailHidden').val());
			}else{
				location.assign('backToFirstRegistrationPage.action?email=' + $('#etpEmailHidden2').val());
			}
		});
		
		$('#forwardBtn').click(function(){
			location.assign('toEnterpriseRegistraionSecondPage.action?etpNum=' + $('#etpNumHidden1').val());
		});
	});
	
</script>
</head>
<body>
	<div class="container-fluid">
		<!-- TODO: 뭐해야 하는지 소개 문구~~ -->
		<div class="row">
			<div class="col-xs-12"></div>
				<s:if test="uploaded != null">
					<s:if test="uploaded == true">
						<img src="${pageContext.request.contextPath}/${loc.phtAddress}">
					</s:if>
				</s:if>
			</div>
		</div>
		
		<div class="row">
			<div class="col-xs-12">
				<s:form action="regCardUploadAction" method="POST" enctype="multipart/form-data">
					<h3>업로드할 파일을 선택해 주세요.</h3>
					<s:file name="fileToUpload" />
					<input type="hidden" name="etpNum" value="${member.enterprise.etpNum}" id="etpNumHidden"/>
					<input type="hidden" name="etpEmail" value="${member.enterprise.etpEmail}" id="etpEmailHidden" />
					<s:submit/>
				</s:form>
			</div>
		</div>
		
		<div class="row">
			<div class="col-xs-12">
				<s:if test="uploaded != null">
					<p>사업자 번호 : <s:property value="etpNum"/> 님의 사업자 등록증 </p>
					
					<s:if test="uploaded == true">
						<p style="color: green;"> 업로드에 성공하였습니다!</p>
						<input type="hidden" name="etpNum" value="${etpNum}" id="etpNumHidden1"/>
						<input type="hidden" name="etpEmail" value="${etpEmail}" id="etpEmailHidden2" />
					</s:if>
					
					<s:if test="uploaded == false">
						<p style="color: red;"> 업로드에 실패하였습니다! 다시 업로드해 주시기 바랍니다. </p>
					</s:if>
				</s:if>
			</div>
		</div>
		
	<div class="row">
		<div class="col-lg-4" align="left"><button type="button" class="btn btn-primary" id="backBtn">이전</button></div>
		<div class="col-lg-4" align="center"><h3>2 / 3</h3></div>
		<div class="col-lg-4" align="right"><button type="button" class="btn btn-primary" id="forwardBtn">다음</button></div>
	</div>
</body>
</html>