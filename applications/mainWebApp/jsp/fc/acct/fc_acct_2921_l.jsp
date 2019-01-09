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
	FC_ACCT_2921_LDataSet ds = (FC_ACCT_2921_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2921_LCURLISTRecord rec = (FC_ACCT_2921_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "budg_cdnm", rec.budg_cdnm);
			//rx.add(record, "amt", rec.amt);
			//rx.add(record, "duty_dt", rec.duty_dt);
			//rx.add(record, "acct_rmtt_dt", rec.acct_rmtt_dt);
			//rx.add(record, "acct_no", rec.acct_no);
			//rx.add(record, "actu_slip_occr_seqo", rec.actu_slip_occr_seqo);
			//rx.add(record, "aprv_slip_occr_seqo", rec.aprv_slip_occr_seqo);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			rx.add(record, "acct_rmtt_dt", StringUtil.replaceToXml(rec.acct_rmtt_dt));
			rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			rx.add(record, "actu_slip_occr_seqo", StringUtil.replaceToXml(rec.actu_slip_occr_seqo));
			rx.add(record, "aprv_slip_occr_seqo", StringUtil.replaceToXml(rec.aprv_slip_occr_seqo));
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
<fc_acct_2921_l>
	<dataSet>
		<CURLIST>
			<record>
				<dlco_nm/>
				<budg_cdnm/>
				<amt/>
				<duty_dt/>
				<acct_rmtt_dt/>
				<acct_no/>
				<actu_slip_occr_seqo/>
				<aprv_slip_occr_seqo/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2921_l>
*/
%>

<% /* 작성시간 : Thu Jun 11 11:13:36 KST 2009 */ %>