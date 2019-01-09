<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_7011_LDataSet ds = (FC_FUNC_7011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_7011_LCURLIST2Record rec = (FC_FUNC_7011_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "int_rate_chg_dt", rec.int_rate_chg_dt);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_7011_LCURLIST1Record rec = (FC_FUNC_7011_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "loan_nm", rec.loan_nm);
			rx.add(record, "loan_amt", rec.loan_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "int_clsf_cd", rec.int_clsf_cd);
			rx.add(record, "loan_rmks", rec.loan_rmks);
			rx.add(record, "loan_slip_occr_dt", rec.loan_slip_occr_dt);
			rx.add(record, "loan_slip_clsf_cd", rec.loan_slip_clsf_cd);
			rx.add(record, "loan_slip_seq", rec.loan_slip_seq);
			rx.add(record, "loan_repay_clsf_cd", rec.loan_repay_clsf_cd);
			rx.add(record, "compgbnm", rec.compgbnm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "intgbnm", rec.intgbnm);
			rx.add(record, "cishgbnm", rec.cishgbnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<int_rate_chg_dt/>
			<int_rate/>
			<incmg_dt_tm/>
			<incmg_pers/>
			<incmg_pers_ipadd/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<loan_nm/>
			<loan_amt/>
			<comp_dt/>
			<mtry_dt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<int_clsf_cd/>
			<loan_rmks/>
			<loan_slip_occr_dt/>
			<loan_slip_clsf_cd/>
			<loan_slip_seq/>
			<loan_repay_clsf_cd/>
			<compgbnm/>
			<compnm/>
			<intgbnm/>
			<cishgbnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 15:45:42 KST 2009 */ %>