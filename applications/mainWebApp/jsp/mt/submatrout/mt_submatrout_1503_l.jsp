<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1503_LDataSet ds = (MT_SUBMATROUT_1503_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData31", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1503_LCURLISTRecord rec = (MT_SUBMATROUT_1503_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ink_clsf", rec.ink_clsf);
			rx.add(record, "ink_clsf_nm", rec.ink_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "bgn_gage", rec.bgn_gage);
			rx.add(record, "end_gage", rec.end_gage);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
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
<mt_submatrout_1503_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<ink_clsf/>
				<ink_clsf_nm/>
				<medi_cd/>
				<sect_cd/>
				<medi_nm/>
				<sect_nm/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrout_1503_l>
*/
%>

<% /* 작성시간 : Tue Sep 15 03:18:13 KST 2009 */ %>