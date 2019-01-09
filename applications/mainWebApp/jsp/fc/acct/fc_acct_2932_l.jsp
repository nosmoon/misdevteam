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
	FC_ACCT_2932_LDataSet ds = (FC_ACCT_2932_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2932_LCURLISTRecord rec = (FC_ACCT_2932_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk", rec.chk);
			rx.add(record, "aprv_slip_occr_dt", rec.aprv_slip_occr_dt);
			rx.add(record, "aprv_slip_clsf", rec.aprv_slip_clsf);
			rx.add(record, "aprv_slip_occr_seqo", rec.aprv_slip_occr_seqo);
			rx.add(record, "aprv_slip_occr_sub_seq", rec.aprv_slip_occr_sub_seq);
			rx.addCData(record, "pch_budg_cdnm", rec.pch_budg_cdnm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "pch_count", rec.pch_count);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "rmtt_dwload_dt", rec.rmtt_dwload_dt);
			rx.add(record, "aprv_slip_no", rec.aprv_slip_no);
			//rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			//rx.add(record, "aprv_slip_occr_dt", StringUtil.replaceToXml(rec.aprv_slip_occr_dt));
			//rx.add(record, "aprv_slip_clsf", StringUtil.replaceToXml(rec.aprv_slip_clsf));
			//rx.add(record, "aprv_slip_occr_seqo", StringUtil.replaceToXml(rec.aprv_slip_occr_seqo));
			//rx.add(record, "aprv_slip_occr_sub_seq", StringUtil.replaceToXml(rec.aprv_slip_occr_sub_seq));
			//rx.add(record, "pch_budg_cdnm", StringUtil.replaceToXml(rec.pch_budg_cdnm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "pch_count", StringUtil.replaceToXml(rec.pch_count));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "rmtt_dwload_dt", StringUtil.replaceToXml(rec.rmtt_dwload_dt));
			//rx.add(record, "aprv_slip_no", StringUtil.replaceToXml(rec.aprv_slip_no));
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
<fc_acct_2932_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<aprv_slip_occr_dt/>
				<aprv_slip_clsf/>
				<aprv_slip_occr_seqo/>
				<aprv_slip_occr_sub_seq/>
				<pch_budg_cdnm/>
				<budg_cd/>
				<pch_count/>
				<amt/>
				<rmtt_dwload_dt/>
				<aprv_slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2932_l>
*/
%>

<% /* 작성시간 : Fri Apr 24 13:50:37 KST 2009 */ %>