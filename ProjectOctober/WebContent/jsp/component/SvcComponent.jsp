<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script type="text/javascript">
	$(function(){
				
		

	});
	

	//수정할 메뉴 카테고리 갖고 오기
	function selectSvcCategory(category){
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/selectSvcCategory.action'+
				'?etpNum='+<s:property value="#session.enterprise.etpNum"/>+'&category='+category,
			type:'GET',
			dataType: 'json',
			success : function(data){
				printSvcModal(data);
				alert("printSvcModal success");
				$('#svcCategoryModal').modal('show');
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
			success: selectServiceList,
			error: function(doc){
				console.log("insert Error");
			}
		});
	};
	
	function deleteService(svcNum){
		if(confirm("정말 삭제하시겠습니까?")==true){
			
		$.ajax({
			url: "${pageContext.request.contextPath}/enterprise/deleteService.action"+
			'?svcNum='+svcNum,
			dataType: 'json',
			type: 'POST',
			success: selectServiceList,
			error: function(doc){
				console.log("insert Error");
			}
		});
		
		}else{
			return false;
		}
	}
	
	function selectServiceList(){
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/selectServiceList.action'+
			'?etpNum='+<s:property value="#session.enterprise.etpNum"/>,
			dataType: 'json',
			type: 'GET',
			success: function(data){
				printSvcList(data);
				//location.reload();
				/* $('#svcCategoryModal').modal('hide').on('hidden.bs.modal', function(){
					$('#svcCategoryModal').hide();
				}); */

			},
			error: function(doc){
				console.log("insert Error");
			}
		});
	}

	
	//모달에 메뉴 카테고리 출력
	function printSvcModal(object){
		//htmleditor modal on
		var svcList = object.serviceList;
		var superClass = object.enterprise.etpSuperclass;
		
		var str = '<table class="table">';
		$.each(svcList, function(index, item){
			str += '<tr><td>카테고리 : </td><td colspan="5"><input type="text" name="serviceList['+index+'].svcCategory" class="form-control" value="'+item.svcCategory+'">';
			str += '<input type="hidden" class="form-control" name="serviceList['+index+'].svcNum" value="'+item.svcNum+'">';
			str += '<input type="hidden" class="form-control" name="serviceList['+index+'].etpNum" value="'+item.etpNum+'">';
			str += '<input type="hidden" class="form-control" name="serviceList['+index+'].etpEmail" value="'+item.etpEmail+'"></td></tr>';
			str += '<tr><td>서비스 명 : </td><td colspan="2"><input type="text" name="serviceList['+index+'].svcTitle" class="form-control" size="85" value="'+item.svcTitle +'"></td></tr>';
			str += '<td>서비스 코드 : </td><td colspan="2"><select name="service.svcCode">';
			if (superClass == "마사지샵"){
				str += '<option value="타이마사지">타이마사지</option>';
				str += '<option value="경락마사지">경락마사지</option>';
				str += '<option value="카이로프랙틱">카이로프랙틱</option>';
				str += '<option value="발마사지">발마사지</option>';
				str += '<option value="바디마사지">바디마사지</option>';
				str += '<option value="페이스마사지">페이스마사지</option>';
				str += '<option value="아로마마사지">아로마마사지</option>';
				str += '<option value="슬리밍케어">슬리밍케어</option>';
				str += '<option value="웨딩관리">웨딩관리</option>';
			}
			if (superClass == "네일샵"){
				str += '<option value="네일케어">네일케어</option>';
				str += '<option value="랩핑 / 연장">랩핑 / 연장</option>';
				str += '<option value="프리미엄젤">프리미엄젤</option>';
			}
			str += '</select></td>';					
			str += '<tr><td>서비스 가격 : </td><td><input type="text" name="serviceList['+index+'].svcCost" class="form-control" value="'+item.svcCost+'"></td>';
			str += '<td>서비스 시간 : </td><td><input type="text" name="serviceList['+index+'].svcTime" class="form-control" value="'+item.svcTime+'"></td></tr>';
			str += '<tr><td>서비스 상세설명 : </td><td colspan="5"><textarea rows="5" cols="85" name="serviceList['+index+'].svcDescription" class="form-control">'+item.svcDescription+'</textarea></td></tr>';			
		});    			
		str += '</table>';
		$('#svcModalDiv').html(str);	
	}
	
	//수정된 카테고리 서비스 to DB에 업데이트
	function updateSvcCategory() {
		$.ajax({
			url: "${pageContext.request.contextPath}/enterprise/updateSvcCategory.action",
			dataType: 'json',
			type: 'POST',
			data: $('#svcCategoryForm').serialize(),
			contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
			success: selectServiceList,
			error: function(doc){
				console.log("insert Error");
			}
		});
	} 

	//서비스 메뉴 항목 출력
	function printSvcList(object){
		console.log(object);
		var str = '<br><p align="right">'
			str	+='<button class="btn btn-default btn-md edit" data-toggle="modal" data-target="#svcModalForm"'
			str	+='data-dismiss="modal">서비스 추가</button></p>';
			
		$.each(object.categoryList, function(index,item){
			str += '<div class="panel panel-default"><div class="panel-heading"><b>'+item+'</b>';
			str += '<button class="btn btn-default btn-md edit" data-toggle="modal" data-target="#svcCategoryModal"';
			str += 'data-dismiss="modal" onclick=\'selectSvcCategory("'+item+'")\'>수정</button>';
			str += '</div>';	
					
			$.each(object.serviceList, function(index, svcItem){
				if(item == svcItem.svcCategory){
					str += '<div class="panel-body"> <table class="table table-hover">';
					str += '<tr><td class="col-xs-3">'+svcItem.svcTitle+'</td><td  class="col-xs-5">';
					if(svcItem.svcDescription != null){
						str += svcItem.svcDescription + '<br>'
					}
					str += '<b>비용 : '+svcItem.svcCost+'</b><br>';
					str += '시간 : '+svcItem.svcTime+'</td>';
					str += '<td class="col-xs-3 edit"><button type="button" class="btn btn-danger btn-md edit" onclick="deleteService('+svcItem.svcNum+')">삭제</button></td></tr></table></div>';	
				}
			});
			str += '</div>';
		});
		$('#svcListTab').html(str);		
	}
	

</script>



</head>
<body>
<div class="container-fluid" id="svcListTab">
<br>

<p align="right">
<button class="btn btn-default btn-md edit hidden-xs" data-toggle="modal" data-target="#svcModalForm" data-dismiss="modal">서비스 추가</button>
</p>

<s:if test="#session.categoryList != null">
<s:iterator value="#session.categoryList">

	<div class="panel panel-default hidden-xs">
		<div class="panel-heading hidden-xs">
		 	<b><s:property/></b>
		 	<s:set var="category"><s:property/></s:set>
		 	
		 	<!-- 인서트시 한 사업자의 카데고리에 중복이 없게 해야 함//셀렉트 할때는 사업자와 카테고리를 조인하여 검색 -->
		 	<button class="btn btn-default btn-md edit" data-toggle="modal" data-target="#svcCategoryModal" 
			data-dismiss="modal" onclick='selectSvcCategory("<s:property/>")'>수정</button>
		</div>
		
		<s:iterator value="#session.enterprise.services">
		<s:if test='%{svcCategory.equalsIgnoreCase(#category)}'> 
		<!-- 서비스 항목-->
		<div class="panel-body hidden-xs">
		  	<table class="table table-hover">
		  		<tr>
		  			<td class="col-xs-4 hidden-xs">
		  				<s:property value="svcTitle"/>
		  			</td>
		  			<td class="col-xs-6 hidden-xs">
		  				<s:if test="svcDescription != null">
		  					<s:property value="svcDescription"/><br>
		  				</s:if>
		  				<b> 비용 : <s:property value="svcCost"/> </b> <br>
		  				시간 : <s:property value="svcTime"/>
		  			</td>
		  			<td class="edit col-xs-2 hidden-xs">
		  				<button type="button" class="btn btn-danger btn-md edit" onclick="deleteService(<s:property value="svcNum"/>)">삭제</button>
		  			</td>
		  		</tr> 
			</table>
			</div>
			</s:if>
		</s:iterator>
	</div>
</s:iterator>		
</s:if>


<div class="modal" id="svcCategoryModal" aria-hidden="true" tabindex="0" aria-labelledby="myModalLabel" role="dialog">
  <div class="modal-dialog modal-lg" >  
    <div class="modal-content">
    
  	<form class="form" role="form" method="post" data-toggle="validator" id="svcCategoryForm"> <!-- form start -->    
      <div class="modal-header">
        <button type="button" class="close" aria-label="Close">
        	<span aria-hidden="true">&times;</span>
        </button>
        <h4 class="modal-title" id="exampleModalLabel">서비스 메뉴 수정</h4>
      </div>
   
      <div class="modal-body table-responsive" id="svcModalDiv">	

      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="updateSvcCategory()">수정</button>
      </div>
      </form>
      
    </div>
  </div>
</div>


<div class="modal" id="svcModalForm" aria-hidden="true" tabindex="0" aria-labelledby="myModalLabel" role="dialog">
  <div class="modal-dialog modal-lg" >  
    <div class="modal-content">
    
  	<form class="form" role="form" method="post" data-toggle="validator" id="svcForm"> <!-- form start -->    
      <div class="modal-header">
        <button type="button" class="close" aria-label="Close">
        	<span aria-hidden="true">&times;</span>
        </button>
        <h4 class="modal-title" id="exampleModalLabel">서비스 메뉴 추가</h4>
      </div>
   
      <div class="modal-body table-responsive">	
      	<table class="table">
			<tr>
				<td>카테고리 : </td>
				<td colspan="5" >
					<input type="text" class="form-control" name="service.svcCategory"  >
					<input type="hidden" class="form-control" name="service.svcNum">
					<input type="hidden" class="form-control" name="service.etpNum" value='<s:property value="etpNum"/>'>
					<input type="hidden" class="form-control" name="service.etpEmail" value='<s:property value="etpEmail"/>'>
				</td>
			</tr>
			<tr>
				<td>서비스 명 : </td>
				<td colspan="2">
					<input type="text" name="service.svcTitle" class="form-control">
				</td>
				<td>서비스 코드 : </td>
				<td colspan="2">		
					<select name="service.svcCode">
						<s:if test='enterprise.etpSuperclass.equals("마사지샵")'>
							<option value="타이마사지">타이마사지</option>
							<option value="경락마사지">경락마사지</option>
							<option value="카이로프랙틱">카이로프랙틱</option>
							<option value="발마사지">발마사지</option>
							<option value="바디마사지">바디마사지</option>
							<option value="페이스마사지">페이스마사지</option>
							<option value="아로마마사지">아로마마사지</option>
							<option value="슬리밍케어">슬리밍케어</option>
							<option value="웨딩관리">웨딩관리</option>	
						</s:if>				
						<s:if test='enterprise.etpSuperclass.equals("네일샵")'>
							<option value="네일케어">네일케어</option>
							<option value="랩핑 / 연장">랩핑 / 연장</option>
							<option value="프리미엄젤">프리미엄젤</option>					
						</s:if>	
					</select>
				</td>
			</tr>
			<tr>
				<td>서비스 가격 : </td>
				<td colspan="2"><input type="text" name="service.svcCost" class="form-control"></td>
				<td>서비스 시간 : </td>
				<td colspan="2"><input type="text" name="service.svcTime" class="form-control" placeholder="HH24:MM"></td>
			</tr>
			<tr>
				<td>서비스 상세설명 : </td>
				<td colspan="5">
					<textarea rows="5" name="service.svcDescription" class="form-control"></textarea>
				</td>
			</tr>			    			
		</table>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="insertService()">추가</button>
      </div>
      </form>
      
    </div>
  </div>
</div>

</div>



</body>
</html>