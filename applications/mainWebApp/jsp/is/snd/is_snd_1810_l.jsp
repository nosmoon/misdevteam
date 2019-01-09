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
	IS_SND_1810_LDataSet ds = (IS_SND_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SND_1810_LCURLISTRecord rec = (IS_SND_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "advt_nm", rec.advt_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.addCData(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.addCData(record, "qunt", rec.qunt);
			rx.add(record, "send_yn", rec.send_yn);
			rx.add(record, "purc_reg_dt", rec.purc_reg_dt);
			rx.add(record, "purc_reg_seq", rec.purc_reg_seq);
		}
		/****** CURLIST END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
