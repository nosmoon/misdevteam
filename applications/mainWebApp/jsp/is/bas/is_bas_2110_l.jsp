<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_2110_LDataSet ds = (IS_BAS_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_BAS_2110_LCURLIST1Record rec = (IS_BAS_2110_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "reg_dt", rec.reg_dt);			
			rx.add(record, "boks_re_resn_clsf", rec.boks_re_resn_clsf);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "resn", rec.resn);
			rx.add(record, "reg_seq", rec.reg_seq);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
