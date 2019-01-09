<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1702_LDataSet ds = (AS_ASET_1702_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1702_LCURLISTRecord rec = (AS_ASET_1702_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			rx.add(record, "actu_slip", rec.actu_slip);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "misu_remk", rec.misu_remk);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "ref_occr_dt", rec.ref_occr_dt);
			rx.add(record, "ref_occr_seq", rec.ref_occr_seq);
			rx.add(record, "actu_slip_dt", rec.actu_slip_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "dlco_ern", rec.dlco_ern);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
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
			<rcpm_dt/>
			<remk/>
			<rcpm_tot_amt/>
			<actu_slip/>
			<rcpm_shet_no/>
			<chg_dt/>
			<dlco_nm/>
			<misu_amt/>
			<misu_remk/>
			<occr_dt/>
			<occr_seq/>
			<ref_occr_dt/>
			<ref_occr_seq/>
			<actu_slip_dt/>
			<slip_clsf_cd/>
			<actu_slip_no/>
			<dlco_ern/>
			<dlco_clsf_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 20:33:45 KST 2009 */ %>