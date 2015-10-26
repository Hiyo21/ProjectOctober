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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" />

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
$(document).ready(function(){
	
	/* 특징 버튼 */
    $("#button1").click(function(){    	
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button1").val();
    });
    
    $("#button2").click(function(){    	
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button2").val();
    });
    
    $("#button3").click(function(){    	
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3").val();
    });
    
    $("#button4").click(function(){    
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button4").val();
    });
    
    $("#button5").click(function(){    
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button5").val();
    });
    
    $("#button6").click(function(){  
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button6").val();
    });
    
    $("#button7").click(function(){   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button7").val();
    });
    
    $("#button8").click(function(){   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button8").val();
    });
});
</script>
<style type="text/css">
textarea {width:800px; height:300px;overflow:visible;}

</style>

<title>이용자 검색 카테고리</title>

</head>
<body>
<s:include value="../Header.jsp" />
<!-- 내가 작성 -->

<div class="container">
  <ul class="nav nav-tabs">
    <li class="active">
    <a data-toggle="tab" href="#home">특징</a></li>
   
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>특징</h3>
         <div class="section">
		      <div class="container">
		        <div class="row">
		          <div class="col-md-12">
		            <div class="section">
		              <div class="container">
		                <div class="row">
		                  <div class="col-md-6"><!-- 왼쪽 -->
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button1" style="width:300px; height:50px;" class="btn btn-primary" value="남성전용">남성전용</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button2" style="width:300px; height:50px;" class="btn btn-primary" value="주차장">주차장여부</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button3" style="width:300px; height:50px;" class="btn btn-primary" value="여성전용">여성전용</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button4" style="width:300px; height:50px;" class="btn btn-primary" value="역근처">역근처</button>
		                  </div>
		                  <div class="col-md-6"><!-- 오른쪽 -->
		                  	  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button5" style="width:300px; height:50px;" class="btn btn-primary" value="어린아이">어린아이 동반여부</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button6" style="width:300px; height:50px;" class="btn btn-primary" value="커플석">커플석 여부</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button7" style="width:300px; height:50px;" class="btn btn-primary" value="예약가능">예약 가능 여부</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button8" style="width:300px; height:50px;" class="btn btn-primary" value="주말오픈">주말오픈</button>                  
		                  </div>
		                </div>
		              </div>
		            </div>
		          </div>		          
		        </div>
		      </div>
		    </div>
      	
      
     </div> <!-- 특징 -->
 
   </div>
</div>
</body>
</html>	
