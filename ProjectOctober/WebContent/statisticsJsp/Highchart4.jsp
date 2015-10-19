<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container4').highcharts({
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: '직업별 소비지출액 평균'
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
                    format: '<b>{point.name}</b>: {point.y} 원',
                   
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
                name: "주부",
                y: 
                	<s:iterator value="#request.listJubu">
                	<s:property value="moneyflow"/>
                	</s:iterator>  
            	
            }, {
                name: "프리랜서",
                y: 
                	<s:iterator value="#request.listFree">
            	<s:property value="moneyflow"/>
            	</s:iterator> 
                	
              
            }, {
                name: "기타",
                y: 
                	<s:iterator value="#request.listOther">
        	<s:property value="moneyflow"/>
        	</s:iterator> 
        	    	
            }, {
                name: "회사원",
                y:

                	<s:iterator value="#request.listCompany">
        	<s:property value="moneyflow"/>
        	</s:iterator> 
            }, {
                name: "학생",
                y: 
                	<s:iterator value="#request.listStudent">
        	<s:property value="moneyflow"/>
        	</s:iterator> 
            }, {
                name: "전문직",
                y: 
                	
                	<s:iterator value="#request.listExpert">
        	<s:property value="moneyflow"/>
        	</s:iterator> 
            }]
        }]
    });
});
</script>

<title>직업별 평균 소비지출액</title>
</head>
<body>
<div id="container4" style="min-width: 1000px; height: 500px; max-width: 1000px; margin: 0 auto"></div>
</body>
</html>