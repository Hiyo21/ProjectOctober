<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>index.jsp</title>

<!-- Latest compiled minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<link href="css/web.css" rel="stylesheet">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest complied JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="js/jquery.js"></script>
<script src="js/jquery.ui.min.js"></script>
</head>
<body>
<center>
<h2>[ DIY Reservation ]</h2>





<s:form action="freeSearching.action" method="post" theme="simple">
	<s:textfield name="searchLanguage"/>
	<s:submit value="검색"/><br>
	
	<s:if test="entList !=null">
		<s:iterator value="entList">
			<tr>			
				<td><s:property value="etpTitle"/></td>
				<td><s:property value="etpZipcode"/></td>
				<td><s:property value="etpAddress"/></td>
				<td><s:property value="etpStartHour"/></td>
				<td><s:property value="etpPhone"/></td>				
				<td><s:property value="etpSuperclass"/></td>
				<td><s:property value="etpOwner"/></td>
				<td><s:property value="etpEmail"/></td>
				<td><s:property value="etpDescription"/></td><br>									
			</tr>			
		</s:iterator>	
	</s:if>
</s:form>

<a href="enterprise/AllNoRegisterEtpList.action"><input type="button" value="관리자"></a>
</center>
</body>
</html>