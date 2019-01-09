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
	MT_ETCPC_4201_MDataSet ds = (MT_ETCPC_4201_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "make_cmpy", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_ETCPC_4201_MCURLIST3Record rec = (MT_ETCPC_4201_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.make_cmpy);
			rx.add(record, "value", rec.make_cmpy);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "swnm", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCPC_4201_MCURLIST2Record rec = (MT_ETCPC_4201_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.swnm);
			rx.add(record, "value", rec.swnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_4201_MCURLIST1Record rec = (MT_ETCPC_4201_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "swmang_no", rec.swmang_no);
			rx.add(record, "use_usag", rec.use_usag);
			rx.add(record, "swlics_cnt", rec.swlics_cnt);
			rx.add(record, "swnm", rec.swnm);
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
	<CURLIST3>
		<record>
			<make_cmpy/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<swnm/>
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
			<swmang_no/>
			<use_usag/>
			<swlics_cnt/>
			<swnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 10:22:44 KST 2009 */ %>