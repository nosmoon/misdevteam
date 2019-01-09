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
	SP_SAL_2810_LDataSet ds = (SP_SAL_2810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_2810_LCURLISTRecord rec = (SP_SAL_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "adms_dstc_cd_nm", rec.adms_dstc_cd_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_head", rec.dlco_head);
			rx.add(record, "dlco_head_tel", rec.dlco_head_tel);
			rx.add(record, "sp_comp_chrg_pers_emp_nm", rec.sp_comp_chrg_pers_emp_nm);
			rx.add(record, "pre_misu", rec.pre_misu);
			rx.add(record, "cur_stot_amt", rec.cur_stot_amt);
			rx.add(record, "cur_in_amt", rec.cur_in_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
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
