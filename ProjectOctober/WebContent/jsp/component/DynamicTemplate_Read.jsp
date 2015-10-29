<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>동적페이지</title>


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

$(function(){
	var options = {
	   		always_show_resize_handle : false,
	       	placeholder_class : 'grid-stack-placeholder',
	       	resizable: {
	        	handles: 'e, se, s, sw, w'
	        }	
	    };
		    
	$('.grid-stack').gridstack(options);
			
	var grid = $('.grid-stack').data('gridstack');
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


function startEdit(){
	//편집, 수정 버튼 보임	
	$('.edit').show();
	
	//저장 버튼 활성화, 편집 버튼 비활성화 
	$('#saveBT').attr('disabled', false);
	//save 버튼에 클릭 이벤트와 함수 연결
    $('#saveBT').on('click', savePage);
	// 편집 중일 때 버튼 누름 효과
	$('#editBT').addClass('active');
  	//편집버튼 click 이벤트 비우기
    $('#editBT').unbind('click');  
	//편집버튼 비운 후 클릭기능 추가
    $('#editBT').on('click', stopEdit);
	
 
	//컴포넌튼 drag, resize 활성화
	var grid = $('.grid-stack').data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', true);
	grid.resizable('.grid-stack-item', true);
	
    
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
	//편집 버튼 숨기기
	$('.edit').hide(); 	
	//편집 버튼에 눌러진 효과 지우기
	$('#editBT').removeClass('active');
	//편집 버튼에 클릭 이벤트 지운 후 새로운 이벤트 추가
	$('#editBT').on('click', startEdit);

	
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
 	
 	console.log(componentList);
 
 	for(var i in componentList){
 		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/insertComponent.action?etpNum=<s:property value="etpNum"/>', 
			type:'POST',
			data :  componentList[i],
			contentType: 
				'application/x-www-form-urlencoded; charset=utf-8',
			success: function(){
				location.reload();
			}
			}); 	
 	} 
 	alert("save complete");
};


function remove_widget(item){
	var grid = $('.grid-stack').data('gridstack');
	
	grid.remove_widget(item, true);
}

function resetPage(){

	var serialization = [
         {componentID: "topCP", 	componentPosX: 1, componentPosY: 0, componentWidth: 10, componentHeight: 2},
         {componentID: "etpBtBar", 	componentPosX: 1, componentPosY: 2, componentWidth: 10, componentHeight: 1},
         {componentID: "rsvBt", 	componentPosX: 1, componentPosY: 3, componentWidth: 10, componentHeight: 1},
         {componentID: "infoCP", 	componentPosX: 1, componentPosY: 4, componentWidth: 10, componentHeight: 3},
         {componentID: "svcCP", 	componentPosX: 1, componentPosY: 7, componentWidth: 7, componentHeight: 5},
         {componentID: "galCP", 	componentPosX: 8, componentPosY: 7, componentWidth: 3, componentHeight: 5},
         {componentID: "locaCP", 	componentPosX: 1, componentPosY: 12, componentWidth: 10, componentHeight: 4},
         {componentID: "reviewCP", 	componentPosX: 1, componentPosY: 16, componentWidth: 10, componentHeight: 4},
     ]; 
	
};

</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<s:if test="#session.enterprise.components != null">
<div class="container">		
	<div class="grid-stack">
	
		<s:iterator value="#session.enterprise.components">
		<div class='grid-stack-item' id ='<s:property value="componentID"/>' draggable="true"
		   	data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
		    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
		    	<!-- 삭제버튼  -->
		    	<a onclick="remove_widget(topCP)">
		    		<span class="delBT edit"></span>
		   		</a>
				<div class="grid-stack-item-content">
					<!-- 상단 컴포넌트 -->
					<s:if test="%{componentID.equals('topCP')}">				
						<s:include value="./StaticTop.jsp"/>
					</s:if>
					<!-- 사업자 전용 버튼 -->
					<s:if test="%{componentID.equals('etpBtBar')}">				
						<s:include value="./EtpBT.jsp"/>
					</s:if>
					<!-- 서비스 메뉴 컴포넌트 -->
					<s:if test="%{componentID.equals('svcCP')}">				
						<s:include value="./SvcComponent.jsp"/>
					</s:if>
					<!-- 기본 정보 컴포넌트 -->
					<s:if test="%{componentID.equals('infoCP')}">				
						<s:include value="./InfoComponent.jsp"/>
					</s:if>
					<!-- 지도 컴포넌트 -->
					<s:if test="%{componentID.equals('locaCP')}">				
						<s:include value="./LocationComponent.jsp"/>
					</s:if>
					<!-- 갤러리 컴포넌트 -->
					<s:if test="%{componentID.equals('galCP')}">				
						<s:include value="./GalleryComponent.jsp"/>
					</s:if>
					<!-- 예약버튼 컴포넌트 -->
					<s:if test="%{componentID.equals('rsvBt')}">				
						<div class="btn-group btn-group-justified" role="group" aria-label="..." draggable="true">
							<div class="btn-group" role="group">
							 <button type="button" class="btn btn-default btn-lg" id="phoneBT" >전화 예약(<s:property value="enterprise.etpPhone"/>)</button>
							</div>
							<div class="btn-group" role="group">
				 				<a href="${pageContext.request.contextPath}/enterprise/toCalendarPage.action?etpNum=${etpNum}"><button type="button" class="btn btn-success btn-lg" id="rsvBT">예약 하기</button></a>
							</div>
						</div>
					</s:if>
					<!-- 평가 컴포넌트 -->
					<s:if test="%{componentID.equals('reviewCP')}">				
						<s:include value="./ReviewComponent.jsp"/>
					</s:if>
					
				</div>
		    </div>

	    </s:iterator>
	    
	</div>
</div>
</s:if>

<s:else>
	<h1> 동적페이지로 저장 되어있는 정보가 없습니다. </h1>
</s:else>
</body>
</html>