<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<div class="panel panel-default">
	<div class="container"> 
		<div class="row">
			<div class="col-md-6">
				<!-- <img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Seoul,Mali&amp;zoom=12&amp;size=400x400&amp;sensor=false"> -->
				<input type="hidden" id="address" value='${enterprise.etpAddress }'/>   
				<input type="hidden" id="map">
				<div id="map" style="width:100%;height:350px;width:350px;"></div>
				<div id="staticMap" style="width:100%;height:300px;width:400px;"></div>
				
			</div>
			<div class="col-md-6">
				<h1>오시는 길</h1>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="http://apis.daum.net/maps/maps3.js?apikey=dc4b9eca6f6c59278349f8b7add7e6b1&libraries=services"></script>
	
				<script>
					var address = document.getElementById('address').value;
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
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
					            content: '<div style="padding:5px;">우리회사</div>'
					        });
					        infowindow.open(map, marker);
					        
					        //지도 가운데
					        map.setCenter(coords);
					        
					       //다시
					        var staticMapContainer  = document.getElementById('staticMap'); // 이미지 지도를 표시할 div  
					        var staticMapOption = { 
					            center: coords, // 이미지 지도의 중심좌표
					            level: 4, // 이미지 지도의 확대 레벨
					            marker: marker
					        }
			
					        //이미지 지도를 표시할 div와 옵션으로 이미지 지도를 생성합니다
					        var staticMap = new daum.maps.StaticMap(staticMapContainer, staticMapOption);
					        infowindow = new daum.maps.InfoWindow({
					        		content: '<div style="padding:5px;">우리회사</div>'
					        });
					        infowindow.open(staticMap, marker);
					        
					        //지도 가운데
					        staticMap.setCenter(coords);
					    } 
					}); 
				</script>
</body>
</html>