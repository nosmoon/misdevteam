<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_6002_LDataSet ds = (HD_DDEMP_6002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DDEMP_6002_LCURLISTRecord rec = (HD_DDEMP_6002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "frlc_no", rec.frlc_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "chrg_posk_cd", rec.chrg_posk_cd);
			rx.add(record, "chrg_posk_cd_nm", rec.chrg_posk_cd_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "thrw_pgm", rec.thrw_pgm);
			rx.add(record, "thrw_pgm_nm", rec.thrw_pgm_nm);
			rx.add(record, "medi_cd2", rec.medi_cd2);
			rx.add(record, "thrw_pgm2", rec.thrw_pgm2);
			rx.add(record, "thrw_pgm2_nm", rec.thrw_pgm2_nm);
			rx.add(record, "cntr_dt", rec.cntr_dt);
			rx.add(record, "cntr_expr_dt", rec.cntr_expr_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "work_yn", rec.work_yn);
			rx.add(record, "servcost", rec.servcost);
			rx.add(record, "pay_cycl", rec.pay_cycl);
			rx.add(record, "etc_pay_cond", rec.etc_pay_cond);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "draft_no", rec.draft_no);
			rx.add(record, "draft_dept_cd", rec.draft_dept_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "setl_bank", rec.setl_bank);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.add(record, "incm_clsf_nm", rec.incm_clsf_nm);
			rx.add(record, "chrg_posk_nm", rec.chrg_posk_nm);
			rx.add(record, "all_insr_dduc_yn", rec.all_insr_dduc_yn);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "frlc_no", StringUtil.replaceToXml(rec.frlc_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "chrg_posk_cd", StringUtil.replaceToXml(rec.chrg_posk_cd));
			//rx.add(record, "chrg_posk_cd_nm", StringUtil.replaceToXml(rec.chrg_posk_cd_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "thrw_pgm", StringUtil.replaceToXml(rec.thrw_pgm));
			//rx.add(record, "thrw_pgm_nm", StringUtil.replaceToXml(rec.thrw_pgm_nm));
			//rx.add(record, "medi_cd2", StringUtil.replaceToXml(rec.medi_cd2));
			//rx.add(record, "thrw_pgm2", StringUtil.replaceToXml(rec.thrw_pgm2));
			//rx.add(record, "thrw_pgm2_nm", StringUtil.replaceToXml(rec.thrw_pgm2_nm));
			//rx.add(record, "cntr_dt", StringUtil.replaceToXml(rec.cntr_dt));
			//rx.add(record, "cntr_expr_dt", StringUtil.replaceToXml(rec.cntr_expr_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "work_yn", StringUtil.replaceToXml(rec.work_yn));
			//rx.add(record, "servcost", StringUtil.replaceToXml(rec.servcost));
			//rx.add(record, "pay_cycl", StringUtil.replaceToXml(rec.pay_cycl));
			//rx.add(record, "etc_pay_cond", StringUtil.replaceToXml(rec.etc_pay_cond));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "draft_no", StringUtil.replaceToXml(rec.draft_no));
			//rx.add(record, "draft_dept_cd", StringUtil.replaceToXml(rec.draft_dept_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "setl_bank", StringUtil.replaceToXml(rec.setl_bank));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			//rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			//rx.add(record, "incm_clsf_nm", StringUtil.replaceToXml(rec.incm_clsf_nm));
			//rx.add(record, "chrg_posk_nm", StringUtil.replaceToXml(rec.chrg_posk_nm));
			//rx.add(record, "all_insr_dduc_yn", StringUtil.replaceToXml(rec.all_insr_dduc_yn));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<hd_ddemp_6002_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<supr_dept_cd/>
				<dept_nm/>
				<frlc_no/>
				<flnm/>
				<chrg_posk_cd/>
				<chrg_posk_cd_nm/>
				<medi_cd/>
				<thrw_pgm/>
				<thrw_pgm_nm/>
				<medi_cd2/>
				<thrw_pgm2/>
				<thrw_pgm2_nm/>
				<cntr_dt/>
				<cntr_expr_dt/>
				<lvcmpy_dt/>
				<work_yn/>
				<servcost/>
				<pay_cycl/>
				<etc_pay_cond/>
				<prn/>
				<tel_no/>
				<addr/>
				<draft_no/>
				<draft_dept_cd/>
				<mang_no/>
				<setl_bank/>
				<acct_no/>
				<bank_nm/>
				<incm_clsf_cd/>
				<incm_clsf_nm/>
				<chrg_posk_nm/>
				<all_insr_dduc_yn/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_ddemp_6002_l>
*/
%>

<% /* 작성시간 : Thu Aug 09 16:44:00 KST 2018 */ %>