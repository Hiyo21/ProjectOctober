<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style type="text/css">
	.etpDescDiv{
		display: inline-block; 
		border-style: solid; 
		border-color: gray;
		min-height : 200px;
		text-align: left;
	}
	
	.shopListDiv{
		max-height: 500px;
	}
</style>

<script>	
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});

</script>
</head>
<body>
<%@include file="Header.jsp"%>
<!-- 항목 1 -->
<div class="container" align="center"> 
	<!-- iterator 시작 -->
	<s:if test="enterpriseList != null">
	<s:iterator value="enterpriseList">
	
	<!-- shopList start -->				
	<div class="panel panel-primary shopListDiv" 
		onclick='location.href="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=<s:property value="etpNum"/>"'>
		<!-- heading -->
		<div class="panel-heading">
			<h1 class="panel-title"  align="left"><s:property value="etpTitle"/></h1>
		</div>
		<!-- body -->
		<div class="panel-body">
			<!-- row1 start -->	
			<div class="row">
				<!-- "특징" 리스트 뿌리기 -->     		
				<script type="text/javascript">
					$(function(){
						var item = '<s:property value="etpSpecialize"/>'
						//","단위로 특징 자르기
						var special = item.split(",");
						//각 shop의 specialBT div에 특징 버튼 뿌림. "클릭 기능 없으므로 label로 해도 무관함"
						var specialBT = $('#specialBT<s:property value="etpNum"/>').html();
							specialBT = '';
						$.each(special, function(i, item){
							specialBT += '<button type="button" class="btn btn-info">'+item+"</button>&nbsp;&nbsp;";
						});
						$('#specialBT<s:property value="etpNum"/>').html(specialBT);		
					});
				</script>
				<!-- "특징" 버튼이 뿌려질 구역 -->
              	<div class="col-md-6" align="left" id='specialBT<s:property value="etpNum"/>'><!-- row1 left start -->
              	
				</div> <!-- row1 Left end -->
				<div class="col-md-6" align="right"><!-- row1 right start -->		
       				<a href='#'>
       				<button type="button" class="btn btn-primary active" style="width: 100px">예약</button></a>
				</div><!-- row1 right end -->
			</div><!--  row1 end -->
			
			<!-- row2 start -->
			<div class="row" style="padding: 10px">
				<!-- image 뿌리기 -->
				<!-- 리스트용 사진이 존재할 경우 -->
				<%-- <s:if test="enterprise.photos != null"> --%>
				<div class="col-md-6" align="left"><!-- row2 left start -->
	         		<!-- photoLocation 에서 각 항목에 맞는 사진 뿌리기 -->
	   				<img src="/ProjectOctober/image/relaxation_logo_test.jpg" class="img-responsive">
	   				<img src="/ProjectOctober/image/relaxation_logo_test.jpg" class="img-responsive">
	   			</div>

            	<div class="col-md-6 etpDescDiv"><!-- 오른쪽 칸 --> 
  					<s:property value="etpDescription"/>
        		</div>
        		<%-- </s:if>
        		<s:else>
        		<div class="etpDescDiv"><!-- 오른쪽 칸 --> 
  					<s:property value="etpDescription"/>
        		</div>
        		</s:else> --%>
			</div>
 		</div><!-- panel body end -->
  		</div>
  		</s:iterator>
	</s:if>	
 	</div>		

</body>
</html>