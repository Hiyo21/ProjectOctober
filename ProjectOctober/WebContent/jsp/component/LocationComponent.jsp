<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Daum Map -->
<script type="text/javascript" src="http://apis.daum.net/maps/maps3.js?apikey=dc4b9eca6f6c59278349f8b7add7e6b1&libraries=services"></script>

</head>
<body>
<div class="panel panel-default">
	<div class="container-fluid"> 
		<div class="row">
			<div class="col-xs-6">
				<input type="hidden" id="address" value='${enterprise.etpAddress}'/>   
				<input type="hidden" id="map">
				<div id="map3" class="img-thumbnail image-responsive" style="width:100%; height:300px;width:300px;"></div>	
			</div>
			<div class="col-xs-6">
				<!-- <h1>오시는 길</h1> -->
				<span></span>
				
			</div>
		</div>
	</div>
</div>
	
<script>
function mapMake() {
	var address = document.getElementById('address').value;
	var mapContainer = document.getElementById('map3'), // 지도를 표시할 div 
	    mapOption = {
	        center: new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨
	    };  
	
	// 지도를 생성합니다    
	var map = new daum.maps.Map(mapContainer, mapOption); 
	
	// 주소-좌표 변환 객체를 생성합니다
	var geocoder = new daum.maps.services.Geocoder();
	
	var coords = '';
	
	// 주소로 좌표를 검색합니다
	geocoder.addr2coord(address, function(status, result) {
	
	    // 정상적으로 검색이 완료됐으면 
	     if (status === daum.maps.services.Status.OK) {
	        coords = new daum.maps.LatLng(result.addr[0].lat, result.addr[0].lng);
	
	        // 결과값으로 받은 위치를 마커로 표시합니다
	        var marker = new daum.maps.Marker({
	            map: map,
	            position: coords
	        });
	
	        // 인포윈도우로 장소에 대한 설명을 표시합니다
	        var infowindow = new daum.maps.InfoWindow({
	            content: '<div style="padding:5px;">' + '${enterprise.etpTitle}' + '</div>'
	        });
	        infowindow.open(map, marker);
	        
	        //지도 가운데
	        map.setCenter(coords);
	    } 
	}); 
}
setTimeout(mapMake(), 1000);
</script>
</body>
</html>