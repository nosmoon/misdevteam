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
	FC_ACCT_2026_LDataSet ds = (FC_ACCT_2026_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2026_LCURLISTRecord rec = (FC_ACCT_2026_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "setl_bank", rec.setl_bank);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "rcpm_main_nm", rec.rcpm_main_nm);
			//rx.add(record, "setl_bank", StringUtil.replaceToXml(rec.setl_bank));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "rcpm_main_nm", StringUtil.replaceToXml(rec.rcpm_main_nm));
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
<fc_acct_2026_l>
	<dataSet>
		<CURLIST>
			<record>
				<setl_bank/>
				<acct_no/>
				<rcpm_main_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2026_l>
*/
%>

<% /* 작성시간 : Fri May 08 15:02:10 KST 2009 */ %>