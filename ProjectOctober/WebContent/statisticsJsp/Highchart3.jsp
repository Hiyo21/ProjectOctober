<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container3').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '계절별 서비스 선호도'
        },
        xAxis: {
            categories: ['봄', '여름', '가을', '겨울']
        },
        yAxis: {
            min: 0,
            title: {
                text: '서비스 예약 수'
            },
            stackLabels: {
                enabled: true,
                style: {
                    fontWeight: 'bold',
                    color: (Highcharts.theme && Highcharts.theme.textColor) || 'gray'
                }
            }
        },
        legend: {
            align: 'right',
            x: -30,
            verticalAlign: 'top',
            y: 25,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.background2) || 'white',
            borderColor: '#CCC',
            borderWidth: 1,
            shadow: false
        },
        tooltip: {
            headerFormat: '<b>{point.x}</b><br/>',
            pointFormat: '{series.name}: {point.y}<br/>Total: {point.stackTotal}'
        },
        plotOptions: {
            column: {
                stacking: 'normal',
                dataLabels: {
                    enabled: true,
                    color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
                    style: {
                        textShadow: '0 0 3px black'
                    }
                }
            }
        },
        series: [{
            name: '타이마사지',
            data: [
<s:iterator value="#request.list1">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>                
                   
              ]
        }, {
            name: '경락마사지',
            data: [
<s:iterator value="#request.list2">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '카이로프랙틱',
            data: [
<s:iterator value="#request.list3">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '발마사지',
            data: [
<s:iterator value="#request.list4">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '바디마사지',
            data: [
<s:iterator value="#request.list5">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '페이스마사지',
            data: [
<s:iterator value="#request.list6">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '아로마마사지',
            data: [
<s:iterator value="#request.list7">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '슬리밍케어',
            data: [
<s:iterator value="#request.list8">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }, {
            name: '웨딩관리',
            data: [
<s:iterator value="#request.list9">
<s:property value="spring"/>,<s:property value="summer"/>,<s:property value="fall"/>,
<s:property value="winter"/>
</s:iterator>   

]
        }]
    });
});
</script>

<title>계절별 선호하는 서비스</title>
</head>
<body>
<div id="container3" style="min-width: 1300px; height: 400px; margin: 0 auto"></div>
</body>
</html>