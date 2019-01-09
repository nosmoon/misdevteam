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
	MT_OUTSDELMT_3001_LDataSet ds = (MT_OUTSDELMT_3001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData_sub", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_OUTSDELMT_3001_LCURLISTRecord rec = (MT_OUTSDELMT_3001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "outsd_elmt_clsf", rec.outsd_elmt_clsf);
			rx.add(record, "outsd_elmt_clsf_nm", rec.outsd_elmt_clsf_nm);
			rx.add(record, "outsd_elmt_cd", rec.outsd_elmt_cd);
			rx.add(record, "outsd_elmt_cd_nm", rec.outsd_elmt_cd_nm);
			rx.add(record, "outsd_elmt_amt", rec.outsd_elmt_amt);
			rx.add(record, "cmps_cost", rec.cmps_cost);
			rx.add(record, "cmps_ratio", rec.cmps_ratio);
			rx.add(record, "cmps_calc", rec.cmps_calc);
			rx.add(record, "chg_ratio_yn", rec.chg_ratio_yn);
			rx.add(record, "chg_cost", rec.chg_cost);
			rx.add(record, "chg_ratio", rec.chg_ratio);
		}
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
			<sub_seq/>
			<outsd_elmt_cd/>
			<aply_clsf/>
			<aply_cost/>
			<aply_ratio/>
			<chg_clsf/>
			<chg_cost/>
			<chg_ratio/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun May 03 16:47:22 KST 2009 */ %>