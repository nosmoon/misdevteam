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
	IS_SND_1110_LDataSet ds = (IS_SND_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");


	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SND_1110_LCURLIST1Record rec = (IS_SND_1110_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "wh_cd_nm", rec.wh_cd_nm);
			rx.add(record, "fix_yn", rec.fix_yn);
			rx.add(record, "self_yn", rec.self_yn);
			rx.add(record, "wh_cd", rec.wh_cd);			
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
