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
	FC_FUNC_1031_LDataSet ds = (FC_FUNC_1031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** RCPMSHETLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPMSHETLIST", "");

		for(int i = 0; i < ds.rcpmshetlist.size(); i++) {
			FC_FUNC_1031_LRCPMSHETLISTRecord rec = (FC_FUNC_1031_LRCPMSHETLISTRecord)ds.rcpmshetlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "pay_plac_cd", rec.pay_plac_cd);
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "now_note_stat_cdnm", rec.now_note_stat_cdnm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "pay_plac_cdnm", rec.pay_plac_cdnm);
			rx.add(record, "note_clsf_cdnm", rec.note_clsf_cdnm);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);			
			rx.add(record, "tmp_note_no", rec.note_no + "-" + rec.bank_cd + "-" + rec.note_seq);
			rx.add(record, "tmp_slip_no", rec.slip_occr_dt + "-" + rec.slip_clsf_cd + "-" + rec.slip_seq);			
		}
		rx.add(recordSet, "totalcnt", ds.rcpmshetlist.size());
		/****** RCPMSHETLIST END */

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
	<RCPMSHETLIST>
		<record>
			<note_clsf_cd/>
			<bank_cd/>
			<note_no/>
			<note_seq/>
			<mtry_dt/>
			<note_amt/>
			<issu_pers_nm/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<pay_plac_cd/>
			<now_note_stat_cd/>
			<now_note_stat_cdnm/>
			<compnm/>
			<pay_plac_cdnm/>
			<note_clsf_cdnm/>
			<coms/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
		</record>
	</RCPMSHETLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 24 11:52:01 KST 2009 */ %>