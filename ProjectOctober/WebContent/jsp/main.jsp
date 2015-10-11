<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



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


<title>Main</title>
</head>
<body>
<s:include value="Header_test.jsp"></s:include>

 <div class="container">
 	<div class="row marketing">
		<div class="col-md-2" id="introduce">
		   	<div class ="well">
		     <h2>사이트 간단한 소개</h2>
		     <h3>Made by 24Hour+</h3>
		   	</div>
	   	</div>
	   	
	   	<div class="col-md-10">
	  		<div class ="well">
          <ul class="nav nav-tabs">
          <a class="navbar-brand">24Hour+</a>
            <li role="presentation" class="active"><a href="#location">지역</a></li>
            <li role="presentation"><a href="#genre">장르</a></li>
            <li role="presentation"><a href="#condition">상태</a></li>
            <li role="presentation">
            	<form class="navbar-form navbar-left" role="search">
			        <div class="input-group input-group-sm">
			          <input type="search" class="form-control" placeholder="Search" type="search">
			          <span class="input-group-btn">
								<button class="btn btn-default fa fa-search" type="submit"></button>
					  </span>
			        </div>
			     </form>
            </li>
          </ul>
	        <div class="tab-content">
	        	<div id="location" class="tab-pane fade in active">
    				<div class="row">
				      	<div class="col-md-7">	
				      		<!-- 실제로 사용할 때는 DB에서 구역명을 가져와서 뿌리기 -->
				      		<button type="button" class="btn btn-default btn-xs">
							  <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> 서울특별시
							</button>
							<button type="button" class="btn btn-default btn-xs">
							  <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> 부산광역시
							</button>
							<button type="button" class="btn btn-default btn-xs">
							  <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> 충청북도
							</button>
							<button type="button" class="btn btn-default btn-xs">
							  <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> 서울특별시
							</button>
							<button type="button" class="btn btn-default btn-xs">
							  <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> 부산광역시
							</button>
							<button type="button" class="btn btn-default btn-xs">
							  <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> 충청북도
							</button>
				      	</div>
		     			<div class="col-md-3" align="center">
							<img src="http://k-ecm.co.kr/imgs/01/0202_con01.gif"/>
		    			</div> 
   					</div>
   				</div>
   				<div id="genre" class="tab-pane fade">
    				<div class="row">	
				      	<h1 align="center">업종 버튼s</h1>
   					</div>
   				</div>
   				<div id="condition" class="tab-pane fade">
    				<div class="row">	
				      	<h1 align="center">컨디션 버튼s</h1>
   					</div>
   				</div>
 			</div>
  		</div>
  	</div>
 </div>
 </div>
</body>
</html>