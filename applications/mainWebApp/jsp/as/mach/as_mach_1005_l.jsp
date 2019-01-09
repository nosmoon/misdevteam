<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.mach.rec.*
	,	chosun.ciis.as.mach.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_MACH_1005_LDataSet ds = (AS_MACH_1005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURWORK BEGIN */
		recordSet = rx.add(dataSet, "curmach", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_MACH_1005_LCURLISTRecord rec = (AS_MACH_1005_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdabrvnm_cd", rec.cdnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURWORK END */

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
<as_mach_1005_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST>
	</dataSet>
</as_mach_1005_l>
*/
%>

<% /* 작성시간 : Tue Jul 14 14:07:50 KST 2015 */ %>