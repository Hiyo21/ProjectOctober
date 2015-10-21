<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
							<h1><a href="toMainPage.action">[Service Name]</a></h1>
						</div>
						<div class="col-xs-6 col-sm-3 col-md-3 col-lg-2">
							<br>
							<a class="btn btn-info btn-block header-newmember-btn" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-user"></span> 회원등록</a>
							
							<!-- Modal -->
							<div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							  <div class="modal-dialog">
							    <div class="modal-content">
							    	<div class="modal-header">
							    		<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span> <span class="sr-only">close</span></button>
							    		<h3 class="modal-title" style="color: gray;">회원가입 선택</h3>
							    	</div>
							      <div class="modal-body">
							      <br><br><br>
							      <br><br>
							        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action" 
									role="button" style="vertical-align:center" id="etpBT"><h1>사업자</h1></a>
				
									<a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action" 
									role="button" style="vertical-align:center" id="cstBT"><h1>이용자</h1></a>
									<br><br><br><br><br>
							      </div>
							    </div>
							  </div>
							</div>
						</div>
						<div class="col-xs-6 col-sm-3 col-md-3 col-lg-2">
							<br>
							<a href="toLoginPage.action" class="btn btn-primary btn-block header-mypage-btn"><span class="glyphicon glyphicon-log-in"></span> 로그인 / 예약체크</a>
						</div>
					</div>
				</s:if>
				<s:if test="#session.loginId != null">
					<div class="row">
					<div class="col-sm-6 col-md-6 col-lg-12">
						<h1><s:property value="#session.loginName"/> 님, 환영합니다!</h1>
					</div>
					<div class="col-xs-6 col-sm-3 col-md-3">
						<br>
						<!-- jQuery로 새로운 팝업창/dialog창 열고 notification 리스트 불러오게 링크는 JS 메소드로..어떻게?-->
						<a href="#~~method~~(#session.loginId)" data-toggle="notification-popover" placement="auto" title="${session.loginName}님의 알림" data-content="여기서가 문제. 리스트를 받아와야 함"><button class="btn btn-warning btn-sm block"> 알림 <span class="badge">1<!-- 여기에는  notification 넘버...어떻게??--></span></button></a>
					</div>

					<div class="col-xs-6 col-sm-6 col-md-6">
						<a href="${pageContext.request.contextPath}/toMainPage.action" class="btn btn-primary btn-sm">메인페이지</a>
						<s:if test="#session.memCode == 1">
							<a href="${pageContext.request.contextPath}/member/toEnterpriseMyPage.action" class="btn btn-primary btn-sm">마이페이지</a>

							<a href="${pageContext.request.contextPath}/member/toEnterpriseMyPage.action" class="btn btn-primary btn-md-2">마이페이지</a>
							<!-- 달력 Test code. Action에서 불러와야만 한다! -->
							<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${session.loginEtpNum}" class="btn btn-danger btn-md-2">예약 페이지</a>
							<!--  -->

						</s:if>
						<s:if test="#session.memCode == 2">
							<a href="${pageContext.request.contextPath}/member/toCustomerMainPage.action" class="btn btn-primary btn-sm">마이페이지</a>
						</s:if>
						<s:if test="#session.memCode == 3">
							<a href="${pageContext.request.contextPath}/enterprise/AllNoRegisterEtpList.action" class="btn btn-primary btn-sm">마이페이지</a>
						</s:if>
						<!-- 공통 로그아웃 -->
							<a href="${pageContext.request.contextPath}/member/logoutProcess.action" class="btn btn-primary btn-sm">로그아웃</a>
					</div>
				</div>
				</s:if>
			</div>
		</div>

		<div class="navbar navbar-default">
			<div class="container">
				<div class="row">					
					<div class="navbar-collapse collapse">
						<s:if test="#session.loginId != null || #session.memCode == 1">
							<ul class="nav navbar-nav" id="test1">
								<li>
									<a href="${pageContext.request.contextPath}/search/toAreaCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-map-marker fa-fw"></i></span>지역검색
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/search/toBusinessSectorCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-building fa-fw"></i></span>업종검색
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/search/toFeatureCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-road fa-fw"></i></span>특징검색
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/search/toMoodCategoryPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-leaf fa-fw"></i></span>기분/상태 검색
									</a>
								</li>
							</ul>
						</s:if>
						
						<s:if test="#session.memCode == 2">
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
						
						<s:if test ="#session.loginId != null || #session.memCode == '2'">
						<form action="/ProjectOctober/search/searchFreeKeyword.action" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8">
	
						<div class="input-group input-group-sm" >
							<input name="searchKeyword" class="form-control" placeholder="검색" type="search" style="display: inline-block;text-align: right;">
							<span class="input-group-btn">
								<button class="btn btn-default fa fa-search" type="submit"></button>
							</span>
						</div>
						</form>
						</s:if>
				<!-- <form action="/ProjectOctober/search/searchFreeKeyword.action" class="navbar-form navbar-left" role="search">
			        <div class="form-group">
			          <input type="text" name="searchKeyword" class="form-control" placeholder="Search">
			        </div>
			        <button type="submit" class="btn btn-default">Search</button>
			     </form> -->
					</div>
				</div>
			</div>
		</div>
	</header>
</div>
</body>
</html>