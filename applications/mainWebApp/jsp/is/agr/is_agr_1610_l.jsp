<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_1610_LDataSet ds = (IS_AGR_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1610_LCURLISTRecord rec = (IS_AGR_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "rvord_dt", rec.rvord_dt);
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "ord_qunt", rec.ord_qunt);
			//rx.add(record, "ord_uprc", rec.ord_uprc);
			rx.add(record, "ord_uprc", DigitUtil.cutUnderPoint(rec.ord_uprc,2));
			rx.add(record, "ord_amt", rec.ord_amt);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "purc_uprc", DigitUtil.cutUnderPoint(rec.purc_uprc,2));
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "prft_amt", rec.prft_amt);
			//rx.add(record, "prft_rate", rec.prft_rate);
			rx.add(record, "prft_rate", DigitUtil.cutUnderPoint(rec.prft_rate,2));
			rx.add(record, "chrg_pers", rec.chrg_pers);
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
