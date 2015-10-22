<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-checkbox/paper-checkbox.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-button/paper-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/iron-form/iron-form.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-group/paper-radio-group.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-radio-button/paper-radio-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-dropdown-menu/paper-dropdown-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu/paper-menu.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-menu-button/paper-menu-button.html">
<link rel="import" href="${pageContext.request.contextPath}/Polymer/components/bower_components/paper-item/paper-item.html">


<script src="${pageContext.request.contextPath}/Polymer/components/bower_components/webcomponentsjs/webcomponents.min.js"></script>
  
  
 <%--  <script src="bower_components/jquery/dist/jquery.min.js"></script> --%>

<title>검색 결과</title>
</head>
<body><s:include value="../Header.jsp" />	

<!-- 자유 검색 리스트 -->
 <div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
          	<div class="container">
          		 
          		 <!-- 기업List -->
          		<s:if test="enterpriseList !=null">
          		 <s:iterator value="enterpriseList">         		 	
					  <div class="panel-group">
					    <div class="panel panel-default">
						      <div class="panel-heading">
						        <h4 class="panel-title">
						          <a data-toggle="collapse" href="#<s:property value="etpNum"/>"><s:property value="etpTitle"/> &nbsp;&nbsp; 영업개시시간 : <s:property value="etpStartHour"/>&nbsp;&nbsp; 영업종료시간 : <s:property value="etpEndHour"/></a>
						        </h4>
						      </div>
						      <div id="<s:property value="etpNum"/>" class="panel-collapse collapse">
						        <!-- 본문 내용 -->
						        <div class="panel-body">
						        	 <div class="section">
									      <div class="container">
									        <div class="row">
									          <div class="col-md-6">
									          		<table>
														<tr>
															<th>전화번호 : </th>
															<td><s:property value="etpPhone"/></td>
														</tr>
														<tr>
															<th>주소 : </th>
															<td><s:property value="etpAddress"/></td>
														</tr>
														<tr>
															<th>이메일 : </th>
															<td><s:property value="etpEmail"/></td>
														</tr>
														<tr>
															<th>특이사항 : </th>
															<td><s:property value="etpSpecialize"/></td>
														</tr>															
													</table>
									          
									          </div>
										          <div class="col-md-6">
										          	<h2>오시는 길</h2>
										          	<img class="img-responsive" src="http://maps.googleapis.com/maps/api/staticmap?center=Tombouctou,Mali&amp;zoom=12&amp;size=200x200&amp;sensor=false">
										          
										          </div>
									        </div>
									      </div>
									    </div>										
								</div>
								<!-- 아랫 부분 -->
						        <s:form action="" method="post"  theme="simple">
							        <div class="panel-footer">
										<s:submit value="예약"/> <input type="button" value="취소">
									</div>
								</s:form>
						      </div>
					    </div>
					  </div>
					  </s:iterator>
					</s:if>
				</div>    
          </div>
        </div>
      </div>
    </div>
</body>
</html>