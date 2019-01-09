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
	FC_FUNC_4012_LDataSet ds = (FC_FUNC_4012_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_4012_LCURLISTRecord rec = (FC_FUNC_4012_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "recp_dt", rec.recp_dt);
			rx.add(record, "bgn_no", rec.bgn_no);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "now_note_stat_dt", rec.now_note_stat_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "patr_budg_cd", rec.patr_budg_cd);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "setoff_yn", rec.setoff_yn);
			rx.add(record, "curacct_clsf_cd", rec.curacct_clsf_cd);
			rx.add(record, "issu_clsf_cd", rec.issu_clsf_cd);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "clsf_nm", rec.clsf_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
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
			<recp_dt/>
			<bgn_no/>
			<comp_dt/>
			<mtry_dt/>
			<now_note_stat_cd/>
			<now_note_stat_dt/>
			<note_amt/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<bank_cd/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_no/>
			<slip_sub_seq/>
			<slip_arow_no/>
			<patr_budg_cd/>
			<rmks1/>
			<rmks2/>
			<setoff_yn/>
			<curacct_clsf_cd/>
			<issu_clsf_cd/>
			<incm_tax/>
			<res_tax/>
			<incmg_dt_tm/>
			<incmg_pers/>
			<incmg_pers_ipadd/>
			<bank_nm/>
			<clsf_nm/>
			<dlco_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 09 12:06:34 KST 2009 */ %>