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
<link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" />

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
	
	
    /* 상태 버튼 */
    $("#button2-1").click(function(){    	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-1").val();
    });
    
    $("#button2-2").click(function(){    	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-2").val();
    });
    
    $("#button2-3").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-3").val();
    });
    
    $("#button2-4").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-4").val();
    });
    
    $("#button2-5").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-5").val();
    });
    
    $("#button2-6").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-6").val();
    });
    
    $("#button2-7").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-7").val();
    });
    
    $("#button2-8").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2-8").val();
    });
    
   
    
});
</script>
<title>기분, 상태 카테고리</title>
</head>
<body>
	<s:include value="../Header.jsp" />
	<!-- 내가작성 -->
	<div class="container">
  <ul class="nav nav-tabs">
    <li class="active">
    <a data-toggle="tab" href="#home">기분/상태</a></li>
  </ul>

  <div class="tab-content">
   	 <div id="home" class="tab-pane fade in active">
   		  <h3>기분/상태</h3>
   			<div class="section">
		      <div class="container">
		        <div class="row">
		          <div class="col-md-12">
		            <div class="section">
		              <div class="container">
		                <div class="row">
		                  <div class="col-md-6"><!-- 왼쪽 -->
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button2-1" style="width:300px; height:50px;" class="btn btn-primary" value="다리교정">다리를 교정하고 싶을 때</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button2-2" style="width:300px; height:50px;" class="btn btn-primary" value="허리디스크교정">허리디스크 교정</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button2-3" style="width:300px; height:50px;" class="btn btn-primary" value="발관리">발관리</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button2-4" style="width:300px; height:50px;" class="btn btn-primary" value="손관리">손관리</button>
		                  </div>
		                  <div class="col-md-6"><!-- 오른쪽 -->
		                  	  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button2-5" style="width:300px; height:50px;" class="btn btn-primary" value="골반교정">골반교정</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button2-6" style="width:300px; height:50px;" class="btn btn-primary" value="부종제거">부종제거</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button2-7" style="width:300px; height:50px;" class="btn btn-primary" value="피부화이트닝">피부 화이트닝</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button2-8" style="width:300px; height:50px;" class="btn btn-primary" value="손톱관리">손톱관리</button>                  
		                  </div>
		                </div>
		              </div>
		            </div>
		          </div>
		        </div>
		      </div>
		    </div>   		
   	  </div>	<!-- 상태 -->
   	 
   </div>
</div>
</body>
</html>