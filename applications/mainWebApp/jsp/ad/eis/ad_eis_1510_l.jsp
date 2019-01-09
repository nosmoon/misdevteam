<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.eis.rec.*
	,	chosun.ciis.ad.eis.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EIS_1510_LDataSet ds = (AD_EIS_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");
	
	try {
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_EIS_1510_LCURLISTRecord rec = (AD_EIS_1510_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			
			rx.add ( record, "titl"		,rec.titl);  
			rx.add ( record, "make_pers",rec.make_pers);  
			rx.add ( record, "make_dt"	,rec.make_dt);  
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