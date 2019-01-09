<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1301_LDataSet ds = (AS_LEAS_1301_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1301_LCURLISTRecord rec = (AS_LEAS_1301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "clam_seq", rec.clam_seq);
			rx.add(record, "clam_dt", rec.clam_dt);
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			rx.add(record, "mang_clam_amt", rec.mang_clam_amt);
			rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "leas_rcpm_amt", rec.leas_rcpm_amt);
			rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt);
			rx.add(record, "vat_rcpm_amt", rec.vat_rcpm_amt);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			rx.add(record, "upd_slip_dt", rec.upd_slip_dt);
			rx.add(record, "upd_slip_yn", rec.upd_slip_yn);
			rx.add(record, "bldg_cd", rec.bldg_cd);
			rx.add(record, "cntr_yy", rec.cntr_yy);
			rx.add(record, "cntr_seq", rec.cntr_seq);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.add(record, "hire_dlco_clsf_cd", rec.hire_dlco_clsf_cd);
			rx.add(record, "slip_dt", rec.slip_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
			//rx.add(record, "clam_dt", StringUtil.replaceToXml(rec.clam_dt));
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			//rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			//rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "leas_rcpm_amt", StringUtil.replaceToXml(rec.leas_rcpm_amt));
			//rx.add(record, "mang_rcpm_amt", StringUtil.replaceToXml(rec.mang_rcpm_amt));
			//rx.add(record, "vat_rcpm_amt", StringUtil.replaceToXml(rec.vat_rcpm_amt));
			//rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			//rx.add(record, "upd_slip_dt", StringUtil.replaceToXml(rec.upd_slip_dt));
			//rx.add(record, "upd_slip_yn", StringUtil.replaceToXml(rec.upd_slip_yn));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "hire_dlco_clsf_cd", StringUtil.replaceToXml(rec.hire_dlco_clsf_cd));
			//rx.add(record, "slip_dt", StringUtil.replaceToXml(rec.slip_dt));
			//rx.add(record, "slip_clsf", StringUtil.replaceToXml(rec.slip_clsf));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
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
<as_leas_1301_l>
	<dataSet>
		<CURLIST>
			<record>
				<clam_yymm/>
				<clam_seq/>
				<clam_dt/>
				<bldg_nm/>
				<hire_dlco_nm/>
				<leas_clam_amt/>
				<mang_clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
				<leas_rcpm_amt/>
				<mang_rcpm_amt/>
				<vat_rcpm_amt/>
				<rcpm_tot_amt/>
				<upd_slip_dt/>
				<upd_slip_yn/>
				<bldg_cd/>
				<cntr_yy/>
				<cntr_seq/>
				<hire_dlco_ern/>
				<hire_dlco_clsf_cd/>
				<slip_dt/>
				<slip_clsf/>
				<slip_seq/>
				<slip_no/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1301_l>
*/
%>

<% /* 작성시간 : Tue Sep 22 16:45:33 KST 2009 */ %>