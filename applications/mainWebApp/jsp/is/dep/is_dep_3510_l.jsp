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
	IS_DEP_3510_LDataSet ds = (IS_DEP_3510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData = rx.add(root, "gridData1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_3510_LCURLISTRecord rec = (IS_DEP_3510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "checked", "");
			rx.add(record, "prof_type_cd_nm", rec.prof_type_cd_nm);
			rx.add(record, "sale_proc_dt", rec.sale_proc_dt);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "sale_clsf_nm", rec.sale_clsf_nm);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "tot_rvord_amt", rec.tot_rvord_amt);
			rx.add(record, "ms_amt", rec.ms_amt);
			rx.add(record, "setoff_tot_rvord_amt", rec.setoff_tot_rvord_amt);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "sale_dlco_li_seq", rec.sale_dlco_li_seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
