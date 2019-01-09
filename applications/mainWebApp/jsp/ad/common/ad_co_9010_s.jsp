<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	java.lang.*
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
	AD_CO_9010_SDataSet ds = (AD_CO_9010_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resData 	= rx.add(root, "resData", "");

	try {  
 
		rx.add(resData, "dlco_no", ds.dlco_no);   
		rx.addCData(resData, "dlco_nm", ds.dlco_nm); System.out.println(ds.dlco_nm);
		rx.add(resData, "slcrg_pers", ds.slcrg_pers); 
		rx.add(resData, "slcrg_pers_nm", ds.slcrg_pers_nm); 
		rx.add(resData, "mchrg_pers", ds.mchrg_pers); 
		rx.add(resData, "mchrg_pers_nm", ds.mchrg_pers_nm); 
		rx.add(resData, "dept_cd", ds.dept_cd); 
		rx.addCData(resData, "dept_nm", ds.dept_nm); 
		rx.add(resData, "grp_cmpy_cd", ds.grp_cmpy_cd); 
		rx.add(resData, "indt_cd", ds.indt_cd);
		rx.addCData(resData, "indt_nm", ds.indt_nm);
		rx.add(resData, "type_cd", ds.type_cd);
		rx.addCData(resData, "type_nm", ds.type_nm);
		
		rx.add(resData, "dlco_clsf", ds.dlco_clsf);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>