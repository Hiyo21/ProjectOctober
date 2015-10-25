<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>zipcode.jsp</title>

<script language="javascript">
//검색어 입력 여부 확인
function formCheck() {
	var searchText = document.getElementById('searchText').value;
	if (searchText.trim().length == 0 || searchText == '') {
		alert('검색어를 입력하세요.');
		return false;
	}
	return true;
}

//ID 사용
function selectZipcode(zipcode, address) {
	opener.document.getElementById("zipcode").value = zipcode;
	opener.document.getElementById("address1").value = address;
	this.close();
}
</script>
</head>

<body>

<h2>[ 우편번호 검색 ]</h2>

<s:form name="zipcodeform" action="zipcode" method="post" onSubmit="return formCheck();" theme="simple">

주소 : <s:textfield id="searchText" name="searchText" />
	 <s:submit value="검색" />
</s:form>
<br><br>

<!-- 우편번호 검색 후에만 실행 -->
<s:if test="zipcodeList != null">
	<s:iterator value="zipcodeList">
		<s:set var="address" value="%{area1 + ' ' + area2 + ' ' + area3}" />
		<s:property value="zipcode" />
		<a href="javascript:selectZipcode('<s:property value="zipcode" />', '<s:property value="#address" />')">
		<s:property value="area1" />
		<s:property value="area2" />
		<s:property value="area3" />
		</a>
		<br>
	</s:iterator>
</s:if>

</body>
</html>
