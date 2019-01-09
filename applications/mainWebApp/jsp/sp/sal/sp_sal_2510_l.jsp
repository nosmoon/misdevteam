<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2510_LDataSet ds = (SP_SAL_2510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");
	
	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_2510_LCURLIST1Record rec = (SP_SAL_2510_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "clam", rec.clam);
			rx.add(record, "clam_amt", rec.clam_amt);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "card_qunt", rec.card_qunt);
			rx.add(record, "card_coms", rec.card_coms);
			rx.add(record, "card_amt", rec.card_amt);
		}
		/****** CURLIST1 END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
