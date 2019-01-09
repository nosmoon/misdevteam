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
	FC_ACCT_1049_LDataSet ds = (FC_ACCT_1049_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1049_LCURLISTRecord rec = (FC_ACCT_1049_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "acct_subj_nm", rec.acct_subj_nm);
			//rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			rx.add(record, "acct_subj_nm", StringUtil.replaceToXml(rec.acct_subj_nm));
			rx.add(record, "insd_acct_cd", StringUtil.replaceToXml(rec.insd_acct_cd));
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
<fc_acct_1049_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<acct_cd/>
				<acct_subj_nm/>
				<insd_acct_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1049_l>
*/
%>

<% /* 작성시간 : Wed Jul 29 18:25:44 KST 2009 */ %>