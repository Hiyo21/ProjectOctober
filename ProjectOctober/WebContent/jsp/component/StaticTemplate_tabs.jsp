<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>      
  
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />

<!-- Custom styles for this template -->
<link href="navbar-fixed-top.css" rel="stylesheet">
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Static Templete 1</title>

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


</head>

<body>
<s:include value="../Header.jsp"></s:include>

<div class="page">

	<div class="container">
	
		<!-- page-top -->
		<s:include value="./StaticTop.jsp"/>
		
		<!-- 사업자 전용 버튼 -->
		<s:include value="./EtpBT.jsp"/>
		
		<div class="buttonBars">
			<div class="btn-group btn-group-justified" role="group" aria-label="...">
				<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-default btn-lg">전화 예약(000-0000-0000)</button>
			  	</div>
			  	<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-success btn-lg">예약 하기</button>
			  	</div>
			</div>
		</div>
		
		<br>	
		<ul class="nav nav-tabs">
           <li role="presentation" class="active"><a href="#infoCP">업체 정보</a></li>
           <li role="presentation"><a href="#svcListCP">서비스 메뉴</a></li>
           <li role="presentation"><a href="#galCP">갤러리</a></li>
           <li role="presentation"><a href="#locationCP">오시는 길</a></li>
           <li role="presentation"><a href="#reviewCP">고객 평가</a></li>
       </ul>
		<div class="tab-content">
			<div id="infoCP" class="tab-pane fade in active">
				<div class="panel panel-default">
					<s:include value="./InfoComponent.jsp"/>
				</div>
			</div>
			<div id="svcListCP" class="tab-pane fade">
				<s:include value="./SvcComponent.jsp"/>			
			</div>
				<div id="galCP" class="tab-pane fade">
		 				<s:include value="./GalleryComponent.jsp"/>	
				</div>
			<div id="locationCP" class="tab-pane fade">
				<div class="panel panel-default">
					<s:include value="./LocationComponent.jsp"/>
				</div>
			</div>
			<div id="reviewCP" class="tab-pane fade">
				<div class="panel panel-default">
					<s:include value="./ReviewComponent.jsp"/>				
				</div>
			</div>
		</div>	
	</div>
</div>
</body>
</html>