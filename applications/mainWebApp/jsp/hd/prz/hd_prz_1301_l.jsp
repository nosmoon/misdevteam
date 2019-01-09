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
	HD_PRZ_1301_LDataSet ds = (HD_PRZ_1301_LDataSet)request.getAttribute("ds");
	System.out.println("7777777777777777777777777");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
	System.out.println("88888888888888888888");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1301_LCURLISTRecord rec = (HD_PRZ_1301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			rx.add(record, "aplc_clsf_nm", StringUtil.replaceToXml(rec.aplc_clsf_nm));
			rx.add(record, "obj_clsf_nm", StringUtil.replaceToXml(rec.obj_clsf_nm));
			rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			rx.add(record, "req_pers_flnm", StringUtil.replaceToXml(rec.req_pers_flnm));
			rx.add(record, "req_pers_dept_nm", StringUtil.replaceToXml(rec.req_pers_dept_nm));
			rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			rx.add(record, "atic_pubc_dt", StringUtil.replaceToXml(rec.atic_pubc_dt));
			rx.add(record, "atic_pubc_side", StringUtil.replaceToXml(rec.atic_pubc_side));
			rx.add(record, "clas_clsf_nm", StringUtil.replaceToXml(rec.clas_clsf_nm));
			rx.add(record, "dtls_cont", StringUtil.replaceToXml(rec.dtls_cont));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "superdept_nm", StringUtil.replaceToXml(rec.superdept_nm));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
			rx.add(record, "prv_insp_dt", StringUtil.replaceToXml(rec.prv_insp_dt));
			rx.add(record, "prv_insp_ocom", StringUtil.replaceToXml(rec.prv_insp_ocom));
			rx.add(record, "prv_insp_resn", StringUtil.replaceToXml(rec.prv_insp_resn));
			rx.add(record, "main_insp_dt", StringUtil.replaceToXml(rec.main_insp_dt));
			rx.add(record, "main_insp_ocom", StringUtil.replaceToXml(rec.main_insp_ocom));
			rx.add(record, "prz_pnsh_cd_nm", StringUtil.replaceToXml(rec.prz_pnsh_cd_nm));
			rx.add(record, "prz_grad", StringUtil.replaceToXml(rec.prz_grad));
			rx.add(record, "prz_amt", StringUtil.replaceToXml(rec.prz_amt));
			
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
<hd_prz_1301_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<aplc_clsf_nm/>
				<obj_clsf_nm/>
				<aplc_dt/>
				<req_pers_flnm/>
				<req_pers_dept_nm/>
				<case_nm/>
				<atic_pubc_dt/>
				<atic_pubc_side/>
				<emp_no/>
				<flnm/>
				<dept_nm/>
				<tms/>
				<prv_insp_dt/>
				<prv_insp_ocom/>
				<prv_insp_resn/>
				<main_insp_dt/>
				<main_insp_ocom/>
				<prz_pnsh_cd_nm/>
				<prz_grad/>
				<prz_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_prz_1301_l>
*/
%>

<% /* 작성시간 : Mon Nov 23 14:12:37 KST 2009 */ %>