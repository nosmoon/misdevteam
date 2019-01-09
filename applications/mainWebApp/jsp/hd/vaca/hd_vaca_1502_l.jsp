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
	HD_VACA_1502_LDataSet ds = (HD_VACA_1502_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_VACA_1502_LCURLIST2Record rec = (HD_VACA_1502_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "appm_vaca_plan_dt", rec.appm_vaca_plan_dt);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "appm_vaca_plan_dt", StringUtil.replaceToXml(rec.appm_vaca_plan_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1502_LCURLISTRecord rec = (HD_VACA_1502_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "real_vaca_dds", rec.real_vaca_dds);
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "duty_vaca_dds", rec.duty_vaca_dds);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_clsf_cd", StringUtil.replaceToXml(rec.emp_clsf_cd));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "emp_dtls_clsf", StringUtil.replaceToXml(rec.emp_dtls_clsf));
			//rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "real_vaca_dds", StringUtil.replaceToXml(rec.real_vaca_dds));
			//rx.add(record, "use_vaca_dds", StringUtil.replaceToXml(rec.use_vaca_dds));
			//rx.add(record, "duty_vaca_dds", StringUtil.replaceToXml(rec.duty_vaca_dds));
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
<hd_vaca_1502_l>
	<dataSet>
		<CURLIST2>
			<record>
				<emp_no/>
				<appm_vaca_plan_dt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_vaca_1502_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_1502_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<dept_cd/>
				<dept_nm/>
				<emp_clsf_cd/>
				<emp_clsf_nm/>
				<emp_dtls_clsf/>
				<emp_dtls_clsf_nm/>
				<emp_clsf/>
				<real_vaca_dds/>
				<use_vaca_dds/>
				<duty_vaca_dds/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1502_l>
*/
%>

<% /* 작성시간 : Thu Jul 16 13:26:31 KST 2009 */ %>