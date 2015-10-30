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
<style>
	@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400);
#header {
.btn-default {
	width: 110px;
} 

.navbar-brand { position: relative; z-index: 2; }

.navbar-nav.navbar-right .btn { position: relative; z-index: 2; padding: 4px 20px; margin: 10px auto; transition: transform 0.3s; }

.navbar .navbar-collapse { position: relative; overflow: hidden !important; }
.navbar .navbar-collapse .navbar-right > li:last-child { padding-left: 22px; }

.navbar .nav-collapse { position: absolute; z-index: 1; top: 0; left: 0; right: 0; bottom: 0; margin: 0; padding-right: 120px; padding-left: 80px; width: 100%; }
.navbar.navbar-default .nav-collapse { background-color: #f8f8f8; }
.navbar.navbar-inverse .nav-collapse { background-color: #222; }
.navbar .nav-collapse .navbar-form { border-width: 0; box-shadow: none; }
.nav-collapse>li { float: right; }

.btn.btn-circle { border-radius: 50px; }
.btn.btn-outline { background-color: transparent; }

.navbar-nav.navbar-right .btn:not(.collapsed) {
    background-color: rgb(111, 84, 153);
    border-color: rgb(111, 84, 153);
    color: rgb(255, 255, 255);
}

.navbar.navbar-default .nav-collapse,
.navbar.navbar-inverse .nav-collapse {
    height: auto !important;
    transition: transform 0.3s;
    transform: translate(0px,-50px);
}
.navbar.navbar-default .nav-collapse.in,
.navbar.navbar-inverse .nav-collapse.in {
    transform: translate(0px,0px);
}


@media screen and (max-width: 767px) {
    .navbar .navbar-collapse .navbar-right > li:last-child { padding-left: 15px; padding-right: 15px; } 
    
    .navbar .nav-collapse { margin: 7.5px auto; padding: 0; }
    .navbar .nav-collapse .navbar-form { margin: 0; }
    .nav-collapse>li { float: none; }
    
    .navbar.navbar-default .nav-collapse,
    .navbar.navbar-inverse .nav-collapse {
        transform: translate(-100%,0px);
    }
    .navbar.navbar-default .nav-collapse.in,
    .navbar.navbar-inverse .nav-collapse.in {
        transform: translate(0px,0px);
    }
    
    .navbar.navbar-default .nav-collapse.slide-down,
    .navbar.navbar-inverse .nav-collapse.slide-down {
        transform: translate(0px,-100%);
    }
    .navbar.navbar-default .nav-collapse.in.slide-down,
    .navbar.navbar-inverse .nav-collapse.in.slide-down {
        transform: translate(0px,0px);
    }
}
}


</style>
</head>
<body>

<<<<<<< HEAD
<div class="container-fluid">
    <!-- Second navbar for categories -->
    <nav class="navbar navbar-default">
      <div class="container">
      	<div class="row">
      	
      	<!-- 로고 -->
      	<div class="nav col-md-1  col-md-pull-2">
      		<a href="${pageContext.request.contextPath}/toMainPage.action"><img src="${pageContext.request.contextPath}/image/biglogo.png" alt="logo"  style="max-width: 120px; max-height: 70px; margin-right: 10px;"/></a>
      	</div>
      	
      	<!-- 개인고객/사업자 부분 -->
          <div class="nav col-md-6 col-md-pull-1">   
          	
          		<div class="collapse navbar-collapse" id="navbar-collapse-1">
          			  <ul class="nav navbar-nav navbar-left">
			            <s:if test="#session.loginId !=null">
			            	 <s:if test="#session.memCode==2">
					            <li><a href="${pageContext.request.contextPath}/search/toBusinessSectorCategoryPage.action">업종검색</a></li>
					            <li><a href="${pageContext.request.contextPath}/search/toFeatureCategoryPage.action">특징검색</a></li>
					            <li><a href="${pageContext.request.contextPath}/search/toMoodCategoryPage.action">기분상태검색</a></li>				           	
			           		 </s:if>
			     		
			     		<s:if test="#session.memCode == 1">							
=======

<!-- 헤더 시작 -->
		<div class="hidden-xs header-upper">
			<div class="container hidden-xs">
				<s:if test="#session.loginId == null">
					<div class="row">
						<div class=" col-xs-1 col-sm-1 col-md-1 col-lg-pull-2">
							<a href="${pageContext.request.contextPath}/toMainPage.action">
								<img src="${pageContext.request.contextPath}/image/biglogo.png"  style="max-width: 200px; max-height: 70px; margin-right: 10px; alt="logo" />
							</a>
						</div>
						<div class=" col-xs-5 col-sm-5 col-md-5 col-lg-7">
							<!-- 원래 서비스 이름 -->
						</div>
						<div class="col-xs-push-1 col-sm-3 col-md-3 col-lg-2">
						 
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
							      <div class="modal-body" style="vertical-align:center">
							      <br><br><br><br><br>							     
								        <div class="col-md-6">
								        	<a href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action"><h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="etpBT">사업자</button></h1></a>								        	 	        	
								        </div>
								        <div class="col-md-6">
								        	 <a href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action"><h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="cstBT">이용자</button></h1></a>								        	
								        </div>   
										<br><br><br><br><br><br><br><br><br><br>			
									
							      </div>
							    </div>
							  </div>
							</div>
						</div>
						<div class="col-xs-push-1 col-sm-3 col-md-3 col-lg-2">
							<br>
							<a href="${pageContext.request.contextPath}/member/toLoginPage.action" class="btn btn-primary btn-block header-mypage-btn"><span class="glyphicon glyphicon-log-in"></span> 로그인 / 예약체크</a>
						</div>
					</div>
				</s:if>
				<s:if test="#session.loginId != null">
					<div class="row">
						<div class="col-xs-1">
							<a href="${pageContext.request.contextPath}/toMainPage.action">
								<img src="${pageContext.request.contextPath}/image/biglogo.png" style="max-width: 120px; max-height: 70px; margin-right: 10px; alt="logo" />
							</a>
						</div>
				        <div class="col-xs-6 col-xs-push-2">	
				      	  <h3><s:property value="#session.loginName"/> 님, 환영합니다!</h3>
				        </div>				        
				        <div class="col-xs-5">
				        	<%-- <a href="#~~method~~(#session.loginId)" data-toggle="notification-popover" data-placement="bottom" title="${session.loginName}님의 알림" data-content="여기서가 문제. 리스트를 받아와야 함"><button class="btn btn-warning btn-sm block"> 알림 <span class="badge">1<!-- 여기에는  notification 넘버...어떻게??--></span></button></a> --%>

				        	<%-- <a href="${pageContext.request.contextPath}/highchart1.action?etpEmail=<s:property value="#session.loginId"/>" class="btn btn-danger btn-sm">통계</a> --%>

				        	
						
						<!-- MyPage 멤버 코드에 따라 이동 페이지 다름 -->
						<s:if test="#session.memCode == 1"><!-- 사업자 -->
							<a href="${pageContext.request.contextPath}/toMainPage.action" class="btn btn-primary btn-sm">메인페이지</a>
							<%-- <a href="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=${session.loginEtpNum}" class="btn btn-primary btn-sm">마이페이지</a> --%>
							<a href="${pageContext.request.contextPath}/enterprise/toEptReservationHistoryPage.action" class="btn btn-primary btn-sm">마이페이지</a>
							<!-- 달력 Test code. Action에서 불러와야만 한다! -->
							<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${session.loginEtpNum}" class="btn btn-danger btn-sm">예약 페이지</a>
							<!--  -->
						</s:if>
						<s:if test="#session.memCode == 2"><!-- 고객 -->
							<a href="${pageContext.request.contextPath}/member/toCustomerMyPage.action" class="btn btn-primary btn-sm">마이페이지</a>
						</s:if>
						<s:if test="#session.memCode == 3"><!-- 관리자 -->
							<a href="${pageContext.request.contextPath}/enterprise/AllNoRegisterEtpList.action" class="btn btn-primary btn-sm">사업자승인게시판</a>
						</s:if>
						
						<!-- 공통 로그아웃 -->
							<a href="${pageContext.request.contextPath}/member/logoutProcess.action" class="btn btn-primary btn-sm">로그아웃</a>
				        </div>					
					<div class="col-xs-6 col-sm-3 col-md-3">
						<br>
						<!-- jQuery로 새로운 팝업창/dialog창 열고 notification 리스트 불러오게 링크는 JS 메소드로..어떻게?-->
						
					</div>

					<div class="col-xs-6 col-sm-6 col-md-6">
						
					</div>
				</div>
				</s:if>
			</div>
		</div>

		<div class="navbar navbar-default">
			<div class="container">
				<div class="row">					
					<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
						<s:if test="#session.loginId != null || #session.memCode == 2">
							<ul class="nav navbar-nav" id="test1">
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
						
						<s:if test="#session.loginId != null ||#session.memCode == 1">
							<ul class="nav navbar-nav">
>>>>>>> refs/remotes/origin/master
								<li>
									<a href="${pageContext.request.contextPath}/enterprise/takeEtp.action">
										<span class="nav-icon-wrap"><i class="fa fa-male fa-fw"></i></span>내 페이지로
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-calendar-check-o fa-fw"></i></span>예약 관리
									</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/enterprise/toMiscSettingPage.action">
										<span class="nav-icon-wrap"><i class="fa ellipsis-h fa-fw"></i></span>기타 설정
									</a>
								</li>
<<<<<<< HEAD
								<li>
									<a href="toEnterpriseSupportPage.action">
										<span class="nav-icon-wrap"><i class="fa fa-map-signs fa-fw"></i></span>사업자 지원 센터
									</a>
								</li>
							
						</s:if>		            
			             </s:if>
			          </ul>          	
          		</div>
          </div>
          
          <!-- 로그인/회원가입 -->
          <div class="nav col-md-4 col-md-pull-1"> 
          <s:if test="#session.loginId == null">
           
          	<a class="btn btn-info header-newmember-btn" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-user"></span> 회원등록</a>
=======
							</ul>
						</s:if>
						
						<s:if test ="#session.loginId == null || #session.memCode !=null">
						<form action="/ProjectOctober/search/searchFreeKeyword.action" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8">
						
						
						
					<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
						<div class="input-group">
							<input name="searchKeyword" class="form-control" type="search" style="display: inline-block; text-align: right; width: 180px; height: 30px;">
							<span class="input-group-btn" >
								<button class="btn btn-success" style="width: 50px; height: 30px;" type="submit" value="검색">검색</button>
							</span>
						</div>
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
<%-- <div class="header-wrap">
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
>>>>>>> refs/remotes/origin/master
							
							<!-- Modal -->
							<div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							  <div class="modal-dialog">
							    <div class="modal-content">
							    	<div class="modal-header">
							    		<button type="button" class="btn btn-default" data-dismiss="modal"><span aria-hidden="true">×</span> <span class="sr-only">close</span></button>
							    		<h3 class="modal-title" style="color: gray;">회원가입 선택</h3>
							    	</div>
							      <div class="modal-body" style="vertical-align:center">
							      <br><br><br><br><br>							     
								        <div class="col-md-6">
								        	<a href="${pageContext.request.contextPath}/member/toEnterpriseRegistrationPage.action"><h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="etpBT">사업자</button></h1></a>								        	 	        	
								        </div>
								        <div class="col-md-6">
								        	 <a href="${pageContext.request.contextPath}/member/toCustomerRegistrationPage.action"><h1><button type="button" class="btn-link"  role="button" style="vertical-align:center" id="cstBT">이용자</button></h1></a>								        	
								        </div>   
										<br><br><br><br><br><br><br><br><br><br>			
									
							      </div>
							    </div>
							  </div>
          </div>     
          	<a href="${pageContext.request.contextPath}/member/toLoginPage.action" class="btn btn-default"><span class="glyphicon glyphicon-log-in"></span> 로그인 / 예약체크</a>
          	</s:if>
          	<s:if test="#session.loginId != null">       
          		<a href="#~~method~~(#session.loginId)" data-toggle="notification-popover" data-placement="bottom" title="${session.loginName}님의 알림" data-content="여기서가 문제. 리스트를 받아와야 함"><button class="btn btn-warning btn-sm block"> 알림 <span class="badge">1<!-- 여기에는  notification 넘버...어떻게??--></span></button></a>

				        	<a href="${pageContext.request.contextPath}/highchart1.action?etpEmail=<s:property value="#session.loginId"/>" class="btn btn-danger btn-sm">통계</a>

				        	
						
						<!-- MyPage 멤버 코드에 따라 이동 페이지 다름 -->
						<s:if test="#session.memCode == 1"><!-- 사업자 -->
							<%-- <a href="${pageContext.request.contextPath}/toMainPage.action" class="btn btn-primary btn-sm">메인페이지</a> --%>
							<a href="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=${session.loginEtpNum}" class="btn btn-primary btn-sm">마이페이지</a>
							<%-- <a href="${pageContext.request.contextPath}/enterprise/toEptReservationHistoryPage.action" class="btn btn-primary btn-sm">마이페이지</a> --%>
							<!-- 달력 Test code. Action에서 불러와야만 한다! -->
							<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${session.loginEtpNum}" class="btn btn-danger btn-sm">예약 페이지</a>
							<!--  -->
						</s:if>
						<s:if test="#session.memCode == 2"><!-- 고객 -->
							<a href="${pageContext.request.contextPath}/member/toCustomerMyPage.action" class="btn btn-primary btn-sm">마이페이지</a>
						</s:if>
						<s:if test="#session.memCode == 3"><!-- 관리자 -->
							<a href="${pageContext.request.contextPath}/enterprise/AllNoRegisterEtpList.action" class="btn btn-primary btn-sm">사업자승인게시판</a>
						</s:if>
						
						<!-- 공통 로그아웃 -->
							<a href="${pageContext.request.contextPath}/member/logoutProcess.action" class="btn btn-primary btn-sm">로그아웃</a>
						
           </div>
           
           <!-- 자유겁색 -->
          <div class="nav col-md-1 col-md-push-2">    
          	<form action="/ProjectOctober/search/searchFreeKeyword.action" id="searchFreeKeywordForm" class="navbar-form navbar-right" role="form" method="get" accept-charset="utf-8" role="search">
				<div class="input-group-btn">
				  <input type="text" name="searchKeyword" class="form-control" placeholder="Search">
				  <button type="submit" title="Search" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
			</div>				
			</form>
                	        	
         </div>                
          
       <!-- /.navbar-collapse -->
      </div><!-- /.container -->
        </div>
    </nav><!-- /.navbar -->
</div><!-- /.container-fluid -->	
		
		
		
</body>		
</html>		
		
