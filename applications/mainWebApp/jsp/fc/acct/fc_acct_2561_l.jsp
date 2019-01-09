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
	FC_ACCT_2561_LDataSet ds = (FC_ACCT_2561_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2561_LCURLIST1Record rec = (FC_ACCT_2561_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "impt_expn_clsf_nm", rec.impt_expn_clsf_nm);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_nm", rec.budg_nm);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "sort_no", rec.sort_no);
			rx.add(record, "impt_expn_clsf_nm", StringUtil.replaceToXml(rec.impt_expn_clsf_nm));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.addCData(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.addCData(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "sort_no", StringUtil.replaceToXml(rec.sort_no));
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
<fc_acct_2561_l>
	<dataSet>
		<CURLIST1>
			<record>
				<impt_expn_clsf_nm/>
				<budg_cd/>
				<budg_nm/>
				<fisc_dt/>
				<dr_amt/>
				<crdt_amt/>
				<rmks2/>
				<sort_no/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2561_l>
*/
%>

<% /* 작성시간 : Tue Apr 21 13:26:23 KST 2009 */ %>