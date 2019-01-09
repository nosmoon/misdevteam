<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1110_LDataSet ds = (IS_SAL_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_1110_LCURLISTRecord rec = (IS_SAL_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt+rec.acwr_reg_seq);
			//rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			//rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "purc_clsf", rec.purc_clsf);
			rx.add(record, "purc_clsf_nm", rec.purc_clsf_nm);
			rx.add(record, "purc_dt", rec.purc_dt);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "trc_yn", rec.trc_yn);
			rx.add(record, "send_yn", rec.send_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "adjm_yn", rec.adjm_yn);
			rx.add(record, "purc_adjm_reg_dt", rec.purc_adjm_reg_dt);
			rx.add(record, "purc_adjm_reg_seq", rec.purc_adjm_reg_seq);
			rx.add(record, "purc_reg_dt", rec.purc_reg_dt);
			rx.add(record, "purc_reg_seq", rec.purc_reg_seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
