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
	FC_FUNC_1420_MDataSet ds = (FC_FUNC_1420_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** NOTE_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "NOTE_CLSF_CD", "");

		for(int i = 0; i < ds.note_clsf_cd.size(); i++) {
			FC_FUNC_1420_MNOTE_CLSF_CDRecord rec = (FC_FUNC_1420_MNOTE_CLSF_CDRecord)ds.note_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.note_clsf_cd.size());
		/****** NOTE_CLSF_CD END */

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
	<NOTE_CLSF_CD>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</NOTE_CLSF_CD>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 13 17:30:24 KST 2009 */ %>