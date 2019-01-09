<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.ds.*
	,   java.net.URLEncoder;
	"
%>

<%
//	RwXml rx = new RwXml();
	TN_LNK_1154_ADataSet ds = (TN_LNK_1154_ADataSet)request.getAttribute("ds");
 
	String errcode = ds.errcode;
	String errmsg = ds.errmsg; 

	byte[] bytearray = ds.getAdd_file();
	String add_file_nm = URLEncoder.encode(ds.getAdd_file_nm(), "euc-kr");

 


	try {
		 response.reset();
		 response.setContentType("application/x-msdownload");
		 response.setHeader("Content-Type", "application/x-msdownload");
 		 response.setHeader("Content-Disposition", "attachment; filename=" + add_file_nm+ ";");
 
 		 
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
		System.out.println("exception:getAdd_file_nm:"+ds.getAdd_file_nm());		
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