<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_3000_LDataSet ds = (HD_DDEMP_3000_LDataSet)request.getAttribute("ds");
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
			HD_DDEMP_3000_LCURLISTRecord rec = (HD_DDEMP_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_yymm", rec.duty_yymm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "studt_wk_yn", rec.studt_wk_yn);
			rx.add(record, "emp_insr_dduc_yn", rec.emp_insr_dduc_yn);
			rx.add(record, "proc_nm", rec.proc_nm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "hd_decid_pers", rec.hd_decid_pers);
			rx.add(record, "hd_decid_dt_tm", rec.hd_decid_dt_tm);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "all_insr_dduc_yn", rec.all_insr_dduc_yn);

			//rx.add(record, "duty_yymm", StringUtil.replaceToXml(rec.duty_yymm));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "studt_wk_yn", StringUtil.replaceToXml(rec.studt_wk_yn));
			//rx.add(record, "emp_insr_dduc_yn", StringUtil.replaceToXml(rec.emp_insr_dduc_yn));
			//rx.add(record, "proc_nm", StringUtil.replaceToXml(rec.proc_nm));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "hd_decid_pers", StringUtil.replaceToXml(rec.hd_decid_pers));
			//rx.add(record, "hd_decid_dt_tm", StringUtil.replaceToXml(rec.hd_decid_dt_tm));
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
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
<hd_ddemp_3000_l>
	<dataSet>
		<CURLIST>
			<record>
				<duty_yymm/>
				<prn/>
				<flnm/>
				<studt_wk_yn/>
				<emp_insr_dduc_yn/>
				<proc_nm/>
				<nm_korn/>
				<pay_amt/>
				<dept_nm/>
				<hd_decid_pers/>
				<hd_decid_dt_tm/>
				<clos_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_ddemp_3000_l>
*/
%>

<% /* 작성시간 : Thu Jun 11 18:34:48 KST 2009 */ %>