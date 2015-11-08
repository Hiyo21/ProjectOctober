<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- LINK 랑 SCRIPT 임포트하지 말 것! -->
<script>
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});
</script>

</head>
<body>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<%-- <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>                        
			</button> --%>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/toMainPage.action">a#shop</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<s:if test="#session.loginId != null">
					<s:if test="#session.memCode==1">	<!-- 사업자 -->
						<li><a href="${pageContext.request.contextPath}/enterprise/takeEtp.action">
							<span class="glyphicon glyphicon-home"></span> 내페이지</a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${session.loginEtpNum}">
							<span class="glyphicon glyphicon-calendar"></span> 예약관리</a></li>
						<li><a href="${pageContext.request.contextPath}/highchart1.action?etpEmail=${session.loginId}">
							<span class="glyphicon glyphicon-zoom-in"></span> 통계분석</a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/toMiscSettingPage.action">
							<span class="glyphicon glyphicon-cog"></span> 기타설정</a></li>
						<li><a href="${pageContext.request.contextPath}/enterprise/toEnterpriseMyPage.action">
							<span class="glyphicon glyphicon-user"></span> 나의정보</a></li>
					</s:if>
					<s:if test="#session.memCode==2">	<!-- 개인고객 -->
						<li><a href="${pageContext.request.contextPath}/search/toBusinessSectorCategoryPage.action">
							<span class="glyphicon glyphicon-briefcase"></span>업종검색</a></li>
						<li><a href="${pageContext.request.contextPath}/search/toFeatureCategoryPage.action">
							<span class="glyphicon glyphicon-flag"></span>특징검색</a></li>
						<li><a href="${pageContext.request.contextPath}/search/toMoodCategoryPage.action">
							<span class="glyphicon glyphicon-heart"></span>기분상태검색</a></li>
						<li><a href="${pageContext.request.contextPath}/toMainPage.action">
							<span class="glyphicon glyphicon-globe"></span>지도검색</a></li>
						<form action="${pageContext.request.contextPath}/search/searchFreeKeyword.action" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8" role="search">
							<input type="text" name="searchKeyword" class="form-control" placeholder="Search">
							<button type="submit" title="Search" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
						</form>
					</s:if>
					<s:if test="#session.memCode==1">	<!-- 관리자 -->
					</s:if>
				</s:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<s:if test="#session.loginId == null">
					<li><a data-toggle="modal" href="#myModal"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
					<!-- Modal --> <!-- 구버전 -->
					<%-- <div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="btn btn-default" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">close</span></button>
									<h3 class="modal-title" style="color: gray;">회원가입 선택</h3>
								</div>
								<div class="modal-body" style="vertical-align:center"><br><br><br><br><br>							     
									<div class="col-md-6">
										<a href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action">
										<h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="etpBT">사업자</button></h1></a>								        	 	        	
									</div>
									<div class="col-md-6">
										<a href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action">
										<h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="cstBT">이용자</button></h1></a>								        	
									</div>   
									<br><br><br><br><br><br><br><br><br><br>			
								</div>
							</div>
						</div>
					</div> --%>
					<!-- Modal -->
					<div class="modal fade" id="myModal" role="dialog">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h3 class="modal-title">회원가입 선택</h3>
								</div>
								<br><br>
								<div class="modal-body" align="center">
									<div class="row">
										<div class="col-md-6">
											<a href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action">
											<h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="etpBT">사업자</button></h1></a>
											<br><br>								        	 	        	
										</div>
										<div class="col-md-6">
											<a href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action">
											<h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="cstBT">이용자</button></h1></a>
											<br><br>								        	
										</div>
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					<li><a href="${pageContext.request.contextPath}/member/toLoginPage.action"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</s:if>
				<s:else>
					<li><a href="${pageContext.request.contextPath}/member/logoutProcess.action"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
				</s:else>
			</ul>		
		</div>
	</div>
</nav>
  

<!-- 구버전 -->
<%-- <div class="container-fluid">
<!-- Second navbar for categories -->
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="row">
			<!-- 로고 -->
				<div class="nav col-md-1 col-md-pull-2">
				<!-- <div class="nav col-md-1"> -->
					<a href="${pageContext.request.contextPath}/toMainPage.action">
					<img src="${pageContext.request.contextPath}/image/biglogo.png" alt="logo" style="max-width: 120px; max-height: 70px; margin-right: 10px;"/></a>
				</div>
			<!-- 개인고객/사업자 부분 -->
			<div class="nav col-md-6 col-md-pull-1">
			<!-- <div class="nav col-md-6"> -->
				<div class="collapse navbar-collapse" id="navbar-collapse-1">
					<ul class="nav navbar-nav navbar-left">
						<s:if test="#session.loginId !=null">
							<s:if test="#session.memCode==2">
								<li><a href="${pageContext.request.contextPath}/search/toBusinessSectorCategoryPage.action">업종검색</a></li>
								<li><a href="${pageContext.request.contextPath}/search/toFeatureCategoryPage.action">특징검색</a></li>
								<li><a href="${pageContext.request.contextPath}/search/toMoodCategoryPage.action">기분상태검색</a></li>				           	
							</s:if>
							<s:if test="#session.memCode == 1">							
								<li><a href="${pageContext.request.contextPath}/enterprise/takeEtp.action">
									<span class="nav-icon-wrap"><i class="fa fa-male fa-fw"></i></span>내 페이지로</a>
								</li>
								<li><a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action">
									<span class="nav-icon-wrap"><i class="fa fa-calendar-check-o fa-fw"></i></span>예약 관리</a>
								</li>
								<li><a href="${pageContext.request.contextPath}/enterprise/toMiscSettingPage.action">
									<span class="nav-icon-wrap"><i class="fa ellipsis-h fa-fw"></i></span>기타 설정</a>
								</li>
								<li><a href="toEnterpriseSupportPage.action">
									<span class="nav-icon-wrap"><i class="fa fa-map-signs fa-fw"></i></span>사업자 지원 센터</a>
								</li>
							</s:if>		            
						</s:if>
					</ul>          	
				</div>
			</div>
			<!-- 로그인/회원가입 -->
			<div class="nav col-md-4 col-md-pull-1">
			<!-- <div class="nav col-md-4"> -->
				<!-- 로그인 안 된 상태 -->
				<s:if test="#session.loginId == null">
					<a class="btn btn-info header-newmember-btn" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-user"></span>회원등록</a>
					<!-- Modal -->
					<div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="btn btn-default" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">close</span></button>
									<h3 class="modal-title" style="color: gray;">회원가입 선택</h3>
								</div>
								<div class="modal-body" style="vertical-align:center"><br><br><br><br><br>							     
									<div class="col-md-6">
										<a href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action">
										<h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="etpBT">사업자</button></h1></a>								        	 	        	
									</div>
									<div class="col-md-6">
										<a href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action">
										<h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="cstBT">이용자</button></h1></a>								        	
									</div>   
									<br><br><br><br><br><br><br><br><br><br>			
								</div>
							</div>
						</div>
					</div>     
					<a href="${pageContext.request.contextPath}/member/toLoginPage.action" class="btn btn-default"><span class="glyphicon glyphicon-log-in"></span> 로그인</a>
				</s:if>
				<s:if test="#session.loginId != null">       
					<a href="#~~method~~(#session.loginId)" data-toggle="notification-popover" data-placement="bottom" title="${session.loginName}님의 알림" data-content="여기서가 문제. 리스트를 받아와야 함"><button class="btn btn-warning btn-sm block"> 알림 <span class="badge">1<!-- 여기에는  notification 넘버...어떻게??--></span></button></a>
					<a href="${pageContext.request.contextPath}/highchart1.action?etpEmail=<s:property value="#session.loginId"/>" class="btn btn-danger btn-sm">통계</a>
					<!-- MyPage 멤버 코드에 따라 이동 페이지 다름 -->
					<s:if test="#session.memCode == 1"><!-- 사업자 -->
						<a href="${pageContext.request.contextPath}/toMainPage.action" class="btn btn-primary btn-sm">메인페이지</a>
						<a href="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=${session.loginEtpNum}" class="btn btn-primary btn-sm">마이페이지</a>
						<!-- 달력 Test code. Action에서 불러와야만 한다! -->
						<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${session.loginEtpNum}" class="btn btn-danger btn-sm">예약 페이지</a>
					</s:if>
					<s:if test="#session.memCode == 2"><!-- 고객 -->
						<a href="${pageContext.request.contextPath}/member/toCustomerMyPage.action" class="btn btn-primary btn-sm">마이페이지</a>
					</s:if>
					<s:if test="#session.memCode == 3"><!-- 관리자 -->
						<a href="${pageContext.request.contextPath}/enterprise/AllNoRegisterEtpList.action" class="btn btn-primary btn-sm">사업자승인게시판</a>
					</s:if>
					<!-- 공통 로그아웃 -->
					<a href="${pageContext.request.contextPath}/member/logoutProcess.action" class="btn btn-primary btn-sm">로그아웃</a>
				</s:if>
			</div>
			
			<!-- 자유검색 -->
			<div class="nav col-md-1 col-md-push-2">
			<!-- <div class="nav col-md-1"> -->
				<form action="/ProjectOctober/search/searchFreeKeyword.action" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8" role="search">
					<div class="input-group-btn">
						<input type="text" name="searchKeyword" class="form-control" placeholder="Search">
						<button type="submit" title="Search" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
					</div>				
				</form>
			</div><!-- /.navbar-collapse -->
			</div><!-- /.container -->
		</div>
	</nav><!-- /.navbar -->
</div><!-- /.container-fluid --> --%>
</body>		
</html>	