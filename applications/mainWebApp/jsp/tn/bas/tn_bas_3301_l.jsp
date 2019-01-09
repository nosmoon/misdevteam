<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.bas.rec.*
	,	chosun.ciis.tn.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_BAS_3301_LDataSet ds = (TN_BAS_3301_LDataSet)request.getAttribute("ds");
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
			TN_BAS_3301_LCURLISTRecord rec = (TN_BAS_3301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bankaccountcode", rec.bankaccountcode);
			rx.add(record, "bankcode", rec.bankcode);
			rx.add(record, "bank", rec.bank);
			rx.add(record, "branch", rec.branch);
			rx.add(record, "bankaccount", rec.bankaccount);
			rx.add(record, "bankaccountowner", rec.bankaccountowner);
			rx.add(record, "memo", rec.memo);
			rx.add(record, "useinsert", rec.useinsert);
			rx.add(record, "useinsert_nm", rec.useinsert_nm);
			//rx.add(record, "bankaccountcode", StringUtil.replaceToXml(rec.bankaccountcode));
			//rx.add(record, "bankcode", StringUtil.replaceToXml(rec.bankcode));
			//rx.add(record, "bank", StringUtil.replaceToXml(rec.bank));
			//rx.add(record, "branch", StringUtil.replaceToXml(rec.branch));
			//rx.add(record, "bankaccount", StringUtil.replaceToXml(rec.bankaccount));
			//rx.add(record, "bankaccountowner", StringUtil.replaceToXml(rec.bankaccountowner));
			//rx.add(record, "memo", StringUtil.replaceToXml(rec.memo));
			//rx.add(record, "useinsert", StringUtil.replaceToXml(rec.useinsert));
			//rx.add(record, "useinsert_nm", StringUtil.replaceToXml(rec.useinsert_nm));
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
<tn_bas_3301_l>
	<dataSet>
		<CURLIST>
			<record>
				<bankaccountcode/>
				<bankcode/>
				<bank/>
				<branch/>
				<bankaccount/>
				<bankaccountowner/>
				<memo/>
				<useinsert/>
				<useinsert_nm/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_3301_l>
*/
%>

<% /* 작성시간 : Fri Jun 17 10:23:32 KST 2016 */ %>