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
	SP_SAL_2210_LDataSet ds = (SP_SAL_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {
		/****** CURLIST BEGIN */
		int gridData1 = rx.add( resData , "gridData1" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_2210_LCURLISTRecord rec = (SP_SAL_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add( gridData1 , "record" , "");	
			rx.add(record, "purc_adjm_reg_dt", rec.purc_adjm_reg_dt);
			rx.add(record, "purc_adjm_reg_seq", rec.purc_adjm_reg_seq);
			rx.add(record, "txn_clsf", rec.txn_clsf);
			rx.addCData(record, "purc_adjm_clsf_nm", rec.purc_adjm_clsf_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "dduc_amt", rec.dduc_amt);
			rx.add(record, "stot_amt", rec.stot_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
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


<% /* 작성시간 : Fri Jul 06 18:21:09 KST 2012 */ %>