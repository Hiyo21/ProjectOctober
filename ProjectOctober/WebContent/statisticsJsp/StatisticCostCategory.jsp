<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="http://code.highcharts.com/modules/data.js"></script>
<script src="http://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>유료 통계 서비스 화면</title>
</head>
<body>
<%@include file="Header.jsp"%>
<!-- 내가 작성할 부분 -->
<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-12">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 1통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은업종, 같은지역 내 매출 상위 TOP10</h3>
						 </div>
						 <div class="panel-body">
						     <s:include value="Highchart9.jsp"/>    
						 </div>
				    </div>
		   		  <!-- 유료 1통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
    </div>



 <div class="section2">
      <div class="container10">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-8">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 2통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은업종, 같은지역 예약이 몰리는 시간대</h3>
						 </div>
						 <div class="panel-body">
						     <s:include value="Highchart10.jsp"/>    
						 </div>
				    </div>
		   		  <!-- 유료2통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
</div>
    
    
    
<div class="section3">
      <div class="container11">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-8">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 3통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은 업종, 같은지격에 속한 업체들의 방문 고객 연령대</h3>
						 </div>
						 <div class="panel-body">
						    <s:include value="Highchart11.jsp"/>
						 </div>
				    </div>
		   		  <!-- 유료3통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
</div>

</body>
</html>