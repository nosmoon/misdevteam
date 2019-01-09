<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.prz.rec.*
	,	chosun.ciis.hd.prz.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_PRZ_1101_LDataSet ds = (HD_PRZ_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1101_LCURLISTRecord rec = (HD_PRZ_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "req_pers_flnm", rec.req_pers_flnm);
			rx.add(record, "aplc_clsf", rec.aplc_clsf);
			rx.add(record, "aplc_clsf_nm", rec.aplc_clsf_nm);
			rx.add(record, "obj_clsf", rec.obj_clsf);
			rx.addCData(record, "obj_clsf_nm", rec.obj_clsf_nm);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "req_pers_dept_nm", rec.req_pers_dept_nm);
			rx.addCData(record, "case_nm", rec.case_nm);
			rx.add(record, "atic_pubc_dt", rec.atic_pubc_dt);
			rx.add(record, "atic_pubc_side", rec.atic_pubc_side);
			rx.add(record, "clas_clsf_cd", rec.clas_clsf_cd);
			rx.add(record, "clas_clsf_nm", rec.clas_clsf_nm);
			rx.add(record, "dtls_cont", rec.dtls_cont);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "tms", rec.tms);
			rx.add(record, "prv_insp_dt", rec.prv_insp_dt);
			rx.add(record, "prv_insp_ocom", rec.prv_insp_ocom);
			rx.addCData(record, "prv_insp_ocom_nm", rec.prv_insp_ocom_nm);
			rx.add(record, "prv_insp_resn", rec.prv_insp_resn);
			rx.add(record, "main_insp_dt", rec.main_insp_dt);
			rx.add(record, "main_insp_ocom", rec.main_insp_ocom);
			rx.add(record, "main_insp_ocom_nm", rec.main_insp_ocom_nm);
			rx.add(record, "prz_cd", rec.prz_cd);
			rx.addCData(record, "prz_nm", rec.prz_nm);
			rx.add(record, "prz_pnsh_cd", rec.prz_pnsh_cd);
			rx.addCData(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			rx.add(record, "prz_resn_cd", rec.prz_resn_cd);
			rx.addCData(record, "prz_resn_nm", rec.prz_resn_nm);
			rx.add(record, "prz_grad", rec.prz_grad);
			rx.add(record, "prz_amt", rec.prz_amt);
			rx.addCData(record, "atic_add_file_nm", rec.atic_add_file_nm);
			if("".equals(rec.atic_add_file_nm)){
				rx.add(record, "download", "");
			}else if(!"".equals(rec.atic_add_file_nm)){
				rx.add(record, "download", "다운로드");
			}
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			//rx.add(record, "req_pers_flnm", StringUtil.replaceToXml(rec.req_pers_flnm));
			//rx.add(record, "aplc_clsf", StringUtil.replaceToXml(rec.aplc_clsf));
			//rx.add(record, "aplc_clsf_nm", StringUtil.replaceToXml(rec.aplc_clsf_nm));
			//rx.add(record, "obj_clsf", StringUtil.replaceToXml(rec.obj_clsf));
			//rx.add(record, "obj_clsf_nm", StringUtil.replaceToXml(rec.obj_clsf_nm));
			//rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			//rx.add(record, "req_pers_dept_nm", StringUtil.replaceToXml(rec.req_pers_dept_nm));
			//rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			//rx.add(record, "atic_pubc_dt", StringUtil.replaceToXml(rec.atic_pubc_dt));
			//rx.add(record, "atic_pubc_side", StringUtil.replaceToXml(rec.atic_pubc_side));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
			//rx.add(record, "prv_insp_dt", StringUtil.replaceToXml(rec.prv_insp_dt));
			//rx.add(record, "prv_insp_ocom", StringUtil.replaceToXml(rec.prv_insp_ocom));
			//rx.add(record, "prv_insp_ocom_nm", StringUtil.replaceToXml(rec.prv_insp_ocom_nm));
			//rx.add(record, "prv_insp_resn", StringUtil.replaceToXml(rec.prv_insp_resn));
			//rx.add(record, "main_insp_dt", StringUtil.replaceToXml(rec.main_insp_dt));
			//rx.add(record, "main_insp_ocom", StringUtil.replaceToXml(rec.main_insp_ocom));
			//rx.add(record, "main_insp_ocom_nm", StringUtil.replaceToXml(rec.main_insp_ocom_nm));
			//rx.add(record, "prz_cd", StringUtil.replaceToXml(rec.prz_cd));
			//rx.add(record, "prz_nm", StringUtil.replaceToXml(rec.prz_nm));
			//rx.add(record, "prz_pnsh_cd", StringUtil.replaceToXml(rec.prz_pnsh_cd));
			//rx.add(record, "prz_pnsh_nm", StringUtil.replaceToXml(rec.prz_pnsh_nm));
			//rx.add(record, "prz_resn_cd", StringUtil.replaceToXml(rec.prz_resn_cd));
			//rx.add(record, "prz_resn_nm", StringUtil.replaceToXml(rec.prz_resn_nm));
			//rx.add(record, "prz_grad", StringUtil.replaceToXml(rec.prz_grad));
			//rx.add(record, "prz_amt", StringUtil.replaceToXml(rec.prz_amt));
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
<hd_prz_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<sub_seq/>
				<req_pers_flnm/>
				<aplc_clsf/>
				<aplc_clsf_nm/>
				<obj_clsf/>
				<obj_clsf_nm/>
				<aplc_dt/>
				<req_pers_dept_nm/>
				<case_nm/>
				<atic_pubc_dt/>
				<atic_pubc_side/>
				<flnm/>
				<dept_nm/>
				<tms/>
				<prv_insp_dt/>
				<prv_insp_ocom/>
				<prv_insp_ocom_nm/>
				<prv_insp_resn/>
				<main_insp_dt/>
				<main_insp_ocom/>
				<main_insp_ocom_nm/>
				<prz_cd/>
				<prz_nm/>
				<prz_pnsh_cd/>
				<prz_pnsh_nm/>
				<prz_resn_cd/>
				<prz_resn_nm/>
				<prz_grad/>
				<prz_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_prz_1101_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 10:23:11 KST 2009 */ %>