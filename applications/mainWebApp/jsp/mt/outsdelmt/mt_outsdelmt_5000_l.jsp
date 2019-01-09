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
	MT_OUTSDELMT_5000_LDataSet ds = (MT_OUTSDELMT_5000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		formData = rx.add(recordSet, "outsd_elmt_ptcr", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_OUTSDELMT_5000_LCURLIST1Record rec = (MT_OUTSDELMT_5000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "value", rec.sub_seq);
			rx.add(record, "outsd_elmt_clsf", rec.outsd_elmt_clsf);
			rx.add(record, "outsd_elmt_clsf_nm", rec.outsd_elmt_clsf_nm);
			rx.add(record, "outsd_elmt_cd", rec.outsd_elmt_cd);
			rx.add(record, "label", rec.outsd_elmt_cd_nm);
			rx.add(record, "outsd_elmt_amt", rec.outsd_elmt_amt);
			rx.add(record, "cmps_cost", rec.cmps_cost);
			rx.add(record, "cmps_ratio", rec.cmps_ratio);
			rx.add(record, "cmps_calc", rec.cmps_calc);
			rx.add(record, "chg_ratio_yn", rec.chg_ratio_yn);
			rx.add(record, "chg_cost", rec.chg_cost);
			rx.add(record, "chg_ratio", rec.chg_ratio);
		}
		
		formData = rx.add(recordSet, "outsd_elmt_matr", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_OUTSDELMT_5000_LCURLIST2Record rec = (MT_OUTSDELMT_5000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "outsd_elmt_aply_clsf", rec.outsd_elmt_aply_clsf);
			rx.add(record, "outsd_elmt_aply_nm", rec.outsd_elmt_aply_nm);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "matr_uprc", rec.matr_uprc);
			rx.add(record, "ratio_yn", rec.ratio_yn);
			rx.add(record, "ratio_nm", rec.ratio_nm);
			rx.add(record, "fix_val", rec.fix_val);
			rx.add(record, "fix_item_cost", rec.fix_item_cost);
			rx.add(record, "fix_item_ratio", rec.fix_item_ratio);
			rx.add(record, "marjn_val", rec.marjn_val);
			rx.add(record, "marjn_cost", rec.marjn_cost);
			rx.add(record, "marjn_ratio", rec.marjn_ratio);
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