<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.modal-dialog{
    overflow-y: initial !important
}
.modal-body{
    height: 500px;
    overflow-y: auto;
}
</style>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lightbox/colorbox.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/css/lightbox/jquery.colorbox.js"></script>
<s:if test="enterprise.etpTemplateType == null">
	<script>
	$('.group').colorbox({
		rel:'group',
		open: true
	});
	</script>
</s:if>
<script>
$(document).ready(function() {
	$('#b1').on('click', first);	//첫번째 버튼에 클릭 이벤트 생성
	$('#b2').on('click', second);	//두번째 버튼에 클릭 이벤트 생성
	$('#b3').on('click', third);	//세번째 버튼에 클릭 이벤트 생성
	$("#one").click(function(){$("#myModal1").modal();});		//첫번째 미리보기 이미지를 클릭하면 모달 실행
	$("#two").click(function(){$("#myModal2").modal();});		//두번째 미리보기 이미지를 클릭하면 모달 실행
	$("#three").click(function(){$("#myModal3").modal();});		//세번째 미리보기 이미지를 클릭하면 모달 실행
});

function first() {
	//첫번째 버튼을 눌렀을 때 바뀌는 세 가지 템플릿 미리보기 이미지 (현재 임시 이미지)
	$('#one').attr('src', 'http://farm9.staticflickr.com/8235/8558295467_e89e95e05a_s.jpg');
	$('#two').attr('src', 'http://farm9.staticflickr.com/8235/8558295467_e89e95e05a_s.jpg');
	$('#three').attr('src', 'http://farm9.staticflickr.com/8235/8558295467_e89e95e05a_s.jpg');
}
function second() {
	//두번째 버튼을 눌렀을 때 바뀌는 세 가지 템플릿 미리보기 이미지 (현재 임시 이미지)
	$('#one').attr('src', 'http://farm9.staticflickr.com/8378/8559402848_9fcd90d20b_b.jpg');
	$('#two').attr('src', 'http://farm9.staticflickr.com/8378/8559402848_9fcd90d20b_b.jpg');
	$('#three').attr('src', 'http://farm9.staticflickr.com/8378/8559402848_9fcd90d20b_b.jpg');
}
function third() {
	//세번째 버튼을 눌렀을 때 바뀌는 세 가지 템플릿 미리보기 이미지 (현재 임시 이미지)
	$('#one').attr('src', 'http://farm9.staticflickr.com/8235/8559402846_8b7f82e05d_s.jpg');
	$('#two').attr('src', 'http://farm9.staticflickr.com/8235/8559402846_8b7f82e05d_s.jpg');
	$('#three').attr('src', 'http://farm9.staticflickr.com/8235/8559402846_8b7f82e05d_s.jpg');
}

function template1() {
	$(".templateConfirmMessage").html("동적 템플릿을 선택하셨습니다.").css("color", "green");
	template = 1;
}
function template2() {
	$(".templateConfirmMessage").html("탭 형식의 템플릿을 선택하셨습니다.").css("color", "green");
	template = 2;
}
function template3() {
	$(".templateConfirmMessage").html("원 페이지 형식의 템플릿을 선택하셨습니다.").css("color", "green");
	template = 3;
}

var colorTheme = 12;
var template = 2;

$(function(){
	$(".btn-group .btn").click(function(){
		colorTheme = $(this).val();
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
});

$(function(){
	$("#colorThemeConfirm").on('click', function(){
		$.ajax({
			url: "${pageContext.request.contextPath}/enterprise/updateTemplate.action",
			data: {"enterprise.etpNum": <s:property value='#session.loginEtpNum'/>,
					"enterprise.etpEmail":'<s:property value="#session.loginId"/>',
					"enterprise.etpThemeType":colorTheme,
					"enterprise.etpTemplateType":template},
			type: "POST",
			success: function(){
				$("#colorConfirmed").html("칼라 테마가 적용되었습니다.").css("color","green");
			},
			error: function(request, status, error){
				console.log(request);
				console.log(request.status);
				console.log(status);
				console.log(error);
			}
		});
	});
});

$(function(){
	$("#toMyPageBtn").click(function(){
		location.href ="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=<s:property value='#session.loginEtpNum'/>";
	});
});

</script>
</head>
<body>
<s:include value="../Header.jsp"></s:include>
<a class="group" href="${pageContext.request.contextPath}/image/pleasedelete1.JPG" title="튜토리얼페이지1"></a>
<a class="group" href="${pageContext.request.contextPath}/image/pleasedelete2.JPG" title="튜토리얼페이지2"></a>
<a class="group" href="${pageContext.request.contextPath}/image/pleasedelete3.JPG" title="튜토리얼페이지3"></a>
<div align = "center">
<br><br>
<div class="container">
	<div class="row">
		<div class="col-xs-4">
			<div id="col1">
			<h2>동적템플릿</h2>
			<!-- 미리보기 이미지는 주소를 바꿔서 (크기 변경 가능) -->
			<img src="http://farm9.staticflickr.com/8235/8558295467_e89e95e05a_s.jpg" class="img img-thumbnail" width="100" height="100" id="one">
			</div>
		</div>
		<div class="col-xs-4">
			<div id="col2">
			<h2>정적템플릿1</h2>
			<!-- 미리보기 이미지는 주소를 바꿔서 (크기 변경 가능) -->
			<img src="http://farm9.staticflickr.com/8235/8558295467_e89e95e05a_s.jpg" class="img img-thumbnail" width="100" height="100" id="two">
			</div>
		</div>
		<div class="col-xs-4">
			<div id="col3">
			<h2>정적템플릿2</h2>
			<!-- 미리보기 이미지는 주소를 바꿔서 (크기 변경 가능) -->
			<img src="http://farm9.staticflickr.com/8235/8558295467_e89e95e05a_s.jpg" class="img img-thumbnail" width="100" height="100" id="three">
			</div>
		</div>
	</div>
</div>
	<br><br><br>
	<h1>색깔 테마를 선택하세요.</h1>
	<div class="btn-group">
		<button type="button" class="btn btn-default btn-lg" id="b1" value="1">Cherry</button>
		<button type="button" class="btn btn-default btn-lg" id="b2" value="2">Color</button>
		<button type="button" class="btn btn-default btn-lg" id="b3" value="3">Creature</button>
		<button type="button" class="btn btn-default btn-lg" id="b4" value="4">Frame</button>
		<button type="button" class="btn btn-default btn-lg" id="b5" value="5">Grass</button>
		<button type="button" class="btn btn-default btn-lg" id="b6" value="6">Maple</button>
		<button type="button" class="btn btn-default btn-lg" id="b7" value="7">Mineral</button>
		<button type="button" class="btn btn-default btn-lg" id="b8" value="8">Sliced</button>
		<button type="button" class="btn btn-default btn-lg" id="b9" value="9">Spring</button>
		<button type="button" class="btn btn-default btn-lg" id="b10" value="10">Sunset</button>
		<button type="button" class="btn btn-default btn-lg" id="b11" value="11">Tile</button>
	</div>
	<br><br>
	<div>
		<button type="button" class="btn btn-info btn-lg" id="b12" value="12">기본 테마 적용</button> 
		<button type="button" class="btn btn-warning btn-lg" id="colorThemeConfirm">이 구성을 사용</button>
		<br><span class="templateConfirmMessage"></span>
		<br><span id="colorConfirmed"></span>
		<br>
		<br>
		<button type="button" class="btn btn-primary btn-lg" id="toMyPageBtn">사업자 페이지로 이동</button>
	</div>
	
<div class="container">
	
	<!-- 첫번째 미리보기를 클릭하면 실행되는 모달 -->
	<div class="modal fade" id="myModal1" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<!-- 모달의 헤더 부분 -->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">동적템플릿</h4>
				</div>
				<!-- 모달의 바디 부분 / 이곳에 include -->
				<div class="modal-body">
					<p><img src="${pageContext.request.contextPath}/image/DynamicTemplate.gif"></p>
				</div>
				<!-- 모달의 하단 / close 버튼이 위치 -->
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" onclick="template1()">Select</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 두번째 미리보기를 클릭하면 실행되는 모달 -->
	<div class="modal fade" id="myModal2" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">정적템플릿1</h4>
				</div>
				<div class="modal-body">
					<p><img src="${pageContext.request.contextPath}/image/StaticTemplate1.gif"></p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" onclick="template2()">Select</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<br>
				</div>
			</div>
		</div>
	</div>
	
	<!-- 세번째 미리보기를 클릭하면 실행되는 모달 -->
	<div class="modal fade" id="myModal3" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">정적템플릿2</h4>
				</div>
				<div class="modal-body">
					<p><img src="${pageContext.request.contextPath}/image/StaticTemplate2.jpg"></p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" onclick="template3()">Select</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<br>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>