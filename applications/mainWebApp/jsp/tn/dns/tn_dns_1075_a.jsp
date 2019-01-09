<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.dns.ds.*
	,   java.net.URLEncoder;
	"
%>

<%
//	RwXml rx = new RwXml();
	TN_DNS_1075_ADataSet ds = (TN_DNS_1075_ADataSet)request.getAttribute("ds");
 
	String errcode = ds.errcode;
	String errmsg = ds.errmsg; 

	byte[] bytearray = ds.getProofdata();
	String proofname = URLEncoder.encode(ds.getProofname(), "euc-kr");

	try {
		 response.reset();
		 response.setContentType("application/x-msdownload");
		 response.setHeader("Content-Type", "application/x-msdownload");
 		 response.setHeader("Content-Disposition", "attachment; filename=" + proofname+ ";");
 
 		 
		 response.setContentLength((int)bytearray.length);
		 //mime = "application/vnd.ms-excel";
		
		// response.setContentLength((int)bytearray..length());
		 ServletOutputStream sout = response.getOutputStream(); 
 
		 if(sout != null) {
		  //sout.write(bytearray,0,bytearray.length-1);  
			sout.write(bytearray,0,bytearray.length);
		 } else {
		  	out.println("../../images/knowbrd/organ_noimg.gif");
		 }
		 sout.close();
	}catch (Exception e) {
		System.out.println("exception:getProofname:"+ds.getProofname());		
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
//		out.println(rx.xmlFlush());
//		out.println(rx.xmlEndFlush());
	}
%>


<% /* 작성시간 : Mon Jul 04 16:03:34 KST 2016 */ %>