<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2500_LDataSet ds = (HD_LVCMPY_2500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_LVCMPY_2500_LCURLIST1Record rec = (HD_LVCMPY_2500_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "incmp_welf_livg_lon_bal", rec.incmp_welf_livg_lon_bal);
			rx.add(record, "incmp_welf_livg_lon_int", rec.incmp_welf_livg_lon_int);
			rx.add(record, "jrnst_safe_livg_patr_boks_bal", rec.jrnst_safe_livg_patr_boks_bal);
			rx.add(record, "jrnst_safe_livg_patr_boks_int", rec.jrnst_safe_livg_patr_boks_int);
			rx.add(record, "lvcmpy_amt_etc_dduc_nm", rec.lvcmpy_amt_etc_dduc_nm);
			rx.add(record, "lvcmpy_amt_etc_dduc", rec.lvcmpy_amt_etc_dduc);
			rx.add(record, "adv_bal", rec.adv_bal);
			//rx.add(record, "incmp_welf_livg_lon_bal", StringUtil.replaceToXml(rec.incmp_welf_livg_lon_bal));
			//rx.add(record, "incmp_welf_livg_lon_int", StringUtil.replaceToXml(rec.incmp_welf_livg_lon_int));
			//rx.add(record, "jrnst_safe_livg_patr_boks_bal", StringUtil.replaceToXml(rec.jrnst_safe_livg_patr_boks_bal));
			//rx.add(record, "jrnst_safe_livg_patr_boks_int", StringUtil.replaceToXml(rec.jrnst_safe_livg_patr_boks_int));
			//rx.add(record, "lvcmpy_amt_etc_dduc_nm", StringUtil.replaceToXml(rec.lvcmpy_amt_etc_dduc_nm));
			//rx.add(record, "lvcmpy_amt_etc_dduc", StringUtil.replaceToXml(rec.lvcmpy_amt_etc_dduc));
			//rx.add(record, "adv_bal", StringUtil.replaceToXml(rec.adv_bal));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_2500_LCURLISTRecord rec = (HD_LVCMPY_2500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "lon_clsf_cd", rec.lon_clsf_cd);
			rx.add(record, "lon_clsf_nm", rec.lon_clsf_nm);
			rx.add(record, "lon_dt", rec.lon_dt);
			rx.add(record, "repay_months", rec.repay_months);
			rx.add(record, "lon_prcp", rec.lon_prcp);
			rx.add(record, "yy_int_rate", rec.yy_int_rate);
			rx.add(record, "pymt_acml_tms", rec.pymt_acml_tms);
			rx.add(record, "rmn_amt", rec.rmn_amt);
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<lon_clsf_cd/>
			<lon_clsf_nm/>
			<lon_dt/>
			<repay_months/>
			<lon_prcp/>
			<yy_int_rate/>
			<pymt_acml_tms/>
			<rmn_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 19 09:58:40 KST 2009 */ %>