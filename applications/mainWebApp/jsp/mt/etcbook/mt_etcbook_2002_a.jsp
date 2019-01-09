<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcbook.rec.*
	,	chosun.ciis.mt.etcbook.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCBOOK_2002_ADataSet ds = (MT_ETCBOOK_2002_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			
            MT_ETCBOOK_2002_ACURLIST1Record rec = (MT_ETCBOOK_2002_ACURLIST1Record)ds.curlist1.get(0);
			rx.add(recordSet, "book_cd", rec.book_cd);
            
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
			<book_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 07 19:55:15 KST 2009 */ %>