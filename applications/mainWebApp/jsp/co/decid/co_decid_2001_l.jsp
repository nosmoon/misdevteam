<%@	page contentType="text/html; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.decid.rec.*
	,	chosun.ciis.co.decid.ds.*;
	"
%>

<%
	CO_DECID_2001_LDataSet ds	= (CO_DECID_2001_LDataSet)request.getAttribute("ds");
	CO_DECID_2001_LCURLISTRecord rec = (CO_DECID_2001_LCURLISTRecord)ds.curlist.get(0);
	byte[] bytearray = rec.getAdd_file();
	String add_file_nm = rec.getAdd_file_nm();
	
	response.reset();
	response.setContentType("application/x-msdownload");
	response.setHeader("Content-Type", "application/x-msdownload");
	response.setHeader("Content-Disposition", "attachment; filename=" + add_file_nm + ";");
	//mime = "application/vnd.ms-excel";
	System.out.println("name=" + add_file_nm);
	
	//response.setContentLength((int)bytearray..length());
	ServletOutputStream sout = response.getOutputStream();	

	if(sout != null) {
		sout.write(bytearray,0,bytearray.length-1);		

	} else {
		out.println("../../images/knowbrd/organ_noimg.gif");
	}
	sout.close();
%>