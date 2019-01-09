<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3110_LDataSet ds = (SP_SAL_3110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3110_LCURLISTRecord rec = (SP_SAL_3110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sp_comp_chrg_pers_emp_nm", rec.sp_comp_chrg_pers_emp_nm);
			rx.add(record, "adms_dstc_cd_nm", rec.adms_dstc_cd_nm);
			rx.add(record, "dlco_head", rec.dlco_head);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "s_amt01", rec.s_amt01);
			rx.add(record, "s_amt02", rec.s_amt02);
			rx.add(record, "s_amt03", rec.s_amt03);
			rx.add(record, "s_amt04", rec.s_amt04);
			rx.add(record, "s_amt05", rec.s_amt05);
			rx.add(record, "s_amt06", rec.s_amt06);
			rx.add(record, "s_amt07", rec.s_amt07);
			rx.add(record, "s_amt08", rec.s_amt08);
			rx.add(record, "s_amt09", rec.s_amt09);
			rx.add(record, "s_amt10", rec.s_amt10);
			rx.add(record, "s_amt11", rec.s_amt11);
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
