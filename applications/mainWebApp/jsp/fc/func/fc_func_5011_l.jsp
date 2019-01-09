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
	FC_FUNC_5011_LDataSet ds = (FC_FUNC_5011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_FUNC_5011_LCURLISTRecord rec = (FC_FUNC_5011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cctr_dt", rec.cctr_dt);
			rx.add(record, "cctr_amt", rec.cctr_amt);
			rx.add(record, "cctr_rmks", rec.cctr_rmks);
			rx.add(record, "nomach_adpay_bal", rec.nomach_adpay_bal);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "cost_gain_stot", rec.cost_gain_stot);
			rx.add(record, "rcpay_amt_stot", rec.rcpay_amt_stot);
			rx.add(record, "bhbijanamt", rec.bhbijanamt);
			rx.add(record, "bhshggbcdnm", rec.bhshggbcdnm);
			rx.add(record, "insr_nm", rec.insr_nm);
			rx.add(record, "bhwhncdnm", rec.bhwhncdnm);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "bhcompgbcdnm", rec.bhcompgbcdnm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "bhcompnm", rec.bhcompnm);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "bhmcnm", rec.bhmcnm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "bhusebuseocdnm", rec.bhusebuseocdnm);
			rx.add(record, "bhstcdnm", rec.bhstcdnm);
			rx.add(record, "fisc_aprv_nm", rec.fisc_aprv_nm);
			rx.add(record, "cctr_slip_occr_dt", rec.cctr_slip_occr_dt);
			rx.add(record, "cctr_slip_clsf_cd", rec.cctr_slip_clsf_cd);
			rx.add(record, "cctr_slip_seq", rec.cctr_slip_seq);
			rx.add(record, "prelae_pay_clsf_cd", rec.prelae_pay_clsf_cd);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "fisc_aprv_stat", rec.fisc_aprv_stat);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<cctr_dt/>
			<cctr_amt/>
			<cctr_rmks/>
			<nomach_adpay_bal/>
			<slip_no/>
			<cost_gain_stot/>
			<rcpay_amt_stot/>
			<bhbijanamt/>
			<bhshggbcdnm/>
			<insr_nm/>
			<bhwhncdnm/>
			<frcr_amt/>
			<won_amt/>
			<bhcompgbcdnm/>
			<dlco_cd/>
			<bhcompnm/>
			<mtry_dt/>
			<bhmcnm/>
			<dtls_medi_cd/>
			<bhusebuseocdnm/>
			<bhstcdnm/>
			<fisc_aprv_nm/>
			<cctr_slip_occr_dt/>
			<cctr_slip_clsf_cd/>
			<cctr_slip_seq/>
			<prelae_pay_clsf_cd/>
			<frex_cd/>
			<dlco_clsf_cd/>
			<medi_cd/>
			<fisc_aprv_stat/>
			<use_dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 19:57:10 KST 2009 */ %>