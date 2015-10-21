<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
$(function () {
    $('#container10').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: '월별 매출액 변화'
        },
        subtitle: {
            text: '월별 매출'
        },
        xAxis: {
            /* type: 'category', */
            labels: {
               /*  rotation: -45, */
                style: {
                    fontSize: '20px',
                   /*  fontFamily: 'Verdana, sans-serif' */
                }
            }
        },
        yAxis: {
            title: {
                text: '매출액(원)'
            }
        },
       /*  legend: {
            enabled: false
        }, */
        tooltip: {
            pointFormat: '매출액: <b>{point.y:f} 원</b>'
        },
        series: [{
            name: '월',
            data: [
                ['1월', 
                  <s:iterator value="#request.amountList">
     				<s:property value="amount0"/>
        		  </s:iterator>  
                 ],
                ['2월', 
                 <s:iterator value="#request.amountList">
 					<s:property value="amount1"/>
    		 	 </s:iterator>  
                 ],
                ['3월', 
                 <s:iterator value="#request.amountList">
					<s:property value="amount2"/>
		 		 </s:iterator> 
                 ],
                ['4월', 
                 <s:iterator value="#request.amountList">
					<s:property value="amount3"/>
		 		 </s:iterator> 
                 ],
                ['5월', 
                 <s:iterator value="#request.amountList">
					<s:property value="amount4"/>
		 		 </s:iterator> 
                 ],
                ['6월', 
                 <s:iterator value="#request.amountList">
					<s:property value="amount5"/>
		 		 </s:iterator> 
                 ],
                ['7월',
                 <s:iterator value="#request.amountList">
					<s:property value="amount6"/>
		 		 </s:iterator> 
                 ],
                ['8월',
                 <s:iterator value="#request.amountList">
					<s:property value="amount7"/>
		 	 	</s:iterator> 
                 ],
                ['9월',
                 <s:iterator value="#request.amountList">
					<s:property value="amount8"/>
		 		 </s:iterator> 
		 		 ],
                ['10월',
                 <s:iterator value="#request.amountList">
					<s:property value="amount9"/>
		 	 	</s:iterator> 
                 ],
                ['11월',
                 <s:iterator value="#request.amountList">
					<s:property value="amount10"/>
		 		 </s:iterator> 
                 ],
                ['12월',
                 <s:iterator value="#request.amountList">
					<s:property value="amount11"/>
		 	 	</s:iterator> 
                 ],
              
            ],
            dataLabels: {
                enabled: true,
                /* rotation: -90, */
                color: 'black',
                align: 'right',
                format: '{point.y:f}', // one decimal
               /*  y: 10, // 10 pixels down from the top */
                style: {
                    fontSize: '10px',
                    /* fontFamily: 'Verdana, sans-serif' */
                }
            }
        }]
    });
});

</script>
<title>월별 매출액 변화</title>
</head>
<body>
<div id="container10" style="min-width: 1000px; height: 500px; margin: 0 auto"></div>
</body>
</html>