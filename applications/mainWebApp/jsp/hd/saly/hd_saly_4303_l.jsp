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
	HD_SALY_4303_LDataSet ds = (HD_SALY_4303_LDataSet)request.getAttribute("ds");
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
			HD_SALY_4303_LCURLISTRecord rec = (HD_SALY_4303_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "acpn_yy", rec.acpn_yy);
			rx.add(record, "acpn_seq", rec.acpn_seq);
			rx.add(record, "seiz_dduc_tms", rec.seiz_dduc_tms);
			rx.add(record, "proc_clsf", rec.proc_clsf);
			rx.add(record, "dduc_dt", rec.dduc_dt);
			rx.add(record, "seiz_dduc_amt", rec.seiz_dduc_amt);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "acpn_yy", StringUtil.replaceToXml(rec.acpn_yy));
			//rx.add(record, "acpn_seq", StringUtil.replaceToXml(rec.acpn_seq));
			//rx.add(record, "seiz_dduc_tms", StringUtil.replaceToXml(rec.seiz_dduc_tms));
			//rx.add(record, "proc_clsf", StringUtil.replaceToXml(rec.proc_clsf));
			//rx.add(record, "dduc_dt", StringUtil.replaceToXml(rec.dduc_dt));
			//rx.add(record, "seiz_dduc_amt", StringUtil.replaceToXml(rec.seiz_dduc_amt));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
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
<hd_saly_4303_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<acpn_yy/>
				<acpn_seq/>
				<seiz_dduc_tms/>
				<proc_clsf/>
				<dduc_dt/>
				<seiz_dduc_amt/>
				<emp_no/>
				<flnm/>
				<dept_cd/>
				<saly_yy/>
				<saly_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_4303_l>
*/
%>

<% /* 작성시간 : Wed Sep 16 20:36:59 KST 2009 */ %>