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
	MT_SUBMATRIN_1120_LDataSet ds = (MT_SUBMATRIN_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	//7805272036727
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "formData", "");
		if( ds.curlist.size() > 0 ) {
			MT_SUBMATRIN_1120_LCURLISTRecord rec = (MT_SUBMATRIN_1120_LCURLISTRecord)ds.curlist.get(0);
			rx.add(recordSet, "cmpy_cd", rec.cmpy_cd);
			rx.add(recordSet, "occr_dt", rec.occr_dt);
			rx.add(recordSet, "seq", rec.seq);
			rx.add(recordSet, "ern", rec.ern);
			rx.add(recordSet, "dlco_cd", rec.dlco_no);
			rx.add(recordSet, "dlco_nm", rec.dlco_nm);
			rx.add(recordSet, "semuro_no", rec.semuro_no);
			rx.add(recordSet, "tot_suply_amt", rec.tot_suply_amt);
			rx.add(recordSet, "tot_amt", rec.tot_amt);
			rx.add(recordSet, "tot_tax_amt", rec.tot_tax_amt);
			rx.add(recordSet, "make_dt", rec.issu_dt);
			rx.add(recordSet, "fac_clsf", rec.fac_clsf);
		}
		
		recordSet = rx.add(dataSet, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRIN_1120_LCURLISTRecord rec = (MT_SUBMATRIN_1120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_seq"     ,    "");
			rx.add(record, "matr_cd"     ,    rec.matr_cd);
			rx.add(record, "matr_nm"     ,    rec.matr_nm);
			rx.add(record, "ewh_qunt"    ,    rec.qunt);
			rx.add(record, "ewh_uprc"    ,    rec.uprc);
			rx.add(record, "ewh_amt"     ,    rec.item_suply_amt);
			rx.add(record, "ewh_vat"     ,    rec.item_tax_amt);
			rx.add(record, "ewh_unit"    ,    rec.unit);
			rx.add(record, "ewh_budg_cd" ,    rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd" ,    rec.owh_budg_cd);
			rx.add(record, "medi_cd"     ,    "");
			rx.add(record, "medi_ser_no" ,    "");
			rx.add(record, "remk"        ,    "");
			rx.add(record, "owh_yn"      ,    "");
			rx.add(record, "usedeptcd"   ,    "");
			rx.add(record, "usedeptnm"   ,    "");
			rx.add(record, "owh_dt"      ,    "");
			rx.add(record, "owh_seq"     ,    "");
			rx.add(record, "owh_sub_seq" ,    "");
			rx.add(record, "owh_no"      ,    "");
			rx.add(record, "mc_flag"     ,    "");
			rx.add(record, "dstb_rat_cd" ,    rec.dstb_rat_cd);
			rx.add(record, "bo_item_yn"  ,    "");

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
			<semuro_no/>
			<tax_stmt_clsf/>
			<ern/>
			<dlco_no/>
			<dlco_nm/>
			<issu_dt/>
			<tot_suply_amt/>
			<tot_amt/>
			<tot_tax_amt/>
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<qunt/>
			<uprc/>
			<item_suply_amt/>
			<item_tax_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jun 03 11:59:10 KST 2009 */ %>