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
	IS_DEP_3810_LDataSet ds = (IS_DEP_3810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		/****** CURLIST BEGIN */
		int gridData = rx.add(root, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_3810_LCURLISTRecord rec = (IS_DEP_3810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
					
			rx.add(record, "checked", "7".equals(rec.bddb_proc_clsf) ? "Y": "N");
			rx.add(record, "bill_no", rec.bill_no);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.add(record, "sale_proc_dt", rec.sale_proc_dt);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "unrcp_vat_amt", rec.unrcp_vat_amt);
			rx.add(record, "bddb_proc_yn", rec.bddb_proc_yn);

			/* hidden data */			
			rx.add(record, "bddb_proc_clsf", "");
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "sale_dlco_li_seq", rec.sale_dlco_li_seq);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			/* hidden data */	
			
			
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
