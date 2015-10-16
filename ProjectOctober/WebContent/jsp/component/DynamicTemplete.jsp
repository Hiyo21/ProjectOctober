<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic Templete</title>

<!-- Latest compiled and minified CSS -->
<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">

<link rel="stylesheet" href="../../css/hover/hover.css" />

<link rel="stylesheet" href="../../css/gridstack/gridstack.css" />
<link rel="stylesheet" href="../../css/gridstack/gridstack-extra.css" />

<style>
	
	.grid-stack-item-content{
		border-style: dotted;
		border-width: 1px;
	}
	
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

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src='//code.jquery.com/ui/1.11.4/jquery-ui.js'></script>

<script src="../../js/lodash.js"></script>
<script src="../../js/gridstack.js"></script>

<script>
$(function () {
	var options = {
        always_show_resize_handle : false,
    	placeholder_class : 'grid-stack-placeholder',
    	resizable: {
            handles: 'e, se, s, sw, w'
        }
	};
	
    $('.grid-stack').gridstack(options);
    
    $('#saveBT').on('click', save_grid);
    $('#loadBT').on('click', load_grid);
    
    $('.grid-stack-item').on('mouseenter', function(){
    	$(this).find('.delBT')
    	.html('<img src="https://cdn3.iconfinder.com/data/icons/iconic-1/32/x_alt-16.png">');
    });
    
    $('.grid-stack-item').on('mouseleave', function(){
    	$(this).find('.delBT').html('');
    });

});


function save_grid(){
	
 	var testList = _.map($('.grid-stack .grid-stack-item:visible'), function(el) {
	    el = $(el);
	    var node = el.data('_gridstack_node'); //node : Object와 같은 모든 것을 담을 수 있는 부모 객체
	    var test = {  
	    	"test.id" : el.attr('id'),
	        "test.x" : node.x,
	        "test.y" : node.y,
	        "test.width" : node.width,
	        "test.height" : node.height
	    };
	    return test; //return 받는 객체 형식
	}); 
 
 	for(var i in testList){
 		console.log(testList[i]);

 		$.ajax({
			url: 'insertComponent.action', 
			type:'POST',
			data :  testList[i],
			contentType: 
				'application/x-www-form-urlencoded; charset=utf-8',
		}); 
 	} 
 	
	$('#saved-data').val(JSON.stringify(testList));
	//JSON.stringify : 배열을 JSON 문자열로 변환 JSON.stringify(value[, replacer[, space]])
    //replacer, space는 옵션
			
};

function load_grid(){	
	$.ajax({
		url: 'getComponentList.action',
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
	console.log(object);

	var items = object.testList;

    $('#saved-data').val(JSON.stringify(items));
    
    var grid = $('.grid-stack').data('gridstack');
    grid.remove_all();
    
    
    _.each(items, function (node) {
 		
   		switch (node.id) {
		case 'topCP':
        	grid.add_widget(
        		$('<div id="topCP">'
        		+'<a onclick="remove_widget(topCP)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\jsp:include value="./StaticTop.jsp"/>'
        		+'</div></div>'),node.x, node.y, node.width, node.height);
        		 $('#topCP').load("./StaticTop.jsp"),function(){};
			break;
			
		case 'etpBtBar':
			grid.add_widget(
				$('<div id="etpBtBar">'
        		+'<a onclick="remove_widget(etpBtBar)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\s:include value="./EtpBT.jsp"/></div>'),node.x, node.y, node.width, node.height);
			break;
			
		case 'rsvBt':
			grid.add_widget(
				$('<div id="rsvBt">'
        		+'<a onclick="remove_widget(rsvBt)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<a href=""><label role="button" class="btn btn-default btn-lg" id="phoneBT" style="width: 250px;">전화 예약(000-0000-0000)</label></a>'
        		+'<a href=""><label role="button" class="btn btn-success btn-lg" id="rsvBT" style="width: 250px;">예약 하기</label></a></div>'),node.x, node.y, node.width, node.height);
			break;
			
		case 'infoCP':
			grid.add_widget(
				$('<div id="infoCP">'
        		+'<a onclick="remove_widget(infoCP)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\s:include value="./InfoComponent.jsp"/></div>'),node.x, node.y, node.width, node.height);
			break;
			
		case 'svcCP':
			grid.add_widget(
				$('<div id="svcCP">'
        		+'<a onclick="remove_widget(svcCP)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\s:include value="./SvcComponent.jsp"/></div>'),node.x, node.y, node.width, node.height);
			break;
			
		case 'galCP':
			grid.add_widget(
				$('<div id="galCP">'
        		+'<a onclick="remove_widget(galCP)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\s:include value="./GalleryComponent.jsp"/></div>'),node.x, node.y, node.width, node.height);
			break;
			
		case 'locaCP':
			grid.add_widget(
				$('<div id="locaCP">'
        		+'<a onclick="remove_widget(locaCP)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\s:include value="./LocationComponent.jsp"/></div>'),node.x, node.y, node.width, node.height);
			break;
			
		case 'reviewCP':
			grid.add_widget(
				$('<div id="reviewCP">'
        		+'<a onclick="remove_widget(reviewCP)">'
        		+'<span class="delBT"></span></a>'
        		+'<div class="grid-stack-item-content">'
        		+'<\s:include value="./ReviewComponent.jsp"/></div>'),node.x, node.y, node.width, node.height);
			break;				
   		} 
    }); 
} 

</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<textarea rows="10" cols="100" id="saved-data"></textarea>

<div class="container" id="page">

<button id ='loadBT'>load Component</button>

	<div class="grid-stack">
	
		<!-- 상단 컴포넌트 -->
	    <div class='grid-stack-item' id ='topCP'
	    data-gs-x='1' data-gs-y='0' data-gs-width='10' data-gs-height='2'>
	    	<!-- 삭제버튼  -->
	    	<a onclick="remove_widget(topCP)">
	    		<span class="delBT"></span>
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
				<span class="delBT"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<a href=""><label role="button" class="btn btn-default btn-lg" id="phoneBT" style="width: 250px;">전화 예약(000-0000-0000)</label></a>
	  			<a href=""><label role="button" class="btn btn-success btn-lg" id="rsvBT" style="width: 250px;">예약 하기</label></a>
			</div>
	    </div>
	    
	    <!-- 기본 정보 컴포넌트 -->
	    <div class="grid-stack-item" id="infoCP"
	    data-gs-x="1" data-gs-y="4" data-gs-width="10" data-gs-height="3">
	    	<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(infoCP)'>
				<span class="delBT"></span>
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
				<span class="delBT"></span>
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
				<span class="delBT"></span>
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
				<span class="delBT"></span>
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
				<span class="delBT"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./ReviewComponent.jsp"/>
			</div>
	    </div>
	    
	</div>

</div>

</body>
</html>