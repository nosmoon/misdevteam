<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1003_SDataSet ds = (AS_ASET_1003_SDataSet)request.getAttribute("ds");
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
			AS_ASET_1003_SCURLISTRecord rec = (AS_ASET_1003_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "item_nm", rec.item_nm);
			rx.add(record, "unit_cd", rec.unit_cd);
			rx.add(record, "unit_nm", rec.unit_nm);
			rx.add(record, "redm_clsf", rec.redm_clsf);
			rx.add(record, "redm_nm", rec.redm_nm);
			rx.add(record, "redm_mthd_cd", rec.redm_mthd_cd);
			rx.add(record, "redm_mthd_nm", rec.redm_mthd_nm);
			rx.add(record, "svc_yys_cnt", rec.svc_yys_cnt);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "buy_clsf", rec.buy_clsf);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "aset_stat", rec.aset_stat);
			rx.add(record, "aset_stat_nm", rec.aset_stat_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "orgin_acqr_amt", rec.orgin_acqr_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "cur_acqr_amt", rec.cur_acqr_amt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_ern", rec.dlco_ern);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "bund_cd", rec.bund_cd);
			rx.addCData(record, "bund_nm", rec.bund_nm);
			rx.add(record, "aset_size", rec.aset_size);
			rx.add(record, "aset_loca", rec.aset_loca);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.addCData(record, "aset_usag", rec.aset_usag);
			rx.add(record, "aset_grp_yn", rec.aset_grp_yn);
			rx.add(record, "phot_yn", rec.phot_yn);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "redm_dt", rec.redm_dt);
			rx.add(record, "cur_redm_agg_amt", rec.cur_redm_agg_amt);
			rx.add(record, "tot_redm_amt", rec.tot_redm_amt);
			rx.add(record, "rem_amt", rec.rem_amt);
			rx.add(record, "un_redm_amt", rec.un_redm_amt);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "eis_aset_clsf", rec.eis_aset_clsf);
			rx.add(record, "insr_type_cd", rec.insr_type_cd);
			rx.add(record, "use_emp_no", rec.use_emp_no);
			rx.add(record, "use_emp_nm", rec.use_emp_nm);
			rx.add(record, "use_cmpy_nm", rec.use_cmpy_nm);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "use_cmpy_cd", rec.use_cmpy_cd);
			rx.addCData(record, "mst_remk", rec.mst_remk);
			rx.add(record, "mst_chnl_clsf_cd", rec.mst_chnl_clsf_cd);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "item_nm", StringUtil.replaceToXml(rec.item_nm));
			//rx.add(record, "unit_cd", StringUtil.replaceToXml(rec.unit_cd));
			//rx.add(record, "unit_nm", StringUtil.replaceToXml(rec.unit_nm));
			//rx.add(record, "redm_clsf", StringUtil.replaceToXml(rec.redm_clsf));
			//rx.add(record, "redm_nm", StringUtil.replaceToXml(rec.redm_nm));
			//rx.add(record, "redm_mthd_cd", StringUtil.replaceToXml(rec.redm_mthd_cd));
			//rx.add(record, "redm_mthd_nm", StringUtil.replaceToXml(rec.redm_mthd_nm));
			//rx.add(record, "svc_yys_cnt", StringUtil.replaceToXml(rec.svc_yys_cnt));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "buy_clsf", StringUtil.replaceToXml(rec.buy_clsf));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "aset_stat", StringUtil.replaceToXml(rec.aset_stat));
			//rx.add(record, "aset_stat_nm", StringUtil.replaceToXml(rec.aset_stat_nm));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "orgin_acqr_amt", StringUtil.replaceToXml(rec.orgin_acqr_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "cur_acqr_amt", StringUtil.replaceToXml(rec.cur_acqr_amt));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_ern", StringUtil.replaceToXml(rec.dlco_ern));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "bund_cd", StringUtil.replaceToXml(rec.bund_cd));
			//rx.add(record, "bund_nm", StringUtil.replaceToXml(rec.bund_nm));
			//rx.add(record, "aset_size", StringUtil.replaceToXml(rec.aset_size));
			//rx.add(record, "aset_loca", StringUtil.replaceToXml(rec.aset_loca));
			//rx.add(record, "aset_qunt_cnt", StringUtil.replaceToXml(rec.aset_qunt_cnt));
			//rx.add(record, "aset_usag", StringUtil.replaceToXml(rec.aset_usag));
			//rx.add(record, "aset_grp_yn", StringUtil.replaceToXml(rec.aset_grp_yn));
			//rx.add(record, "phot_yn", StringUtil.replaceToXml(rec.phot_yn));
			//rx.add(record, "sale_dt", StringUtil.replaceToXml(rec.sale_dt));
			//rx.add(record, "sale_amt", StringUtil.replaceToXml(rec.sale_amt));
			//rx.add(record, "redm_dt", StringUtil.replaceToXml(rec.redm_dt));
			//rx.add(record, "cur_redm_agg_amt", StringUtil.replaceToXml(rec.cur_redm_agg_amt));
			//rx.add(record, "tot_redm_amt", StringUtil.replaceToXml(rec.tot_redm_amt));
			//rx.add(record, "rem_amt", StringUtil.replaceToXml(rec.rem_amt));
			//rx.add(record, "un_redm_amt", StringUtil.replaceToXml(rec.un_redm_amt));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "eis_aset_clsf", StringUtil.replaceToXml(rec.eis_aset_clsf));
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
<as_aset_1003_s>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<aset_no/>
				<aset_nm/>
				<item_nm/>
				<unit_cd/>
				<unit_nm/>
				<redm_clsf/>
				<redm_nm/>
				<redm_mthd_cd/>
				<redm_mthd_nm/>
				<svc_yys_cnt/>
				<budg_cd/>
				<budg_nm/>
				<buy_clsf/>
				<dept_cd/>
				<dept_nm/>
				<aset_stat/>
				<aset_stat_nm/>
				<acqr_dt/>
				<orgin_acqr_amt/>
				<vat_amt/>
				<cur_acqr_amt/>
				<dlco_clsf_cd/>
				<dlco_ern/>
				<dlco_nm/>
				<bund_cd/>
				<bund_nm/>
				<aset_size/>
				<aset_loca/>
				<aset_qunt_cnt/>
				<aset_usag/>
				<aset_grp_yn/>
				<phot_yn/>
				<sale_dt/>
				<sale_amt/>
				<redm_dt/>
				<cur_redm_agg_amt/>
				<tot_redm_amt/>
				<rem_amt/>
				<un_redm_amt/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<eis_aset_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</as_aset_1003_s>
*/
%>

<% /* 작성시간 : Sat Aug 08 10:33:42 KST 2009 */ %>