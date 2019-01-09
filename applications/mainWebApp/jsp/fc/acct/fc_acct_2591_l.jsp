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
	FC_ACCT_2591_LDataSet ds = (FC_ACCT_2591_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2591_LCURLISTRecord rec = (FC_ACCT_2591_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_num", rec.acct_num);
			rx.addCData(record, "acct_nm", rec.acct_nm);
			rx.add(record, "mang_num", rec.mang_num);
			rx.addCData(record, "tran_remain", rec.tran_remain);
			rx.add(record, "bef_amt", rec.bef_amt);
			rx.add(record, "cha_amt", rec.cha_amt);
			//rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			//rx.add(record, "acct_nm", StringUtil.replaceToXml(rec.acct_nm));
			//rx.add(record, "mang_num", StringUtil.replaceToXml(rec.mang_num));
			//rx.add(record, "tran_remain", StringUtil.replaceToXml(rec.tran_remain));
			//rx.add(record, "bef_amt", StringUtil.replaceToXml(rec.bef_amt));
			//rx.add(record, "cha_amt", StringUtil.replaceToXml(rec.cha_amt));
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
<fc_acct_2591_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<acct_num/>
				<acct_nm/>
				<mang_num/>
				<tran_remain/>
				<bef_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2591_l>
*/
%>

<% /* 작성시간 : Fri Feb 10 16:22:34 KST 2012 */ %>