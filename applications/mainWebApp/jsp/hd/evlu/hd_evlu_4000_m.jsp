<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<% 
	RwXml rx = new RwXml();
	HD_EVLU_4000_MDataSet ds = (HD_EVLU_4000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "pers_chk01", ds.getPers_chk01());  	
		rx.add(dataSet, "pers_chk02", ds.getPers_chk02());    
		rx.add(dataSet, "pers_chk03", ds.getPers_chk03());          
		rx.add(dataSet, "pers_chk04", ds.getPers_chk04());          
		rx.add(dataSet, "pers_chk05", ds.getPers_chk05());         
		rx.add(dataSet, "pers_chk06", ds.getPers_chk06());                
		rx.add(dataSet, "pers_chk07", ds.getPers_chk07());          
		 

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>


<% /* 작성시간 : Wed May 20 16:32:55 KST 2009 */ %>