<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>NoRegisterEtpList.jsp</title>

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
	location.href= '${pageContext.request.contextPath}'+'/enterprise/NoRegisterEtp.action?etpNum='+$();
}
</script>
</head>

<s:include value="../Header.jsp"/>

<br>
<h2 align="center">[ 인증 필요 사업자 목록 ]</h2>
<br>
<table id="divSearch" class="table table-hover table-condensed table-striped">
	<tr>
		<th>사업자명</th>
		<th>이메일</th>
		<th>연락처</th>
		<th>주소</th>
		<th>가입신청일</th>
		<th>승인여부</th>
		<th></th>
	</tr>
	
	<s:if test="enterpriseList !=null">
		<s:iterator value="enterpriseList">
			<tr>			
				<td><s:property value="etpOwner"/></td><!-- 사업자명 -->
				<td><s:property value="etpEmail"/></td><!-- 이메일 -->
				<td><s:property value="etpPhone"/></td><!-- 연락처 -->
				<td><s:property value="etpAddress"/></td><!-- 주소 -->
				<td><s:property value="memJoinedDate"/></td><!-- 가입신청일 -->
				
			<!-- 승인여부 -->	
			<s:if test="etpStatus==2">
				<td style="COLOR: red">승인거부</td>
			</s:if>
			<s:if test="etpStatus==1">
				<td style="COLOR: blue">승인완료</td>
			</s:if>
			<s:if test="etpStatus==0">
				<td style="COLOR: green">승인대기</td>
			</s:if>
	
				<td><input type="button" value="보기" onclick="sendData(<s:property value="etpNum"/>)"></td>
			</tr>			
		</s:iterator>	
	</s:if>
</table>

</body>
</html> 