<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	.etpImage { width : 200px; height : 200px; }
</style>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lightbox/colorbox.css">
<script src="${pageContext.request.contextPath}/css/lightbox/jquery.colorbox.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.group').colorbox({
		rel:'group'	
	});
});
</script>
<script type="text/javascript">
function uploadOpen() {
	window.open("${pageContext.request.contextPath}/enterprise/toImageUploadPage.action","newwin","top=200,left=400,width=500,height=500,resizable=no,scrollbars=yes");
}
</script>
</head>
<body>
<input type="button" value="사진업로드" onclick="uploadOpen()" class="edit">
<div class="panel panel-default" id="gallery">
	<div class="container-fluid">
		<s:iterator value="#session.enterprise.photos">

			<a class='group' href='${pageContext.request.contextPath}/<s:property value="phtAddress"/>' title='<s:property value="phtUsage"/>'>
				<img src='${pageContext.request.contextPath}/<s:property value="phtAddress"/>' class='etpImage'>
			</a>

		</s:iterator>
	</div>
</div>

</body>
</html>