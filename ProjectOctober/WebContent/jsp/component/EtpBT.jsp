<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<!-- 페이지 주인만 보이게 -->
<%-- <s:if  test="#session.loginId == 페이지 주인 id"></s:if> --%>
<div class="etpButtonBars" draggable="true">

	<div class="btn-group btn-group-justified" role="group" aria-label="...">
		<div class="btn-group" role="group">
			<button type="button" class="btn btn-danger btn-lg" id="rsvBT">예약 관리</button>
		</div>
		<div class="btn-group" role="group">
			<button type="button" class="btn btn-success btn-lg" id="miscSetBT">기타설정</button>
		</div>
		<!-- 페이지 편집중에만 보이게 -->
		<div class="btn-group" role="group">
			<button type="button" class="btn btn-primary btn-lg" id="saveBT">Save &raquo;</button>
		</div>
	</div>
</div>

</body>
</html>