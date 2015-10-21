<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container12').highcharts({
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: '직업별 선호하는 서비스'
        },
        /* tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:f}원</b>'
        }, */
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.y} 개',
                   
                    style: {
                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                    }
                }
            }
        },
        series: [{
           /*  name: "Brands", */
            colorByPoint: true,
            data: [{
                name: "경락마사지",
                y: 
                	<s:iterator value="#request.service1">
                	<s:property value="total"/>
                	</s:iterator>  
            	
            }, {
                name: "슬리밍케어",
                y: 
                	<s:iterator value="#request.service2">
            	<s:property value="total"/>
            	</s:iterator> 
                	
              
            }, {
                name: "타이마사지",
                y: 
                	<s:iterator value="#request.service3">
        	<s:property value="total"/>
        	</s:iterator> 
        	    	
            }, {
                name: "발마사지",
                y:

                	<s:iterator value="#request.service4">
        	<s:property value="total"/>
        	</s:iterator> 
            }, {
                name: "웨딩관리",
                y: 
                	<s:iterator value="#request.service5">
        	<s:property value="total"/>
        	</s:iterator> 
            }, {
                name: "카이로프랙틱",
                y: 
                	
                	<s:iterator value="#request.service6">
        	<s:property value="total"/>
        	</s:iterator> 
            }, {
                name: "바디마사지",
                y: 
                	
                	<s:iterator value="#request.service7">
        	<s:property value="total"/>
        	</s:iterator> 
            }, {
                name: "페이스마사지",
                y: 
                	
                	<s:iterator value="#request.service8">
        	<s:property value="total"/>
        	</s:iterator> 
            }, {
                name: "아로마마사지",
                y: 
                	
                	<s:iterator value="#request.service9">
        	<s:property value="total"/>
        	</s:iterator> 
            }]
        }]
    });
});
</script>
<title>직업별 인기가 있는 서비스</title>
</head>
<body>
<div id="container12" style="min-width: 1000px; height: 500px; max-width: 1000px; margin: 0 auto"></div>
</body>
</html>
