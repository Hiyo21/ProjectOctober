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
	<s:if test="enterpriseList.size() > 0">
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
							specialBT += '<span class="label label-info">'+item+"</span>&nbsp;&nbsp;";
						});
						$('#specialBT<s:property value="etpNum"/>').html(specialBT);		
					});
				</script>
				<!-- "특징, 주소, 영업시간" 구역 -->
              	<div class="col-xs-6" align="left" id='specialBT<s:property value="etpNum"/>'><!-- row1 left start -->
					
				</div> <!-- row1 Left end -->
				<div class="col-xs-6" align="right"><!-- row1 right start -->		
       				<a href='#'>
       				<button type="button" class="btn btn-primary" style="width: 100px">예약</button></a>
				</div><!-- row1 right end -->
			</div><!--  row1 end -->
			
			<div class="row" align="left"><!-- row2 start -->
				<div class="col-xs-12">
					<!-- 주소, 영업시간 -->
					<span class="label label-success">주소</span> <s:property value="etpAddress"/>&nbsp;&nbsp;
					<span class="label label-success">영업시간</span> <s:property value="etpStartHour"/> ~ <s:property value="etpEndHour"/>
				</div>
			</div>
			
			<!-- row3 start -->
			<div class="row" style="padding: 10px">
				<!-- image 뿌리기 -->
				<!-- 리스트용 사진이 존재할 경우 -->
				<div class="col-xs-6"><!-- row2 left start -->
					<s:if test="infoPht == null">
			         	<!-- 인포사진 부재시 기본적으로 뿌려지는 사진 -->
						<img src='${pageContext.request.contextPath}/image/wait.gif' class='img-responsive'>
					</s:if>
					<s:else>
						<!-- photoLocation 에서 각 항목에 맞는 사진 뿌리기 -->
			   			<img src='${pageContext.request.contextPath}/<s:property value="infoPht"/>' class='img-responsive'>
					</s:else>
				</div>
            	<div class="col-xs-6 etpDescDiv"><!-- 오른쪽 칸 -->
	            	<s:if test="etpDescription==null">
	            		<h3><s:property value="etpTitle"/>에 어서오세요</h3>
					</s:if>
					<s:else>
						<s:property value="etpDescription" escapeHtml="false"/>
					</s:else>
        		</div>
			</div> <!-- row2 end  -->
			</div>
 		</div><!-- panel body end -->
  		</s:iterator>
	</s:if>
	<s:if test="enterpriseList.size() == 0">
		<h1>검색 결과가 존재하지 않습니다.</h1>
	</s:if>
 	</div>		

</body>
</html>