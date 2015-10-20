<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-checkbox/paper-checkbox.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-button/paper-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/iron-form/iron-form.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-group/paper-radio-group.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-button/paper-radio-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-dropdown-menu/paper-dropdown-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu/paper-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu-button/paper-menu-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-item/paper-item.html">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/Polymer/components/bower_components/webcomponentsjs/webcomponents.min.js"></script>

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
    
    /* 장르 버튼 */
    $("#button3-1").click(function(){    	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-1").val();
    });
    
    $("#button3-2").click(function(){    	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-2").val();
    });
    
    $("#button3-3").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-3").val();
    });
    
    $("#button3-4").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-4").val();
    });
    
    $("#button3-5").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-5").val();
    });
    
    $("#button3-6").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-6").val();
    });
    
    $("#button3-7").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-7").val();
    });
    
    $("#button3-8").click(function(){ 	   
    	location.href= '${pageContext.request.contextPath}'+'/search/categorySearch.action?button='+$("#button3-8").val();
    });
    
    
});
</script>
<style type="text/css">
textarea {width:800px; height:300px;overflow:visible;}

</style>

<title>이용자 검색 카테고리</title>

</head>
<body>
<%@include file="Header.jsp"%>
<!-- 내가 작성 -->

<div class="container">
  <ul class="nav nav-tabs">
    <li class="active">
    <a data-toggle="tab" href="#home">특징</a></li>
    <li><a data-toggle="tab" href="#menu1">상태</a></li>
    <li><a data-toggle="tab" href="#menu2">장르</a></li>
    <li><a data-toggle="tab" href="#menu3">지역</a></li>
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
   	 <div id="menu1" class="tab-pane fade">
   		  <h3>상태</h3>
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
   	  <div id="menu2" class="tab-pane fade">
      	<h3>장르</h3>	
   		  <div class="section">
		      <div class="container">
		        <div class="row">
		          <div class="col-md-12">
		            <div class="section">
		              <div class="container">
		                <div class="row">
		                  <div class="col-md-6"><!-- 왼쪽 -->
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button3-1" style="width:300px; height:50px;" class="btn btn-primary" value="타이마사지">타이식마사지</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button3-2" style="width:300px; height:50px;" class="btn btn-primary" value="경락마사지">경락마사지 교정</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button3-3" style="width:300px; height:50px;" class="btn btn-primary" value="두피마사지">두피마사지</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button3-4" style="width:300px; height:50px;" class="btn btn-primary" value="교정">교정</button>
		                  </div>
		                  <div class="col-md-6"><!-- 오른쪽 -->
		                  	  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button3-5" style="width:300px; height:50px;" class="btn btn-primary" value="핸드케어">핸드케어</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button3-6" style="width:300px; height:50px;" class="btn btn-primary" value="바디케어">바디케어</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button3-7" style="width:300px; height:50px;" class="btn btn-primary" value="네일아트">네일아트</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button3-8" style="width:300px; height:50px;" class="btn btn-primary" value="발마사지">발마사지</button>                  
		                  </div>
		                </div>
		              </div>
		            </div>
		          </div>
		        </div>
		      </div>
		    </div>    		
   	  </div><!-- 장르 -->
   	   <div id="menu3" class="tab-pane fade">
     	  <h3>지역</h3>
      	    <div class="section">
		      <div class="container">
		        <div class="row">
		          <div class="col-md-12">
		            <div class="section">
		              <div class="container">
		                <div class="row">
		                  <div class="col-md-6"><!-- 왼쪽 -->
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button4-1" style="width:300px; height:50px;" class="btn btn-primary" value="서울">서울특별시</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button4-2" style="width:300px; height:50px;" class="btn btn-primary" value="경기도">경기도</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button4-3" style="width:300px; height:50px;" class="btn btn-primary" value="강원도">강원도</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button4-4" style="width:300px; height:50px;" class="btn btn-primary" value="충청도">충청도</button>
		                  </div>
		                  <div class="col-md-6"><!-- 오른쪽 -->
		                  	  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
			                  <button type="button" id="button4-5" style="width:300px; height:50px;" class="btn btn-primary" value="경상도">경상도</button>
			                  <br>
			                  <br>
			                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  			  <button type="button" id="button4-6" style="width:300px; height:50px;" class="btn btn-primary" value="전라도">전라도</button>
				  			  <br>
				  			  <br>
				  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  							  <button type="button" id="button4-7" style="width:300px; height:50px;" class="btn btn-primary" value="제주도">제주도</button>
  							  <br>
  							  <br>
  							  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  						  <button type="button" id="button4-8" style="width:300px; height:50px;" class="btn btn-primary" value="기타">기타 섬 지역</button>                  
		                  </div>
		                </div>
		              </div>
		            </div>
		          </div>
		        </div>
		      </div>
		    </div>      
      </div><!-- 지역 -->
   </div>
</div>
</body>
</html>	
