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
	HD_EVLU_1803_LDataSet ds = (HD_EVLU_1803_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_1803_LCURLISTRecord rec = (HD_EVLU_1803_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "evlu_part_nm", rec.evlu_part_nm);
			rx.add(record, "evlu_indx_nm", rec.evlu_indx_nm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
			rx.add(record, "db_status", rec.db_status);
			rx.add(record, "evlu_part_cd", rec.evlu_part_cd);
			rx.add(record, "evlu_indx_cd", rec.evlu_indx_cd);
			rx.add(record, "act_indx_cd", rec.act_indx_cd);
			rx.add(record, "gub_note", rec.gub_note);
			
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
			<sel_chk/>
			<evlu_part_nm/>
			<evlu_indx_nm/>
			<act_indx_def/>
			<db_status/>
			<evlu_part_cd/>
			<evlu_indx_cd/>
			<act_indx_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 18 20:02:43 KST 2009 */ %>