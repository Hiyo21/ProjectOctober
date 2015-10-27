<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>      
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />


<title>Static Template 2</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script> 

<script type="text/javascript">

	$(function(){
		var colorTheme = <s:property value="enterprise.etpThemeType"/>;
		if(colorTheme == 1) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/cherry.css'/>");
		if(colorTheme == 2) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/color.css'/>"); 
		if(colorTheme == 3) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/creature.css'/>"); 
		if(colorTheme == 4) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/frame.css'/>"); 
		if(colorTheme == 5) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/grass.css'/>"); 
		if(colorTheme == 6) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/maple.css'/>"); 
		if(colorTheme == 7) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/mineral.css'/>"); 
		if(colorTheme == 8) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/sliced.css'/>"); 
		if(colorTheme == 9) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/spring.css'/>"); 
		if(colorTheme == 10) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/sunset.css'/>"); 
		if(colorTheme == 11) $('head').append("<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/colorthemes/tile.css'/>"); 
		if(colorTheme == 12) $('head').append("<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>");
	});

	$(document).ready(function(){
		hideBT();
	});
	
	//사업자용 편집 버튼 숨김
	function hideBT(){
		var loginId = "<%= session.getAttribute("loginId") %>" ;
		var pageId = "<%= session.getAttribute("pageId") %>" ;

		$('#saveBT').attr('disabled', true);
		$('.edit').hide();
		
		//로그인 한 사람이 페이지 주인과 동일 할 때 
		if(loginId!=null && loginId==pageId){
			$('#etpBtBar').show();
			$('#editBT').on('click', startEdit);
		}else{
			$('#etpBtBar').hide();	
		}	
	}
	
	
	//편집 버튼 보이기
	function startEdit(){
		//편집, 수정 버튼 보임	
		$('.edit').show();
		
		//저장 버튼 활성화, 편집 버튼 비활성화 // 편집버튼 비활성화에서 활성화로 되돌리는 법 생각해야함 
		$('#saveBT').attr('disabled', false);
		$('#saveBT').on('click', savePage);  
		
		//편집 버튼에 누름 효과 추가
	    $('#editBT').addClass('active');
		//편집 버튼에 기존 클릭 이벤트 제거 후 새로운 이벤트 추가
	    $('#editBT').unbind('click');
	    $('#editBT').on('click', stopEdit);
	}
	
	function stopEdit(){
		//편집 버튼에 누름 효과 제거
		$('#editBT').removeClass('active');
		//편집 버튼에 기존 클릭 이벤트 제거 후 새로운 이벤트 추가
		$('#editBT').unbind('click');
		$('#editBT').on('click', startEdit);
		
		$('.edit').hide(); //편집 버튼 숨기기
		loadPage(); //DB에 저장되어 있는 페이지 로드
	}
	
	/* //각 <div class="grid-stack-item-content"> 안에 들어갈 페이지 불러오기
    $('#inReviewCP').load('${pageContext.request.contextPath}/jsp/component/ReviewComponent.jsp');
    $('#inLocaCP').load('${pageContext.request.contextPath}/jsp/component/LocationComponent.jsp');
    $('#inGalCP').load('${pageContext.request.contextPath}/jsp/component/GalleryComponent.jsp');
    $('#inSvcCP').load('${pageContext.request.contextPath}/jsp/component/SvcComponent.jsp');
    $('#inInfoCP').load('${pageContext.request.contextPath}/jsp/component/InfoComponent.jsp');
    $('#inEtpBtBar').load('${pageContext.request.contextPath}/jsp/component/EtpBT.jsp');
    $('#inTopCP').load('${pageContext.request.contextPath}/jsp/component/StaticTop.jsp'); 
	 */
</script>

</head>

<body>
<s:include value="../Header.jsp"></s:include>

<div class="page">

	<div class="container">
		<!-- page-top -->
		<s:include value="./StaticTop.jsp"/>
		
		<s:include value="./EtpBT.jsp"/>
		
		<div class="buttonBars">
			<div class="btn-group btn-group-justified" role="group" aria-label="...">
				<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-default btn-lg">전화 예약(000-0000-0000)</button>
			  	</div>
			  	<div class="btn-group" role="group">
			    	<a href="toCalendarPage.action"><button type="button" class="btn btn-success btn-lg">예약 하기</button></a>
			  	</div>
			</div>
		</div>

		<!------- 업체 소개 ------->
		<br>
		<div class="panel panel-success">
			<div id="infoCP" class="panel-heading">
				<div class="panel-title">
					<h2>업체 소개</h2>
				</div>
			</div>
			<div class="panel-body">
				<s:include value="./InfoComponent.jsp"/>
			</div>	
				
			<!------- 서비스 메뉴 ------->
			<div id="svcListCP" class="panel-heading">
				<div class="panel-title">
					<h2>서비스 메뉴</h2>
				</div>
			</div>
			<div class="panel-body">
				<s:include value="./SvcComponent.jsp"/>
			</div>
				
			<!------- 갤러리 메뉴 ------->
			<div id="galCP" class="panel-heading">
				<div class="panel-title">
					<h2>갤러리</h2>
				</div>
			</div>
			<div class="panel-body">
				<s:include value="./GalleryComponent.jsp"/>
			</div>
				
			<!------- 오시는 길 ------->
			<div id="locationCP" class="panel-heading">
				<div class="panel-title">
					<h2>오시는 길</h2>
				</div>
			</div>
			<div class="panel-body">
				<h1>오시는 길</h1>
				<s:include value="./LocationComponent.jsp"/>
			</div>	
				
			<!------- 고객 평가 ------->
			<div id="reviewCP" class="panel-heading">
				<div class="panel-title">
					<h2>고객 평가</h2>
				</div>
			</div>
			<div class="panel-body">
				<s:include value="./ReviewComponent.jsp"/>
			</div>		
		</div>
	</div>
</div>	
</body>
</html>