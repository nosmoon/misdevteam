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
	HD_EVLU_2900_MDataSet ds = (HD_EVLU_2900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cd_010",ds.getXx_cd_010());
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_2900_MCURLIST2Record rec = (HD_EVLU_2900_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "evlu_grad_cd", rec.evlu_grad_cd);
			rx.add(record, "evlu_grad_nm", rec.evlu_grad_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EVLU_2900_MCURLIST1Record rec = (HD_EVLU_2900_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "evlu_stat_cd", rec.evlu_stat_cd);
			rx.add(record, "evlu_stat_nm", rec.evlu_stat_nm);
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
			<evlu_grad_cd/>
			<evlu_grad_nm/>
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
			<evlu_stat_cd/>
			<evlu_stat_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 11:11:21 KST 2009 */ %>