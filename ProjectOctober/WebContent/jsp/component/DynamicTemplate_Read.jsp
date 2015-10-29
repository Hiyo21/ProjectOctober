<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:property value="etpTitle"/></title>

<!-- Latest compiled and minified CSS -->
<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'/>
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
		z-index: 100;
	}
	
	.modal{
		z-index: 110;
		text-align: center;
	}
	
</style>

<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css"/>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gridstack/gridstack.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gridstack/gridstack-extra.css" />

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src='//code.jquery.com/ui/1.11.4/jquery-ui.js'></script>

<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/lodash.js"></script>
<script src="${pageContext.request.contextPath}/js/gridstack.js"></script>

<script>

$(function(){

	defaultGridSet();

	hideBT();
});

function defaultGridSet(){
	var options = {
    		always_show_resize_handle : false,
        	placeholder_class : 'grid-stack-placeholder',
        	resizable: {
                handles: 'e, se, s, sw, w'
            }	
	    };
	    
	$('.grid-stack').gridstack(options);
		
	var grid = $('.grid-stack').gridstack(options).data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', false);
	grid.resizable('.grid-stack-item', false);
}

function hideBT(){
	var loginId = "<%= session.getAttribute("loginId") %>" ;
	var pageId = "<%= session.getAttribute("pageId") %>" ;

	$('#saveBT').attr('disabled', true);
	$('.edit').hide();
	
	//로그인 한 사람이 페이지 주인과 동일 할 때 
	if(loginId!=null && loginId==pageId){
		$('#etpBtBar').show();
		$('#editBT').on('click', startEdit);

		/* setTimeout(function(){$(this).off('click')}, 1000);
		$('#editBT').off('click'); */

		//$('#editBt').off('click');

	}else{
		$('#etpBtBar').hide();	
	}	
}


function startEdit(){
	//편집, 수정 버튼 보임	
	$('.edit').show();
	
	//저장 버튼 활성화, 편집 버튼 비활성화 // 편집버튼 비활성화에서 활성화로 되돌리는 법 생각해야함 
	$('#saveBT').attr('disabled', false);
	
	// 편집 중일 때와 그렇지 않을 때는 구분
	$('#editBT').addClass('active');
  	//편집버튼 비운 후 클릭기능 추가
    $('#editBT').unbind('click');  

	//컴포넌튼 drag, resize 활성화
	var grid = $('.grid-stack').data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', true);
	grid.resizable('.grid-stack-item', true);
	
	//save, load 버튼에 클릭 이벤트와 함수 연결
    $('#saveBT').on('click', savePage);
	$('#saveBt').off('click');
	//편집버튼 비운 후 클릭기능 추가
    $('#editBT').on('click', stopEdit);

    
	//컴포넌튼 drag, resize 활성화
	var grid = $('.grid-stack').data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', true);
	grid.resizable('.grid-stack-item', true);

	$('#saveBt').off('click');

    
    //컴포넌트에 마우스가 들어가면 삭제 버튼 생성
    $('.grid-stack-item').on('mouseenter', function(){
    	$(this).find('.delBT')
    	.html('<img src="https://cdn3.iconfinder.com/data/icons/iconic-1/32/x_alt-16.png">');
    });
    
	//컴포넌트에 마우스가 나오면 삭제 버튼 사라짐
    $('.grid-stack-item').on('mouseleave', function(){
    	$(this).find('.delBT').html('');
    });

	$('.grid-stack-item').off('mouseleave');

}

function stopEdit(){
	//편집 버튼 숨기기
	$('.edit').hide(); 
	
	//편집 버튼에 눌러진 효과 지우기
	$('#editBT').removeClass('active');
	//편집 버튼에 클릭 이벤트 지운 후 새로운 이벤트 추가
	$('#editBT').on('click', startEdit);

	$('#editBt').off('click');
	$('.edit').hide(); //편집 버튼 숨기기
	
	var grid = $('.grid-stack').data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', false);
	grid.resizable('.grid-stack-item', false);
	
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
 	
 	//console.log(componentList);
 
 	for(var i in componentList){
 		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/insertComponent.action?etpNum=<s:property value="etpNum"/>', 
			type:'POST',
			data :  componentList[i],
			contentType: 
				'application/x-www-form-urlencoded; charset=utf-8'
			}); 	
 	} 
 	alert("save complete");
};


function remove_widget(item){
	var grid = $('.grid-stack').data('gridstack');
	
	grid.remove_widget(item, true);
}


</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<s:if test="enterprise.components != null">
<div class="container" id="page">
		
	<div class="grid-stack">
		
		<!-- 상단 컴포넌트 -->
		<s:if test="componentID == topCP">
	    <div class='grid-stack-item' id ='topCP' 
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	    	<!-- 삭제버튼  -->
	    	<a onclick="remove_widget(topCP)">
	    		<span class="delBT edit"></span>
	   		</a>
			<div class="grid-stack-item-content">				
				<s:include value="./StaticTop.jsp"/>
			</div>
	    </div>
	    </s:if>
   		
   		<!-- 사업자 전용 버튼 -->
   		<s:if test="componentID == etpBtBar"></s:if>
	    <div class="grid-stack-item" id="etpBtBar"
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	    	
	    	<!-- 필수 항목이므로 지울 수 없음!! -->		    
			<div class="grid-stack-item-content">
				<s:include value="./EtpBT.jsp"/>
			</div>
	    </div>
	    
	    <!-- 예약 버튼 -->
	    <s:if test="componentID == rsvBt">
	    <div class="grid-stack-item" id="rsvBt" 
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
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
		 				<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${etpNum}"><button type="button" class="btn btn-success btn-lg" id="rsvBT">예약 하기</button></a>
					</div>
				</div>
			</div>
	    </div>
	    </s:if>
	    
	    <!-- 기본 정보 컴포넌트 -->
	    <s:if test="componentID == infoCP">
	    <div class="grid-stack-item" id="infoCP"
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	    	<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(infoCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./InfoComponent.jsp"/>
			</div>
	    </div>
	    </s:if>
	    
	    <!-- 서비스 메뉴 컴포넌트 -->
	    <s:if test="componentID == svcCP">
	    <div class="grid-stack-item"  id="svcCP"
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(svcCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./SvcComponent.jsp"/>
			</div>
	    </div>
	    </s:if>
	    
	    <!-- 갤러리 컴포넌트 -->
	    <s:if test="componentID == galCP">
	    <div class="grid-stack-item" id="galCP"
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	    	<!-- 삭제버튼  -->
    		<a href='javascript:remove_widget(galCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./GalleryComponent.jsp"/>
			</div>
	    </div>
	    </s:if>
	    
	    <!-- 오시는 길 컴포넌트 -->
	    <s:if test="componentID == locaCP">
	    <div class="grid-stack-item" id="locaCP"
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	   		<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(locaCP)'>
				<span class="delBT edit"></span>
			</a>
	   	
			<div class="grid-stack-item-content">
				<s:include value="./LocationComponent.jsp"/>
			</div>
	    </div>
	    </s:if>
	    
	    <!-- 고객 평가 컴포넌트 -->
	    <s:if test="componentID == reviewCP">
	    <div class="grid-stack-item" id="reviewCP"
	    data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
	    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
	    	<!-- 삭제버튼  -->
	    	<a href='javascript:remove_widget(reviewCP)'>
				<span class="delBT edit"></span>
			</a>
	    
			<div class="grid-stack-item-content">
				<s:include value="./ReviewComponent.jsp"/>
			</div>
	    </div><!-- 고객 평가 컴포넌트 end -->
	    </s:if>
	    
	</div>
</div>

</s:if>
</body>
</html>