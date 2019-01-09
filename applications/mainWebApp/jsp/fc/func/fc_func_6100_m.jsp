<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_6100_MDataSet ds = (FC_FUNC_6100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURDRCR_YGGBCD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_YGGBCD", "");

		for(int i = 0; i < ds.curdrcr_yggbcd.size(); i++) {
			FC_FUNC_6100_MCURDRCR_YGGBCDRecord rec = (FC_FUNC_6100_MCURDRCR_YGGBCDRecord)ds.curdrcr_yggbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_yggbcd.size());
		/****** CURDRCR_YGGBCD END */

		/****** CURDRCR_COMPGBCD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_COMPGBCD", "");

		for(int i = 0; i < ds.curdrcr_compgbcd.size(); i++) {
			FC_FUNC_6100_MCURDRCR_COMPGBCDRecord rec = (FC_FUNC_6100_MCURDRCR_COMPGBCDRecord)ds.curdrcr_compgbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_compgbcd.size());
		/****** CURDRCR_COMPGBCD END */

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
	<CURDRCR_YGGBCD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_YGGBCD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_COMPGBCD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_COMPGBCD>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 19:02:50 KST 2009 */ %>