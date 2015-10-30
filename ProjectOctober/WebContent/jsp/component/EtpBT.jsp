<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="btn-group btn-group-justified" role="group" draggable="true">
	
		<div class="btn-group" role="group">
			 <button type="button" class="btn btn-danger btn-lg" id="rsvBT">예약 관리</button>
		</div>
		<div class="btn-group" role="group">
			 <button type="button" class="btn btn-success btn-lg" id="miscSetBT">자동화 설정</button>
		</div>
		<!-- 편집 on/off -->
		<div class="btn-group" role="group">
			 <button type="button" class="btn btn-primary btn-lg" id="editBT">페이지 편집</button>
		</div>
		<s:if test="#session.enterprise.etpTemplateType==1">
			<div class="btn-group" role="group">
				 <button type="button" class="btn btn-primary btn-lg" id="resetBT" onclick="resetPage()">페이지 초기화</button>
			</div>
		</s:if>
		<!-- 페이지 편집중에만 보이게 -->
		<div class="btn-group" role="group">
			 <button type="button" class="btn btn-primary btn-lg" id='saveBT' onclick='cleanComponent()'>Save &raquo;</button>
		</div>
	</div>
</body>
</html>

