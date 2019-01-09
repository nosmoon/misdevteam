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
	FC_ACCT_3151_LDataSet ds = (FC_ACCT_3151_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_3151_LCURLISTRecord rec = (FC_ACCT_3151_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evnt_cd", rec.evnt_cd);
			rx.add(record, "evnt_nm", rec.evnt_nm);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "bal_amt", rec.bal_amt);
			rx.add(record, "extnc_amt", rec.extnc_amt);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "obj_budg_cd", rec.obj_budg_cd);
			rx.add(record, "slip_no1", rec.slip_no1);
			//rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			//rx.add(record, "evnt_nm", StringUtil.replaceToXml(rec.evnt_nm));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "occr_amt", StringUtil.replaceToXml(rec.occr_amt));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "bal_amt", StringUtil.replaceToXml(rec.bal_amt));
			//rx.add(record, "extnc_amt", StringUtil.replaceToXml(rec.extnc_amt));
			//rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			//rx.add(record, "obj_budg_cd", StringUtil.replaceToXml(rec.obj_budg_cd));
			//rx.add(record, "slip_no1", StringUtil.replaceToXml(rec.slip_no1));
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
<fc_acct_3151_l>
	<dataSet>
		<CURLIST>
			<record>
				<evnt_cd/>
				<evnt_nm/>
				<slip_no/>
				<occr_amt/>
				<rmks/>
				<bal_amt/>
				<extnc_amt/>
				<obj_amt/>
				<obj_budg_cd/>
				<slip_no1/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_3151_l>
*/
%>

<% /* 작성시간 : Fri Oct 28 18:49:37 KST 2011 */ %>