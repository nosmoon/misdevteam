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
	IS_AGR_1320_LDataSet ds = (IS_AGR_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1320_LCURLISTRecord rec = (IS_AGR_1320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "purc_uprc", DigitUtil.cutUnderPoint(rec.purc_uprc,2));
			rx.add(record, "purc_qunt", rec.purc_qunt);
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "rvord_dt", rec.rvord_dt);
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
