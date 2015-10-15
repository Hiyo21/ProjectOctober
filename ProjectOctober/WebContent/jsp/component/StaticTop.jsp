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
<div class='container-fluid'>
	
	<div class="row" align="center">
		<div class="col-md-3">
			<div id='logoCP'>
			  	<div class="panel-body">
			  		<!-- img src에 업로드 된 파일이 바로 적용되도록 -->
			    	<img class="img-responsive" src="http://orig10.deviantart.net/2e58/f/2013/288/b/9/leaf_png_by_iheartsnsdforever-d6qjxl2.png" style="max-width: 200">
			    	<input type="file" name="datafile" size="40">
			  	</div>
			</div>
		</div>
		
		<div class="col-md-6">
			<div id='outLineCP'>
			  	<div class="panel-body">
			    	<textarea class="form-control" id="outLineText" placeholder="사업 개요"></textarea>
			  	</div>
			</div>
		</div>
			
		<div class="col-md-3">
			<span class="label label-primary">특징1</span>
			<span class="label label-primary">특징2</span>
			<span class="label label-primary">특징3</span>
		</div>	
	</div><!-- row end -->
</div><!-- page-top end -->

</body>
</html>