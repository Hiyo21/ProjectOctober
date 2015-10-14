<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic Templete</title>

<!-- Latest compiled and minified CSS -->
<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />

<link rel="stylesheet" href="../../css/gridstack/gridstack.css" />
<link rel="stylesheet" href="../../css/gridstack/gridstack-extra.css" />

<style>
	
	.grid-stack-item{
		border-style: dotted;
		border-width: 1px;
	}

</style>


<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src='//code.jquery.com/ui/1.11.4/jquery-ui.js'></script>

<script src="../../js/lodash.js"></script>
<script src="../../js/gridstack.js"></script>

<script>
$(function () {
    var options = {
        cell_height: 80,
        vertical_margin: 10
    };
    $('.grid-stack').gridstack({
    	placeholder_class : 'grid-stack-placeholder',
    	resizable: {
            handles: 'e, se, s, sw, w'
        }
    });
});
</script>


</head>
<body>

<s:include value="../Header.jsp"/>

<div class="grid-stack">
    <div class="grid-stack-item" data-gs-x="0" data-gs-y="0" data-gs-width="6" data-gs-height="2">
		<div class="grid-stack-item-content">
			<h1>haha</h1>
			<s:include value="./StaticTop.jsp"/>
		</div>
    </div>
    <div class="grid-stack-item" data-gs-x="6" data-gs-y="0" data-gs-width="2" data-gs-height="2">
		<div class="grid-stack-item-content">
			<a href=""><label role="button" class="btn btn-default btn-lg" id="phoneBT" style="width: 250px;">전화 예약(000-0000-0000)</label></a>
  			<a href=""><label role="button" class="btn btn-success btn-lg" id="rsvBT" style="width: 250px;">예약 하기</label></a>
		</div>
    </div>
    <div class="grid-stack-item" data-gs-x="8" data-gs-y="0" data-gs-width="4" data-gs-height="2">
		<div class="grid-stack-item-content">
			<s:include value="./InfoComponent.jsp"/>
		</div>
    </div>
    <div class="grid-stack-item" data-gs-x="0" data-gs-y="2" data-gs-width="6" data-gs-height="4">
		<div class="grid-stack-item-content">
			<s:include value="./SvcComponent.jsp"/>
		</div>
    </div>
    <div class="grid-stack-item" data-gs-x="6" data-gs-y="2" data-gs-width="4" data-gs-height="4">
		<div class="grid-stack-item-content">
			<s:include value="./GalleryComponent.jsp"/>
		</div>
    </div>
    <div class="grid-stack-item" data-gs-x="0" data-gs-y="6" data-gs-width="4" data-gs-height="4">
		<div class="grid-stack-item-content">
			<s:include value="./LocationComponent.jsp"/>
		</div>
    </div>
    <div class="grid-stack-item" data-gs-x="4" data-gs-y="6" data-gs-width="4" data-gs-height="4">
		<div class="grid-stack-item-content">
			<s:include value="./ReviewComponent.jsp"/>
		</div>
    </div>
    
</div>

<%-- <div class="container" id="pageWrapper">
	<div id='top' class='cp'>
		<s:include value="./StaticTop.jsp"/>
	</div>
	<div id='rsvCP' class='cp' draggable="true" style="width: 510px;">
		<a href=""><label role="button" class="btn btn-default btn-lg" id="phoneBT" style="width: 250px;">전화 예약(000-0000-0000)</label></a>
  		<a href=""><label role="button" class="btn btn-success btn-lg" id="rsvBT" style="width: 250px;">예약 하기</label></a>
	</div>
	<div id='infoCP' class='cp' draggable="true">
	  <s:include value="./InfoComponent.jsp"/>
	</div>
	<div id='svcListCP' class='cp' draggable="true">
	  <s:include value="./SvcComponent.jsp"/>
	</div>
	<div id='galCP' class='cp' draggable="true">
	  <s:include value="./GalleryComponent.jsp"/>
	</div>
	<div id='locationCP' class='cp' draggable="true">
	  <s:include value="./LocationComponent.jsp"/>
	</div>
	<div id='reviewCP' class='cp' draggable="true">
	  <s:include value="./ReviewComponent.jsp"/>
	</div>
</div>  --%>

</body>
</html>