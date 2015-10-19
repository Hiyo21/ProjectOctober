<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript">
	$(function(){
		var etpNum = ${etpNum};
		receiveSvcList(etpNum);
	});

	function svcDelete(item) {
		alert("정말 " +item+"을(를) 삭제하시겠습니까?");
		//ajax를 통해 테이블이 삭제 된 것을 보여줌
	}
	
	function receiveSvcList(item){
		//수정 및 삭제 성공시 다시 서비스 리스트를 뿌려주는 메소드
		location.href='receiveSvcList.action?'
	}
</script>
</head>
<body>
<div class="container-fluid">
<div class="panel panel-default">
	<s:if test="svcList != null">
	<s:iterator value="svcList">
		<div class="panel-heading">
		 	<s:property value="svcCategory"/>
		 	<!-- 인서트시 한 사업자의 카데고리에 중복이 없게 해야 함//셀렉트 할때는 사업자와 카테고리를 조인하여 검색 -->
			<button type="button" class="btn btn-default btn-md edit" onclick="svcUpdate(<s:property value="svcCategory"/>)">수정</button>
	  		<button type="button" class="btn btn-default btn-md edit" onclick="svcDelete(<s:property value="svcCategory"/>)">삭제</button>
		</div>
		<div class="panel-body">
		  	<table class="table">
		  		<tr>
		  			<td>
		  				<s:property value="svcTitle"/>
		  			</td>
		  			<td>
		  				<s:if test="svcDescription != null">
		  					<s:property value="svcDescription"/><br>
		  				</s:if>
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
	</s:iterator>		
	</s:if>
</div>

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