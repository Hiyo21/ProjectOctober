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
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css"/>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gridstack/gridstack.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gridstack/gridstack-extra.css" />

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
	
	.modal-backdrop{
		z-index: -1;
	}
	
	.modal{
		z-index: 100;
		text-align: center;
		position: relative;
	}
	
</style>

<script>

$(function(){
	loadPage();	
	
	var options = {
    		always_show_resize_handle : false,
        	placeholder_class : 'grid-stack-placeholder',
        	resizable: {
                handles: 'e, se, s, sw, w'
            }	
	    };
	    
	$('.grid-stack').gridstack(options);
	
	var grid = $('.grid-stack').data('gridstack');
	console.log(grid);
	//drag, resize false
	grid.movable('.grid-stack-item', false);
	grid.resizable('.grid-stack-item', false);
	
	hideBT();
});



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

function activateGrid(){
	var grid = $('.grid-stack').data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', true);
	grid.resizable('.grid-stack-item', true);
}

function startEdit(){
	//편집, 수정 버튼 보임	
	$('.edit').show();
	
	//저장 버튼 활성화, 편집 버튼 비활성화 // 편집버튼 비활성화에서 활성화로 되돌리는 법 생각해야함 
	$('#saveBT').attr('disabled', false);
	$('#editBT').addClass('active');  // 편집 중일 때와 그렇지 않을 때는 구분
	
	//컴포넌튼 drag, resize 활성화
	activateGrid();
	
	//save, load 버튼에 클릭 이벤트와 함수 연결
    $('#saveBT').on('click', savePage);
	//편집버튼 비운 후 클릭기능 추가
    $('#editBT').unbind('click');
    $('#editBT').on('click', stopEdit);
    
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

function stopEdit(){
	//편집 버튼에 눌러진 효과 지우기
	$('#editBT').removeClass('active');
	//편집 버튼에 클릭 이벤트 지운 후 새로운 이벤트 추가
	$('#editBT').unbind('click');
	$('#editBT').on('click', startEdit);
	$('.edit').hide(); //편집 버튼 숨기기
	
	loadPage(); //DB에 저장되어 있는 페이지 로드 
}


function savePage(){
 	var componentList = _.map($('.grid-stack .grid-stack-item:visible'), function(el) {
	    el = $(el);
	    var node = el.data('_gridstack_node'); //node : Object와 같은 모든 것을 담을 수 있는 부모 객체
	    var component = {  
	    	"component.etpNum" : <s:property value="etpNum"/>,
	    	"component.componentID" : el.attr('id'),
	        "component.componentPosX" : node.x,
	        "component.componentPosY" : node.y,
	        "component.componentWidth" : node.width,
	        "component.componentHeight" : node.height
	    };
	    return component; //return 받는 객체 형식
	}); 
 
 	for(var i in componentList){
 		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/insertComponent.action?etpNum=<s:property value="etpNum"/>', 
			type:'POST',
			data :  componentList[i],
			contentType: 
				'application/x-www-form-urlencoded; charset=utf-8',
			success : function(){
				
			}
		}); 	
 	} 
 	
 	alert("저장 완료했습니다")
	//JSON.stringify : 배열을 JSON 문자열로 변환 JSON.stringify(value[, replacer[, space]])
    //replacer, space는 옵션
};

function loadPage(){	
	$.ajax({
		url: '${pageContext.request.contextPath}/enterprise/takeEtpForDynamic.action?etpNum=<s:property value="etpNum"/>',
		type:'GET',
		dataType: 'json',
		success : function(data){
			var items = data.componentList
			printComponent(items);
			hideBT();
		},
		error : function(request, status, error){
			console.log(request);
			console.log(status);
			console.log(request.status);
			console.log(error);
		}
	}); 
};

function resetPage(){

	var serialization = [
         {componentID: "topCP" , componentPosX: 1, componentPosY: 0, componentWidth: 10, componentHeight: 2},
         {componentID: "etpBtBar" , componentPosX: 1, componentPosY: 2, componentWidth: 10, componentHeight: 1},
         {componentID: "rsvBt", componentPosX: 1, componentPosY: 3, componentWidth: 10, componentHeight: 1},
         {componentID: "infoCP", componentPosX: 1, componentPosY: 4, componentWidth: 10, componentHeight: 3},
         {componentID: "svcCP", componentPosX: 1, componentPosY: 7, componentWidth: 7, componentHeight: 5},
         {componentID: "galCP", componentPosX: 8, componentPosY: 7, componentWidth: 3, componentHeight: 5},
         {componentID: "locaCP", componentPosX: 1, componentPosY: 12, componentWidth: 10, componentHeight: 4},
         {componentID: "reviewCP", componentPosX: 1, componentPosY: 16, componentWidth: 10, componentHeight: 4},
     ]; 
	
	printComponent(serialization);
};

function remove_widget(item){
	var grid = $('.grid-stack').data('gridstack');
	
	grid.remove_widget(item, true);
}


// 불러온 컴포넌트 출력
function printComponent(items){
    
    var grid = $('.grid-stack').data('gridstack');
    grid.remove_all();
    
    _.each(items, function (node) {
	
   	switch (node.componentID) {
		case 'topCP':
        	grid.add_widget(
        		$('<div id="topCP" draggable="true">'
        		+'<a onclick="remove_widget(topCP)">'
        		+'<span class="delBT edit"></span></a>'
        		+'<div class="grid-stack-item-content" id="inTopCP">'
        		+'</div></div>')
        		,node.componentPosX, node.componentPosY, node.componentWidth, node.componentHeight);
			break;
		//사업자 편집용 버튼은 삭제할 수 없도록 하기 위해 삭제 버튼 없음	
		case 'etpBtBar':
			grid.add_widget(
				$('<div id="etpBtBar">'
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
        		+'<div class="btn-group btn-group-justified" role="group" aria-label="...">'
        		+'<div class="btn-group" role="group">'
        		+'<button type="button" class="btn btn-default btn-lg" id="phoneBT">전화 예약(<s:property value="enterprise.etpPhone"/>)</button></div>'
        		+'<div class="btn-group" role="group">'
        		+'<button type="button" class="btn btn-success btn-lg" id="rsvBT">예약 하기</button></div></div>')
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
    $('#inReviewCP').load('${pageContext.request.contextPath}/jsp/component/ReviewComponent.jsp');
    $('#inLocaCP').load('${pageContext.request.contextPath}/jsp/component/LocationComponent.jsp');
    $('#inGalCP').load('${pageContext.request.contextPath}/jsp/component/GalleryComponent.jsp');
    $('#inSvcCP').load('${pageContext.request.contextPath}/jsp/component/SvcComponent.jsp');
    $('#inInfoCP').load('${pageContext.request.contextPath}/jsp/component/InfoComponent.jsp');
    $('#inRsvBt').load('${pageContext.request.contextPath}/jsp/component/InfoComponent.jsp');
    $('#inEtpBtBar').load('${pageContext.request.contextPath}/jsp/component/EtpBT.jsp');
    $('#inTopCP').load('${pageContext.request.contextPath}/jsp/component/StaticTop.jsp');
    
}

</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<div class="container" id="page">
	<!-- <button onclick="loadPage()">load</button> -->
	
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
	    data-gs-x='1' data-gs-y='3' data-gs-width='10' data-gs-height='1'>
	    	<!-- 필수 항목이므로 지울 수 없음!! -->		    
			<div class="grid-stack-item-content">
				<s:include value="./EtpBT.jsp"/>
			</div>
	    </div>
	    
	    <!-- 예약 버튼 -->
	    <div class="grid-stack-item" id="rsvBt" 
	    data-gs-x="1" data-gs-y="4" data-gs-width="10" data-gs-height="1">
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(rsvBt)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<div class="btn-group btn-group-justified" role="group" aria-label="...">
					<div class="btn-group" role="group">
					 <button type="button" class="btn btn-default btn-lg" id="phoneBT" >전화 예약(<s:property value="enterprise.etpPhone"/>)</button>
					</div>
					<div class="btn-group" role="group">
		 				<button type="button" class="btn btn-success btn-lg" id="rsvBT">예약 하기</button>
					</div>
				</div>
			</div>
	    </div>
	    
	    <!-- 기본 정보 컴포넌트 -->
	    <div class="grid-stack-item" id="infoCP"
	    data-gs-x="1" data-gs-y="5" data-gs-width="10" data-gs-height="3">
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
	    data-gs-x="1" data-gs-y="8" data-gs-width="7" data-gs-height="5">
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
	    data-gs-x="8" data-gs-y="8" data-gs-width="3" data-gs-height="5">
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
	    data-gs-x="1" data-gs-y="13" data-gs-width="10" data-gs-height="4">
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
	    data-gs-x="1" data-gs-y="18" data-gs-width="10" data-gs-height="4">
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