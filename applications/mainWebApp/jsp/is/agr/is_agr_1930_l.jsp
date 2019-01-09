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
	IS_AGR_1930_LDataSet ds = (IS_AGR_1930_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData2 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_AGR_1930_LCURLISTRecord rec = (IS_AGR_1930_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "indt_cd_nm", rec.indt_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "spc_sale_clsf_nm", rec.spc_sale_clsf_nm);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			//rx.add(record, "uprc", rec.uprc);
			rx.add(record, "uprc", DigitUtil.cutUnderPoint(rec.uprc,2));
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "purc_uprc", DigitUtil.cutUnderPoint(rec.purc_uprc,2));
			rx.add(record, "purc_amt", rec.purc_amt);
			rx.add(record, "prft_amt", rec.prft_amt);
			//rx.add(record, "prft_rate", rec.prft_rate);
			rx.add(record, "prft_rate", DigitUtil.cutUnderPoint(rec.prft_rate,2));
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
<% /* 작성시간 : Fri Jun 01 16:26:19 KST 2012 */ %>