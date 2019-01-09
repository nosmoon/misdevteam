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
	MT_ETCBOOK_1101_LDataSet ds = (MT_ETCBOOK_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int resSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
        
        dataSet = rx.add(resSet, "gridData", "");
System.out.println("ds.curlist.size() =>"+ds.curlist.size());		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCBOOK_1101_LCURLISTRecord rec = (MT_ETCBOOK_1101_LCURLISTRecord)ds.curlist.get(i);
			
            int record = rx.add(dataSet, "record", "");
			rx.add(record, "book_cd", rec.book_cd);
			rx.add(record, "book_nm", rec.book_nm);
            
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<book_cd/>
			<book_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 15:09:49 KST 2009 */ %>