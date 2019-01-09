<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_2001_LDataSet ds = (MT_SUBMATROUT_2001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData_main", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_2001_LCURLISTRecord rec = (MT_SUBMATROUT_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "mov_inout_dt", rec.mov_inout_dt);
			rx.add(record, "mov_in_fac_cd", rec.mov_in_fac_cd);
			rx.add(record, "mov_out_fac_cd", rec.mov_out_fac_cd);
			rx.add(record, "mov_out_deptcd", rec.mov_out_deptcd);
			rx.add(record, "mov_in_deptcd", rec.mov_in_deptcd);
			rx.add(record, "state", rec.state);
			rx.add(record, "state_nm", rec.state_nm);
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<mov_inout_dt/>
			<mov_in_fac_cd/>
			<mov_out_fac_cd/>
			<mov_out_deptcd/>
			<state/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 30 14:22:06 KST 2009 */ %>