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
	FC_FUNC_6150_MDataSet ds = (FC_FUNC_6150_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURDRCR_YJGGBCD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_YJGGBCD", "");

		for(int i = 0; i < ds.curdrcr_yjggbcd.size(); i++) {
			FC_FUNC_6150_MCURDRCR_YJGGBCDRecord rec = (FC_FUNC_6150_MCURDRCR_YJGGBCDRecord)ds.curdrcr_yjggbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_yjggbcd.size());
		/****** CURDRCR_YJGGBCD END */

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
	<CURDRCR_YJGGBCD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURDRCR_YJGGBCD>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 09:17:28 KST 2009 */ %>