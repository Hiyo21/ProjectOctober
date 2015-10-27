<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이미지 업로드</title>
<style>
img {
	height : 300px;
	width : auto;
}
</style>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
function closing() {
	this.close();
	window.opener.location.reload();
}
</script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
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
					<s:form action="imageUploadAction" method="POST" enctype="multipart/form-data">
						<h3>갤러리로 업로드할 파일을 선택해 주세요.</h3>
						<s:file name="imageToUpload" />
						<%-- <input type="hidden" name="etpNum" value="${enterprise.etpNum}" id="etpNumHidden"/> --%>
						<input type="hidden" name="etpEmail" value="${enterprise.etpEmail}" id="etpEmailHidden" />
						<s:submit/>
					</s:form>
				</div>
			</div>
				
			<div class="row">
				<div class="col-xs-12">
					<s:if test="uploaded != null">
						<p>사업자 번호 : <s:property value="etpNum"/> 님이 업로드 하신 갤러리 사진 </p>
						
						<s:if test="uploaded == true">
							<p style="color: green;"> 업로드에 성공하였습니다!</p>
							<input type="hidden" name="etpNum" value="${enterprise.etpNum}" id="etpNumHidden1"/>
							<input type="hidden" name="etpEmail" value="${enterprise.etpEmail}" id="etpEmailHidden2" />
							<button type="button" class="btn btn-primary" onclick="closing()">닫기</button>
						</s:if>
						
						<s:if test="uploaded == false">
							<p style="color: red;"> 업로드에 실패하였습니다! 다시 업로드해 주시기 바랍니다. </p>
						</s:if>
					</s:if>
				</div>
			</div>
		</div>
	</div>
</body>
</html>