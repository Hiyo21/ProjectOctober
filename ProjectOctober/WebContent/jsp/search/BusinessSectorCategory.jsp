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
<%-- <link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css"> --%>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" /> --%>
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
<div id="portfolio" class="container text-center bg-grey" align="center">
	<h2>업종으로 검색</h2>
	<h4>서비스 받길 원하는 업종으로 검색해보세요!</h4><br><br>
	<div class="row text-center">
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('타이')">
				<img src="/ProjectOctober/image/sch-biz-tai.jpg" alt="Paris" width="400" height="300">
				<p><strong>타이마사지</strong></p>
				<p>몸과 마음의 휴식 모두를!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('경락')">
				<img src="/ProjectOctober/image/sch-biz-gr.jpg" alt="New York" width="400" height="300">
				<p><strong>경락마사지</strong></p>
				<p>불편했던 몸을 편안하게!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('두피')">
				<img src="/ProjectOctober/image/sch-biz-hair.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>두피마사지</strong></p>
				<p>두피도 관리가 필요합니다!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('발관리')">
				<img src="/ProjectOctober/image/sch-biz-foot.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>발마사지</strong></p>
				<p>소중한 당신의 발을 위해서!</p>
			</div>
		</div>
	</div>
	<div class="row text-center">
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('아로마마사지')">
				<img src="/ProjectOctober/image/sch-biz-aroma.jpg" alt="Paris" width="400" height="300">
				<p><strong>아로마마사지</strong></p>
				<p>향긋한 아로마로 심신의 안정을!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('웨딩관리')">
				<img src="/ProjectOctober/image/sch-biz-wedding.jpg" alt="New York" width="400" height="300">
				<p><strong>웨딩관리</strong></p>
				<p>평생에 단 한 번뿐인 날을 위해!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('네일케어')">
				<img src="/ProjectOctober/image/sch-biz-hand.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>네일케어</strong></p>
				<p>손 끝까지도 예뻐지세요!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchSubClass('프리미엄젤')">
				<img src="/ProjectOctober/image/sch-biz-gel.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>프리미엄젤</strong></p>
				<p>남들과는 다른 손으로 차별화!</p>
			</div>
		</div>
	</div>
</div>
<!-- 내가작성 -->	<!-- 구버전 -->
<!-- <div class="container" align="center">
	<div class="row">
		<h2>업종으로 검색</h2><br><br>
		<div class="col-md-6">왼쪽
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-1" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('타이')">타이식마사지</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-2" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('경락')">경락마사지 교정</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-3" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('두피')">두피마사지</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-4" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('교정')">교정</button>
		</div>
		<div class="col-md-6">오른쪽
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-5" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('핸드케어')">핸드케어</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-6" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('바디케어')">바디케어</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-7" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('네일아트')">네일아트</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button3-8" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchSubClass('발')">발마사지</button>                  
		</div>
	</div>
</div> -->
</body>
</html>