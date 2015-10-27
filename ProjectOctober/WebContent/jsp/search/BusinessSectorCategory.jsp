<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" />

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
function searchSubClass(subClass) {
	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?searchKeyword='+subClass+'&part=business';
}
</script>
<title>업종 카테고리</title>
</head>
<body>
	<s:include value="../Header.jsp" />
	
		<!-- 내가작성 -->
<div class="container">
  <ul class="nav nav-tabs">
    <li class="active">
    <a data-toggle="tab" href="#home">업종</a></li>
  </ul>

  <div class="tab-content">
   	 <div id="home" class="tab-pane fade in active">
      	<h3>업종</h3>	
   		  <div class="section">
			<div class="container">
				<div class="row">
					<div class="col-md-6"><!-- 왼쪽 -->
		            	<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
		                <button type="button" id="button3-1" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('타이')">타이식마사지</button>
		                <br><br>
		                <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			  			<button type="button" id="button3-2" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('경락')">경락마사지 교정</button>
			  			<br><br>
			  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
 						<button type="button" id="button3-3" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('두피')">두피마사지</button>
 						<br><br>
 						<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  						<button type="button" id="button3-4" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('교정')">교정</button>
					</div>
	                <div class="col-md-6"><!-- 오른쪽 -->
	                	<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
		                <button type="button" id="button3-5" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('핸드케어')">핸드케어</button>
		                <br><br>
		                <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			  			<button type="button" id="button3-6" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('바디케어')">바디케어</button>
			  			<br><br>
			  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
 						<button type="button" id="button3-7" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('네일아트')">네일아트</button>
 						<br><br>
 						<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  						<button type="button" id="button3-8" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchSubClass('발')">발마사지</button>                  
					</div>
				</div>
			</div>
		</div>
	</div><!-- 장르 --> 
   </div>
</div>
	
	
	
	
	
</body>
</html>