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

	function svcDelete(item) {
		alert("정말 " +item+"을(를) 삭제하시겠습니까?");
		//ajax를 통해 테이블이 삭제 된 것을 보여줌
	}
	
	function selectSvcList(item) {
		$.ajax({
			url: '${pageContext.request.contextPath}/enterprise/selectServiceList.action?etpNum='+item,
			type:'GET',
			dataType: 'json',
			success : printSvcList
		});
	}
	
	function printSvcList(object){
		var svcList = object.svcList;
		console.log(svcList);
	}

</script>
</head>
<body>
<button onclick="selectSvcList('1234567890')">리스트 불러오기</button>
<div class="container-fluid">

<s:if test="enterprise.services != null">
<s:iterator value="enterprise.services">

<div class="panel panel-default">
	<div class="panel-heading">
	 	<b class="svcCategory"><s:set var="category"><s:property value="svcCategory"/></s:set></b>
	 
	 	<!-- 인서트시 한 사업자의 카데고리에 중복이 없게 해야 함//셀렉트 할때는 사업자와 카테고리를 조인하여 검색 -->
		<button type="button" class="btn btn-default btn-md edit" onclick="svcUpdate(<s:property value="svcCategory"/>)">수정</button>
  		<button type="button" class="btn btn-default btn-md edit" onclick="svcDelete(<s:property value="svcCategory"/>)">삭제</button>
	  		
	</div>
	
	<s:iterator value="enterprise.services">
	<s:if test='<s:property value="#category"/>==<s:property value="svcCategory"/>'> 
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
	  				카테고리  : '<s:property value="#category"/>==<s:property value="svcCategory"/>'<br>
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
	</div>
	</s:if>
	</s:iterator>
</div>
</s:iterator>		
</s:if>

<!--  svc edit modal -->
<!-- ajax를 통해 서비스메뉴를 불러오기 -->
<div class="modal fade" id="svcModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <form class="form-inline" role="form" action="svcUpdate"> <!-- form start -->
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">서비스 메뉴 수정</h4>
      </div>
      <div class="modal-body">
      	<s:if test="svc != null">
        <table class="table">
        	<tr>
        		<td>
					<div class="form-group">
						<label for="svcCategory">서비스 카테고리 명</label>
					    <input type="text" class="form-control" id="svcCategory" value='<s:property value="svcCategory"/>'>
					</div>
        		</td>
        	</tr>
        	<tr>
        		<td>
  					<div class="form-group">
						<label for="svcTitle">서비스 명</label>
					    <input type="text" class="form-control" id="svcTitle" value='<s:property value="svcTitle"/>'>
					</div>
        		</td>
        		<td>
  					<div class="form-group">
						<label for="svcDescription">서비스 상세설명</label>
					    <input type="text" class="form-control" id="svcDescription" value='<s:property value="svcDescription"/>'>
					</div>        		
        		</td>
        		<td>
  					<div class="form-group">
						<label for="svcCost">서비스 가격</label>
					    <input type="number" class="form-control" id="svcCost" value='<s:property value="svcCost"/>' placeholder="원">
					</div>           		
        		</td>
        		<td>
  					<div class="form-group">
						<label for="svcTime">서비스 소요시간</label>
					    <input type="number" class="form-control" id="svcTime" value='<s:property value="svcTime"/>' placeholder="분">
					</div>        		
        		</td>
        	</tr>
        </table>
        </s:if>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        <button type="submit" class="btn btn-primary" data-dismiss="modal">수정</button>
      </div>
      </form>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


</div>
</body>
</html>