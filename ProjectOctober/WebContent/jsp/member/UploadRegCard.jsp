<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사업자 등록증 업로드</title>
<script>
	function closeWindow(){
		this.close();
	}
</script>
</head>
<body>
	<s:form action="regCardUploadAction" method="POST" enctype="multipart/form-data">
		<div class="container">업로드할 파일을 선택해 주세요.
			<s:file name="fileToUpload" />
		</div>
		<input type="hidden" name="etpNum" value="${etpNumInput}"/>
		<s:submit/>
	</s:form>
		<s:if test="etpNumInput != null">
			<s:property value="etpNumInput"/>
		</s:if>
	<button class="btn btn-warning" onclick="closeWindow()">창 닫기</button>	
</body>
</html>