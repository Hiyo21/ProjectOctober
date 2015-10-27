<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" />

<style type="text/css">
	.etpDescDiv{
		display: inline-block; 
		border-style: solid; 
		border-color: gray;
		min-height : 200px;
		text-align: left;
	}
	
	.shopListDiv{
		max-height: 500px;
	}
</style>

<script>	
	$(function(){
		$('[data-toggle="notification-popover"]').popover();
	});

</script>
<!-- Latest compiled and minified CSS -->


<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>지도 클릭시 이동하는 페이지</title>
</head>
<body>
<s:include value="../Header.jsp" />
<!-- 내가 작성 list 뿌리기 -->

<div class="container" align="center"> 
	<!-- iterator 시작 -->
	<s:if test="enterpriseList != null">
	<s:iterator value="enterpriseList">
	
	<!-- shopList start -->				
	<div class="panel panel-primary shopListDiv" 
		onclick='location.href="${pageContext.request.contextPath}/enterprise/takeEtp.action?etpNum=<s:property value="etpNum"/>"'>
		<!-- heading -->
		<div class="panel-heading">
			<h1 class="panel-title"  align="left"><s:property value="etpTitle"/></h1>
		</div>
		<!-- body -->
		<div class="panel-body">
			<!-- row1 start -->	
			<div class="row">
				<!-- "특징" 리스트 뿌리기 -->     		
				<script type="text/javascript">
					$(function(){
						var item = '<s:property value="etpSpecialize"/>'
						//","단위로 특징 자르기
						var special = item.split(",");
						//각 shop의 specialBT div에 특징 버튼 뿌림. "클릭 기능 없으므로 label로 해도 무관함"
						var specialBT = $('#specialBT<s:property value="etpNum"/>').html();
							specialBT = '';
						$.each(special, function(i, item){
							specialBT += '<button type="button" class="btn btn-info">'+item+"</button>&nbsp;&nbsp;";
						});
						$('#specialBT<s:property value="etpNum"/>').html(specialBT);		
					});
				</script>
				<!-- "특징" 버튼이 뿌려질 구역 -->
              	<div class="col-md-6" align="left" id='specialBT<s:property value="etpNum"/>'><!-- row1 left start -->
              	
				</div> <!-- row1 Left end -->
				<div class="col-md-6" align="right"><!-- row1 right start -->		
       				<a href='#'>
       				<button type="button" class="btn btn-primary active" style="width: 100px">예약</button></a>
				</div><!-- row1 right end -->
			</div><!--  row1 end -->
			
			<!-- row2 start -->
			<div class="row" style="padding: 10px">
				<!-- image 뿌리기 -->
				<!-- 리스트용 사진이 존재할 경우 -->
				<div class="col-md-6" align="left"><!-- row2 left start -->
					<s:if test="infoPht != null">
			         	<!-- photoLocation 에서 각 항목에 맞는 사진 뿌리기 -->
			   			<img src='${pageContext.request.contextPath}/<s:property value="infoPht"/>' class='img-responsive'>
					</s:if>
					<s:else>
						<!-- 인포사진 부재시 기본적으로 뿌려지는 사진 -->
						<s:if test='etpSuperclass.equals("마사지샵")'>
							<img src='http://coolmassage.net/data/apms/background/%EB%B6%84%EB%8B%B9%EB%A7%88%EC%82%AC%EC%A7%801.jpg' class='img-responsive'>
						</s:if>
						<s:if test='etpSuperclass.equals("네일샵")'>
							<img src='http://img.kormedi.com/news/article/__icsFiles/afieldfile/2012/10/15/cc201210150001145.jpg' class='img-responsive'>
						</s:if>
					</s:else>
				</div>
            	<div class="col-md-6 etpDescDiv"><!-- 오른쪽 칸 -->
            	<s:if test="etpDescription==null">
            		<s:if test='etpSuperclass.equals("마사지샵")'> 
  						<h1>마사지 샵입니다</h1>
  					</s:if>
  					<s:if test='etpSuperclass.equals("네일샵")'>
						<h1>네일 샵입니다</h1>
					</s:if>
				</s:if>
				<s:else>
					<s:property value="etpDescription"/>
				</s:else>
        		</div>
			</div>
 		</div><!-- panel body end -->
  		</div>
  		</s:iterator>
	</s:if>	
 	</div>		









</body>
</html>