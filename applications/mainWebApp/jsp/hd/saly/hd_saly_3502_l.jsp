<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_3502_LDataSet ds = (HD_SALY_3502_LDataSet)request.getAttribute("ds");
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
			HD_SALY_3502_LCURLISTRecord rec = (HD_SALY_3502_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "total_amt", rec.total_amt);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "emp_insr_fee", rec.emp_insr_fee);
			rx.add(record, "total_fee", rec.total_fee);
			rx.add(record, "cal_pay_amt", rec.cal_pay_amt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "gugcd", rec.gugcd);
			rx.add(record, "gugcd_nm", rec.gugcd_nm);
			rx.add(record, "bucd", rec.bucd);
			rx.add(record, "bucd_nm", rec.bucd_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "emp_flnm", rec.emp_flnm);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "total_amt", StringUtil.replaceToXml(rec.total_amt));
			//rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			//rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			//rx.add(record, "emp_insr_fee", StringUtil.replaceToXml(rec.emp_insr_fee));
			//rx.add(record, "total_fee", StringUtil.replaceToXml(rec.total_fee));
			//rx.add(record, "cal_pay_amt", StringUtil.replaceToXml(rec.cal_pay_amt));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "gugcd", StringUtil.replaceToXml(rec.gugcd));
			//rx.add(record, "gugcd_nm", StringUtil.replaceToXml(rec.gugcd_nm));
			//rx.add(record, "bucd", StringUtil.replaceToXml(rec.bucd));
			//rx.add(record, "bucd_nm", StringUtil.replaceToXml(rec.bucd_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "emp_flnm", StringUtil.replaceToXml(rec.emp_flnm));
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
<hd_saly_3502_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<total_amt/>
				<incm_tax/>
				<res_tax/>
				<emp_insr_fee/>
				<total_fee/>
				<cal_pay_amt/>
				<cmpy_cd/>
				<gugcd/>
				<gugcd_nm/>
				<bucd/>
				<bucd_nm/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<emp_flnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_3502_l>
*/
%>

<% /* 작성시간 : Fri Oct 23 15:51:00 KST 2009 */ %>