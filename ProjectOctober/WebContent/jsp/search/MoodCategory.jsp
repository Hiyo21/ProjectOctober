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
function searchMood(searchKeyword) {
	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?searchKeyword='+searchKeyword+'&part=mood';
}
</script>
<title>기분/ 상태 카테고리</title>
</head>
<body>
<s:include value="../Header.jsp" />
<div id="portfolio" class="container text-center bg-grey" align="center">
	<h2>기분 / 상태로 검색</h2>
	<h4>현재의 기분이나 상태로 업체를 검색해보세요!</h4><br><br>
	<div class="row text-center">
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('경락')">
				<img src="/ProjectOctober/image/sch-mood-back.jpg" alt="Paris" width="400" height="300">
				<p><strong>허리가 아플 때</strong></p>
				<p>앉아서 일하는 직장인들을 위해!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('경락')">
				<img src="/ProjectOctober/image/sch-mood-neck.jpg" alt="New York" width="400" height="300">
				<p><strong>목과 어깨가 결릴 때</strong></p>
				<p>컴퓨터 사용이 많은분께 추천!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('타이')">
				<img src="/ProjectOctober/image/sch-mood-leg.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>다리가 부었을 때</strong></p>
				<p>더이상 고민하지 마세요!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('웨딩관리')">
				<img src="/ProjectOctober/image/sch-mood-special.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>특별한 날을 위한 관리</strong></p>
				<p>특별한 날에는 특별한 관리를!</p>
			</div>
		</div>
	</div>
	<div class="row text-center">
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('아로마마사지')">
				<img src="/ProjectOctober/image/sch-mood-aroma.jpg" alt="Paris" width="400" height="300">
				<p><strong>마음의 편안함을 찾고 싶을 때</strong></p>
				<p>심신의 안정을 찾아드립니다!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('두피')">
				<img src="/ProjectOctober/image/sch-mood-hair.jpg" alt="New York" width="400" height="300">
				<p><strong>머릿결이 푸석할 때</strong></p>
				<p>머릿결도 관리가 필요합니다!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('심야영업')">
				<img src="/ProjectOctober/image/sch-mood-off.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>퇴근 후에 관리받고 싶을 때</strong></p>
				<p>시간에 구애받지 마세요!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchMood('네일케어')">
				<img src="/ProjectOctober/image/sch-mood-nail.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>손톱이 자주 갈라질 때</strong></p>
				<p>손이 예뻐야 진정한 미인!</p>
			</div>
		</div>
	</div>
</div>
<!-- 내가작성 -->	<!-- 구버전 -->
<!-- <div class="container" align="center">
	<h2>기분 / 상태로 검색</h2><br><br>
	<div class="row">
		<div class="col-md-6">왼쪽
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-1" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('교정')">다리를 교정하고 싶을 때</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-2" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('교정')">허리디스크 교정</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-3" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('발')">발관리</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-4" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('손')">손관리</button>
		</div>
		<div class="col-md-6">오른쪽
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-5" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('교정')" >골반교정</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-6" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('마사지')">부종제거</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-7" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('페이스')" >피부 화이트닝</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" id="button2-8" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchMood('네일')">손톱관리</button>                  
		</div>
	</div>
</div> -->
</body>
</html>