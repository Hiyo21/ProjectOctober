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
<script src="http://malsup.github.com/jquery.form.js"></script> 

<script type="text/javascript">
	$(document).ready(function(){
		hideBT();
	});
	
	//사업자용 편집 버튼 숨김
	function hideBT(){
		var loginId = "<%= session.getAttribute("loginId") %>" ;
		var pageId = "<%= session.getAttribute("pageId") %>" ;

		$('#saveBT').attr('disabled', true);
		$('#editBT').attr('disabled', false); // 사업자 편집 버튼바 중 페이지 편집 버튼 disabled	
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
		$('#editBT').addClass('active');  // 편집 중일 때 누름 표시
		$('#editBT').on('click', stopEdit);	//편집 정지 function on
		//save, load 버튼에 클릭 이벤트와 함수 연결
	    $('#saveBT').on('click', savePage);
	}
	
	function stopEdit(){
		$('#editBT').removeClass('active');
		$('.edit').hide(); //편집 버튼 숨기기
		loadPage(); //DB에 저장되어 있는 페이지 로드
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