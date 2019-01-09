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
	MT_PRNPAP_3200_LDataSet ds = (MT_PRNPAP_3200_LDataSet)request.getAttribute("ds");
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
			MT_PRNPAP_3200_LCURLISTRecord rec = (MT_PRNPAP_3200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "paper_loca_clsf", rec.paper_loca_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "a_qunt_cnt", rec.a_rem_qunt_cnt);
			rx.add(record, "a_qunt_wgt", rec.a_rem_qunt_wgt);
			rx.add(record, "a_un_use_roll_cnt", rec.a_un_use_roll_cnt);
			rx.add(record, "a_roll_wgt", rec.a_roll_wgt);
			rx.add(record, "b_qunt_cnt", rec.b_rem_qunt_cnt);
			rx.add(record, "b_qunt_wgt", rec.b_rem_qunt_wgt);
			rx.add(record, "b_un_use_roll_cnt", rec.b_un_use_roll_cnt);
			rx.add(record, "b_roll_wgt", rec.b_roll_wgt);
			rx.add(record, "c_qunt_cnt", rec.c_rem_qunt_cnt);
			rx.add(record, "c_qunt_wgt", rec.c_rem_qunt_wgt);
			rx.add(record, "c_un_use_roll_cnt", rec.c_un_use_roll_cnt);
			rx.add(record, "c_roll_wgt", rec.c_roll_wgt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "issu_dt", rec.issu_dt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "roll_wgt", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3200_LCURLIST1Record rec = (MT_PRNPAP_3200_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "paper_clsf_cd", rec.paper_clsf_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "roll_wgt", rec.roll_wgt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
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
			<fac_clsf/>
			<paper_loca_clsf/>
			<papcmpy_cd/>
			<a_rem_qunt_cnt/>
			<a_rem_qunt_wgt/>
			<b_rem_qunt_cnt/>
			<b_rem_qunt_wgt/>
			<c_rem_qunt_cnt/>
			<c_rem_qunt_wgt/>
			<occr_dt/>
			<seq/>
			<issu_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 23 14:44:30 KST 2009 */ %>