<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link rel="stylesheet"	href="${pageContext.request.contextPath}/css/freelancer/css/freelancer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lavish-bootstrap.css" />

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
function searchFeature(searchKeyword) {
	location.href= '${pageContext.request.contextPath}/search/categorySearch.action?searchKeyword='+searchKeyword+'&part=feature';
}
</script>

<style type="text/css">
textarea {width:800px; height:300px;overflow:visible;}

</style>

<title>이용자 검색 카테고리</title>

</head>
<body>
<s:include value="../Header.jsp" />
<!-- 내가 작성 -->

<div class="container">
  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>특징</h3>
         <div class="section">
		      <div class="container">
		        <div class="row">
                 <div class="col-md-6"><!-- 왼쪽 -->
                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
                  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('남성전용')">남성전용</button>
                  <br>
                  <br>
                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  			  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('주차장')">주차장여부</button>
	  			  <br>
	  			  <br>
	  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('여성전용')">여성전용</button>
				  <br>
				  <br>
				  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('24시')">24시 운영</button>
                 </div>
                 <div class="col-md-6"><!-- 오른쪽 -->
                 	  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
                  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('아이')">어린아이 동반여부</button>
                  <br>
                  <br>
                  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
	  			  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('커플')">커플석 여부</button>
	  			  <br>
	  			  <br>
	  			  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('남녀')">남녀공통</button>
				  <br>
				  <br>
				  <img src="/ProjectOctober/image/relaxation_logo_test.jpg" width="100" height="100">  
				  <button type="button" style="width:300px; height:50px;" class="btn btn-primary" onclick="searchFeature('연중무휴')">연중무휴</button>                  
                 </div>
               </div>
             </div>
           </div>
		       
      	
      
     </div> <!-- 특징 -->
 
   </div>
</div>
</body>
</html>	
