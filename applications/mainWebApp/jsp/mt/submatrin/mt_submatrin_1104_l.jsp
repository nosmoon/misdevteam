<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1104_LDataSet ds = (MT_SUBMATRIN_1104_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "mediCnt", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATRIN_1104_LCURLIST2Record rec = (MT_SUBMATRIN_1104_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "cnt", rec.cnt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRIN_1104_LCURLISTRecord rec = (MT_SUBMATRIN_1104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			rx.add(record, "ewh_uprc", rec.purc_uprc);
			rx.add(record, "ewh_unit", rec.unit);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
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
	<CURLIST2>
		<record>
			<cnt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<matr_cd/>
			<matr_nm/>
			<purc_uprc/>
			<unit/>
			<ewh_budg_cd/>
			<owh_budg_cd/>
			<dstb_rat_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 10:23:16 KST 2009 */ %>