<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript">
	$(function(){
		$('#svcModal').on('show.bs.modal', function(event){
			$('#svcModal').focus();
		    var button = $(event.relatedTarget);
			var title = button.data('title');
			var submit = button.data('submit');
			var onclick = button.data('onclick');
			var modal = $(this);
			modal.find('.modal-title').text(title);
			modal.find('.modal-footer .btn-primary').text(submit);
			modal.find('.modal-content .btn-primary').attr('onclick', onclick);
		 });
	});
	
	//수정할 메뉴 카테고리 갖고 오기
	function svcUpdate(category){
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/selectSvcCategory.action'+
				'?etpNum='+<s:property value="etpNum"/>+'&category='+category,
			type:'GET',
			dataType: 'json',
			success : function(data){
				printSvcCategory(data);
				$('#svcModal').modal('show');
			}
		});
	}
	
	//서비스 메뉴 추가
	function insertService(){
		$.ajax({
			url: "${pageContext.request.contextPath}/enterprise/insertService.action",
			dataType: 'json',
			type: 'POST',
			data: $('#svcForm').serialize(),
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
			success: printSvcCategory,
			error: function(doc){
				console.log("insert Error");
			}
		});
	};
	
	//모달에 메뉴 카테고리 출력
	function printSvcCategory(object){
		//htmleditor modal on
		var svcList = object.serviceList;
		console.log(svcList);
		
		var str = '<table class="table">';
		$.each(svcList, function(index, item){
			str += '<tr><td>카테고리 : </td><td colspan="5"><input type="text" name="serviceList['+index+'].svcCategory" class="form-control" value="'+item.svcCategory+'">';
			str += '<input type="hidden" class="form-control" name="serviceList['+index+'].svcNum" value="'+item.svcNum+'">';
			str += '<input type="hidden" class="form-control" name="serviceList['+index+'].etpNum" value="'+item.etpNum+'">';
			str += '<input type="hidden" class="form-control" name="serviceList['+index+'].etpEmail" value="'+item.etpEmail+'"></td></tr>';
			str += '<tr><td>서비스 명 : </td><td colspan="5"><input type="text" name="serviceList['+index+'].svcTitle" class="form-control" size="85" value="'+item.svcTitle +'"></td></tr>';
			str += '<tr><td>서비스 가격 : </td><td><input type="text" name="serviceList['+index+'].svcCost" class="form-control" value="'+item.svcCost+'"></td>';
			str += '<td>서비스 시간 : </td><td><input type="text" name="serviceList['+index+'].svcTime" class="form-control" value="'+item.svcTime+'"></td></tr>';
			str += '<tr><td>서비스 상세설명 : </td><td colspan="5"><textarea rows="5" cols="85" name="serviceList['+index+'].svcDescription" class="form-control">'+item.svcDescription+'</textarea></td></tr>';			
		});    			
		str += '</table>';
		$('#svcModalDiv').html(str);
	}
	//수정된 카테고리 to DB에 업데이트
	function updateSvcCategory() {
		$.ajax({
			url: "${pageContext.request.contextPath}/enterprise/updateSvcCategory.action",
			dataType: 'json',
			type: 'POST',
			data: $('#svcForm').serialize(),
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
			success: selectSvcList,
			error: function(doc){
				console.log("insert Error");
			}
		});
	} 
	//서비스 메뉴 불러오기
	function selectSvcList(item) {	
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/selectServiceList.action?etpNum='+item.etpNum,
			type:'GET',
			dataType: 'json',
			success : function(data){
				printSvcList(data);
				$('#svcModal').hide();	
				$('.modal').hide()
			}
		});
	}
	//서비스 메뉴 항목 출력
	function printSvcList(object){
		console.log(object);
		
		var str = '';
		$.each(object.categoryList, function(index,item){
			str += '<div class="panel panel-default"><div class="panel-heading"><b>'+item+'</b>';
			str += '<a class="btn btn-default btn-md edit" href="#" role="button" onclick="svcUpdate('+item+')" data-dismiss="modal">수정</a>';
			str += '<a class="btn btn-default btn-md edit" href="#" role="button" onclick="svcDelete('+item+')" data-dismiss="modal">삭제</a>';
			str += '</div>';	
			
			$.each(object.serviceList, function(index, svcItem){
				if(item == svcItem.svcCategory){
					str += '<div class="panel-body" id="categoryBody"> <table class="table">';
					str += '<tr><td>'+svcItem.svcTitle+'</td><td>';
					if(svcItem.svcDescription != null){
						str += svcItem.svcDescription + '<br>'
					}
					str += '비용 : '+svcItem.svcCost+'<br>';
					str += '시간 : '+svcItem.svcTime+'</td>';
					str += '<td><button type="button" class="btn btn-success btn-md" onclick="rsvInsert('+svcItem.svcNum+') style="width: 100px">예약 하기</button></td>';
					str += '<td class="edit"><button type="button" class="btn btn-danger btn-md edit" onclick="svcDelete('+svcItem.svcNum+')">삭제</button></td></tr></table></div>';	
				}
			});
			str += '</div>';
		});
		$('#svcListTab').html(str);	

	}
	
	//선택된 메뉴 삭제 하기
	function svcDelete(item) {
		alert("정말 " +item+"을(를) 삭제하시겠습니까?");
		//ajax를 통해 테이블이 삭제 된 것을 보여줌
	}

</script>


</head>
<body>
<div class="container-fluid" id="svcListTab">

<button class="btn btn-default btn-md edit" data-toggle="modal" data-target="#svcModal"
data-title="서비스 추가" data-submit="추가" data-onclick="insertService()">서비스 추가</button>

<s:if test="categoryList != null">
<s:iterator value="categoryList">

	<div class="panel panel-default">
		<div class="panel-heading">
		 	<b><s:property/></b>
		 	<s:set var="category"><s:property/></s:set>
		 	
		 	<!-- 인서트시 한 사업자의 카데고리에 중복이 없게 해야 함//셀렉트 할때는 사업자와 카테고리를 조인하여 검색 -->
		 	<a class="btn btn-default btn-md edit" href="#" role="button" onclick="svcUpdate('<s:property/>')" data-dismiss="modal" >수정</a>
		 	<a class="btn btn-default btn-md edit" href="#" role="button" onclick="svcDelete('<s:property/>')" data-dismiss="modal" >삭제</a>	
		</div>
		
		<s:iterator value="enterprise.services">
		<s:if test='%{svcCategory.equalsIgnoreCase(#category)}'> 
		<!-- 서비스 항목-->
		<div class="panel-body" id="categoryBody">
		  	<table class="table">
		  		<tr>
		  			<td>
		  				<s:property value="svcTitle"/>
		  			</td>
		  			<td>
		  				<s:if test="svcDescription != null">
		  					<s:property value="svcDescription"/><br>
		  				</s:if>
		  				비용 : <s:property value="svcCost"/> <br>시간 : <s:property value="svcTime"/>
		  			</td>
		  			<td>
		  				<button type="button" class="btn btn-success btn-md" onclick="rsvInsert(<s:property value="svcNum"/>)" style="width: 100px">예약 하기</button>
		  			</td>
		  			<td class="edit">
		  				<button type="button" class="btn btn-danger btn-md edit" onclick="svcDelete(<s:property value="svcNum"/>)">삭제</button>
		  			</td>
		  		</tr>
			</table>
			</div>
			</s:if>
		</s:iterator>
	</div>
</s:iterator>		
</s:if>

<!-- <div id="modalWrapper"> -->
<!--  svc edit modal -->
<!-- ajax를 통해 서비스메뉴를 불러오기 -->
<div class="modal fade" id="svcModal" aria-hidden="true" tabindex="-1" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog modal-lg" >  
    <div class="modal-content">
    
  	<form class="form-inline" role="form" method="post" data-toggle="validator" id="svcForm"> <!-- form start -->    
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        	<span aria-hidden="true">&times;</span>
        </button>
        <h4 class="modal-title" id="exampleModalLabel">서비스 메뉴 수정</h4>
      </div>
      
      <!-- 수정 테이블 들어감 -->    
      <div class="modal-body" id="svcModalDiv">	
      	<table class="table">
			<tr>
				<td>카테고리 : </td>
				<td colspan="5">
					<input type="text" class="form-control" name="service.svcCategory"  >
					<input type="hidden" class="form-control" name="service.svcNum">
					<input type="hidden" class="form-control" name="service.etpNum" value='<s:property value="etpNum"/>'>
					<input type="hidden" class="form-control" name="service.etpEmail" value='<s:property value="etpEmail"/>'>
				</td>
			</tr>
			<tr>
				<td>서비스 명 : </td>
				<td colspan="5">
					<input type="text" name="service.svcTitle" class="form-control" size="85">
				</td>
			</tr>
			<tr>
				<td>서비스 가격 : </td>
				<td><input type="text" name="service.svcCost" class="form-control"></td>
				<td>서비스 시간 : </td>
				<td><input type="text" name="service.svcTime" class="form-control"></td>
			</tr>
			<tr>
				<td>서비스 상세설명 : </td>
				<td colspan="5">
					<textarea rows="5" cols="85" name="service.svcDescription" class="form-control">
					</textarea>
				</td>
			</tr>			    			
		</table>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        <button type="button" class="btn btn-primary" onclick="updateSvcCategory()" data-dismiss="modal">수정</button>
      </div>
      </form>
      
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</div>

<!-- </div> -->

</body>
</html>