<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>      
  
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script> 

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Static Template ver.Tab</title>

<script>
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
	    $(".nav-tabs a").click(function(){
	        $(this).tab('show');
	    });
	    $('.nav-tabs a').on('shown.bs.tab', function(event){
	        var x = $(event.target).text();         // active tab
	        var y = $(event.relatedTarget).text();  // previous tab
	        $(".act span").text(x);
	        $(".prev span").text(y);
	    }); 
	   	
	    hideBT();
	}); 
	
	//편집 버튼 숨김
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
	};
	
	//편집 버튼 보이기
	function startEdit(){
		//편집, 수정 버튼 보임	
		$('.edit').show();
		//저장 버튼 활성화, 편집 버튼 비활성화 // 편집버튼 비활성화에서 활성화로 되돌리는 법 생각해야함 
		$('#saveBT').attr('disabled', false);
		//save 버튼에 클릭 이벤트와 함수 연결
	    $('#saveBT').on('click', savePage);
		//편집버튼에 누름 효과, 클릭시 편집 중지 기능
		$('#editBT').addClass('active');
		$('#editBT').unbind('click');
		$('#editBT').on('click', stopEdit);    
	};
	
	function stopEdit(){
		$('.edit').hide(); //편집 버튼 숨기기
		$('#editBT').unbind('click');
		$('#editBT').on('click', startEdit);
		$('#editBT').removeClass('active');
		
	};
	
	function savePage(){
		
	};
		
	/* $("#locationCP").load('${pageContext.request.contextPath}/jsp/component/LocationComponent.jsp'); */
	
	/* //각 <div class="grid-stack-item-content"> 안에 들어갈 페이지 불러오기
    $('#inReviewCP').load('${pageContext.request.contextPath}/jsp/component/ReviewComponent.jsp');
    $('#inLocaCP').load('${pageContext.request.contextPath}/jsp/component/LocationComponent.jsp');
    $('#inGalCP').load('${pageContext.request.contextPath}/jsp/component/GalleryComponent.jsp');
    $('#inSvcCP').load('${pageContext.request.contextPath}/jsp/component/SvcComponent.jsp');
    $('#inInfoCP').load('${pageContext.request.contextPath}/jsp/component/InfoComponent.jsp');
    $('#inRsvBt').load('${pageContext.request.contextPath}/jsp/component/InfoComponent.jsp');
    $('#inEtpBtBar').load('${pageContext.request.contextPath}/jsp/component/EtpBT.jsp');
    $('#inTopCP').load('${pageContext.request.contextPath}/jsp/component/StaticTop.jsp');  */
</script>


</head>

<body>
<s:include value="../Header.jsp"></s:include>

<!-- 동적 페이지의 경우 컴포넌트의 위치 및 사이즈 값이 추가로 저장 및 수정이 필요하기 때문에 Action을 구분한다 -->

<div class="page">
	<div class="container">
		<!-- page-top -->
		<s:include value="./StaticTop.jsp"/>
		
		<!-- 테스트용 -->
		<s:include value="./EtpBT.jsp"/>
	
		<div class="buttonBars">
			<div class="btn-group btn-group-justified" role="group" aria-label="...">
				<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-default btn-lg">전화 예약(<s:property value="enterprise.etpPhone"/>)</button>
			  	</div>
			  	<div class="btn-group" role="group">
			    	<button type="button" class="btn btn-success btn-lg" onclick='location.href="receiveServiceList.action?etpNum="${etpNum}'>예약 하기</button>
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