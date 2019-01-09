<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.lear.rec.*
	,	chosun.ciis.as.lear.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAR_1401_LDataSet ds = (AS_LEAR_1401_LDataSet)request.getAttribute("ds");
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
			AS_LEAR_1401_LCURLISTRecord rec = (AS_LEAR_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			rx.add(record, "clam_amt", rec.clam_amt);
			rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "leas_fr_dt", rec.leas_fr_dt);
			rx.add(record, "leas_to_dt", rec.leas_to_dt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "bldg_cd", rec.bldg_cd);
			rx.add(record, "cntr_yy", rec.cntr_yy);
			rx.add(record, "cntr_seq", rec.cntr_seq);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.add(record, "midw_expy_dt", rec.midw_expy_dt);
			rx.add(record, "pymt_clsf", rec.pymt_clsf);
			rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			rx.add(record, "leas_clam_cycl", rec.leas_clam_cycl);
			rx.add(record, "mang_clam_cycl", rec.mang_clam_cycl);
			rx.add(record, "leas_cntr_dt", rec.leas_cntr_dt);
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "clam_amt", StringUtil.replaceToXml(rec.clam_amt));
			//rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "leas_fr_dt", StringUtil.replaceToXml(rec.leas_fr_dt));
			//rx.add(record, "leas_to_dt", StringUtil.replaceToXml(rec.leas_to_dt));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "midw_expy_dt", StringUtil.replaceToXml(rec.midw_expy_dt));
			//rx.add(record, "pymt_clsf", StringUtil.replaceToXml(rec.pymt_clsf));
			//rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			//rx.add(record, "leas_clam_cycl", StringUtil.replaceToXml(rec.leas_clam_cycl));
			//rx.add(record, "mang_clam_cycl", StringUtil.replaceToXml(rec.mang_clam_cycl));
			//rx.add(record, "leas_cntr_dt", StringUtil.replaceToXml(rec.leas_cntr_dt));
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
<as_lear_1401_l>
	<dataSet>
		<CURLIST>
			<record>
				<bldg_nm/>
				<cntr_no/>
				<hire_dlco_nm/>
				<clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<cmpy_cd/>
				<bldg_cd/>
				<cntr_yy/>
				<cntr_seq/>
				<rcpm_amt/>
				<hire_dlco_ern/>
				<midw_expy_dt/>
				<pymt_clsf/>
				<leas_clam_amt/>
				<leas_clam_cycl/>
				<mang_clam_cycl/>
				<leas_cntr_dt/>
			</record>
		</CURLIST>
	</dataSet>
</as_lear_1401_l>
*/
%>

<% /* 작성시간 : Fri May 08 09:47:29 KST 2009 */ %>