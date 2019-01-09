<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrin.rec.*
	,	chosun.ciis.mt.submatrin.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRIN_1118_LDataSet ds = (MT_SUBMATRIN_1118_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRIN_1118_LCURLISTRecord rec = (MT_SUBMATRIN_1118_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yy", rec.yy);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "smleasegb", rec.smleasegb);
			rx.add(record, "case_nm", rec.case_nm);
			rx.add(record, "impt_resn", rec.impt_resn);
			rx.add(record, "offer_pric", rec.offer_pric);
			rx.add(record, "offer_pric_curc_clsf", rec.offer_pric_curc_clsf);
			rx.add(record, "ship_pers", rec.ship_pers);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "ship_widr", rec.ship_widr);
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
			<yy/>
			<seq/>
			<smleasegb/>
			<case_nm/>
			<impt_resn/>
			<offer_pric/>
			<offer_pric_curc_clsf/>
			<ship_pers/>
			<use_dept_nm/>
			<ship_widr/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 01 13:51:15 KST 2009 */ %>