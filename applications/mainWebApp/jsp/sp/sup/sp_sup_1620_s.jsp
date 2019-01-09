<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1620_SDataSet ds = (SP_SUP_1620_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");

	try {
		rx.add(resForm, "req_clsf", ds.req_clsf);
		rx.add(resForm, "make_pers_nm", ds.make_pers_nm);
		rx.add(resForm, "make_dt", ds.make_dt);
		rx.addCData(resForm, "titl", ds.titl);
		rx.addCData(resForm, "cont", ds.cont);
		
		rx.add(resForm, "proc_pers", ds.proc_pers);
		rx.add(resForm, "proc_dt", ds.proc_dt);
		rx.add(resForm, "proc_stat_s", ds.proc_stat);
		rx.addCData(resForm, "proc_cont", ds.proc_cont);
		
		rx.add(resForm, "seq_s", ds.seq);
		  
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
