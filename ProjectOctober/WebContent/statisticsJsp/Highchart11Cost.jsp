<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	#container111 {
		height: 400px; 
		position: relative; 
		width: 800px;
		font-size: 150%;
	}
	
	.container {
		width: 70%;
  		height: 70%;
  		margin: 40px auto;
	}
</style>
<script type="text/javascript">

$(function () {
    $('#container111').highcharts({
        chart: {
            type: 'bar'
        },
        title: {
            text: '같은지역&같은업종에 방문하는 연령대별 고객'
        },
        xAxis: {
            categories: ['10대', '20대', '30대', '40대', '50대 이상']
        },
        yAxis: {
            min: 0,
            title: {
                text: '고객의 수'
            }
        },
        legend: {
            reversed: true
        },
        plotOptions: {
            series: {
                stacking: 'normal'
            }
        },
        series: [{
            name: '고객의 수',
            data: [
                   <s:iterator value="#request.resultList1"><s:property value="first"/></s:iterator>
                   ,
                   <s:iterator value="#request.resultList2"><s:property value="second"/></s:iterator>
                   ,
                   <s:iterator value="#request.resultList3"><s:property value="third"/></s:iterator>
                   ,
                   <s:iterator value="#request.resultList4"><s:property value="forth"/></s:iterator>
                   ,
                   <s:iterator value="#request.resultList5"><s:property value="fifth"/></s:iterator>
                   
                   
                  ]
        }]
    });
});

</script>
<title>같은 업종, 같은지격에 속한 업체들의 방문 고객 연령대</title>
</head>
<body>
<div id="container111" class="container"></div>
</body>
</html>