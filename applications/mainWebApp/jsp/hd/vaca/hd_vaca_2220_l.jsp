<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_2220_LDataSet ds = (HD_VACA_2220_LDataSet)request.getAttribute("ds");
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
			HD_VACA_2220_LCURLISTRecord rec = (HD_VACA_2220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "nm_korn", rec.nm_korn);
			//System.out.println("!!!!!!!!!!!!"+rec.dty_nm);
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "year_vaca_dds_sum", rec.year_vaca_dds_sum);
			rx.add(record, "add_vaca_dds_sum", rec.add_vaca_dds_sum);
			rx.add(record, "occr_vaca_dds_sum", rec.occr_vaca_dds_sum);
			rx.add(record, "use_vaca_dds_sum", rec.use_vaca_dds_sum);
			rx.add(record, "base_saly_sum", rec.base_saly_sum);
			rx.add(record, "posk_saly_sum", rec.posk_saly_sum);
			rx.add(record, "mm_ordy_wag_sum", rec.mm_ordy_wag_sum);
			rx.add(record, "dd_basi_wag_sum", rec.dd_basi_wag_sum);
			rx.add(record, "vaca_rmn_dds_sum", rec.vaca_rmn_dds_sum);
			rx.add(record, "yymm_alon_sum", rec.yymm_alon_sum);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "year_vaca_dds_sum", StringUtil.replaceToXml(rec.year_vaca_dds_sum));
			//rx.add(record, "add_vaca_dds_sum", StringUtil.replaceToXml(rec.add_vaca_dds_sum));
			//rx.add(record, "occr_vaca_dds_sum", StringUtil.replaceToXml(rec.occr_vaca_dds_sum));
			//rx.add(record, "use_vaca_dds_sum", StringUtil.replaceToXml(rec.use_vaca_dds_sum));
			//rx.add(record, "base_saly_sum", StringUtil.replaceToXml(rec.base_saly_sum));
			//rx.add(record, "posk_saly_sum", StringUtil.replaceToXml(rec.posk_saly_sum));
			//rx.add(record, "mm_ordy_wag_sum", StringUtil.replaceToXml(rec.mm_ordy_wag_sum));
			//rx.add(record, "dd_basi_wag_sum", StringUtil.replaceToXml(rec.dd_basi_wag_sum));
			//rx.add(record, "vaca_rmn_dds_sum", StringUtil.replaceToXml(rec.vaca_rmn_dds_sum));
			//rx.add(record, "yymm_alon_sum", StringUtil.replaceToXml(rec.yymm_alon_sum));
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
<hd_vaca_2220_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd_nm/>
				<dept_nm/>
				<emp_no/>
				<in_cmpy_dt/>
				<nm_korn/>
				<dty_nm/>
				<posi_nm/>
				<year_vaca_dds_sum/>
				<add_vaca_dds_sum/>
				<occr_vaca_dds_sum/>
				<use_vaca_dds_sum/>
				<base_saly_sum/>
				<posk_saly_sum/>
				<mm_ordy_wag_sum/>
				<dd_basi_wag_sum/>
				<vaca_rmn_dds_sum/>
				<yymm_alon_sum/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_2220_l>
*/
%>

<% /* 작성시간 : Thu Jul 02 21:38:04 KST 2009 */ %>