<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
</head>
<body>
<%@include file="Header.jsp"%>


<s:iterator>
<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="section">
              <div class="container">
                <div class="row">
                <div class="panel panel-default" style="width: 1200px"><!-- 조건이네 shop -->
					<div class="panel panel-primary">
						<div class="panel-heading">
					    	<h1 class="panel-title"  align="left">조건이네 마사지 SHOP</h1>
					  	</div>
						 <div class="panel-body"> 	
					  	
					  	
				                  <div class="col-md-6"><!-- 왼쪽 캉 -->
				                  	<button type="button" class="btn btn-info">주차장있음</button>&nbsp;&nbsp;<button type="button" class="btn btn-info">여성전용</button>
				          			<br>
				          			<br>
				    				<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="200" height="200">
				    				<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="200" height="200"> 
				                  </div>
				                  
				                  <div class="col-md-6" style="display: inline-block;text-align: right;"><!-- 오른쪽 칸 --> 
				                  	 <div class="row">                 	 
					          			<button type="button" class="btn btn-primary active" style="background-color: gray;">오늘 있음</button>&nbsp;&nbsp;
					    				<button type="button" class="btn btn-primary active" style="background-color: gray;">지금 예약 가능</button>    				
				          				<button type="button" class="btn btn-primary active" style="width: 100px">예약</button>
				          			</div>
				          			<br>
				          			</div>
				          			
				          			<div class="panel panel-default" style="display: inline-block; text-align: left; width: 500px; height: 200px;">
				    					업체 소개 및 선전 문구
				    				</div>
				    	</div>
				    </div>
				  </div>			
                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

</s:iterator>
</body>
</html>