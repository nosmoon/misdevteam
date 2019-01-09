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
	FC_FUNC_8011_ADataSet ds = (FC_FUNC_8011_ADataSet)request.getAttribute("ds");
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
			FC_FUNC_8011_ACURLIST2Record rec = (FC_FUNC_8011_ACURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "cntr_clsf_cd", rec.cntr_clsf_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "cost_amt", rec.cost_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "fisc_dt", rec.fisc_dt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8011_ACURLIST1Record rec = (FC_FUNC_8011_ACURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "cntr_clsf_cd", rec.cntr_clsf_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "totz_dt", rec.totz_dt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "cost_amt", rec.cost_amt);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "cost_bal", rec.cost_bal);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "prelae_pay_clsf_nm", rec.prelae_pay_clsf_nm);
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
			<cmpy_cd/>
			<cntr_clsf_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<slip_no/>
			<cost_amt/>
			<rmks/>
			<fisc_dt/>
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
			<cmpy_cd/>
			<cntr_clsf_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<totz_dt/>
			<comp_dt/>
			<mtry_dt/>
			<cost_amt/>
			<rcpay_amt_stot/>
			<cost_gain_stot/>
			<cost_bal/>
			<prelae_pay_clsf_cd/>
			<prelae_pay_clsf_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 25 18:58:57 KST 2009 */ %>