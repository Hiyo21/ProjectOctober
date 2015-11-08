<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>A_Shop Project</title>
<link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/jejugothic.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/landing-page.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome/css/font-awesome.min.css"/>
<link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/jsp/calendar/fullcalendar/lib/jquery-2.1.4.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
<s:include value="Header.jsp"></s:include>

<div class="intro-header">
        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-message">
                        <h1>
                        <strong style="color: #E5FF96;">Y</strong>our 
                        <strong style="color: ;">A</strong>esthetic 
                        <strong style="color: ;">C</strong>ompanion</h1>
                        <h2>Hello Again, <strong style="color: #E60073;">a.#</strong></h2>
                        <hr class="intro-divider">
                        <!-- Social buttons. 딴걸로 어떻게 바꾸지? -->
                        <ul class="list-inline intro-social-buttons">
                            <li>
                                <a href="${pageContext.request.contextPath}/member/toLoginPage.action" class="btn btn-default btn-lg"><i class="fa fa-sign-in fa-fw"></i> <span class="network-name">Login</span></a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/toMainPage.action" class="btn btn-default btn-lg"><i class="fa fa-search fa-fw"></i> <span class="network-name">Search</span></a>
                            </li>
                            <li>
                                <a data-toggle="modal" href="#myModal" class="btn btn-default btn-lg"><i class="fa fa-male fa-fw"></i> <span class="network-name">Signup</span></a>
                            </li>
                        </ul> 
                    </div>
                </div>
            </div>
        </div>
        <!-- /.container -->

    </div>
    <!-- /.intro-header -->

    <!-- Page Content -->

	<a name="services"></a>
    <div class="content-section-a">

        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading"> 이제 온라인에서도  마사지샵, <br/> 네일샵 예약을 하실 수 있습니다:</h2>
                    <p class="lead">전화로만 예약하기 불편하셨죠? a.#은 기존 방식보다 훨씬 <br/> 빠르고 간단한 예약 솔루션을 제공합니다.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive img-thumbnail" src="${pageContext.request.contextPath}/image/themes/esthetics_ad.jpg" alt="grid_system">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

    <div class="content-section-b">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading"> 누구나 자신만의 사업 홍보 공간을 <br/> 쉽게 만들 수 있습니다:</h2>
                    <p class="lead">동적 배치가 가능한 템플릿, 다양한 칼라 테마를 통해 특색있는 스타일의 페이지를 만들어 보세요.</p>
                </div>
                <div class="col-lg-5 col-sm-pull-6  col-sm-6">
                    <img class="img-responsive img-thumbnail" src="${pageContext.request.contextPath}/image/themes/esUtah.jpg" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-b -->

    <div class="content-section-a">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">매우 직관적인 예약 시스템을<br> 제공합니다: </h2>
                    <p class="lead">다양한 상황에 모두 대처 가능하도록 특수 제작된 예약 <br>스케쥴러를 통해 매우 간단한 조작만으로 모든 예약 관련 기능을 수행합니다.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive img-thumbnail" src="${pageContext.request.contextPath}/image/themes/intuition.jpg" alt="">
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.content-section-a -->

	<a  name="contact"></a>
    <div class="banner">

        <div class="container">

            <div class="row">
                <div class="col-lg-6">
                    <h2>a.# 과 함께 하세요: </h2>
                </div>
                <div class="col-lg-6">
                    <ul class="list-inline banner-social-buttons">
                        <li>
                            <a href="${pageContext.request.contextPath}/member/toLoginPage.action" class="btn btn-default btn-lg"><i class="fa fa-sign-in fa-fw"></i> <span class="network-name">Login</span></a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/toMainPage.action" class="btn btn-default btn-lg"><i class="fa fa-search fa-fw"></i> <span class="network-name">Search</span></a>
                        </li>
                        <li>
                            <a data-toggle="modal" data-target="#myModal" class="btn btn-default btn-lg"><i class="fa fa-male fa-fw"></i> <span class="network-name">Signup</span></a>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
        <!-- /.container -->

    </div>
    <!-- /.banner -->

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <p class="copyright text-muted small">Copyright &copy; 24시간이 모자라 2015. All Rights Reserved</p>
                </div>
            </div>
        </div>
    </footer>
</body>
</html>