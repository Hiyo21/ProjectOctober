<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
  <script src="bower_components/jquery/dist/jquery.min.js"></script>
  
  <script>
$(document).ready(function(){
    $(".nav-tabs a").click(function(){
        $(this).tab('show');
    });
    $('.nav-tabs a').on('shown.bs.tab', function(event){
        var x = $(event.target).text();         // active tab
        var y = $(event.relatedTarget).text();  // previous tab
        $(".act span").text(x);
        $(".prev span").text(y);
    });
});
</script>
<title>CustomerMypage.jsp</title>
</head>
<body>
<!-- 헤더시작 -->
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
							<h1> [Service Name]</h1>
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
<!-- 헤더 끝 -->

<!-- 탭 시작 -->
<div class="container">
  <h2>마이 페이지</h2><br>
  <ul class="nav nav-tabs">
    <li class="active"><a href="#InformationUpdate">정보수정</a></li>
    <li><a href="#Reservation">예약</a></li>
    <li><a href="#CouponEvent">쿠폰 및 이벤트</a></li>
    <li><a href="#OneClick">OneClick 결제</a></li>
  </ul>

  <div class="tab-content">
  <!-- 정보수정 탭 시작 -->
    <div id="InformationUpdate" class="tab-pane fade in active">
    	 <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
          	<table class="table table-hover">
          		<tr>
          			<td>이름</td>
          			<td><input type="text" name="name" id="vo.name"><br></td>
          		</tr>  
          		<tr>          			        			         		
          			<td>이메일</td>
          			<td><input type="email" name="email" id="vo.email"><br></td>
          		</tr>
          		<tr>
          			<td>P/W</td>
          			<td><input type="password" name="pwd1" id="vo.password"></td>
          		</tr>
          		<tr>
          			<td>P/W 재확인</td>
          			<td><input type="password" name="pwd2"></td>
          		</tr>
          		<tr>
          			<td>전화번호</td>
          			<td><input type="text" name="phone" id="vo.phone"></td>
          		</tr>
          		<tr>
          			<td>성별</td>
          			<td><input type="radio" name="sex">남 &nbsp;&nbsp;&nbsp;<input type="radio" name="sex">여</td>
          		</tr>          		
          	</table>          	
          </div>
         
          <div class="col-md-6">
          	<table class="table table-hover">  	
            	<tr>
          			<td>생년월일&nbsp;</td>
          			<td><select name="year">
          				<option value="1960">1960년</option>
          				<option value="1961">1961년</option>
          				<option value="1962">1962년</option>
          				<option value="1963">1963년</option>
          				<option value="1964">1964년</option>
          				<option value="1965">1965년</option>
          				<option value="1966">1966년</option>
          				<option value="1967">1967년</option>
          				<option value="1968">1968년</option>
          				<option value="1969">1969년</option>
          				<option value="1970">1970년</option>
          				<option value="1971">1971년</option>
          				<option value="1972">1972년</option>
          				<option value="1973">1973년</option>
          				<option value="1974">1974년</option>
          				<option value="1975">1975년</option>
          				<option value="1976">1976년</option>
          				<option value="1977">1977년</option>
          				<option value="1978">1978년</option>
          				<option value="1979">1979년</option>
          				<option value="1980">1980년</option>
          				<option value="1981">1981년</option>
          				<option value="1982">1982년</option>
          				<option value="1983">1983년</option>
          				<option value="1984">1984년</option>
          				<option value="1985">1985년</option>
          				<option value="1986">1986년</option>
          				<option value="1987">1987년</option>          				
          			</select>&nbsp;&nbsp;
          			
          			<select name="month">
          				<option value="1">1월</option>
          				<option value="2">2월</option>
          				<option value="3">3월</option>
          				<option value="4">4월</option>
          				<option value="5">5월</option>
          				<option value="6">6월</option>
          				<option value="7">7월</option>
          				<option value="8">8월</option>
          				<option value="9">9월</option>
          				<option value="10">10월</option>
          				<option value="11">11월</option>
          				<option value="12">12월</option>          				          			
          			</select>&nbsp;&nbsp;         			
          			
          			<select name="month">
          				<option value="01">01일</option>
		          			<option value="02">02일</option>
		          			<option value="03">03일</option>
		          			<option value="04">04일</option>
		          			<option value="05">05일</option>
		          			<option value="06">06일</option>
		          			<option value="07">07일</option>
		          			<option value="08">08일</option>
		          			<option value="09">09일</option>
		          			<option value="10">10일</option>
		          			<option value="11">11일</option>
		          			<option value="12">12일</option>
		          			<option value="13">13일</option>
		          			<option value="14">14일</option>
		          			<option value="15">15일</option>
		          			<option value="16">16일</option>
		          			<option value="17">17일</option>
		          			<option value="18">18일</option>
		          			<option value="19">19일</option>
		          			<option value="20">20일</option>
		          			<option value="21">21일</option>
		          			<option value="22">22일</option>
		          			<option value="23">23일</option>
		          			<option value="24">24일</option>
		          			<option value="25">25일</option>
		          			<option value="26">26일</option>
		          			<option value="27">27일</option>
		          			<option value="28">28일</option>
		          			<option value="29">29일</option>
		          			<option value="30">30일</option>
		          			<option value="31">31일</option>          				          				          			
          			</select>
          			
          			</td>
          		</tr>
          		<tr>
          			<td>우편번호</td>
          			<td><input type="text" name="zipcode" id="vo.zipcode" value="우편번호" onfocus="this.value=''" readOnly>&nbsp;<input type="button" value="우편번호 검색"></td>
          		</tr> 
          		<tr>
          			<td>주소</td>
          			<td><input type="text" name="address1" id="vo.address1">&nbsp;&nbsp;&nbsp;<input type="text" name="address2" id="vo.address2"></td>
          		</tr>  
          	</table>
          </div>        
        </div>
        <div class="modal-footer">
		  	<button type="button" class="btn btn-default">수정하기</button>
		  	<button type="button" class="btn btn-default">취소</button>		          
		  </div>
      </div>
    </div>	       
    </div>    
    <!-- 정보수정 탭 끝 -->   
    
    <!-- 예약 탭 시작 -->
    <div id="Reservation" class="tab-pane fade">
     <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-6" style="display: inline-block;text-align: center;">
            <h2>지난 한 달간 예약내역</h2>
            <div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#reservation1">15/09/20 릴렉스 마사지</a>
					      </h4>      
					      </div>
					      
					    <div id="reservation1" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>릴렉스 마사지</h2>
								<p>시술 일자 : 2015.10.13</p>
								<p>시술 내용 : 얼굴 축소 마사지</p>
								<p></p>						
							</div>					      
					    </div>
					  </div>
				</div>						
          </div>
          <div class="col-md-6" style="display: inline-block;text-align: center;">
            <h2>예약확인</h2>
            	<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#rsvConfirm1">15/10/10 릴렉스 마사지</a>
					      </h4>      
					      </div>
					      
					    <div id="rsvConfirm1" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>릴렉스 마사지</h2>
								<p>시술 예정 일자 : 2015.10.10</p>
								<p>시술 내용 : 발마닥 마사지</p>							
								<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>
							</div>					      
					    </div>
					  </div>
					  
				</div>
				
						<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#reservation2">15/10/30 이형익 이발소</a>
					      </h4>      
					      </div>
					      
					    <div id="reservation2" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>이형익 이발소</h2>
								<p>시술 예정 일자 : 2015.10.30</p>
								<p>시술 내용 : 볼륨펌+갈색 염색</p>
								<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>						
							</div>					      
					    </div>
					  </div>
					  
				</div>		
          </div>
        </div>
      </div>
    </div>
    </div>
    <!-- 예약 탭 끝 -->
    
    <!-- 쿠폰 및 이벤트 탭 시작  -->
    <div id="CouponEvent" class="tab-pane fade">
      <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-6" style="display: inline-block;text-align: center;">
            <h2>이벤트 내역</h2>
            	<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#event1">~13/12/31 오픈기념 첫예약 무료!!</a>
					      </h4>      
					      </div>
					      
					    <div id="event1" class="panel-collapse collapse">
					      <div class="panel-body">
								<h2>조건 마사지</h2>
								<p>이벤트 내용 : 여러분의 성원에 응답하고자 첫 예약손님께 무료로 마사지를 해드립니다</p>
								<p>대상 : 조건마사지 예약 홈페이지 예약하신 첫 손님</p>
								<p>기간 : 2015.10.13 ~ 2016.1.1까지</p>
								<p>많은 참여 부탁드립니다.</p>
								<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>
							</div>					      
					    </div>
					  </div>
					  
				</div>
				<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#event2">15/12/20~15/12/25 크리스마스 특별 할인</a>
					      </h4>
					    </div>
					    
					    <div id="event2" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<h2>김지희 헤어샵</h2>
							<p>이벤트 내용 : 크리스마스를 맞이해 저희 헤어샵에서 시술을 받으실 경우 30%할인을 해드립니다</p>
							<p>대상 : 기간내에 방문하시는 모든 고객님</p>
							<p>할인율 : 모든 시술 30% 할인</p>
							<p>기간 : 2015.12.20 ~ 2015.12.25까지</p>
							<p>따뜻한 크리스마스 보내시길 바랍니다.</p>
							<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>					      
					      </div>					      
					    </div>
					  </div>
				</div>
				
						<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#event3">김소연 네일샵 오픈 기념 선착순 10명 무료 시술</a>
					      </h4>
					    </div>
					    
					    <div id="event3" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<h2>김소연 네일샵</h2>
							<p>이벤트 내용 : 성원에 보답하고자 10분에게 무료로 네일을 시술해드립니다</p>
							<p>대상 : 저희 가게 선착순 10분</p>
							<p>기간 : 2016.01.05 ~ 2016.04.25까지</p>
							<p>여러분의 방문을 기다리고 있겠습니다.</p>	
							<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>				      
					      </div>					      
					    </div>
					  </div>
				</div>
          </div>
          <div class="col-md-6" style="display: inline-block;text-align: center;">
            <h2>보유 쿠폰</h2>
            	<div class="panel-group">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" href="#coupon1">~15/10/17 열라퐁타이 10% 할인</a>
					      </h4>
					    </div>
					    
					    <div id="coupon1" class="panel-collapse collapse">
					      <div class="panel-body">
							<h2>열라퐁타이</h2>
							<p>쿠폰 내용 : 열라퐁타이 전 서비스 메뉴 10% 할인</p>
							<p>대상 : 모든 고객님</p>
							<p>기간 : ~15/10/17까지</p>							
							<p align="center">오시는 길 :  <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false"></p>
						</div>					      
					    </div>
					  </div>
				</div>
          </div>
        </div>
      </div>
    </div>
    </div>
    <!-- 쿠폰 및 이벤트 탭 끝 -->
    
    <!-- 원클릭 결제 탭 시작 -->
    <div id="OneClick" class="tab-pane fade" >
      <h2>OneClick 카드등록</h2>
      <table class="table table-hover">
          		<tr>
          			<td>카드번호</td>
          			<td><input type="password" name="cardNumber" id="vo.cardNum"><br></td>
          		</tr>
          		<tr>
          			<td>유효기간</td>
          			<td><select name="month">
	          				<option value="1">1월</option>
	          				<option value="2">2월</option>
	          				<option value="3">3월</option>
	          				<option value="4">4월</option>
	          				<option value="5">5월</option>
	          				<option value="6">6월</option>
	          				<option value="7">7월</option>
	          				<option value="8">8월</option>
	          				<option value="9">9월</option>
	          				<option value="10">10월</option>
	          				<option value="11">11월</option>
	          				<option value="12">12월</option>  
          				</select>&nbsp;&nbsp;
          				
          				<select name="day">
          					<option value="01">01일</option>
		          			<option value="02">02일</option>
		          			<option value="03">03일</option>
		          			<option value="04">04일</option>
		          			<option value="05">05일</option>
		          			<option value="06">06일</option>
		          			<option value="07">07일</option>
		          			<option value="08">08일</option>
		          			<option value="09">09일</option>
		          			<option value="10">10일</option>
		          			<option value="11">11일</option>
		          			<option value="12">12일</option>
		          			<option value="13">13일</option>
		          			<option value="14">14일</option>
		          			<option value="15">15일</option>
		          			<option value="16">16일</option>
		          			<option value="17">17일</option>
		          			<option value="18">18일</option>
		          			<option value="19">19일</option>
		          			<option value="20">20일</option>
		          			<option value="21">21일</option>
		          			<option value="22">22일</option>
		          			<option value="23">23일</option>
		          			<option value="24">24일</option>
		          			<option value="25">25일</option>
		          			<option value="26">26일</option>
		          			<option value="27">27일</option>
		          			<option value="28">28일</option>
		          			<option value="29">29일</option>
		          			<option value="30">30일</option>
		          			<option value="31">31일</option>          				          				          			
          				</select>        				
          			</td>
          		</tr>
          		<tr>
          			<td>CVC</td>
          			<td><input type="text" id="cvc" size="5"/></td>
          		</tr>        		
       </table>  
		       <div class="container" style="display: inline-block;text-align: center;">
		          			<button type="button" class="btn btn-primary">등록</button>
		          		</div>
    </div>
    <!-- 원클릭 결제 탭 끝 -->   
      
  
    <hr>
    <p class="act"><b>Active Tab</b>: <span></span></p>
    <p class="prev"><b>Previous Tab</b>: <span></span></p>
	</div>
<!-- 탭 끝 -->

</body>
</html>