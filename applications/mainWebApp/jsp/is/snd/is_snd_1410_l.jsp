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
	IS_SND_1410_LDataSet ds = (IS_SND_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SND_1410_LCURLISTRecord rec = (IS_SND_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.addCData(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "bnch_qty", DigitUtil.cutUnderPoint(rec.bnch_qty,2));;
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "purc_dlco_nm_sort", rec.purc_dlco_nm_sort);
			rx.add(record, "dstc_seqo", rec.dstc_seqo);
			rx.add(record, "scat_dt", rec.scat_dt);			
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
