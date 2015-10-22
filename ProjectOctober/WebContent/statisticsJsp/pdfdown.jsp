<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test.pdf.Pdf" %>
<%@ page import="test.pdf.MakePdf" %>
<%@page import="java.io.File"%>
<%@page import="java.io.*"%>

<%
	String strPdf = "D:\\test.pdf";
	String filename = "test.pdf";
	//String strPdf = "C:\\Users\\jihee kim\\git\\ProjectOctober\\ProjectOctober\\WebContent\\WEB-INF\\download\\"+filename;
	//String strPdf = "C:\\Users\\"+filename;
	
	MakePdf mk = new MakePdf(strPdf,"\"http://localhost:8888/ProjectOctober/statisticsJsp/highchartCost\"");

	

	boolean check = mk.processPdf();
	
	  String filePath = strPdf;
	  
	  try{
		  out.clear();
		out = pageContext.pushBody();
		File file = new File(filePath);
		byte b[] = new byte[4096];
		
		response.reset();
		response.setContentType("application/octet-stream");
		
		String Encoding = new String(filename.getBytes("UTF-8"), "8859_1");
		response.setHeader("Content-Disposition", "attatchment; filename = " + Encoding);
		
		FileInputStream is = new FileInputStream(filePath);
		ServletOutputStream sos = response.getOutputStream();
		
		int numRead;
		while((numRead = is.read(b,0,b.length)) != -1){
			sos.write(b,0,numRead);
		}
		
		sos.flush();
		sos.close();
			
	   
	  } catch(Exception e){
	  }
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test.pdf.Pdf" %>
<%@ page import="test.pdf.MakePdf" %>
<%@page import="java.io.File"%>
 <%@page import="java.io.*"%>

<%
	String strPdf = "G:\\test.pdf";
	String filename = "test.pdf";
	//String strPdf = "C:\\Users\\jihee kim\\git\\ProjectOctober\\ProjectOctober\\WebContent\\WEB-INF\\download\\"+filename;
	//String strPdf = "C:\\Users\\"+filename;
	
	MakePdf mk = new MakePdf(strPdf,"\"http://localhost:8888/ProjectOctober/statisticsJsp/highchartCost\"");

	boolean check = mk.processPdf();
	
	  String filePath = strPdf;
	  
	  try{
		  out.clear();
		out = pageContext.pushBody();
		File file = new File(filePath);
		byte b[] = new byte[4096];
		
		response.reset();
		response.setContentType("application/octet-stream");
		
		String Encoding = new String(filename.getBytes("UTF-8"), "8859_1");
		response.setHeader("Content-Disposition", "attatchment; filename = " + Encoding);
		
		FileInputStream is = new FileInputStream(filePath);
		ServletOutputStream sos = response.getOutputStream();
		
		int numRead;
		while((numRead = is.read(b,0,b.length)) != -1){
			sos.write(b,0,numRead);
		}
		
		sos.flush();
		sos.close();
			
	   
	  } catch(Exception e){
	  }
%>