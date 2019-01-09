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
	IS_AGR_1410_LDataSet ds = (IS_AGR_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1410_LCURLISTRecord rec = (IS_AGR_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "rvord_dt", rec.rvord_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "rvord_type", rec.rvord_type);
			rx.add(record, "rvord_type_nm", rec.rvord_type_nm);
			rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "uprc", rec.uprc);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "scat_dt", rec.scat_dt);
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
