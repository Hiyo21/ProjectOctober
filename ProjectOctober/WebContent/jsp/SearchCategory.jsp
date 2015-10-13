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
<script>
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
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
    <li class="active"><a data-toggle="tab" href="#home">특징</a></li>
    <li><a data-toggle="tab" href="#menu1">상태</a></li>
    <li><a data-toggle="tab" href="#menu2">장르</a></li>
    <li><a data-toggle="tab" href="#menu3">지역</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>특징</h3>
	      <div class="container">	         
	  		<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">주차장 여부</button>
		  	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">남성전용</button>
		  </div>  
		  <br>
		  	  
		  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">여성전용</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">역근처</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">어린아이 동반여부</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">패키지상품</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">예약 가능 여부</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">주말오픈</button>
	 	  </div>
	</div>
    <div id="menu1" class="tab-pane fade">
      <h3>상태</h3>
        <div class="container">	         
	  		<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">다리를 교정하고 싶을 때</button>
		  	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">허리디스크 교정</button>
		  </div>  
		  <br>
		  	  
		  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">얼굴축소</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">부종제거</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">피부 화이트닝</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">손관리</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">발관리</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">골반교정</button>
	 	  </div>    
    </div>
    <div id="menu2" class="tab-pane fade">
      <h3>장르</h3>
       <div class="container">	         
	  		<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">발마사지</button>
		  	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">네일아트</button>
		  </div>  
		  <br>
		  	  
		  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">바디케어</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">핸드케어</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">교정</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">두피마사지</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">경락마사지</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">타이식 마사지</button>
	 	  </div>   
    </div>
    <div id="menu3" class="tab-pane fade">
      <h3>지역</h3>
    	 <div class="container">	         
	  		<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">서울특별시</button>
		  	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">경기도</button>
		  </div>  
		  <br>
		  	  
		  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">강원도</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">경상도</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">전라도</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">충청도</button>
	 	  </div>
	 	  <br>
	 	  
	 	  <div class="container">	         
  			<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
  			<button type="button" style="width:300px; height:50px;" class="btn btn-primary">제주도</button>
  			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  	 <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  		<button type="button" style="width:300px; height:50px;" class="btn btn-primary">기타섬</button>
	 	  </div>   
    </div>
  </div>
</div>






</body>
</html>	
