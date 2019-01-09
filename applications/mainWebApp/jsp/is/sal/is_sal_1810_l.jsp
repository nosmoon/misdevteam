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
	IS_SAL_1810_LDataSet ds = (IS_SAL_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_1810_LCURLISTRecord rec = (IS_SAL_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "dstc_seqo", rec.dstc_seqo);
			rx.add(record, "dlco_clsf_cd_seq", rec.dlco_clsf_cd_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "setl_bank_nm", rec.setl_bank_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.addCData(record, "rcpm_main_nm", rec.rcpm_main_nm);
			rx.add(record, "purc_amt", rec.purc_amt);
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
