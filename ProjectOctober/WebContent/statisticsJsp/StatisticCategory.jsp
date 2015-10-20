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
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">

<style type="text/css">
textarea {width:800px; height:300px;overflow:visible;}

</style>
<title>기본 통계</title>

</head>
<body>
<%@include file="Header.jsp"%>
<!-- 내가 작성 -->

<div class="container">
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">통계1</a></li>
    <li><a data-toggle="tab" href="#menu1">통계2</a></li>
    <li><a data-toggle="tab" href="#menu2">통계3</a></li>
    <li><a data-toggle="tab" href="#menu3">통계4</a></li>
    <li><a data-toggle="tab" href="#menu4">통계5</a></li>
    <li><a data-toggle="tab" href="#menu5">통계6</a></li>
    <li><a data-toggle="tab" href="#menu6">통계7</a></li>
    <li><a data-toggle="tab" href="#menu7">통계8</a></li>
    <li><a data-toggle="tab" href="#menu8">통계9</a></li>
    <li><a data-toggle="tab" href="#menu9">통계10</a></li>
    <li><a data-toggle="tab" href="#menu10">통계11</a></li>
    <li><a data-toggle="tab" href="#menu11">통계12</a></li>
    <li><a data-toggle="tab" href="#menu12">통계13</a></li>
    <li><a data-toggle="tab" href="#menu13">통계14</a></li>
    <li><a data-toggle="tab" href="#menu14">통계15</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>통계1</h3>
         <s:include value="Highchart1.jsp"/>        
     </div> <!-- 통계1 -->
     
   	 <div id="menu1" class="tab-pane fade" >
   		  <h3>통계2</h3>
   		 <s:include value="Highchart2.jsp"/>       	
   	  </div>	<!-- 통계2 -->
   	 
   	  <div id="menu2" class="tab-pane fade">
      	<h3>통계3</h3>	
   		  <s:include value="Highchart3.jsp"/>  		   
   	  </div><!-- 통계3 -->
   	 
   	  <div id="menu3" class="tab-pane fade">
     	 <h3>통계4</h3>
      	  <s:include value="Highchart4.jsp"/>  
      </div><!-- 통계4 -->
      
      <div id="menu4" class="tab-pane fade">
     	  <h3>통계5</h3>
      	   <s:include value="Highchart5.jsp"/>  
      </div><!-- 통계5 -->
      
      <div id="menu5" class="tab-pane fade">
     	  <h3>통계6</h3>
      	   <s:include value="Highchart6.jsp"/>      
      </div><!-- 통계6 --> 
      
      <div id="menu6" class="tab-pane fade">
     	  <h3>통계7</h3>
      	   
      </div><!-- 통계7 --> 
      <div id="menu7" class="tab-pane fade">
     	  <h3>통계8</h3>
      	   
      </div><!-- 통계8 --> 
      <div id="menu8" class="tab-pane fade">
     	  <h3>통계9</h3>
      	   
      </div><!-- 통계9 --> 
      <div id="menu9" class="tab-pane fade">
     	  <h3>통계10</h3>
      	   
      </div><!-- 통계10 --> 
      <div id="menu10" class="tab-pane fade">
     	  <h3>통계11</h3>
      	   
      </div><!-- 통계11 --> 
      <div id="menu11" class="tab-pane fade">
     	  <h3>통계12</h3>
      	   
      </div><!-- 통계12 --> 
      <div id="menu12" class="tab-pane fade">
     	  <h3>통계13</h3>
      	   
      </div><!-- 통계13 -->
       <div id="menu13" class="tab-pane fade">
     	  <h3>통계14</h3>
      	   
      </div><!-- 통계14 --> 
      <div id="menu14" class="tab-pane fade">
     	  <h3>통계15</h3>
      	   
      </div><!-- 통계15 -->
      
   </div>
</div>
</body>
</html>	
