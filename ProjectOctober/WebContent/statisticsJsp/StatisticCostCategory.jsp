<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/highcharts-more.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>
<script src="http://code.highcharts.com/modules/data.js"></script>
<script src="http://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>유료 통계 서비스 화면</title>
</head>
<body>
<s:include value="../jsp/Header.jsp"></s:include>
<%-- <%@include file="Header.jsp"%> --%>
<script type="text/javascript">
$(function(){
	// Ajax 파일 다운로드
	jQuery.download = function(url, data, method){
	    // url과 data를 입력받음
	    if( url && data ){ 
	        // data 는  string 또는 array/object 를 파라미터로 받는다.
	        data = typeof data == 'string' ? data : jQuery.param(data);
	        // 파라미터를 form의  input으로 만든다.
	        var inputs = '';
	        jQuery.each(data.split('&'), function(){ 
	            var pair = this.split('=');
	            inputs+='<input type="hidden" name="'+ pair[0] +'" value="'+ pair[1] +'" />'; 
	        });
	        // request를 보낸다.
	        jQuery('<form action="'+ url +'" method="'+ (method||'post') +'">'+inputs+'</form>')
	        .appendTo('body').submit().remove();
	    };
	};
	
	$("#pdfdown").click(function(){
		/*
		$.ajax({
			url:'./pdfdown.jsp',
			type:'post',
			dataType:'html',
			async: false,
			success:function(data){
				//alert(data);
				//download
				document.write(data);
			},
			error:function(request,status,error){
		        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
		    }
		});
		*/
		//$.download('pdfdown.jsp','','post' );
		$("#form").submit();
	});
});
</script>
<form action = "./statisticsJsp/pdfdown.jsp" method = "post" id="form">
</form>
<!-- 내가 작성할 부분 -->
<!-- pdf -->
<script type="text/javascript">
$(function(){
	// Ajax 파일 다운로드
	jQuery.download = function(url, data, method){
	    // url과 data를 입력받음
	    if( url && data ){ 
	        // data 는  string 또는 array/object 를 파라미터로 받는다.
	        data = typeof data == 'string' ? data : jQuery.param(data);
	        // 파라미터를 form의  input으로 만든다.
	        var inputs = '';
	        jQuery.each(data.split('&'), function(){ 
	            var pair = this.split('=');
	            inputs+='<input type="hidden" name="'+ pair[0] +'" value="'+ pair[1] +'" />'; 
	        });
	        // request를 보낸다.
	        jQuery('<form action="'+ url +'" method="'+ (method||'post') +'">'+inputs+'</form>')
	        .appendTo('body').submit().remove();
	    };
	};
	
	$("#pdfdown").click(function(){
		/*
		$.ajax({
			url:'./pdfdown.jsp',
			type:'post',
			dataType:'html',
			async: false,
			success:function(data){
				//alert(data);
				//download
				document.write(data);
			},
			error:function(request,status,error){
		        alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
		    }
		});
		*/
		//$.download('pdfdown.jsp','','post' );
		$("#form").submit();
	});
});
</script>
<form action = "./statisticsJsp/pdfdown.jsp" method = "post" id="form">
<!-- 통계 -->
<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-12">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 1통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은업종, 같은지역 내 매출 상위 TOP10</h3>
						 </div>
						 <div class="panel-body">
						     <s:include value="Highchart9Cost.jsp"/>   
						     <p align="center">
						     <!-- 자동문구 -->
						    
						     
						      귀사와 동종업계, 동일 지역(구 단위)에 위치한 매출액 상위 10위 업체를 선별하여 <br>
						      귀사가 가지고 있는 서비스와 상위 TOP10의 평균 서비스 가격대를 비교한 결과 <br>
							(<s:iterator value="#request.autoList">
							<s:if test="wedding != null">							
								<s:property value="wedding"/>,
							</s:if>
							<s:if test="tai != null">		
								<s:property value="tai"/>,
							</s:if>
							<s:if test="gyung != null">	
								<s:property value="gyung"/>,
							</s:if>
							<s:if test="kairo != null">	
								<s:property value="kairo"/>,
							</s:if>
							<s:if test="bal != null">	
								<s:property value="bal"/>,
							</s:if>
							<s:if test="body != null">	
								<s:property value="body"/>,
							</s:if>	
							<s:if test="face != null">	
								<s:property value="face"/>,
							</s:if>	
							<s:if test="aroma != null">	
								<s:property value="aroma"/>,
							</s:if>
							<s:if test="sleeming != null">	
								<s:property value="sleeming"/>,
							</s:if>
							</s:iterator>)는  각각 
							(<s:iterator value="#request.autoList">
							<s:if test="weddingCost != 0">	
								<s:property value="weddingCost"/>,
							</s:if>							
							<s:if test="taiCost != 0">
								<s:property value="taiCost"/>,
							</s:if>	
							<s:if test="gyungCost != 0">
								<s:property value="gyungCost"/>,
							</s:if>	
							<s:if test="kairoCost != 0">
								<s:property value="kairoCost"/>,
							</s:if>	
							<s:if test="balCost != 0">
								<s:property value="balCost"/>,
							</s:if>	
							<s:if test="bodyCost != 0">	
								<s:property value="bodyCost"/>,
							</s:if>	
							<s:if test="faceCost != 0">
								<s:property value="faceCost"/>,
							</s:if>	
							<s:if test="aromaCost != 0">
								<s:property value="aromaCost"/>,
							</s:if>	
							<s:if test="sleemingCost != 0">
								<s:property value="sleemingCost"/>,
							</s:if>
							</s:iterator>)원 차이가 납니다.
											     
						     </p>			 
						 </div>
				    </div>
		   		  <!-- 유료 1통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
    </div>



 <div class="section2">
      <div class="container10">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-8">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 2통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은업종, 같은지역 예약이 몰리는 시간대</h3>
						 </div>
						 <div class="panel-body">
						     <s:include value="Highchart10Cost.jsp"/>  
						     <p align="center">
						     	귀사와 동종 업계, 동일 지역(구 단위)에 있는 업체에 고객이 가장 많이 몰리는 시간은 (
						     	<s:iterator value="#request.TotalCnt">
						     		<s:property value="timeSet"/>
						     	</s:iterator>
						     	)시 입니다. <br>
								그리고 귀사에 고객이 가장 많이 몰리는 시간은 (
								<s:iterator value="#request.PersonalCnt">
						     		<s:property value="timeSet"/>
						     	</s:iterator>)시입니다.						     
						     </p>			  
						 </div>
				    </div>
		   		  <!-- 유료2통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
</div>
    
    
    
<div class="section3">
      <div class="container11">
        <div class="row">
          <div class="col-md-2"></div><!-- 안쓰는 부분 -->
          
          <div class="col-md-8">
          	<div class="container9">
		       <div class="row">
		         <div class="col-md-12">
		   		<!-- 유료 3통계 -->     
		   			<div class="panel panel-default">
						 <div class="panel-heading">
						    <h3 class="panel-title">같은 업종, 같은지격에 속한 업체들의 방문 고객 연령대</h3>
						 </div>
						 <div class="panel-body">
						    <s:include value="Highchart11Cost.jsp"/>
						   	<p align="center">
						   		귀사와 동종 업계, 동일 지역(구 단위)에 있는 업체에 가장 많이 방문하는 고객의 연령대는 (
						   		<s:iterator value="#request.TotalAge">
						     		<s:property value="age"/>
						     	</s:iterator>)대입니다. <Br>
								그리고 귀사에 가장 많이 방문하는 고객의 연령대는 (
								<s:iterator value="#request.PersonalAge">
						     		<s:property value="age"/>
						     	</s:iterator>)대입니다.
						   	</p>						   
						 </div>
				    </div>
		   		  <!-- 유료3통계 -->    
		          </div>
        		</div>
     		</div>
         </div>
     
         <div class="col-md-4"></div><!-- 안쓰는 부분 -->
        </div>
      </div>
</div>
<div align="center">
	<button type="button" class="btn btn-primary" id="pdfdown">PDF파일로 다운받기</button>
  </div>
  </form>
 <s:property value="etpEmail"/>
<s:property value='#session.loginId'/>
</body>
</html>