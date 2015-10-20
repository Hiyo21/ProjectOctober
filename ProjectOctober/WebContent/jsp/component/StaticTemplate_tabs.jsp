<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>      
  
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Static Template ver.Tab</title>

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
	
	//편집 버튼 숨김
	$(function(){		
		$('.edit').hide();	// top 개요 편집 버튼, info 편집 버튼, 사업자 버튼바 중 save 버튼, 서비스 편집 버튼
	});
	
	//편집 버튼 보이기
	function showBT(){
		$('.edit').show();	// top 개요 편집 버튼, info 편집 버튼, 사업자 버튼바 중 save 버튼, 서비스 편집 버튼

		$('#editBT').hide();// 사업자 편집 버튼바 중 페이지 편집 버튼
	}
	
	//페이지 저장 form으로 전달 예정 
	function savePage(){
		
	}
	
</script>


</head>

<body>
<s:include value="../Header.jsp"></s:include>

<!-- 동적 페이지의 경우 컴포넌트의 위치 및 사이즈 값이 추가로 저장 및 수정이 필요하기 때문에 Action을 구분한다 -->

<div class="page">
	<div class="container">
		<!-- page-top -->
		<s:include value="./StaticTop.jsp"/>
		
		<!-- 로그인 된 아이디와 페이지 소유자 아이디가 일치할 때만 보여야 함. 다른 페이지에서도 확인할 필요가 있으므로 세션으로 넣는것은?? -->
		<%-- <s:if test="#session.loginId == #session.pageEtpId">
			<!-- 사업자 전용 버튼 -->
			<s:include value="./EtpBT.jsp"/>
		</s:if> --%>
		
		<!-- 테스트용 -->
		<s:include value="./EtpBT.jsp"/>
	
		<div class="buttonBars">
			<div class="btn-group btn-group-justified" role="group" aria-label="...">
				<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-default btn-lg">전화 예약(${etpPhone})</button>
			  	</div>
			  	<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-success btn-lg" onclick='location.href="receiveSvcList.action?etpNum="${etpNum}'>예약 하기</button>
			  	</div>
			</div>
		</div>

		<br>
		<div class="panel panel-default">	
			<ul class="nav nav-tabs">
	           <li role="presentation" class="active"><a href="#infoCP">업체 정보</a></li>
	           <li role="presentation"><a href="#svcListCP">서비스 메뉴</a></li>
	           <li role="presentation"><a href="#galCP">갤러리</a></li>
	           <li role="presentation"><a href="#locationCP">오시는 길</a></li>
	           <li role="presentation"><a href="#reviewCP">고객 평가</a></li>
	       	</ul>
			<div class="tab-content">
				<div id="infoCP" class="tab-pane fade in active">
					<s:include value="./InfoComponent.jsp"/>
				</div>
				<div id="svcListCP" class="tab-pane fade">
					<s:include value="./SvcComponent.jsp"/>			
				</div>
				<div id="galCP" class="tab-pane fade">
		 			<s:include value="./GalleryComponent.jsp"/>	
				</div>
				<div id="locationCP" class="tab-pane fade">
					<s:include value="./LocationComponent.jsp"/>
				</div>
				<div id="reviewCP" class="tab-pane fade">
					<s:include value="./ReviewComponent.jsp"/>				
				</div>
			</div>	
		</div>
	</div>
</div>

</body>
</html>