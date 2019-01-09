<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1810_LDataSet ds = (IS_DEP_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_1810_LCURLISTRecord rec = (IS_DEP_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sale_proc_dt", rec.sale_proc_dt);
			rx.add(record, "stmt_no", rec.stmt_no);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			
			/**HIDDEN**/
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "sale_dlco_li_seq", rec.sale_dlco_li_seq);
			/**HIDDEN**/
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
