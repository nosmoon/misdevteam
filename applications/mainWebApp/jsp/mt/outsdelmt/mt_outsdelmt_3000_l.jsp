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
	MT_OUTSDELMT_3000_LDataSet ds = (MT_OUTSDELMT_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData_main", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_OUTSDELMT_3000_LCURLISTRecord rec = (MT_OUTSDELMT_3000_LCURLISTRecord)ds.curlist.get(i);
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
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<outsd_elmt_aply_clsf/>
			<aply_dt/>
			<aply_yymm/>
			<matr_uprc/>
			<fix_item_clsf/>
			<fix_item_cost/>
			<fix_item_ratio/>
			<marjn_clsf/>
			<marjn_ratio/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun May 03 16:32:18 KST 2009 */ %>