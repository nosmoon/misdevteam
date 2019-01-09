<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_2412_LDataSet ds = (HD_AFFR_2412_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_2412_LCURLISTRecord rec = (HD_AFFR_2412_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "chk_dt", rec.chk_dt);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "chk_obj_pers_rshp", rec.chk_obj_pers_rshp);
			rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			rx.add(record, "chk_pers_nm", rec.chk_pers_nm);
			rx.add(record, "chk_hosp_nm", rec.chk_hosp_nm);
			rx.add(record, "real_chk_fee", rec.real_chk_fee);
			rx.add(record, "sply_chk_fee", rec.sply_chk_fee);
			rx.add(record, "ocom_subm_yn", rec.ocom_subm_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "cmpy_welf_fund_clsf", rec.cmpy_welf_fund_clsf);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "chk_dt", StringUtil.replaceToXml(rec.chk_dt));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "chk_obj_pers_rshp", StringUtil.replaceToXml(rec.chk_obj_pers_rshp));
			//rx.add(record, "faml_rshp_nm", StringUtil.replaceToXml(rec.faml_rshp_nm));
			//rx.add(record, "chk_pers_nm", StringUtil.replaceToXml(rec.chk_pers_nm));
			//rx.add(record, "chk_hosp_nm", StringUtil.replaceToXml(rec.chk_hosp_nm));
			//rx.add(record, "real_chk_fee", StringUtil.replaceToXml(rec.real_chk_fee));
			//rx.add(record, "sply_chk_fee", StringUtil.replaceToXml(rec.sply_chk_fee));
			//rx.add(record, "ocom_subm_yn", StringUtil.replaceToXml(rec.ocom_subm_yn));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "cmpy_welf_fund_clsf", StringUtil.replaceToXml(rec.cmpy_welf_fund_clsf));
			//rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			//rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			//rx.add(record, "slip_proc_seq", StringUtil.replaceToXml(rec.slip_proc_seq));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
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
<hd_affr_2412_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<dept_cd/>
				<dty_cd/>
				<posi_cd/>
				<dty_nm/>
				<posi_nm/>
				<dept_nm/>
				<chk_dt/>
				<prn/>
				<chk_obj_pers_rshp/>
				<faml_rshp_nm/>
				<chk_pers_nm/>
				<chk_hosp_nm/>
				<real_chk_fee/>
				<sply_chk_fee/>
				<ocom_subm_yn/>
				<remk/>
				<cmpy_welf_fund_clsf/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<slip_proc_seq/>
				<proc_stat/>
				<proc_stat_nm/>
				<actu_slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_2412_l>
*/
%>

<% /* 작성시간 : Thu Oct 04 17:40:38 KST 2012 */ %>