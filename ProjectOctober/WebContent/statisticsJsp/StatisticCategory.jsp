<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/jejugothic.css"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/data.js"></script>
<script src="http://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



<script type="text/javascript">
function myFuncthion(){
	
	var con_test = confirm("유료 통계서비스를 결제하시겠습니까?");
	if(con_test == true){ 
		document.write("결제완료");
		location.href="PaymentAction.action?etpEmail=<s:property value='#session.loginId'/>"; 
	
	}
	else if(con_test == false){
		document.write("결제취소");
	}
	
	
}//유료 통계 페이지로 이동
</script>  

<style type="text/css">
textarea {width:800px; height:300px;overflow:visible;}
*{
	font-family: "Helvetica Neue", "Jeju Gothic", Helvetica,Arial,sans-serif;
}
</style>
<title>기본 통계</title>

</head>
<body>
<s:include value="../jsp/Header.jsp"></s:include>
<div class="container">
  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#home">통계1</a></li>
    <li><a data-toggle="tab" href="#menu1">통계2</a></li>
    <li><a data-toggle="tab" href="#menu2">통계3</a></li>
    <li><a data-toggle="tab" href="#menu3">통계4</a></li>
    <li><a data-toggle="tab" href="#menu4">통계5</a></li>
    <li><a data-toggle="tab" href="#menu5">통계6</a></li>
    <li><a data-toggle="tab" href="#menu6">통계7</a></li>
   <!--  <li><a data-toggle="tab" href="#menu7">통계8</a></li> -->
    <li><a data-toggle="tab" href="#menu8">통계8</a></li>
    <li><a data-toggle="tab" href="#menu9">통계9</a></li>
    <li><a data-toggle="tab" href="#menu10">통계10</a></li>
    <!-- <li><a data-toggle="tab" href="#menu11">통계11</a></li> -->
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>통계1</h3>
         <s:include value="Highchart1.jsp"/>        
     </div> <!-- 통계1 -->
     
   	 <div id="menu1" class="tab-pane fade" >
   		  <h3>통계2</h3>
   		 <s:include value="Highchart2.jsp"/>       	
   	  </div>	<!-- 통계2 -->
   	 
   	  <div id="menu2" class="tab-pane fade">
      	<h3>통계3</h3>	
   		  <s:include value="Highchart3.jsp"/>  		   
   	  </div><!-- 통계3 -->
   	 
     <div id="menu3" class="tab-pane fade">
     	 <h3>통계4</h3>
      	  <s:include value="Highchart4.jsp"/>  
      </div><!-- 통계4 --> 
      
      <div id="menu4" class="tab-pane fade">
     	  <h3>통계5</h3>
      	   <s:include value="Highchart5.jsp"/>  
      </div><!-- 통계5 -->
      
      <div id="menu5" class="tab-pane fade">
     	  <h3>통계6</h3>
      	   <s:include value="Highchart6.jsp"/>      
      </div><!-- 통계6 --> 
      
      <div id="menu6" class="tab-pane fade">
     	  <h3>통계7</h3>
      	   <s:include value="Highchart7.jsp"/>  
      </div><!-- 통계7 --> 
     <%--  <div id="menu7" class="tab-pane fade">
     	  <h3>통계8</h3>
      	  <s:include value="Highchart8.jsp"/>  
      </div><!-- 통계8 -->  --%>
      <div id="menu8" class="tab-pane fade">
     	  <h3>통계8</h3>
      	   <s:include value="Highchart9.jsp"/>  
      </div><!-- 통계9 --> 
      <div id="menu9" class="tab-pane fade">
     	  <h3>통계9</h3>
      	   <s:include value="Highchart10.jsp"/> 
      </div><!-- 통계10 --> 
      <div id="menu10" class="tab-pane fade">
     	  <h3>통계10</h3>
      	   <s:include value="Highchart11.jsp"/> 
      </div><!-- 통계11 --> 
     <%--  <div id="menu11" class="tab-pane fade">
     	  <h3>통계11</h3>
      	   <s:include value="Highchart12.jsp"/> 
      </div><!-- 통계12 -->  --%>
           
   </div>
  <div align="right">
	<button type="button" class="btn btn-primary" onclick='location.href="highchartCost"'>유료통계서비스</button><!-- onclick="myFuncthion()" -->
  </div>
</div>
<!-- onclick='location.href="highchartCost"' -->

</body>
</html>	
