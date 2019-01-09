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
	FC_ACCT_2840_MDataSet ds = (FC_ACCT_2840_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** RCPMCLSFLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPMCLSFLIST", "");

		for(int i = 0; i < ds.rcpmclsflist.size(); i++) {
			FC_ACCT_2840_MRCPMCLSFLISTRecord rec = (FC_ACCT_2840_MRCPMCLSFLISTRecord)ds.rcpmclsflist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.rcpmclsflist.size());
		/****** RCPMCLSFLIST END */

		/****** RCPMSHETCLSFLIST BEGIN */
		recordSet = rx.add(dataSet, "RCPMSHETCLSFLIST", "");

		for(int i = 0; i < ds.rcpmshetclsflist.size(); i++) {
			FC_ACCT_2840_MRCPMSHETCLSFLISTRecord rec = (FC_ACCT_2840_MRCPMSHETCLSFLISTRecord)ds.rcpmshetclsflist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.rcpmshetclsflist.size());
		/****** RCPMSHETCLSFLIST END */

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
	<RCPMCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</RCPMCLSFLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<RCPMSHETCLSFLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</RCPMSHETCLSFLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 20:38:33 KST 2009 */ %>