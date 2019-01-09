<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.smtb.rec.*
	,	chosun.ciis.co.smtb.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SMTB_1060_LDataSet ds = (CO_SMTB_1060_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CERT_STMTLIST BEGIN */
		recordSet = rx.add(dataSet, "CERT_STMTLIST", "");

		for(int i = 0; i < ds.cert_stmtlist.size(); i++) {
			CO_SMTB_1060_LCERT_STMTLISTRecord rec = (CO_SMTB_1060_LCERT_STMTLISTRecord)ds.cert_stmtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cert_regno", rec.cert_regno);
			rx.add(record, "cert_comname", rec.cert_comname);
			rx.add(record, "userdn", rec.userdn);
			rx.add(record, "userinfo", rec.userinfo);
			rx.add(record, "userinfoYn", ""); //rec.userinfoYn);
			rx.add(record, "expiration_dt", rec.expiration_dt);
			//rx.add(record, "cert_regno", StringUtil.replaceToXml(rec.cert_regno));
			//rx.add(record, "cert_comname", StringUtil.replaceToXml(rec.cert_comname));
			//rx.add(record, "userdn", StringUtil.replaceToXml(rec.userdn));
			//rx.add(record, "userinfo", StringUtil.replaceToXml(rec.userinfo));
			//rx.add(record, "expiration_dt", StringUtil.replaceToXml(rec.expiration_dt));
		}
		rx.add(recordSet, "totalcnt", ds.cert_stmtlist.size());
		/****** CERT_STMTLIST END */

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
<co_smtb_1060_l>
	<dataSet>
		<CERT_STMTLIST>
			<record>
				<cert_regno/>
				<cert_comname/>
				<userdn/>
				<userinfo/>
				<expiration_dt/>
			</record>
		</CERT_STMTLIST>
	</dataSet>
</co_smtb_1060_l>
*/
%>

<% /* 작성시간 : Tue May 17 11:15:59 KST 2011 */ %>