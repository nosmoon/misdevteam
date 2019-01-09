<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.dep.rec.*
	,	chosun.ciis.sp.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_DEP_1310_LDataSet ds = (SP_DEP_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_DEP_1310_LCURLISTRecord rec = (SP_DEP_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "sale_item_cd_nm", rec.sale_item_cd_nm);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "clamt", rec.clamt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "sp_comp_chrg_pers_emp_nm", rec.sp_comp_chrg_pers_emp_nm);
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
