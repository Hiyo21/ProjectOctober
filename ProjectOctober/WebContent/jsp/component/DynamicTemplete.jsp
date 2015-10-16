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

});


function save_grid(){
	alert("click saveBT");

 	var tests = _.map($('.grid-stack .grid-stack-item:visible'), function(el) {
	    el = $(el);
	    var node = el.data('_gridstack_node'); //node : Object와 같은 모든 것을 담을 수 있는 부모 객체
	    return {
	        x: node.x,
	        y: node.y,
	        width: node.width,
	        height: node.height
	    };//return 받는 객체 형식
	}); 
 	
 /* 	for(var i in tests){
 		
 		$.ajax({
 			url: 'test1.action', 
 			type: 'post',
 			data :  tests[i],
 			dataType : 'json',
 			contentType : 'application/x-www-form-urlencoded; charset=utf-8',
 			success : success
 		}); 

 	}; */
 	var test = {
 		x : 1,
 		y : 2,
 		width : 3,
 		height : 4 			
 	}
 	console.log(test);
 	
 	$.ajax({
			url: 'test1.action', 
			data :  test,
			success : success
		}); 
 	
	
	
	$('#saved-data').val(JSON.stringify(tests));
	//JSON.stringify : 배열을 JSON 문자열로 변환 JSON.stringify(value[, replacer[, space]])
    //replacer, space는 옵션
			
};

function remove_widget(item){
	var grid = $('.grid-stack').data('gridstack');
	
	grid.remove_widget(item, true);
}

function makeDelBt(item){
	$(item).find('.delBT')
	.html('<img src="https://cdn3.iconfinder.com/data/icons/iconic-1/32/x_alt-16.png">');
}

function removeDelBt(item){
	$(item).find('.delBT').html('');
}

function success(){
	alert("success");
}

</script>


</head>
<body>

<s:include value="../Header.jsp"/>

<textarea rows="10" cols="100" id="saved-data"></textarea>

<div class="container" id="page">

	<div class="grid-stack">
	
			<!-- 상단 컴포넌트 -->
		    <div class="grid-stack-item" id='topCP'
		    data-gs-x="1" data-gs-y="0" data-gs-width="10" data-gs-height="2"
		    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
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
		    data-gs-x="1" data-gs-y="3" data-gs-width="4" data-gs-height="1"
		    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
		    	<!-- 필수 항목이므로 지울 수 없음!! -->		    
				<div class="grid-stack-item-content">
					<s:include value="./EtpBT.jsp"/>
				</div>
		    </div>
		    
		    <!-- 예약 버튼 -->
		    <div class="grid-stack-item" id="rsvBt"
		    data-gs-x="5" data-gs-y="3" data-gs-width="6" data-gs-height="1"
		    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
		    	<!-- 삭제버튼  -->
	    		<a href='javascript:remove_widget(rsvBt)'>
					<span class="delBT"></span>
				</a>
		    
				<div class="grid-stack-item-content">
					<a href=""><label role="button" class="btn btn-default btn-lg" id="phoneBT" style="width: 250px;">전화 예약(000-0000-0000)</label></a>
		  			<a href=""><label role="button" class="btn btn-success btn-lg" id="rsvBT" style="width: 250px;">예약 하기</label></a>
				</div>
		    </div>
	    
	    
	    <div class="grid-stack-item" id="infoCP"
	    data-gs-x="1" data-gs-y="4" data-gs-width="10" data-gs-height="3"
	    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
	    	<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(infoCP)'>
				<span class="delBT"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./InfoComponent.jsp"/>
			</div>
	    </div>
	    
	    
	    <div class="grid-stack-item"  id="svcCP"
	    data-gs-x="1" data-gs-y="7" data-gs-width="7" data-gs-height="5"
	    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(svcCP)'>
				<span class="delBT"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./SvcComponent.jsp"/>
			</div>
	    </div>
	    
	    
	    <div class="grid-stack-item" id="galCP"
	    data-gs-x="8" data-gs-y="7" data-gs-width="3" data-gs-height="5"
	    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(galCP)'>
				<span class="delBT"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./GalleryComponent.jsp"/>
			</div>
	    </div>
	    
	    
	    <div class="grid-stack-item" id="locaCP"
	    data-gs-x="1" data-gs-y="12" data-gs-width="10" data-gs-height="4"
	   	onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
	   		<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(locaCP)'>
				<span class="delBT"></span>
			</a>
	   	
			<div class="grid-stack-item-content">
				<s:include value="./LocationComponent.jsp"/>
			</div>
	    </div>
	    
	    
	    <div class="grid-stack-item" id="reviewCP"
	    data-gs-x="1" data-gs-y="17" data-gs-width="10" data-gs-height="4"
	    onmouseenter='makeDelBt(this)' onmouseleave="removeDelBt(this)">
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