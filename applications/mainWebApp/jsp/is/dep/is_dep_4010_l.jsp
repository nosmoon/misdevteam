<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_4010_LDataSet ds = (IS_DEP_4010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		for(int i = 0; i<ds.curlist.size(); i++) {
			IS_DEP_4010_LCURLISTRecord rec = (IS_DEP_4010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "checked", "");
			rx.add(record, "card_rcpm_reg_dt", rec.card_rcpm_reg_dt);
			rx.add(record, "card_rcpm_reg_seq", rec.card_rcpm_reg_seq);
			rx.add(record, "aprv_dt", rec.aprv_dt);
			rx.add(record, "tmnl_no", rec.tmnl_no);
			rx.add(record, "card_no", rec.card_no);
			rx.add(record, "req_amt", rec.req_amt);
			rx.add(record, "aprv_no", rec.aprv_no);
			rx.add(record, "card_cmpy_cd", rec.card_cmpy_cd);
			rx.add(record, "card_clsf", rec.card_clsf);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "acct_mang_no", rec.acct_mang_no);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "setoff_suply_amt", rec.setoff_suply_amt);
			rx.add(record, "setoff_vat_amt", rec.setoff_vat_amt);
			rx.add(record, "setoff_tot_rvord_amt", rec.setoff_tot_rvord_amt);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "card_cmpy_cd_nm", rec.card_cmpy_cd_nm);
			rx.add(record, "card_clsf_nm", rec.card_clsf_nm);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "sub_dept_cd_nm", rec.sub_dept_cd_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);	
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);			
			rx.add(record, "card_rcpm_reg_no", rec.card_rcpm_reg_dt+"-"+rec.card_rcpm_reg_seq); /**카드승인번호는 카드입금등록일자+등록순번**/
		}
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>