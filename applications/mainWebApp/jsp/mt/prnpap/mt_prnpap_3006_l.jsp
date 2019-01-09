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
	MT_PRNPAP_3006_LDataSet ds = (MT_PRNPAP_3006_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "stat_flag", ds.stat_flag);
		recordSet = rx.add(dataSet, "wgt_clsf" , ds.wgt_clsf);

		recordSet = rx.add(dataSet, "gridData6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			MT_PRNPAP_3006_LCURLIST6Record rec = (MT_PRNPAP_3006_LCURLIST6Record)ds.curlist6.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "gridData5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_PRNPAP_3006_LCURLIST5Record rec = (MT_PRNPAP_3006_LCURLIST5Record)ds.curlist5.get(i);
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
			rx.add(record, "bw_pj_wgt", rec.bw_pj_wgt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());

		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "gridData4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PRNPAP_3006_LCURLIST4Record rec = (MT_PRNPAP_3006_LCURLIST4Record)ds.curlist4.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "gridData3", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PRNPAP_3006_LCURLIST3Record rec = (MT_PRNPAP_3006_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "paper_clsf_cd", rec.paper_clsf_cd);
			rx.add(record, "roll_wgt", rec.roll_wgt);
		}
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3006_LCURLIST2Record rec = (MT_PRNPAP_3006_LCURLIST2Record)ds.curlist2.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3006_LCURLIST1Record rec = (MT_PRNPAP_3006_LCURLIST1Record)ds.curlist1.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3006_LCURLISTRecord rec = (MT_PRNPAP_3006_LCURLISTRecord)ds.curlist.get(i);
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
	<CURLIST4>
		<record>
			<medi_cd/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<cdnm/>
			<rem_qunt/>
			<cnt/>
			<mang_cd_1/>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<prt_dt/>
			<fac_clsf/>
			<issu_dt/>
			<medi_cd/>
			<sect_cd/>
			<issu_pcnt/>
			<issu_qty/>
			<pj_qunt/>
			<matr_cd/>
			<cnsm_qunt/>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<sub_seq/>
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

<% /* 작성시간 : Mon Jun 22 09:41:16 KST 2009 */ %>