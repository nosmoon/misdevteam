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
	MT_PRNPAP_3304_LDataSet ds = (MT_PRNPAP_3304_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "thisPage", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3304_LCURLIST1Record rec = (MT_PRNPAP_3304_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "rot_mach_no", rec.rot_mach_no);
			rx.add(record, "sett_no", rec.sett_no);
			rx.add(record, "sett_seq", rec.sett_seq);
			rx.add(record, "a_cmcnt_val", rec.a_cmcnt_val_cnt);
			rx.add(record, "a_wgt", rec.a_wgt);
			rx.add(record, "a_un_use_yn", rec.a_un_use_yn);
			rx.add(record, "b_cmcnt_val", rec.b_cmcnt_val_cnt);
			rx.add(record, "b_wgt", rec.b_wgt);
			rx.add(record, "b_un_use_yn", rec.b_un_use_yn);
			rx.add(record, "c_cmcnt_val", rec.c_cmcnt_val_cnt);
			rx.add(record, "c_wgt", rec.c_wgt);
			rx.add(record, "c_un_use_yn", rec.c_un_use_yn);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "issu_dt", rec.issu_dt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "mainPage", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3304_LCURLISTRecord rec = (MT_PRNPAP_3304_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowCnt", i + 1 );
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "pap_cmpy", rec.pap_cmpy);
			rx.add(record, "paper_clsf_cd", rec.paper_clsf_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "fr_roll", rec.fr_roll);
			rx.add(record, "fr_wt", rec.fr_wt);
			rx.add(record, "rem_qunt_cnt", rec.rem_qunt_cnt);
			rx.add(record, "rem_qunt_wgt", rec.rem_qunt_wgt);
			rx.add(record, "somo_roll", rec.somo_roll);
			rx.add(record, "somo_wgt", rec.somo_wgt);
			rx.add(record, "ewh_roll_cnt", rec.ewh_roll_cnt);
			rx.add(record, "ewh_wgt", rec.ewh_wgt);
			rx.add(record, "ewh_roll_cnt_to", rec.ewh_roll_cnt_to);
			rx.add(record, "ewh_wgt_to", rec.ewh_wgt_to);
			rx.add(record, "cnsm_qunt", rec.cnsm_qunt);
			rx.add(record, "wht_pj_retngod_wgt", rec.wht_pj_retngod_wgt);
			rx.add(record, "sum_wht_pj_retngod_wgt", rec.sum_wht_pj_retngod_wgt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
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
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<fac_clsf/>
			<papcmpy_cd/>
			<rot_mach_no/>
			<sett_no/>
			<sett_seq/>
			<a_cmcnt_val_cnt/>
			<a_wgt/>
			<a_un_use_yn/>
			<b_cmcnt_val_cnt/>
			<b_wgt/>
			<b_un_use_yn/>
			<c_cmcnt_val_cnt/>
			<c_wgt/>
			<c_un_use_yn/>
			<occr_dt/>
			<seq/>
			<issu_dt/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<fac_clsf/>
			<pap_cmpy/>
			<paper_clsf_cd/>
			<matr_cd/>
			<fr_roll/>
			<fr_wt/>
			<rem_qunt_cnt/>
			<rem_qunt_wgt/>
			<somo_roll/>
			<somo_wgt/>
			<ewh_roll_cnt/>
			<ewh_wgt/>
			<ewh_roll_cnt_to/>
			<ewh_wgt_to/>
			<cnsm_qunt/>
			<wht_pj_retngod_wgt/>
			<sum_wht_pj_retngod_wgt/>
			<occr_dt/>
			<seq/>
			<roll_wgt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Sep 21 23:12:15 KST 2009 */ %>