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
	MT_ETCPC_1100_LDataSet ds = (MT_ETCPC_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int resSet = 0;
    int rowCnt = 1;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	resSet = rx.add(root, "resData", "");
    
	try {
		/****** COMMCDCUR1 BEGIN */
		dataSet = rx.add(resSet, "gridData", "");

		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			MT_ETCPC_1100_LCOMMCDCUR1Record rec = (MT_ETCPC_1100_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "rowCnt", rowCnt);
			rx.add(record, "modl_mang_no", rec.modl_mang_no);
			rx.add(record, "modl_nm", rec.modl_nm);
			rx.add(record, "modl_kind_a", rec.modl_kind_a.substring(0,1));
			rx.add(record, "modl_kind_nm", rec.modl_kind_nm);
			rx.add(record, "modl_kind", rec.modl_kind);
			rowCnt++;
		}
		rx.add(recordSet, "totalcnt", ds.commcdcur1.size());
		/****** COMMCDCUR1 END */

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
	<COMMCDCUR1>
		<record>
			<modl_mang_no/>
			<modl_nm/>
			<modl_kind_a/>
			<modl_kind_nm/>
			<modl_kind/>
		</record>
	</COMMCDCUR1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 08:55:48 KST 2009 */ %>