<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcpc.rec.*
	,	chosun.ciis.mt.etcpc.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCPC_2002_MDataSet ds = (MT_ETCPC_2002_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "modl_kindNM", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_2002_MCURLIST1Record rec = (MT_ETCPC_2002_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.modl_mang_no);
			rx.add(record, "label", rec.modl_mang_no+" "+rec.modl_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<modl_mang_no/>
			<modl_nm/>
			<modl_kind/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 13:09:49 KST 2009 */ %>