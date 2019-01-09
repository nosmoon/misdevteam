<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6231_SDataSet ds = (FC_ACCT_6231_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_EXPRSLTPTCR_LIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.cur_exprsltptcr_list.size(); i++) {
			FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord rec = (FC_ACCT_6231_SCUR_EXPRSLTPTCR_LISTRecord)ds.cur_exprsltptcr_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "exp_decl_no", rec.exp_decl_no);
			rx.add(record, "ship_dt", rec.ship_dt);
			rx.add(record, "frcr_clsf_cd", rec.frcr_clsf_cd);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "won_amt", rec.won_amt);
		}
		rx.add(recordSet, "totalcnt", ds.cur_exprsltptcr_list.size());
		
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "erplace_cd", ds.erplace_cd);
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm);
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm);
		rx.add(resform, "qunt_etc", ds.qunt_etc);
		rx.add(resform, "frcr_amt_etc", ds.frcr_amt_etc);
		rx.add(resform, "won_amt_etc", ds.won_amt_etc);
		rx.add(resform, "qunt_exp", ds.qunt_exp);
		rx.add(resform, "frcr_amt_exp", ds.frcr_amt_exp);
		rx.add(resform, "won_amt_exp", ds.won_amt_exp);
		rx.add(resform, "qunt_tot", ds.qunt_tot);
		rx.add(resform, "frcr_amt_tot", ds.frcr_amt_tot);
		rx.add(resform, "won_amt_tot", ds.won_amt_tot);
		rx.add(resform, "accflag", "U");
		rx.add(resform, "flag", "");
		
		/****** CUR_EXPRSLTPTCR_LIST END */
		System.out.println("최호정 fc_acct_6231_s.jsp 정상 success");
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Jun 13 18:58:29 KST 2014 */ %>