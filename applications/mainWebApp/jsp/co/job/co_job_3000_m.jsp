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
	CO_JOB_3000_MDataSet ds = (CO_JOB_3000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		int sys_clsf = rx.add( tempData , "sys_clsf" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			CO_JOB_3000_MCURLISTRecord rec = (CO_JOB_3000_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( sys_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		rx.add ( tempData, "eis_report_cd", ds.eis_report_cd );
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>