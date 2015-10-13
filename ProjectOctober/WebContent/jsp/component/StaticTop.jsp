<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	textarea{
		resize : none;
	}

</style>
</head>
<body>

<!-- page-top -->
<div id="top" class='well'>
	<div class="row" align="center">
	
		<div class="col-md-3">
			<div id='logoCP' style="height: 150px;">
			  	<div class="panel-body">
			    	<img src="http://orig10.deviantart.net/2e58/f/2013/288/b/9/leaf_png_by_iheartsnsdforever-d6qjxl2.png" width="100px">
			  	</div>
			</div>
		</div>
		
		<div class="col-md-5"  style="height: 150px;">
			<div id='outLineCP'>
			  	<div class="panel-body">
			    	<textarea class="form-control" rows="5" id="outLineText" placeholder="사업 개요"></textarea>
			  	</div>
			</div>
		</div>
			
		<div class="col-md-4">
			<span class="label label-primary">특징1</span>
			<span class="label label-primary">특징2</span>
			<span class="label label-primary">특징3</span>
		</div>
					
	</div><!-- row end -->
</div><!-- page-top end -->
<br>
<!-- 페이지 주인만 보이게 -->
<%-- <s:if  test="#session.loginId == 페이지 주인 id"></s:if> --%>
<div class="etpButtonBars">
	<div class="btn-group btn-group-justified" role="group" aria-label="...">
		<div class="btn-group" role="group">
			<button type="button" class="btn btn-danger btn-lg" id="rsvBT">예약 관리</button>
		</div>
		<div class="btn-group" role="group">
			<button type="button" class="btn btn-success btn-lg" id="miscSetBT">기타설정</button>
		</div>
		<div class="btn-group" role="group">
			<button type="button" class="btn btn-primary btn-lg" id="saveBT">Save &raquo;</button>
		</div>
	</div>
</div>

<br>

</body>
</html>