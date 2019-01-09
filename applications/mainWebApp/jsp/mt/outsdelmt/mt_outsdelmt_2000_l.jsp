<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.outsdelmt.rec.*
	,	chosun.ciis.mt.outsdelmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_OUTSDELMT_2000_LDataSet ds = (MT_OUTSDELMT_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_OUTSDELMT_2000_LCURLISTRecord rec = (MT_OUTSDELMT_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "outsd_elmt_clsf", rec.outsd_elmt_clsf);
			rx.add(record, "outsd_elmt_cd", rec.outsd_elmt_cd);
			rx.add(record, "outsd_elmt_nm", rec.outsd_elmt_nm);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "avg_amt", rec.avg_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
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
			<occr_dt/>
			<seq/>
			<aply_dt/>
			<outsd_elmt_clsf/>
			<outsd_elmt_cd/>
			<unit/>
			<amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 30 20:25:17 KST 2009 */ %>