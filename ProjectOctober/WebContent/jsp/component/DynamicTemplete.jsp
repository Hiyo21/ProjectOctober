<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dynamic Templete</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" />
<link rel='stylesheet' href='//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css'>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src='//code.jquery.com/ui/1.11.4/jquery-ui.js'></script>

<style>
	#pageWrapper{
		background-color: #EFE7DE ;
		border-style: groove;
		padding: 50px;
	}
	.cp {
		
		background-color: transparent;
		border-style: dotted;
		border-width: 1px;
	}
	#top{
		border-style: solid;
		border-width: 1px;
		padding: 30px;
	}
	
</style>

<script>
  $(function() { 
	$('.cp').draggable({ 
		snap: true,
		containment: "#pageWrapper",
	});
	$('#infoCP').resizable();
	
  });
</script>

</head>
<body>

<s:include value="../Header.jsp"/>

<div class="container" id="pageWrapper">
	<div id='top'>
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

</div> 


</body>
</html>