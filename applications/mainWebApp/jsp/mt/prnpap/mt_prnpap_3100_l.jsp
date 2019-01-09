<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3100_LDataSet ds = (MT_PRNPAP_3100_LDataSet)request.getAttribute("ds");
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
			MT_PRNPAP_3100_LCURLISTRecord rec = (MT_PRNPAP_3100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "paper_cmpy", rec.paper_cmpy);
			rx.add(record, "paper_cmpy_nm", rec.paper_cmpy_nm);
			rx.add(record, "paper_clsf_cd", rec.paper_clsf_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "roll_cnt", rec.roll_cnt);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "roll_wgt", rec.roll_wgt);
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
			<issu_dt/>
			<fac_clsf/>
			<paper_cmpy/>
			<paper_clsf_cd/>
			<matr_cd/>
			<roll_cnt/>
			<wgt/>
			<roll_wgt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 23 11:46:22 KST 2009 */ %>