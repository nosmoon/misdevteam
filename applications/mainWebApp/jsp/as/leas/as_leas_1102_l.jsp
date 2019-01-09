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
	AS_LEAS_1102_LDataSet ds = (AS_LEAS_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");
	dataSet = rx.addCData(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.addCData(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_LEAS_1102_LCURLISTRecord rec = (AS_LEAS_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.addCData(recordSet, "record", "");
			rx.addCData(record, "cntr_no", rec.cntr_no);
			rx.addCData(record, "bldg_cd_nm", rec.bldg_cd_nm);
			rx.addCData(record, "ser_no", rec.ser_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "leas_area_size", rec.leas_area_size);
			rx.addCData(record, "leas_fr_dt", rec.leas_fr_dt);
			rx.addCData(record, "leas_to_dt", rec.leas_to_dt);
			rx.addCData(record, "cntr_star", rec.cntr_star);
			rx.addCData(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.addCData(record, "leas_clam_cycl", rec.leas_clam_cycl);
			rx.addCData(record, "cntr_mang_amt", rec.cntr_mang_amt);
			rx.addCData(record, "mang_clam_cycl", rec.mang_clam_cycl);
			rx.addCData(record, "tot_amt", rec.tot_amt);
			rx.addCData(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
			rx.addCData(record, "gurt_tot_amt", rec.gurt_tot_amt);
			rx.addCData(record, "gurt_out_amt", rec.gurt_out_amt);
			rx.addCData(record, "gurt_amt", rec.gurt_amt);
			rx.addCData(record, "ref_cntr_no", rec.ref_cntr_no);
			rx.addCData(record, "bldg_cd", rec.bldg_cd);
			rx.addCData(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.addCData(record, "draft_no", rec.draft_no);
			rx.addCData(record, "rcpm_amt_end", rec.rcpm_amt_end);
			rx.addCData(record, "leas_cntr_dt", rec.leas_cntr_dt);
			rx.addCData(record, "last_leas_clam_dt", rec.last_leas_clam_dt);
			rx.addCData(record, "midw_expy_dt", rec.midw_expy_dt);
			rx.addCData(record, "last_mang_clam_dt", rec.last_mang_clam_dt);
			rx.addCData(record, "precpt_tot_amt", rec.precpt_tot_amt);
			rx.addCData(record, "end_clsf", rec.end_clsf);
			rx.addCData(record, "precpt_out_amt", rec.precpt_out_amt);
			rx.addCData(record, "precpt_amt", rec.precpt_amt);
			rx.addCData(record, "pymt_clsf", rec.pymt_clsf);
			rx.addCData(record, "expy_remk", rec.expy_remk);
			rx.addCData(record, "good_clsf", rec.good_clsf);
			rx.addCData(record, "remk", rec.remk);
			rx.addCData(record, "aset_addr", rec.aset_addr);
			rx.addCData(record, "gurt_dlco_ern", rec.gurt_dlco_ern);
			rx.addCData(record, "gurt_dlco_nm", rec.gurt_dlco_nm);
			rx.addCData(record, "ref_cntr_nm", rec.ref_cntr_nm);
			rx.addCData(record, "leas_dlco_ern", rec.leas_dlco_ern);
			rx.addCData(record, "leas_ern_nm", rec.leas_ern_nm);
			rx.addCData(record, "hire_dlco_clsf_cd", rec.hire_dlco_clsf_cd);
			rx.addCData(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.addCData(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.addCData(record, "cmpy_cd", rec.cmpy_cd);
			rx.addCData(record, "cntr_yy", rec.cntr_yy);
			rx.addCData(record, "cntr_seq", rec.cntr_seq);
			rx.addCData(record, "bo_cd", rec.bo_cd);
			rx.addCData(record, "bo_seq", rec.bo_seq);
			rx.addCData(record, "vat_non_yn", rec.vat_non_yn);
			rx.addCData(record, "frex_rcpm_yn", rec.frex_rcpm_yn);			
			rx.addCData(record, "email", rec.email);			
			rx.add(record, "leas_telno1", rec.leas_telno1);
			rx.add(record, "leas_telno2", rec.leas_telno2);
			rx.add(record, "leas_telno3", rec.leas_telno3);
			rx.add(record, "unrcpm_info", rec.unrcpm_info);						
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "bldg_cd_nm", StringUtil.replaceToXml(rec.bldg_cd_nm));
			//rx.add(record, "ser_no", StringUtil.replaceToXml(rec.ser_no));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "leas_area_size", StringUtil.replaceToXml(rec.leas_area_size));
			//rx.add(record, "leas_fr_dt", StringUtil.replaceToXml(rec.leas_fr_dt));
			//rx.add(record, "leas_to_dt", StringUtil.replaceToXml(rec.leas_to_dt));
			//rx.add(record, "cntr_star", StringUtil.replaceToXml(rec.cntr_star));
			//rx.add(record, "cntr_leas_amt", StringUtil.replaceToXml(rec.cntr_leas_amt));
			//rx.add(record, "leas_clam_cycl", StringUtil.replaceToXml(rec.leas_clam_cycl));
			//rx.add(record, "cntr_mang_amt", StringUtil.replaceToXml(rec.cntr_mang_amt));
			//rx.add(record, "mang_clam_cycl", StringUtil.replaceToXml(rec.mang_clam_cycl));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "cntr_gurt_amt", StringUtil.replaceToXml(rec.cntr_gurt_amt));
			//rx.add(record, "gurt_tot_amt", StringUtil.replaceToXml(rec.gurt_tot_amt));
			//rx.add(record, "gurt_out_amt", StringUtil.replaceToXml(rec.gurt_out_amt));
			//rx.add(record, "gurt_amt", StringUtil.replaceToXml(rec.gurt_amt));
			//rx.add(record, "ref_cntr_no", StringUtil.replaceToXml(rec.ref_cntr_no));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "draft_no", StringUtil.replaceToXml(rec.draft_no));
			//rx.add(record, "rcpm_amt_end", StringUtil.replaceToXml(rec.rcpm_amt_end));
			//rx.add(record, "leas_cntr_dt", StringUtil.replaceToXml(rec.leas_cntr_dt));
			//rx.add(record, "last_leas_clam_dt", StringUtil.replaceToXml(rec.last_leas_clam_dt));
			//rx.add(record, "midw_expy_dt", StringUtil.replaceToXml(rec.midw_expy_dt));
			//rx.add(record, "last_mang_clam_dt", StringUtil.replaceToXml(rec.last_mang_clam_dt));
			//rx.add(record, "precpt_tot_amt", StringUtil.replaceToXml(rec.precpt_tot_amt));
			//rx.add(record, "end_clsf", StringUtil.replaceToXml(rec.end_clsf));
			//rx.add(record, "precpt_out_amt", StringUtil.replaceToXml(rec.precpt_out_amt));
			//rx.add(record, "precpt_amt", StringUtil.replaceToXml(rec.precpt_amt));
			//rx.add(record, "pymt_clsf", StringUtil.replaceToXml(rec.pymt_clsf));
			//rx.add(record, "expy_remk", StringUtil.replaceToXml(rec.expy_remk));
			//rx.add(record, "good_clsf", StringUtil.replaceToXml(rec.good_clsf));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "aset_addr", StringUtil.replaceToXml(rec.aset_addr));
			//rx.add(record, "gurt_dlco_ern", StringUtil.replaceToXml(rec.gurt_dlco_ern));
			//rx.add(record, "gurt_dlco_nm", StringUtil.replaceToXml(rec.gurt_dlco_nm));
			//rx.add(record, "ref_cntr_nm", StringUtil.replaceToXml(rec.ref_cntr_nm));
			//rx.add(record, "leas_dlco_ern", StringUtil.replaceToXml(rec.leas_dlco_ern));
			//rx.add(record, "leas_ern_nm", StringUtil.replaceToXml(rec.leas_ern_nm));
			//rx.add(record, "hire_dlco_clsf_cd", StringUtil.replaceToXml(rec.hire_dlco_clsf_cd));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "bo_cd", StringUtil.replaceToXml(rec.bo_cd));
			//rx.add(record, "bo_seq", StringUtil.replaceToXml(rec.bo_seq));
			//rx.add(record, "vat_non_yn", StringUtil.replaceToXml(rec.vat_non_yn));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.addCData(dataSet, "errcode", errcode);
		rx.addCData(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1102_l>
	<dataSet>
		<CURLIST>
			<record>
				<cntr_no/>
				<bldg_cd_nm/>
				<ser_no/>
				<dlco_nm/>
				<leas_area_size/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<cntr_star/>
				<cntr_leas_amt/>
				<leas_clam_cycl/>
				<cntr_mang_amt/>
				<mang_clam_cycl/>
				<tot_amt/>
				<cntr_gurt_amt/>
				<gurt_tot_amt/>
				<gurt_out_amt/>
				<gurt_amt/>
				<ref_cntr_no/>
				<bldg_cd/>
				<aset_no/>
				<aset_nm/>
				<draft_no/>
				<rcpm_amt_end/>
				<leas_cntr_dt/>
				<last_leas_clam_dt/>
				<midw_expy_dt/>
				<last_mang_clam_dt/>
				<precpt_tot_amt/>
				<end_clsf/>
				<precpt_out_amt/>
				<precpt_amt/>
				<pymt_clsf/>
				<expy_remk/>
				<good_clsf/>
				<remk/>
				<aset_addr/>
				<gurt_dlco_ern/>
				<gurt_dlco_nm/>
				<ref_cntr_nm/>
				<leas_dlco_ern/>
				<leas_ern_nm/>
				<hire_dlco_clsf_cd/>
				<hire_dlco_ern/>
				<hire_dlco_nm/>
				<cmpy_cd/>
				<cntr_yy/>
				<cntr_seq/>
				<bo_cd/>
				<bo_seq/>
				<vat_non_yn/>
				<frex_rcpm_yn/>
				<email/>				
				<leas_telno1/>
				<leas_telno2/>
				<leas_telno3/>
				<unrcpm_info/>				
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1102_l>
*/
%>

<% /* 작성시간 : Tue Sep 08 14:35:12 KST 2009 */ %>