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
	AD_CO_9007_SDataSet ds = (AD_CO_9007_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		rx.add(tempData, "slcrg_pers"	, ds.slcrg_pers); 
		rx.add(tempData, "slcrg_pers_nm", ds.slcrg_pers_nm); 
		rx.add(tempData, "dept_cd"		, ds.dept_cd);
		rx.add(tempData, "dept_nm"		, ds.dept_nm);
		rx.add(tempData, "mchrg_pers"	, ds.mchrg_pers);
		rx.add(tempData, "mchrg_pers_nm", ds.mchrg_pers_nm); 
		rx.add(tempData, "grp_cmpy_cd"	, ds.grp_cmpy_cd);
		rx.add(tempData, "indt_cd"		, ds.indt_cd);
		rx.add(tempData, "indt_nm"		, ds.indt_nm);
		rx.add(tempData, "type_cd"		, ds.type_cd);
		rx.add(tempData, "type_nm"		, ds.type_nm);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>