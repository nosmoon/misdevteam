<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.snd.rec.*
	,	chosun.ciis.is.snd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SND_1255_LDataSet ds = (IS_SND_1255_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData6 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SND_1255_LCURLIST1Record rec = (IS_SND_1255_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData6, "record", "");
			rx.addCData(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.add(record, "bnch_qunt", rec.bnch_qunt);
			rx.addCData(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.add(record, "bnch_qty", rec.bnch_qty);
			rx.addCData(record, "cmpy_cd_nm", rec.cmpy_cd_nm);
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
