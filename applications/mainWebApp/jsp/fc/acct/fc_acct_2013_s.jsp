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
	FC_ACCT_2013_SDataSet ds = (FC_ACCT_2013_SDataSet)request.getAttribute("ds");
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
			FC_ACCT_2013_SCURLISTRecord rec = (FC_ACCT_2013_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "clsf_yn", rec.clsf_yn);
			//rx.add(record, "draft_expn_amt", rec.draft_expn_amt);
			//rx.add(record, "draft_impt_amt", rec.draft_impt_amt);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "clsf_yn", StringUtil.replaceToXml(rec.clsf_yn));
			rx.add(record, "draft_expn_amt", StringUtil.replaceToXml(rec.draft_expn_amt));
			rx.add(record, "draft_impt_amt", StringUtil.replaceToXml(rec.draft_impt_amt));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
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
<fc_acct_2013_s>
	<dataSet>
		<CURLIST>
			<record>
				<clsf_yn/>
				<draft_expn_amt/>
				<draft_impt_amt/>
				<dr_amt/>
				<crdt_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2013_s>
*/
%>

<% /* 작성시간 : Thu Jul 09 11:18:34 KST 2009 */ %>