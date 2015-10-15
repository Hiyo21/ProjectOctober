<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/lightbox/colorbox.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="../css/lightbox/jquery.colorbox.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.group').colorbox({
		rel:'group',
		open: true	
	});
});
</script>
</head>
<body>
<h1>LIGHTBOX</h1>
<!-- jquery 없는 헤더 include -->
<s:include value="Header_no_jQuery.jsp"></s:include>

<!-- 라이트박스 세 페이지에 들어갈 이미지 -->
<!-- 이미지 주소만 변경해서 (href) 사용합니다 -->
<!-- 좌측 상단에 나타나는 제목을 (title) 변경할 수 있습니다 -->
<a class="group" href="http://farm9.staticflickr.com/8242/8558295633_f34a55c1c6_b.jpg" title="img1"></a>
<a class="group" href="http://farm9.staticflickr.com/8382/8558295631_0f56c1284f_b.jpg" title="img2"></a>
<a class="group" href="http://farm9.staticflickr.com/8225/8558295635_b1c5ce2794_b.jpg" title="img3"></a>
</body>
</html>