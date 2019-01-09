<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.job.rec.*
	,	chosun.ciis.co.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_JOB_3010_LDataSet ds = (CO_JOB_3010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");
	
	try {
		for(int i=0; i<ds.curlist.size(); i++){ 
			CO_JOB_3010_LCURLISTRecord rec = (CO_JOB_3010_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			
			rx.add ( record, "titl"		,StringUtil.replaceToXml(rec.titl));  
			rx.add ( record, "eis_fix"	,StringUtil.nvl(rec.eis_fix, "N")); 
			rx.add ( record, "make_pers",rec.make_pers);  
			rx.add ( record, "make_dt"	,rec.make_dt);  
			rx.add ( record, "sys_clsf"	,rec.sys_clsf);  
			rx.add ( record, "seq"		,rec.seq);  
		}	
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>