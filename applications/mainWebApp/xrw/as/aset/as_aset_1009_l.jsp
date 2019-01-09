<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	" 
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1009_LDataSet ds = (AS_ASET_1009_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_ASET_1009_LCURLISTRecord rec = (AS_ASET_1009_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "item_cd", rec.item_cd);
			rx.add(record, "item_nm", rec.item_nm);
			rx.add(record, "unit_cd", rec.unit_cd);
			rx.add(record, "unit_nm", rec.unit_nm);
			rx.add(record, "redm_clsf", rec.redm_clsf);
			rx.add(record, "redm_nm", rec.redm_nm);
			rx.add(record, "redm_mthd_cd", rec.redm_mthd_cd);
			rx.add(record, "redm_mthd_nm", rec.redm_mthd_nm);
			rx.add(record, "svc_yys_cnt", rec.svc_yys_cnt);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
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
			<item_cd/>
			<item_nm/>
			<unit_cd/>
			<unit_nm/>
			<redm_clsf/>
			<redm_nm/>
			<redm_mthd_cd/>
			<redm_mthd_nm/>
			<svc_yys_cnt/>
			<budg_cd/>
			<budg_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 17:55:32 KST 2009 */ %>