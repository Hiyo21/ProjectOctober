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
<title>Static Templete 2</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script type="text/javascript">
//편집 버튼 숨김
	$(function(){
		$('#outEditBT').hide();		// top 부분의 개요 편집 버튼
		$('#infoEditBT').hide();	// info 컴포넌트의 편집 버튼
		$('#saveBT').hide();		// 사업자 편집 버튼바 중 페이지 save 버튼
		
		var etpNum = '1234567890'/* ${etpNum} */;
		
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum='+etpNum,
			type:'GET',
			dataType: 'json',
			success : check
		});
	});
	
	//편집 버튼 보이기
	function showBT(){
		$('#outEditBT').show();		// top 부분의 개요 편집 버튼
		$('#infoEditBT').show();	// info 컴포넌트의 편집 버튼
		$('#saveBT').show();		// 사업자 편집 버튼바 중 페이지 save 버튼
		$('#editBT').hide();		// 사업자 편집 버튼바 중 페이지 편집 버튼
	}
	
	function check(object){
		console.log(object);
	}
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
			    	<button type="button" class="btn btn-success btn-lg">예약 하기</button>
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
				<%-- <s:include value="./LocationComponent.jsp"/> --%>
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