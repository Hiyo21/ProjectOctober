<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>동적페이지</title>

<link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/jejugothic.css"/>
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
	*{
		font-family: "Helvetica Neue", "Jeju Gothic", Helvetica,Arial,sans-serif;
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
	
	.img-responsive{
		max-width:100%;
		max-height:100%;	
	}
	
	.grid-stack > .grid-stack-item > .grid-stack-item-content, .table-responsive{
		overflow: hidden;
	}

</style>


<script>

$(function(){
	var colorTheme = <s:property value="enterprise.etpThemeType"/>;
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
	
	//마우스가 들어갈 때만 스크롤 보임
	$('.grid-stack > .grid-stack-item > .grid-stack-item-content').on({
		mouseenter : function () { $(this).css('overflow', 'auto')},
		mouseleave : function () { $(this).css('overflow', 'hidden')}
	});
	
	//아이콘 클릭시 각 컴포넌트를 모달창에 띄우기
	$('#componentModal').on('show.bs.modal', function (event) {
		var icon = $(event.relatedTarget); 
		var title = icon.data('title');
	  	var id = icon.data('id');
	  	var content = $(id).find('.content').html();
	  
	  	var modal = $(this);
	  	modal.find('.modal-title').text(title);
	  	modal.find('.modal-body').html(content);
	  	$('#infoCP').css('z-index', -1);
	});
	
	$('.modal').on('shown.bs.modal', function(){
		$('.modal-backdrop').css('z-index', -1);
		$('.modal-dialog').css('z-index', +1);
		$('.input-group-btn').css('z-index', 0);			
	});
	
	$('#svcCategoryModal').on('shown.bs.modal', function(){
		$('.grid-stack-item').css('z-index', -1);
		$('#svcCP').css('z-index', 0);
		$('#svcCategoryModal').css('z-index', 1);
	});
	
	$('#svcModalForm').on('shown.bs.modal', function(){
		$('.grid-stack-item').css('z-index', -1);
		$('#svcCP').css('z-index', 0);
		$('#svcModalForm').css('z-index', 1);
	});
	
	$('#infoModal').on('shown.bs.modal', function(){
		$('.grid-stack-item').css('z-index', -1);
		$('#infoCP').css('z-index', 0);
		$('#infoModal').css('z-index', 1);
	});
	
	$('.modal').on('hidden.bs.modal', function(){
		$('.grid-stack-item').css('z-index', 0);
	});
	
	//편집 버튼 숨기기
	hideBT();
	
	//icon 숨기기
	$('.icon').hide();
	
	//각 grid-stack-item에서 폭을 측정해서 icon show를 분기하면 될 것 같은데...
	var components = $('.grid-stack-item');
	$.each(components, function(i, item){
		var width = $(item).attr('data-gs-width');
		if(width < 4){
			switch (item.id) {
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
		}
	});
	
	
	$('.grid-stack').on('change', function (e, items) {
		makeIcon(items);   
	});
	
});

function makeIcon(items){
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


function hideBT(){
	var loginId = "<%= session.getAttribute("loginId") %>" ;
	var pageId = "<%= session.getAttribute("pageId") %>" ;

	$('#saveBT').attr('disabled', true);
	$('.edit').hide();
	
	//로그인 한 사람이 페이지 주인과 동일 할 때 
	if(loginId!=null && loginId==pageId){
		$('#etpBt').show();
		$('#editBT').on('click', startEdit);

	}else{
		$('#etpBt').hide();	
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
				//alert("success");
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
			location.reload();
		}
	});
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
  <div class="modal-dialog modal-lg">
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