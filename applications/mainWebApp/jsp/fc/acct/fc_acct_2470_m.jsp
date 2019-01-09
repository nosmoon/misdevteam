<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2470_MDataSet ds = (FC_ACCT_2470_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** SLIP_CLSF_CD2 BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_CD2", "");

		for(int i = 0; i < ds.slip_clsf_cd2.size(); i++) {
			FC_ACCT_2470_MSLIP_CLSF_CD2Record rec = (FC_ACCT_2470_MSLIP_CLSF_CD2Record)ds.slip_clsf_cd2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.slip_clsf_cd2.size());
		/****** SLIP_CLSF_CD2 END */

		/****** SLIP_CLSF_CD1 BEGIN */
		recordSet = rx.add(dataSet, "SLIP_CLSF_CD1", "");

		for(int i = 0; i < ds.slip_clsf_cd1.size(); i++) {
			FC_ACCT_2470_MSLIP_CLSF_CD1Record rec = (FC_ACCT_2470_MSLIP_CLSF_CD1Record)ds.slip_clsf_cd1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.slip_clsf_cd1.size());
		/****** SLIP_CLSF_CD1 END */

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
<dataSet>
	<SLIP_CLSF_CD2>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</SLIP_CLSF_CD2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<SLIP_CLSF_CD1>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</SLIP_CLSF_CD1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 23 19:58:24 KST 2009 */ %>