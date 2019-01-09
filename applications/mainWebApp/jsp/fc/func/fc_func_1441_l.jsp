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
	FC_FUNC_1441_LDataSet ds = (FC_FUNC_1441_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1441_LCURLISTRecord rec = (FC_FUNC_1441_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "pay_plac_cd", rec.pay_plac_cd);
			rx.add(record, "now_note_stat_cd_nm", rec.now_note_stat_cd_nm);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "dlco_clsf_cd_nm", rec.dlco_clsf_cd_nm);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			rx.add(record, "cymd", rec.cymd);
			rx.add(record, "total", rec.total);
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
			<pay_plac_cd/>
			<now_note_stat_cd_nm/>
			<note_no/>
			<mtry_dt/>
			<note_amt/>
			<dlco_clsf_cd_nm/>
			<issu_pers_nm/>
			<bank_cd_nm/>
			<note_clsf_cd_nm/>
			<cymd/>
			<total/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 16:18:38 KST 2009 */ %>