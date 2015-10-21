<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
    
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript">
$(function(){
	/*var check =$('.svcCategory').val; 
	console.log(check);
	 if( check != '<s:property value="svcCategory"/>'){
			
		var categoryBody = $('#categoryBody').html();
		
		categoryBody = '<table>'		
			
		$.each(<s:property/>, function(i, item){
			categoryBody += '<tr><td>'+item.svcTitle +"</td>";
			categoryBody += '<td>' + item.svcDescription + '<br> 비용 : ' + item.svcCost + '// 시간 : ' + item.svcTime +'</td>';
			categoryBody += '<td><button type="button" class="btn btn-success btn-md" onclick="rsvInsert(<s:property value="svcNum"/>)" style="width: 100px">예약 하기</button></td>';
			categoryBody += '<td class="edit"><button type="button" class="btn btn-danger btn-md edit" onclick="svcDelete(<s:property value="svcNum"/>)">삭제</button></td></tr>'; 		
		});
		categoryBody += "</table>"
		
		$('#categoryBody').html(categoryBody);	
	} */
	

});

	function svcUpdate(category){
		
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/selectSvcCategory.action'+
				'?etpNum='+<s:property value="etpNum"/>+'&category='+category,
			type:'GET',
			dataType: 'json',
			success : printSvcCategory
		});
	}

	function svcDelete(item) {
		alert("정말 " +item+"을(를) 삭제하시겠습니까?");
		//ajax를 통해 테이블이 삭제 된 것을 보여줌
	}
	
	function selectSvcList(item) {
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum='+item,
			type:'GET',
			dataType: 'json',
			success : printSvcList
		});
	}
	
	function printSvcCategory(object){
		//htmleditor modal on
		var svcList = object.serviceList;
		console.log(svcList);
		var str = '<table class="table">';
		$.each(svcList, function(index, item){
			var svcCategory = item.svcCategory;

			str += '<tr><td>카테고리 : </td><td colspan="5"><input type="text" class="form-control" value='+item.svcCategory+'></td></tr>';
			str += '<td>서비스 명 : </td><td colspan="5"><input type="text" class="form-control" size="85" value="'+item.svcTitle +'"></td></tr>';
			str += '<tr><td>서비스 가격 : </td><td><input type="text" class="form-control" value='+item.svcCost+'></td>';
			str += '<td>서비스 시간 : </td><td><input type="text" class="form-control" value='+item.svcTime+'></td></tr>';
			str += '<tr><td>서비스 상세설명 : </td><td colspan="5"><textarea rows="5" cols="85" class="form-control">'+item.svcDescription+'</textarea></td></tr>';			
		});    		
		
		str += '</table>';
		$('#svcModalDiv').html(str);
		
		$('#svcModal').on('show.bs.modal', function () {
			$('#svcModal').focus();
		});
	}

</script>
</head>
<body>
<button onclick="selectSvcList('<s:property value="etpNum"/>')">리스트 불러오기</button>
<div class="container-fluid">

<s:if test="categoryList != null">
<s:iterator value="categoryList">


<div class="panel panel-default">
	<div class="panel-heading">
	 	<b><s:property/></b>
	 	<s:set var="category"><s:property/></s:set>
	 	
	 	<!-- 인서트시 한 사업자의 카데고리에 중복이 없게 해야 함//셀렉트 할때는 사업자와 카테고리를 조인하여 검색 -->
	 	<a class="btn btn-default btn-md edit" href="#" role="button" data-toggle="modal" 
	 	data-target="#svcModal" onclick="svcUpdate('<s:property/>')"  >수정</a>
	 	<a class="btn btn-default btn-md edit" href="#" role="button" data-toggle="modal" data-target="#infoModal" onclick="svcDelete('<s:property/>')">삭제</a>	
	</div>
	
	<s:iterator value="enterprise.services">
	<!-- 서비스 항목-->
	<div class="panel-body" id="categoryBody">
	<s:if test= '%{svcCategory.equalsIgnoreCase("타이마사지")}'>
		1
	</s:if>
	<s:property value="#category"/>
	
	
	
	<s:if test='%{svcCategory.equalsIgnoreCase("<s:property value="#category"/>")}'> 
	  	<table class="table">
	  		<tr>
	  			<td>
	  				<s:property value="svcTitle"/>
	  			</td>
	  			<td>
	  				<s:if test="svcDescription != null">
	  					<s:property value="svcDescription"/><br>
	  				</s:if>
	  				카테고리 : <s:property value="#category"/>==<s:property value="svcCategory"/> <br>
	  				비용 : <s:property value="svcCost"/> //시간 : <s:property value="svcTime"/>
	  			</td>
	  			<td>
	  				<button type="button" class="btn btn-success btn-md" onclick="rsvInsert(<s:property value="svcNum"/>)" style="width: 100px">예약 하기</button>
	  			</td>
	  			<td class="edit">
	  				<button type="button" class="btn btn-danger btn-md edit" onclick="svcDelete(<s:property value="svcNum"/>)">삭제</button>
	  			</td>
	  		</tr>
		</table>
		</s:if>
		</div>
	</s:iterator>
</div>
</s:iterator>		
</s:if>

<!--  svc edit modal -->
<!-- ajax를 통해 서비스메뉴를 불러오기 -->
<div class="modal fade" id="svcModal">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <form class="form-inline" role="form" action="updateSvcCategory"> <!-- form start -->
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">서비스 메뉴 수정</h4>
      </div>
      <div class="modal-body" id="svcModalDiv">
      	<!-- 수정 테이블 들어감 -->
      </div>
	</form>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        <button type="submit" class="btn btn-primary" data-dismiss="modal">수정</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


</div>
</body>
</html>