<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>NoRegisterEtpConfirm.jsp</title>

<!-- Latest compiled minified CSS -->
<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.min.css">

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src='//code.jquery.com/ui/1.11.4/jquery-ui.js'></script>


<script>
function sendData(ev){
	alert(ev);
	location.href='${pageContext.request.contextPath}'+'/enterprise/confrim.action?etpNum='+ev;
	
}
</script>
</head>
<body>
<s:include value="../Header.jsp"/>

<h2 align="center">[ 사업자 인증 ]</h2>

<div class="section">
	<div class="container">
		<div class="row">
		
			<div class="col-md-6">
				<div class="container">
					<img src="../image/Clean.jpg" width="300" height="300" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal"/>
					<!-- modal -->
					<div class="modal fade" id="myModal" role="dialog">
						<div class="modal-dialog">
							<!-- Modal content-->
					      	<div class="modal-content">
						        <div class="modal-header">
						          <button type="button" class="close" data-dismiss="modal">&times;</button>
						          <h4 class="modal-title">사업자 인증서</h4>
						        </div>
						        <div class="modal-body">
						          <img src="../image/Clean.jpg" width="500" height="500"/>
						        </div>
						        <div class="modal-footer">
						          <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
						        </div>
					      	</div>  
    					</div>	
  					</div>
				</div><!-- modal end -->
          	</div><!-- col-md-3 end -->
          	
          <div class="col-md-6">
          	<s:form name="NoRegisterEtpConfirm" action="/enterprise/Confirm.action" method="post" theme="simple">
          	<input type="hidden" name="etpNum" value="<s:property value="etpNum"/>" >

			<table id="divSearch" class="table table-hover table-condensed table-striped">
				<s:if test="enterpriseList !=null">
					<s:iterator value="enterpriseList">	
						<tr>				
							<th>사업자명</th>
							<td><s:property value="etpOwner"/></td>
						</tr>
						<tr>
							<th>이메일</th>
							<td><s:property value="etpEmail"/></td>
						</tr>
						<tr>
							<th>연락처</th>
							<td><s:property value="etpPhone"/></td>
						</tr>
						<tr>
							<th>주소</th>	
							<td><s:property value="etpAddress"/></td>
						</tr>	
						<tr>
							<th>승인여부</th>	
							<td>
								<s:if test="etpStatus==2">
									<h5 style="COLOR: red">승인거부</h5>
								</s:if>
								<s:if test="etpStatus==1">
									<h5 style="COLOR: blue">승인완료</h5>
								</s:if>
								<s:if test="etpStatus==0">
									<h5 style="COLOR: green">승인대기</h5>
								</s:if>
							</td>
						</tr>								
					</s:iterator>	
				</s:if>
			</table>
			
			<br><br><br><br>
	
			<s:if test='etpStatus==0'>
				<center>
				<s:submit value="승인"/>  
				<a href="<s:url value="/enterprise/Reject.action?etpNum="/>${etpNum}">
				<input type="button" value="승인거부">	</a>
				</center>
			</s:if>					
			<s:if test='etpStatus==1'>
				<h2 style="COLOR: blue">승인완료</h2>
			</s:if>
			<s:if test='etpStatus==2'>
				<h2 style="COLOR: red">승인거부</h2>
			</s:if>
			
		</s:form>  
	</div>
        </div>
      </div>
    </div>




</body>
</html>