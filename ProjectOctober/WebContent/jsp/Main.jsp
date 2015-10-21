<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css">


<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


<style>
=======
<style type="text/css">
 @font-face{
	font-family:'NanumGothic';
	src:url("NanumGothic.eot");
	src:local(""), url("NanumGothic.woff") format("woff");
}



 body{	
	font-family: "Helvetica Neue", Helvetica, Arial,"맑은 고딕","Malgun gothic",sans-serif;
} 

.btn-default {
	width: 110px;
} 
</style>

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

	<s:include value="Header.jsp"></s:include>

 <div class="container">
 	<div class="row marketing">
		<div class="col-md-2" >		   	
	   	</div>
	   	
	   	<div class="col-md-12">
	  		<div class ="well">
	  		   <div class="section">
				      <div class="container">
				        <div class="row">
				          <div class="col-md-8">
				          	<ul class="nav nav-tabs">          
					            <li role="presentation" class="active">
					            						<a href="#location">지역</a></li>
					            <li role="presentation"><a href="#genre">장르</a></li>
					            <li role="presentation"><a href="#condition">상태</a></li>
					            <li role="presentation">
					           </li>
         					 </ul>
					        </div>				       
				        </div>
				      </div>
				    </div>
          
            	
            
	        <div class="tab-content">
	        	<div id="location" class="tab-pane fade in active">
    				<div class="row">
				      	<div class="col-md-9">	
				      	<br><br>
				      		<!-- 실제로 사용할 때는 DB에서 구역명을 가져와서 뿌리기 -->
				      		<div class="container">								  
								  <button type="button" class="btn btn-warning" data-toggle="collapse" data-target="#seoul"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>서울 특별시</button>
								  <div id="seoul" class="collapse">								  
								  	<li><a href="<s:url value="/Reservation/NoRegisterEtpList.action?wtlNum="/>${wtlNum}">종로구</a></li>								    
								  </div>
								  <br><br>							
								  <button type="button" class="btn btn-warning" data-toggle="collapse" data-target="#busan"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>부산 광역시</button>
								  <div id="busan" class="collapse">
								  	<li><a href="<s:url value="/Reservation/NoRegisterEtpList.action?wtlNum="/>${wtlNum}">종로구</a></li>								    
								  </div>
								  <br><br>
								   <button type="button" class="btn btn-warning" data-toggle="collapse" data-target="#chungcheongN"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>충청북도</button>
								  <div id="chungcheongN" class="collapse">
								  	<li><a href="<s:url value="/Reservation/NoRegisterEtpList.action?wtlNum="/>${wtlNum}">종로구</a></li>							    
								  </div>
								  <br><br>
								    <button type="button" class="btn btn-warning" data-toggle="collapse" data-target="#chungcheongS"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>충청남도</button>
								  <div id="chungcheongS" class="collapse">
								  	<li><a href="<s:url value="/Reservation/NoRegisterEtpList.action?wtlNum="/>${wtlNum}">종로구</a></li>								    
								  </div>
								  <br><br>
								   <button type="button" class="btn btn-warning" data-toggle="collapse" data-target="#jeonradoN"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>전라북도</button>
								  <div id="jeonradoN" class="collapse">
								  	<li><a href="<s:url value="/Reservation/NoRegisterEtpList.action?wtlNum="/>${wtlNum}">종로구</a></li>									    
								  </div>								  
								</div>				
				      	</div>
		     			<div class="col-md-3 col-md-pull-2" align="center">
							<img src="${pageContext.request.contextPath}/image/Korea2.png" width="400" height="400" />
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
<!-- >>>>>>> refs/remotes/origin/master -->
</body>
</html>