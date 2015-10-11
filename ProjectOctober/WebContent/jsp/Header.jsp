<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script>
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});
</script>
</head>
<body>
<div class="header-wrap">
	<header id="header">
		<div class="container">
			<div class="row">
				<div class="col-sm-12 col-md-12 col-lg-12">
					<p> </p>
				</div>
			</div>
		</div>

		<div class="hidden-xs header-upper">
			<div class="container hidden-xs">
				<s:if test="#session.loginId == null">
					<div class="row">
						<div class="col-sm-1 col-md-1 col-lg-1">
							<img src="${pageContext.request.contextPath}/image/relaxation_logo_test.jpg" style="max-width: 120px; max-height: 70px; margin-right: 10px; alt="logo" />
						</div>
						<div class="col-sm-5 col-md-5 col-lg-7">
							<h1>[Service Name]</h1>
						</div>
						<div class="col-xs-6 col-sm-3 col-md-3 col-lg-2">
							<br>
							<a href="toRegistrationPage.action" class="btn btn-info btn-block header-newmember-btn"><span class="glyphicon glyphicon-user"></span> 회원등록</a>
						</div>
						<div class="col-xs-6 col-sm-3 col-md-3 col-lg-2">
							<br>
							<a href="toLoginPage.action" class="btn btn-primary btn-block header-mypage-btn"><span class="glyphicon glyphicon-log-in"></span> 로그인 / 예약체크</a>
						</div>
					</div>
				</s:if>
				<s:if test="#session.loginId != null && #session.loginId == 'enterprise' || #session.loginId == 'customer'">
					<div class="row">
					<div class="col-sm-6 col-md-6 col-lg-12">
						<h1><s:property value="#session.loginName"/> 님, 환영합니다!</h1>
					</div>
					<div class="col-xs-6 col-sm-3 col-md-3">
						<br>
						<!-- jQuery로 새로운 팝업창/dialog창 열고 notification 리스트 불러오게 링크는 JS 메소드로..어떻게?-->
						<a href="#~~method~~(#session.loginId)" data-toggle="notification-popover" placement="auto" title="${session.loginName}님의 알림" data-content="여기서가 문제. 리스트를 받아와야 함"><button class="btn btn-warning btn-btn block"> 알림 <span class="badge">1<!-- 여기에는  notification 넘버...어떻게??--></span></button></a>
					</div>
					<div class="col-xs-6 col-sm-3 col-md-3">
						<br>
						<a href="toEnterpriseMyPage" class="btn btn-primary btn-block header-mypage-btn">마이 페이지</a>
					</div>
				</div>
				</s:if>
			</div>
		</div>

		<div class="navbar navbar-default">
			<div class="container">
				<div class="row">					
					<div class="navbar-collapse collapse">
						<s:if test="#session.loginId == null || #session.loginId == 'customer'">
							<ul class="nav navbar-nav" id="test1">
								<li>
									<a href="toAreaCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-map-marker fa-fw"></i></span>지역검색
									</a>
								</li>
								<li>
									<a href="toBusinessSectorCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-building fa-fw"></i></span>업종검색
									</a>
								</li>
								<li>
									<a href="toFeatureCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-road fa-fw"></i></span>특징검색
									</a>
								</li>
								<li>
									<a href="toMoodCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-leaf fa-fw"></i></span>기분/상태 검색
									</a>
								</li>
							</ul>
						</s:if>
						
						<s:if test="#session.loginId == 'enterprise'">
							<ul class="nav navbar-nav">
								<li>
									<a href="toEnterpriseMyPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-male fa-fw"></i></span>내 페이지로
									</a>
								</li>
								<li>
									<a href="toReservationManagementPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-calendar-check-o fa-fw"></i></span>예약 관리
									</a>
								</li>
								<li>
									<a href="toMiscSettingPage.action">
										<span class="nav-icon-wrap"><i class="fa ellipsis-h fa-fw"></i></span>기타 설정
									</a>
								</li>
								<li>
									<a href="toEnterpriseSupportPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-map-signs fa-fw"></i></span>사업자 지원 센터
									</a>
								</li>
							</ul>
						</s:if>
						
						<s:if test ="#session.loginId == null || #session.loginId == 'customer'">
						<form action="searchFreeKeyword" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8">
	
						<div class="input-group input-group-sm">
							<input name="search" class="form-control" placeholder="검색" type="search">
							<span class="input-group-btn">
								<button class="btn btn-default fa fa-search" type="submit"></button>
							</span>
						</div>
						</form>
						</s:if>
					</div>
				</div>
			</div>
		</div>
	</header>
</div>
</body>
</html>