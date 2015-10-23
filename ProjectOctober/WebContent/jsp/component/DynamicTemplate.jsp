<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic Templete</title>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src='//code.jquery.com/ui/1.11.4/jquery-ui.js'></script>

<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/lodash.js"></script>
<script src="${pageContext.request.contextPath}/js/gridstack.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gridstack/gridstack.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gridstack/gridstack-extra.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/hover/hover.css" />

<style>
	.delBT{
		position: absolute;
	}
	
	.delBT:hover{
		size: 30px;
	}
			
	#page {
		background-color: white;
		border-style: solid;
		border-color: green;
		padding: 20px;
	}
	
</style>

<script>
$(function () {
//startEdit() 안에 들어가지 않고 나와있음.
	$('.grid-stack').gridstack({
		static_grid : false,
   		always_show_resize_handle : false,
    	placeholder_class : 'grid-stack-placeholder',
    	resizable: {
            handles: 'e, se, s, sw, w'
        }	
	});
		
	var loginId = '<%= session.getAttribute("loginId") %>';
	var pageId = '<%= session.getAttribute("pageId") %>';

	$('.edit').hide();
	$('#etpBT').hide();
	
	//로그인 한 사람이 페이지 주인과 동일 할 때 
	if(loginId!=null && loginId==pageId){	
		activeComponent();
		alert("내가 주인이다")	
		$('#etpBT').show();
		
		$('#saveBT').attr('disabled', true);
		$('#editBT').attr('disabled', false); // 사업자 편집 버튼바 중 페이지 편집 버튼 disabled		
	} else{
		alert("I am not 주인");
	//로그인 하지 않았거나 페이지 주인이 아닐때
});


function startEdit(){
		
	$('.edit').show();
	
	$('#saveBT').attr('disabled', false);
	$('#editBT').attr('disabled', true); // 사업자 편집 버튼바 중 페이지 편집 버튼 disabled

	
	//save, load 버튼에 클릭 이벤트와 함수 연결
    $('#saveBT').on('click', savePage);
    $('#loadBT').on('click', load_grid);
    
    //컴포넌트에 마우스가 들어가면 삭제 버튼 생성
    $('.grid-stack-item').on('mouseenter', function(){
    	$(this).find('.delBT')
    	.html('<img src="https://cdn3.iconfinder.com/data/icons/iconic-1/32/x_alt-16.png">');
    });
    
	//컴포넌트에 마우스가 나오면 삭제 버튼 사라짐
    $('.grid-stack-item').on('mouseleave', function(){
    	$(this).find('.delBT').html('');
    });
}


function savePage(etpNum){
	var etpNum2 = etpNum;
 	var componentList = _.map($('.grid-stack .grid-stack-item:visible'), function(el) {
	    el = $(el);
	    var node = el.data('_gridstack_node'); //node : Object와 같은 모든 것을 담을 수 있는 부모 객체
	    var component = {  
	    	"component.etpNum" : etpNum2,
	    	"component.componentID" : el.attr('id'),
	        "component.componentPosX" : node.x,
	        "component.componentPosY" : node.y,
	        "component.componentWidth" : node.width,
	        "component.componentHeight" : node.height
	    };
	    return component; //return 받는 객체 형식
	}); 
 
 	
 	for(var i in componentList){
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
 		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/insertComponent.action?etpNum='+etpNum, 
			type:'POST',
			data :  componentList[i],
			contentType: 
				'application/x-www-form-urlencoded; charset=utf-8',
		}); 
 	} 
 	
	$('#saved-data').val(JSON.stringify(componentList));
	//JSON.stringify : 배열을 JSON 문자열로 변환 JSON.stringify(value[, replacer[, space]])
    //replacer, space는 옵션
};

function load_grid(){	
	$.ajax({
		url: '${pageContext.request.contextPath}/enterprise/receiveComponentList.action?etpNum='+etpNum,
		type:'GET',
		dataType: 'json',
		success : print				
	});	
};

function remove_widget(item){
	var grid = $('.grid-stack').data('gridstack');
	
	grid.remove_widget(item, true);
}


function print(object){
	var items = object.componentList;
    items = GridStackUI.Utils.sort(items); // 각 컴포넌트를 원래 순서대로 정렬. 안하면 랜덤으로 섞여서 배치됨
    
    console.log(items);	// 컴포넌트 위치값 확인
    
    var grid = $('.grid-stack').data('gridstack');
    grid.remove_all();
    
    _.each(items, function (node) {
	
    	console.log(node);
	
   	switch (node.componentID) {
		case 'topCP':
        	grid.add_widget(
        		$('<div id="topCP">'
        		+'<a onclick="remove_widget(topCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inTopCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'etpBtBar':
			grid.add_widget(
				$('<div id="etpBtBar">'
        		+'<a onclick="remove_widget(etpBtBar)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inEtpBtBar">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'rsvBt':
			grid.add_widget(
				$('<div id="rsvBt">'
        		+'<a onclick="remove_widget(rsvBt)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<a href=""><label role="button" class="btn btn-default btn-lg" id="phoneBT" style="width: 250px;">전화 예약(000-0000-0000)</label></a>'
        		+'<a href=""><label role="button" class="btn btn-success btn-lg" id="rsvBT" style="width: 250px;">예약 하기</label></a></div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'infoCP':
			grid.add_widget(
				$('<div id="infoCP">'
        		+'<a onclick="remove_widget(infoCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inInfoCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'svcCP':
			grid.add_widget(
				$('<div id="svcCP">'
        		+'<a onclick="remove_widget(svcCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inSvcCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'galCP':
			grid.add_widget(
				$('<div id="galCP">'
        		+'<a onclick="remove_widget(galCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inGalCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'locaCP':
			grid.add_widget(
				$('<div id="locaCP">'
        		+'<a onclick="remove_widget(locaCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inLocaCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
			
		case 'reviewCP':
			grid.add_widget(
				$('<div id="reviewCP">'
        		+'<a onclick="remove_widget(reviewCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inReviewCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;				
   		} //switch, grid.add_widget end
    });
    
    //각 <div class="grid-stack-item-content"> 안에 들어갈 페이지 불러오기
    $('#inReviewCP').load('./ReviewComponent.jsp');
    $('#inLocaCP').load('./LocationComponent.jsp');
    $('#inGalCP').load('./GalleryComponent.jsp');
    $('#inSvcCP').load('./SvcComponent.jsp');
    $('#inInfoCP').load('./InfoComponent.jsp');
    $('#inEtpBtBar').load('./EtpBT.jsp');
    $('#inTopCP').load('./StaticTop.jsp');
    
    // 세이브, 로드, 삭제버튼 생성 및 사라짐
    eventOn(); 
}


</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<div class="container" id="page">

<button id ='loadBT'>load Component</button>

	<div class="grid-stack">
	
		<!-- 상단 컴포넌트 -->
	    <div class='grid-stack-item' id ='topCP'
	    data-gs-x='1' data-gs-y='0' data-gs-width='10' data-gs-height='2'>
	    	<!-- 삭제버튼  -->
	    	<a onclick="remove_widget(topCP)">
	    		<span class="delBT edit"></span>
	   		</a>
	   		
			<div class="grid-stack-item-content">				
				<s:include value="./StaticTop.jsp"/>
			</div>
			
	    </div>
   		
   		<!-- 사업자 전용 버튼 -->
	    <div class="grid-stack-item" id="etpBtBar"  
	    data-gs-x="1" data-gs-y="3" data-gs-width="4" data-gs-height="1">
	    	<!-- 필수 항목이므로 지울 수 없음!! -->		    
			<div class="grid-stack-item-content">
				<s:include value="./EtpBT.jsp"/>
			</div>
	    </div>
	    
	    <!-- 예약 버튼 -->
	    <div class="grid-stack-item" id="rsvBt"
	    data-gs-x="5" data-gs-y="3" data-gs-width="6" data-gs-height="1">
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(rsvBt)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<div class="btn-group btn-group-justified" role="group" aria-label="..." draggable="true">
					<div class="btn-group" role="group">
					 <button type="button" class="btn btn-default btn-lg" id="phoneBT" >전화 예약(000-0000-0000)</button>
					</div>
					<div class="btn-group" role="group">
		 				<button type="button" class="btn btn-success btn-lg" id="rsvBT">예약 하기</button>
					</div>
				</div>
			</div>
	    </div>
	    
	    <!-- 기본 정보 컴포넌트 -->
	    <div class="grid-stack-item" id="infoCP"
	    data-gs-x="1" data-gs-y="4" data-gs-width="10" data-gs-height="3">
	    	<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(infoCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./InfoComponent.jsp"/>
			</div>
	    </div>
	    
	    <!-- 서비스 메뉴 컴포넌트 -->
	    <div class="grid-stack-item"  id="svcCP"
	    data-gs-x="1" data-gs-y="7" data-gs-width="7" data-gs-height="5">
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(svcCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./SvcComponent.jsp"/>
			</div>
	    </div>
	    
	    <!-- 갤러리 컴포넌트 -->
	    <div class="grid-stack-item" id="galCP"
	    data-gs-x="8" data-gs-y="7" data-gs-width="3" data-gs-height="5">
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(galCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./GalleryComponent.jsp"/>
			</div>
	    </div>
	    
	    <!-- 오시는 길 컴포넌트 -->
	    <div class="grid-stack-item" id="locaCP"
	    data-gs-x="1" data-gs-y="12" data-gs-width="10" data-gs-height="4">
	   		<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(locaCP)'>
				<span class="delBT edit"></span>
			</a>
	   	
			<div class="grid-stack-item-content">
				<s:include value="./LocationComponent.jsp"/>
			</div>
	    </div>
	    
	    <!-- 고객 평가 컴포넌트 -->
	    <div class="grid-stack-item" id="reviewCP"
	    data-gs-x="1" data-gs-y="17" data-gs-width="10" data-gs-height="4">
	    	<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(reviewCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./ReviewComponent.jsp"/>
			</div>
	    </div>
	    
	</div>

</div>




</body>
</html>