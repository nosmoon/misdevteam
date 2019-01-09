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
	MT_PRNPAP_3418_LDataSet ds = (MT_PRNPAP_3418_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "stat_flag", ds.stat_flag);
		recordSet = rx.add(dataSet, "wgt_clsf" , ds.wgt_clsf);

		recordSet = rx.add(dataSet, "thisPage3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PRNPAP_3418_LCURLIST3Record rec = (MT_PRNPAP_3418_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "title", rec.title);
			rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			rx.addCData(record, "sect_cd_nm", rec.sect_cd_nm);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			rx.add(record, "tmpdata", rec.tmpdata);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pre_prt_clsf", rec.pre_prt_clsf);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "prt_dt", rec.prt_dt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "thisPage2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3418_LCURLIST2Record rec = (MT_PRNPAP_3418_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "bw_pj_wgt", rec.bw_pj_wgt);
			rx.add(record, "matr_cd_a", rec.matr_cd_a);
			rx.add(record, "use_qunt_a", rec.use_qunt_a);
			rx.add(record, "matr_cd_b", rec.matr_cd_b);
			rx.add(record, "use_qunt_b", rec.use_qunt_b);
			rx.add(record, "matr_cd_c", rec.matr_cd_c);
			rx.add(record, "use_qunt_c", rec.use_qunt_c);
			rx.add(record, "use_qunt_tot", rec.use_qunt_tot);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "thisPage1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3418_LCURLIST1Record rec = (MT_PRNPAP_3418_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.addCData(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "matr_cd_a", rec.matr_cd_a);
			rx.add(record, "use_qunt_a", rec.use_qunt_a);
			rx.add(record, "matr_cd_b", rec.matr_cd_b);
			rx.add(record, "use_qunt_b", rec.use_qunt_b);
			rx.add(record, "matr_cd_c", rec.matr_cd_c);
			rx.add(record, "use_qunt_c", rec.use_qunt_c);
			rx.add(record, "use_qunt_tot", rec.use_qunt_tot);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "mainPage", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3418_LCURLISTRecord rec = (MT_PRNPAP_3418_LCURLISTRecord)ds.curlist.get(i);
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
	<CURLIST3>
		<record>
			<title/>
			<medi_cd_nm/>
			<sect_cd_nm/>
			<cd/>
			<cdnm/>
			<mang_cd_1/>
			<tmpdata/>
			<cnt/>
			<wgt/>
			<hdqt_paper_clsf/>
			<medi_cd/>
			<sect_cd/>
			<pre_prt_clsf/>
			<issu_dt/>
			<prt_dt/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<hdqt_paper_clsf/>
			<prt_dt/>
			<issu_dt/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<slip_qty/>
			<papcmpy_cd/>
			<bw_pj_wgt/>
			<matr_cd_a/>
			<use_qunt_a/>
			<matr_cd_b/>
			<use_qunt_b/>
			<matr_cd_c/>
			<use_qunt_c/>
			<use_qunt_tot/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<hdqt_paper_clsf/>
			<prt_dt/>
			<issu_dt/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<slip_qty/>
			<papcmpy_cd/>
			<matr_cd_a/>
			<use_qunt_a/>
			<matr_cd_b/>
			<use_qunt_b/>
			<matr_cd_c/>
			<use_qunt_c/>
			<use_qunt_tot/>
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

<% /* 작성시간 : Tue Sep 22 09:26:45 KST 2009 */ %>