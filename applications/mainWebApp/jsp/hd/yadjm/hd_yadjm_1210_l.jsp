<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1210_LDataSet ds = (HD_YADJM_1210_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1210_LCURLISTRecord rec = (HD_YADJM_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "adjm_rvrs_yy", rec.adjm_rvrs_yy);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "seq", rec.seq);
			rx.addCData(record, "offic_nm", rec.offic_nm);
			rx.addCData(record, "cmpy_nm", rec.cmpy_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "impt_saly", rec.impt_saly);
			rx.add(record, "non_tax_prod", rec.non_tax_prod);
			rx.add(record, "non_tax_frnc", rec.non_tax_frnc);
			rx.add(record, "deci_incm_tax", rec.deci_incm_tax);
			rx.add(record, "deci_res_tax", rec.deci_res_tax);
			rx.add(record, "impt_bns", rec.impt_bns);
			rx.add(record, "bns_incm_tax_tot_amt", rec.bns_incm_tax_tot_amt);
			rx.add(record, "bns_res_tax_tot_amt", rec.bns_res_tax_tot_amt);
			rx.add(record, "bns_deci_farm_spc_tax", rec.bns_deci_farm_spc_tax);
			rx.add(record, "aprv_bns_tot_amt", rec.aprv_bns_tot_amt);
			rx.add(record, "stok_num_shet_prft_amt", rec.stok_num_shet_prft_amt);
			rx.add(record, "np_pymt_amt", rec.np_pymt_amt);
			rx.add(record, "hosp_insr_fee", rec.hosp_insr_fee);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "etc_insr_fee", rec.etc_insr_fee);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "adjm_rvrs_yy", StringUtil.replaceToXml(rec.adjm_rvrs_yy));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "offic_nm", StringUtil.replaceToXml(rec.offic_nm));
			//rx.add(record, "cmpy_nm", StringUtil.replaceToXml(rec.cmpy_nm));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "impt_saly", StringUtil.replaceToXml(rec.impt_saly));
			//rx.add(record, "non_tax_prod", StringUtil.replaceToXml(rec.non_tax_prod));
			//rx.add(record, "non_tax_frnc", StringUtil.replaceToXml(rec.non_tax_frnc));
			//rx.add(record, "deci_incm_tax", StringUtil.replaceToXml(rec.deci_incm_tax));
			//rx.add(record, "deci_res_tax", StringUtil.replaceToXml(rec.deci_res_tax));
			//rx.add(record, "impt_bns", StringUtil.replaceToXml(rec.impt_bns));
			//rx.add(record, "bns_incm_tax_tot_amt", StringUtil.replaceToXml(rec.bns_incm_tax_tot_amt));
			//rx.add(record, "bns_res_tax_tot_amt", StringUtil.replaceToXml(rec.bns_res_tax_tot_amt));
			//rx.add(record, "bns_deci_farm_spc_tax", StringUtil.replaceToXml(rec.bns_deci_farm_spc_tax));
			//rx.add(record, "aprv_bns_tot_amt", StringUtil.replaceToXml(rec.aprv_bns_tot_amt));
			//rx.add(record, "stok_num_shet_prft_amt", StringUtil.replaceToXml(rec.stok_num_shet_prft_amt));
			//rx.add(record, "np_pymt_amt", StringUtil.replaceToXml(rec.np_pymt_amt));
			//rx.add(record, "hosp_insr_fee", StringUtil.replaceToXml(rec.hosp_insr_fee));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "etc_insr_fee", StringUtil.replaceToXml(rec.etc_insr_fee));
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
<hd_yadjm_1210_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<adjm_rvrs_yy/>
				<emp_no/>
				<flnm/>
				<seq/>
				<offic_nm/>
				<cmpy_nm/>
				<ern/>
				<impt_saly/>
				<non_tax_prod/>
				<non_tax_frnc/>
				<deci_incm_tax/>
				<deci_res_tax/>
				<impt_bns/>
				<bns_incm_tax_tot_amt/>
				<bns_res_tax_tot_amt/>
				<bns_deci_farm_spc_tax/>
				<aprv_bns_tot_amt/>
				<stok_num_shet_prft_amt/>
				<np_pymt_amt/>
				<hosp_insr_fee/>
				<emp_insr_fee/>
				<etc_insr_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1210_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 22:25:50 KST 2009 */ %>