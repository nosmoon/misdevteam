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
	SP_SAL_1710_LDataSet ds = (SP_SAL_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_1710_LCURLISTRecord rec = (SP_SAL_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sale_yymm", rec.sale_yymm);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_proc_dt", rec.clos_proc_dt);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "clos_pers_emp_nm", rec.clos_pers_emp_nm);
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

