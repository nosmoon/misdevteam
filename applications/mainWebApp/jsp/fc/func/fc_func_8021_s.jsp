<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8021_SDataSet ds = (FC_FUNC_8021_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_FUNC_8021_SCURLIST3Record rec = (FC_FUNC_8021_SCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "loss_dt", rec.loss_dt);
			rx.add(record, "expt_loss_amt", rec.expt_loss_amt);
			rx.add(record, "fix_loss_amt", rec.fix_loss_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_8021_SCURLIST2Record rec = (FC_FUNC_8021_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "expt_widr_dt", rec.expt_widr_dt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8021_SCURLIST1Record rec = (FC_FUNC_8021_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "cntr_clsf_cd", rec.cntr_clsf_cd);
			rx.add(record, "leas_clsf_cd", rec.leas_clsf_cd);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "leas_sub_seq", rec.leas_sub_seq);
			rx.add(record, "leas_nm", rec.leas_nm);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "libo_int_rate", rec.libo_int_rate);
			rx.add(record, "dedu_int_rate", rec.dedu_int_rate);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "re_leas_yn", rec.re_leas_yn);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "pymt_cycl", rec.pymt_cycl);
			rx.add(record, "pay_plan_tms", rec.pay_plan_tms);
			rx.add(record, "libo_yn", rec.libo_yn);
			rx.add(record, "end_aftr", rec.end_aftr);
			rx.add(record, "leas_stat_cd", rec.leas_stat_cd);
			rx.add(record, "leas_stat_nm", rec.leas_stat_nm);
			rx.add(record, "end_dt", rec.end_dt);
			rx.add(record, "basi_int", rec.basi_int);
			rx.add(record, "leas_int_rate", rec.leas_int_rate);
			rx.add(record, "prd_int_rate", rec.prd_int_rate);
			rx.add(record, "tms_leas_amt", rec.tms_leas_amt);
			rx.add(record, "tot_leas_fee", rec.tot_leas_fee);
			rx.add(record, "decid_amt", rec.decid_amt);
			rx.add(record, "prd_int", rec.prd_int);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "loca", rec.loca);
			rx.add(record, "int_calc_cdnm", rec.int_calc_cdnm);
			rx.add(record, "good_curcnm", rec.good_curcnm);
			rx.add(record, "good_amt", rec.good_amt);
			rx.add(record, "prelae_pay_clsf_cdnm", rec.prelae_pay_clsf_cdnm);
			rx.add(record, "fst_leas_no", rec.fst_leas_no);
			rx.add(record, "fst_leas_nm", rec.fst_leas_nm);
			rx.add(record, "leas_hire_clsf_cdnm", rec.leas_hire_clsf_cdnm);
			rx.add(record, "dlco_cdnm", rec.dlco_cdnm);
			rx.add(record, "use_dept_cdnm", rec.use_dept_cdnm);
			rx.add(record, "medi_cdnm", rec.medi_cdnm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST3>
		<record>
			<cmpy_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<loss_dt/>
			<expt_loss_amt/>
			<fix_loss_amt/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<note_no/>
			<amt/>
			<expt_widr_dt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<cntr_clsf_cd/>
			<leas_clsf_cd/>
			<leas_no/>
			<leas_sub_seq/>
			<leas_nm/>
			<cntr_no/>
			<frcr_amt/>
			<won_amt/>
			<libo_int_rate/>
			<dedu_int_rate/>
			<comp_dt/>
			<mtry_dt/>
			<re_leas_yn/>
			<frex_cd/>
			<exrate/>
			<rmks/>
			<pymt_cycl/>
			<pay_plan_tms/>
			<libo_yn/>
			<end_aftr/>
			<leas_stat_cd/>
			<leas_stat_nm/>
			<end_dt/>
			<basi_int/>
			<leas_int_rate/>
			<prd_int_rate/>
			<tms_leas_amt/>
			<tot_leas_fee/>
			<decid_amt/>
			<prd_int/>
			<usag/>
			<loca/>
			<int_calc_cdnm/>
			<good_curcnm/>
			<good_amt/>
			<prelae_pay_clsf_cdnm/>
			<fst_leas_no/>
			<fst_leas_nm/>
			<leas_hire_clsf_cdnm/>
			<dlco_cdnm/>
			<use_dept_cdnm/>
			<medi_cdnm/>
			<dtls_medi_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Mar 27 15:44:14 KST 2009 */ %>