<%@	page contentType="text/xml; charset=EUC-KR" %>
 
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_5000_LDataSet ds = (PR_PRTEXEC_5000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTEXEC_5000_LCURLIST2Record rec = (PR_PRTEXEC_5000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "is_cnt_ex_yn", rec.is_cnt_ex_yn);
			rx.add(record, "is_qty_inc_yn", rec.is_qty_inc_yn);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "duty_ovt_prt_yn", rec.duty_ovt_prt_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "clos_clsf", rec.clos_clsf);
		}
		/****** CURLIST2 END */

		recordSet = rx.add(dataSet, "gridData1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTEXEC_5000_LCURLIST1Record rec = (PR_PRTEXEC_5000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "is_cnt_ex_yn", rec.is_cnt_ex_yn);
			rx.add(record, "is_qty_inc_yn", rec.is_qty_inc_yn);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "duty_ovt_prt_yn", rec.duty_ovt_prt_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "clos_clsf", rec.clos_clsf);
			rx.add(record, "chg_yn", rec.chg_yn);
		}
		recordSet = rx.add(dataSet, "clos_clsf", ds.clos_clsf);
		recordSet = rx.add(dataSet, "clos_clsf_nm", ds.clos_clsf_nm);
		
		recordSet = rx.add(dataSet, "gridData3", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PRTEXEC_5000_LCURLIST3Record rec = (PR_PRTEXEC_5000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "prt_clsf", rec.prt_clsf);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "is_cnt_ex_yn", rec.is_cnt_ex_yn);
			rx.add(record, "is_qty_inc_yn", rec.is_qty_inc_yn);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "duty_ovt_prt_yn", rec.duty_ovt_prt_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "clos_clsf", rec.clos_clsf);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
		recordSet = rx.add(dataSet, "gridData4", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PRTEXEC_5000_LCURLIST4Record rec = (PR_PRTEXEC_5000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "value", rec.medi_cd);
			rx.addCData(record, "label", rec.slip_qty); 
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<prt_dt/>
			<issu_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<slip_qty/>
			<is_cnt_ex_yn/>
			<is_qty_inc_yn/>
			<add_prt_yn/>
			<qunt_out_yn/>
			<duty_ovt_prt_yn/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 19:33:59 KST 2009 */ %>