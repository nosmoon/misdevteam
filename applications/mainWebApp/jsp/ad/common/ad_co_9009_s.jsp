<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>
 
<%
	RwXml rx = new RwXml();  
	AD_CO_9009_SDataSet ds = (AD_CO_9009_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resData 	= rx.add(root, "resData", "");

	try {  
 
		rx.add(resData, "emp_no", ds.emp_no); 
		rx.add(resData, "emp_nm", ds.emp_nm); 
		rx.add(resData, "dept_cd", ds.dept_cd); 
		rx.add(resData, "dept_nm", ds.dept_nm); 
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>