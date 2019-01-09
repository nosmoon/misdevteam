<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_2400_MDataSet ds = (HD_EVLU_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
	
		int valid_evlu_cd = rx.add(dataSet, "valid_evlu_cd", ds.valid_evlu_cd);
	
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");


		int item = rx.add(recordSet, "item", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_2400_MCURLIST2Record rec = (HD_EVLU_2400_MCURLIST2Record)ds.curlist2.get(i);
			item = rx.add(recordSet, "item", "");
			rx.add(item, "cd", rec.cd);
			rx.add(item, "cdnm", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");
		
		
		item = rx.add(recordSet, "item", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			item = rx.add(recordSet, "item", "");
			HD_EVLU_2400_MCURLIST1Record rec = (HD_EVLU_2400_MCURLIST1Record)ds.curlist1.get(i);
			rx.add(item, "evlu_cd", rec.evlu_cd);
			rx.add(item, "evlu_cdnm", rec.evlu_cdnm);
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
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 01 10:14:30 KST 2009 */ %>