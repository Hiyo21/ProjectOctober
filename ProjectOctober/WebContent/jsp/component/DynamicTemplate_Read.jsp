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
	
	.img-responsive{
		max-width:100%;
		max-height:100%;	
	}
	
	.grid-stack > .grid-stack-item > .grid-stack-item-content{
		overflow: hidden;
	}
	
	#infoCP{
		z-index: -1;
	}

</style>


<script>

$(function(){
	//textarea를 htmleditor로 대체, toolbar 설정
	CKEDITOR.replace('infoEdit', {
		toolbarGroups : [
   			{ name: 'document', groups: [ 'mode', 'document', 'doctools' ] },
   			{ name: 'editing', groups: [ 'find', 'selection', 'spellchecker', 'editing' ] },
   			{ name: 'forms', groups: [ 'forms' ] },
   			{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
   			{ name: 'paragraph', groups: [ 'list', 'indent', 'blocks', 'align', 'bidi', 'paragraph' ] },
   			{ name: 'links', groups: [ 'links' ] },
   			{ name: 'insert', groups: [ 'insert' ] },
   			{ name: 'clipboard', groups: [ 'clipboard', 'undo' ] },
   			{ name: 'styles', groups: [ 'styles' ] },
   			{ name: 'colors', groups: [ 'colors' ] },
   			{ name: 'tools', groups: [ 'tools' ] },
   			{ name: 'others', groups: [ 'others' ] },
   			{ name: 'about', groups: [ 'about' ] }
   		],

   		removeButtons : 'Source,Save,Templates,NewPage,Preview,Print,SelectAll,Find,Replace,Form,Checkbox,Radio,TextField,Textarea,Select,Button,ImageButton,HiddenField,BidiLtr,BidiRtl,Language,CreateDiv,Link,Unlink,Anchor,PageBreak,ShowBlocks,Maximize',
   		language : 'ko'
	});
	
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
	
	//아이콘 클릭시 각 컴포넌트를 모달창에 띄우기
	$('#componentModal').on('show.bs.modal', function (event) {
		var icon = $(event.relatedTarget); 
		var title = icon.data('title');
	  	var id = icon.data('id');
	  	var content = $(id).find('.content').html();
	  
	  	var modal = $(this);
	  	modal.find('.modal-title').text(title);
	  	modal.find('.modal-body').html(content);
	});

	
	$('#componentModal').on('hidden.bs.modal', function () {
		location.reload();
	});
	
	//편집 버튼 숨기기
	hideBT();
	
	//icon 숨기기
	$('.icon').hide();
	
	var serialize_widget_map = function (items) {
	    
	    $.each(items, function(i, item){
	    	if(item.width < 4){
	    		switch (item.el.context.id) {
				case 'infoCP':
					$('#infoCP').find('.icon').show();
					$('#infoCP').find('.content').hide();
					break;
				case 'svcCP':
					$('#svcCP').find('.icon').show();
					$('#svcCP').find('.content').hide();
					break;
				case 'locaCP':
					$('#locaCP').find('.icon').show();
					$('#locaCP').find('.content').hide();
					break;
				case 'galCP':
					$('#galCP').find('.icon').show();
					$('#galCP').find('.content').hide();
					break;
				case 'reviewCP':
					$('#reviewCP').find('.icon').show();
					$('#reviewCP').find('.content').hide();
					break;
				}
	    	}else{
	    		switch (item.el.context.id) {
				case 'infoCP':
					$('#infoCP').find('.icon').hide();
					$('#infoCP').find('.content').show();
					break;
				case 'svcCP':
					$('#svcCP').find('.icon').hide();
					$('#svcCP').find('.content').show();
					break;
				case 'locaCP':
					$('#locaCP').find('.icon').hide();
					$('#locaCP').find('.content').show();
					break;
				case 'galCP':
					$('#galCP').find('.icon').hide();
					$('#galCP').find('.content').show();
					break;
				case 'reviewCP':
					$('#reviewCP').find('.icon').hide();
					$('#reviewCP').find('.content').show();
					break;
				}
	    	}
	    });
	};

	$('.grid-stack').on('change', function (e, items) {
	    serialize_widget_map(items);   
	});
	
	
	
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
	$('.grid-stack-item').css('border-width', '1.5px');	
	$('.grid-stack-item').css('border-style', 'dotted');
	$('.grid-stack-item').css('border-radius', '15px');
	$('.grid-stack-item').css('border-spacing', '5px');
	
		
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
	//편집 버튼에 눌러진 효과 지우기
	$('#editBT').removeClass('active');
	
	//편집 버튼 숨기기
	$('.edit').hide(); 	
	$('.grid-stack-item').css('border-style', 'none');
	
	//편집 버튼에 클릭 이벤트 지운 후 새로운 이벤트 추가
	$('#editBT').on('click', startEdit);

	
	var grid = $('.grid-stack').data('gridstack');
	//drag, resize false
	grid.movable('.grid-stack-item', false);
	grid.resizable('.grid-stack-item', false);
	
}
function cleanComponent(){
	$.ajax({
		url: '${pageContext.request.contextPath}/enterprise/cleanComponent.action?etpNum=<s:property value="etpNum"/>', 
		type:'POST',
		success: savePage
	});
}

function savePage(){
 	var componentList = _.map(
 		$('.grid-stack .grid-stack-item:visible'), 
 			function(el) {
			    el = $(el);
			    var node = el.data('_gridstack_node'); //node : Object와 같은 모든 것을 담을 수 있는 부모 객체
			    var component = {  
			    	"component.etpNum" : <s:property value="etpNum"/>,
			    	"component.etpEmail" : "<s:property value="#session.loginId"/>",
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
			url: '${pageContext.request.contextPath}/enterprise/updateComponent.action?etpNum=<s:property value="etpNum"/>', 
			type:'POST',
			data :  componentList[i],
			contentType: 
				'application/x-www-form-urlencoded; charset=utf-8',
			success : function(){
				alert("success");
			}
		});
	}
 	
 	location.reload();
};


function remove_widget(item){
	var grid = $('.grid-stack').data('gridstack');
	
	grid.remove_widget(item, true);
}

function resetPage(){
	$.ajax({
		url: '${pageContext.request.contextPath}/enterprise/resetComponent.action?etpNum=<s:property value="etpNum"/>', 
		type:'POST',
		success: function(){
			alert("success");
		}
	});
	location.reload();
};

</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<div class="container" style="padding-bottom: 300px;">

<s:if test="#session.enterprise.components != null">
		
	<div class="grid-stack">
		<s:iterator value="#session.enterprise.components">
		<s:if test="componentWidth!=0">
		
		<div class='grid-stack-item' id ='<s:property value="componentID"/>' draggable="true"
		   	data-gs-x='<s:property value="componentPosX"/>' data-gs-y='<s:property value="componentPosY"/>' 
		    data-gs-width='<s:property value="componentWidth"/>' data-gs-height='<s:property value="componentHeight"/>'>
		    	
			<div class="grid-stack-item-content">		
				<!-- 상단 컴포넌트 -->
				<s:if test="%{componentID.equals('topCP')}">
					<!-- 삭제버튼  -->
					<a onclick="remove_widget(topCP)">
	    				<span class="delBT edit"></span>
	   				</a>		
					<s:include value="./StaticTop.jsp"/>
				</s:if>
				
				<!-- 사업자 전용 버튼 -->
				<s:if test="%{componentID.equals('etpBtBar')}">	
					<s:include value="./EtpBT.jsp"/>
				</s:if>
				
				<!-- 서비스 메뉴 컴포넌트 -->
				<s:if test="%{componentID.equals('svcCP')}">
					<!-- 삭제버튼  -->	
					<a onclick="remove_widget(svcCP)">
	    				<span class="delBT edit"></span>
	   				</a>
	   				<a class="icon" data-toggle="modal" data-target="#componentModal" data-title="서비스 메뉴" data-id="#svcCP">
						<img class="img-responsive" src="https://cdn3.iconfinder.com/data/icons/eightyshades/512/45_Menu-128.png"/>
					</a>
					<div class="content">	
						<s:include value="./SvcComponent.jsp"/>
					</div>
				</s:if>
				
				<!-- 기본 정보 컴포넌트 -->
				<s:if test="%{componentID.equals('infoCP')}">
					<a onclick="remove_widget(infoCP)">
	    				<span class="delBT edit"></span>
	   				</a>
	   				<a class="icon" data-toggle="modal" data-target="#componentModal" data-title="기본 정보" data-id="#infoCP">
						<img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/miu/22/circle_info_more-information_detail-128.png"/>
					</a>
					<div class="content">				
						<s:include value="./InfoComponent.jsp"/>
					</div>
				</s:if>
				
				<!-- 지도 컴포넌트 -->
				<s:if test="%{componentID.equals('locaCP')}">
					<a onclick="remove_widget(locaCP)">
	    				<span class="delBT edit"></span>
	   				</a>	
	   				<a class="icon" data-toggle="modal" data-target="#componentModal" data-title="오시는 길" data-id="#locaCP">
						<img class="img-responsive" src="https://cdn3.iconfinder.com/data/icons/glypho-free/64/map-pin-marker-circle-128.png"/>
					</a>
					<div class="content">			
						<s:include value="./LocationComponent.jsp"/>
					</div>
				</s:if>
				
				<!-- 갤러리 컴포넌트 -->
				<s:if test="%{componentID.equals('galCP')}">
					<a onclick="remove_widget(galCP)">
	    				<span class="delBT edit"></span>
	   				</a>
	   				<a class="icon" data-toggle="modal" data-target="#componentModal" data-title="갤러리" data-id="#galCP">
						<img class="img-responsive" src="https://cdn0.iconfinder.com/data/icons/news-and-magazine/512/gallery-128.png"/>
					</a>
					<div class="content">		
						<s:include value="./GalleryComponent.jsp"/>
					</div>
				</s:if>
				
				<!-- 예약버튼 컴포넌트 -->
				<s:if test="%{componentID.equals('rsvBt')}">
					<a onclick="remove_widget(rsvBt)">
	    				<span class="delBT edit"></span>
	   				</a>		
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
					<a onclick="remove_widget(reviewCP)">
	    				<span class="delBT edit"></span>
	   				</a>	
	   				<a class="icon" data-toggle="modal" data-target="#componentModal" data-title="고객 평가" data-id="#reviewCP">
						<img class="img-responsive" src="https://cdn4.iconfinder.com/data/icons/miu/22/other_conversation_review_comment_bubble_talk-128.png"/>
					</a>
					<div class="content">							
						<s:include value="./ReviewComponent.jsp"/>
					</div>		
				</s:if>
					
			</div><!-- grid-stack-item-content end -->
		</div>
		</s:if>
	    </s:iterator> 
	</div>
	<div class="modal fade" id="componentModal" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title"></h4>
      </div>
      <div class="modal-body">
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
	
	
</s:if>
</div>
<s:else>
	<h1 align="center"> 동적페이지로 저장 되어있는 정보가 없습니다. </h1>
</s:else>

</body>
</html>