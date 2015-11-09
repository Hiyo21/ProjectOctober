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
function searchFeature(searchKeyword) {
	location.href= '${pageContext.request.contextPath}/search/categorySearch.action?searchKeyword='+searchKeyword+'&part=feature';
}
</script>
<style type="text/css">
	textarea {width:800px; height:300px;overflow:visible;}
</style>
<title>이용자 검색 카테고리</title>
</head>
<body>
<s:include value="../Header.jsp" />
<div id="portfolio" class="container text-center bg-grey" align="center">
	<h2>특징으로 검색</h2>
	<h4>원하는 서비스를 제공하는 업체를 검색해보세요!</h4><br><br>
	<div class="row text-center">
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('여성전용')">
				<img src="/ProjectOctober/image/sch-feat-female.jpg" alt="Paris" width="400" height="300">
				<p><strong>여성전용</strong></p>
				<p>편안하게 관리받으세요!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('남녀전용')">
				<img src="/ProjectOctober/image/sch-feat-male.jpg" alt="New York" width="400" height="300">
				<p><strong>남성가능</strong></p>
				<p>남성 고객님도 가능합니다!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('커플룸')">
				<img src="/ProjectOctober/image/sch-feat-couple.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>커플룸</strong></p>
				<p>연인과 함께 관리를!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('파우더룸')">
				<img src="/ProjectOctober/image/sch-feat-powder.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>파우더룸</strong></p>
				<p>나가실 때에도 완벽하게!</p>
			</div>
		</div>
	</div>
	<div class="row text-center">
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('연중무휴')">
				<img src="/ProjectOctober/image/sch-feat-365.jpg" alt="Paris" width="400" height="300">
				<p><strong>연중무휴</strong></p>
				<p>원하는 날짜 언제라도!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('24시간 운영')">
				<img src="/ProjectOctober/image/sch-feat-24.jpg" alt="New York" width="400" height="300">
				<p><strong>24시간 운영</strong></p>
				<p>원하는 시간 언제라도!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('심야영업')">
				<img src="/ProjectOctober/image/sch-feat-night.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>심야영업</strong></p>
				<p>퇴근 후에도 이용하세요!</p>
			</div>
		</div>
		<div class="col-md-3">
			<div class="thumbnail" onclick="searchFeature('회원권 제도')">
				<img src="/ProjectOctober/image/sch-feat-card.jpg" alt="San Francisco" width="400" height="300">
				<p><strong>회원권제도</strong></p>
				<p>보다 저렴하게 이용하세요!</p>
			</div>
		</div>
	</div>
</div>
<!-- 내가 작성 -->	<!-- 구버전 -->
<!-- <div class="container">
	<h2>특징으로 검색</h2><br><br>
	<div class="row">
		<div class="col-md-6">왼쪽
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('남성전용')">남성전용</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('주차장')">주차장여부</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('여성전용')">여성전용</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('24시')">24시 운영</button>
		</div>
		<div class="col-md-6">오른쪽
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('아이')">어린아이 동반여부</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('커플')">커플석 여부</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('남녀')">남녀공통</button>
			<br><br>
			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			<button type="button" style="width:300px; height:50px;" class="btn btn-primary btn-lg" onclick="searchFeature('연중무휴')">연중무휴</button>                  
		</div>
	</div>
</div> -->
</body>
</html>	
