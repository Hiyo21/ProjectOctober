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

function deleteImage(num){
	$.ajax({
		url : '${pageContext.request.contextPath}/enterprise/deleteImage.action',
		type : 'POST',
		data : {'photoLocation.photoNum' : num},
		success : printPht
	});
}

function printPht(){
	$.ajax({
		url : '${pageContext.request.contextPath}/enterprise/selectGalleryList.action',
		type : 'GET',
		data : {'etpNum' : <s:property value="#session.enterprise.etpNum"/>},
		success : function(data){
			console.log(data);
			
			var items =  data.enterprise.photos;
			var print ='';
			$.each(items, function(index, item){
				print += '<a class="group" href="${pageContext.request.contextPath}/'+item.phtAddress+'" ';
				print += 'title="'+item.phtUsage+'">';
				print += '<img src="${pageContext.request.contextPath}/'+item.phtAddress+'" ';
				print += 'class = "phtImage"></a>';
				print += '<a class="btn btn-danger edit" role="button" onclick="deleteImage('+index+')">삭제</a>';
			});
			$('#gallery').html(print);
		}
	});
	
	
}

</script>
</head>
<body>
<!-- 이미지 업로드 -->
<input type="button" value="사진업로드" onclick="uploadOpen()" class="edit">
<!-- 이미지 출력 -->
<div class="panel panel-default">
	<div class="container-fluid" id="gallery">
		<s:iterator value="#session.enterprise.photos">
			<a class='group' href='${pageContext.request.contextPath}/<s:property value="phtAddress"/>' title='<s:property value="phtUsage"/>'>
				<img src='${pageContext.request.contextPath}/<s:property value="phtAddress"/>' class='etpImage'>
			</a>
			<a class="btn btn-danger edit" role="button" onclick='deleteImage(<s:property value="photoNum"/>)'>
			삭제
			</a>
		</s:iterator>
	</div>
</div>

</body>
</html>