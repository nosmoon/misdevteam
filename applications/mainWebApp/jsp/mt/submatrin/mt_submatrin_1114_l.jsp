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
	MT_SUBMATRIN_1114_LDataSet ds = (MT_SUBMATRIN_1114_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATRIN_1114_LCURLISTRecord rec = (MT_SUBMATRIN_1114_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "ewh_no", rec.ewh_no);
			rx.add(record, "purc_clsf", rec.purc_clsf);
			rx.addCData(record, "ewh_title", rec.ewh_title);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "clos_proc_dt", rec.clos_proc_dt);
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
			<ewh_dt/>
			<purc_clsf/>
			<fac_clsf_nm/>
			<inpt_yy/>
			<impt_seq/>
			<leas_clsf/>
			<clos_proc_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 02 09:21:15 KST 2009 */ %>