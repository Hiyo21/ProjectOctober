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
<script>
	$(function(){
		$('[data-toggle="notification-popover"]').popover();

	});
	
	function cutString(item){
		alert(item);
		console.log(item);
		var special = item.split(",");
		console.log(special);
		return special;
	}
</script>
</head>
<body>
<%@include file="Header.jsp"%>
	<!-- 항목 1 -->
  	<div class="container" align="center"> 
       	<div class="row">
           	<div class="panel panel-default"><!-- 조건이네 shop -->
           		<s:if test="enterpriseList != null">
				<s:iterator value="enterpriseList">
				<div class="panel panel-primary" onclick='location.href="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=<s:property value="etpNum"/>"'>
					<div class="panel-heading">
	    				<h1 class="panel-title"  align="left"><s:property value="etpTitle"/></h1>
	  				</div>
		 			<div class="panel-body">
		 				<div class="row">	
		                	<div class="col-md-6" align="left"><!-- 왼쪽 캉 -->
		                		<!-- iterator로 specialize 리스트 뿌리기 -->     		
								<script type="text/javascript">
									$(function(){
										var item = '<s:property value="etpSpecialize"/>'
										var special = item.split(",");
										
										var specialBT = $('#specialBT').html();
											specialBT = '';
										$.each(special, function(i, item){
											specialBT += '<button type="button" class="btn btn-info">'+item+"</button>&nbsp;&nbsp;";
										});
										
										$('#specialBT<s:property value="etpNum"/>').html(specialBT);	

									});
								</script>
								<div id='specialBT<s:property value="etpNum"/>'>
			                		<%-- <button type="button" class="btn btn-info"><s:property/></button>&nbsp;&nbsp;<button type="button" class="btn btn-info">여성전용</button> --%>
								</div>
							</div> 
							<div class="col-md-6" align="right">   				
		          				<a href='#'>
		          				<button type="button" class="btn btn-primary active" style="width: 100px">예약</button></a>
							</div>
						</div>
						<div class="row" style="padding: 10px">
							<div class="col-md-6" align="left">
			          			<!-- photoLocation 에서 각 항목에 맞는 사진 뿌리기 -->
			    				<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="200" height="200">
			    				<img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="200" height="200">
			    			</div>

		              		<div class="col-md-6" style="display: inline-block;text-align: right;"><!-- 오른쪽 칸 --> 
								<div class="panel-inline panel-default" style="border-style: solid; text-align: left; height: 200px;">
		    						<s:property value="etpDescription"/>
		    					</div>
		          			</div>
						</div>
	    			</div><!-- panel body end -->
	    		</div>
	  		</s:iterator>
			</s:if>
	  		</div>			
		</div>
   	</div>


</body>
</html>