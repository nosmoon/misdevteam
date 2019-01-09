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
	IS_SAL_2110_LDataSet ds = (IS_SAL_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SAL_2110_LCURLISTRecord rec = (IS_SAL_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.add(record, "dlco_clsf_cd_seq", rec.dlco_clsf_cd_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "spc_sale_clsf_nm", rec.spc_sale_clsf_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "not_suply_amt", rec.not_suply_amt);
			rx.add(record, "indt_cd_nm", rec.indt_cd_nm);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "erplace_cd_nm", rec.erplace_cd_nm);
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
