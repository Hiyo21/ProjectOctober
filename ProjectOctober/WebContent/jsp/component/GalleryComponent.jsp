<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	* { margin:0px; padding:0px; }
	/* body { background-color:#525252; } */
	.item {
		margin : 5px;
		width : 100px;
		height : 100px;
		background-color : White;
		border-radius : 10px;
		float : left;
	}
	.small { width : 200px; height : 200px; }
	.grid {
	  background: #EEE;
	  max-width: 2000px;
	}
	.etpImage { width : 200px; height : 200px; }
</style>


<script src="https://cdnjs.cloudflare.com/ajax/libs/masonry/3.3.2/masonry.pkgd.min.js"></script>
<script src="${pageContext.request.contextPath}/css/lightbox/jquery.colorbox.js"></script>
<script>
	$(document).ready(function () {
		$('#masonry_container').masonry({
			itemSelector : '.item',
			columnWidth : 110
		});
		$('.group').colorbox({
			rel:'group'
		});
	});
</script>
</head>
<body>
<h1><s:property value="etpNum"/> test</h1>
<div class="panel panel-default" id="gallery">
	<div class="container-fluid">
		<div id = "masonry_container" class="grid">
			<s:iterator value="enterprise.photos">
				<div class ='item small'>
					<a class='group' href='${pageContext.request.contextPath}/<s:property value="phtAddress"/>' title='<s:property value="phtUsage"/>'>
						<img src='${pageContext.request.contextPath}/<s:property value="phtAddress"/>' class='etpImage'>
					</a>
				</div>
			</s:iterator>
		</div>
	
		<!-- <a>
		<label role="button" >
		<img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/48-bubbles/48/18.Pictures-Day-128.png"> 
		<h3>A title</h3> <h5>내용</h5>
		</label>
		</a>
		<a>
		<label role="button" >
		<img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/48-bubbles/48/18.Pictures-Day-128.png"> 
		<h3>A title</h3> <h5>내용</h5>
		</label>
		</a>
		<a>
		<label role="button" >
		<img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/48-bubbles/48/18.Pictures-Day-128.png"> 
		<h3>A title</h3> <h5>내용</h5>
		</label>
		</a> -->
	</div>
</div>

</body>
</html>