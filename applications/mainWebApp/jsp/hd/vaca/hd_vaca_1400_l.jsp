<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1400_LDataSet ds = (HD_VACA_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1400_LCURLISTRecord rec = (HD_VACA_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
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
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "aply_yy", rec.aply_yy);
			rx.add(record, "qq_clsf", rec.qq_clsf);
			rx.add(record, "vaca_dds1", rec.vaca_dds1);
			rx.add(record, "vaca_dds2", rec.vaca_dds2);
			rx.add(record, "vaca_dds3", rec.vaca_dds3);
			rx.add(record, "vaca_dds4", rec.vaca_dds4);
			rx.add(record, "vaca_dds5", rec.vaca_dds5);
			rx.add(record, "vaca_dds6", rec.vaca_dds6);
			rx.add(record, "vaca_dds7", rec.vaca_dds7);
			rx.add(record, "vaca_dds8", rec.vaca_dds8);
			rx.add(record, "vaca_dds9", rec.vaca_dds9);
			rx.add(record, "vaca_dds10", rec.vaca_dds10);
			rx.add(record, "vaca_dds11", rec.vaca_dds11);
			rx.add(record, "vaca_dds12", rec.vaca_dds12);
			rx.add(record, "vaca_dds13", rec.vaca_dds13);
			rx.add(record, "vaca_dds14", rec.vaca_dds14);
			rx.add(record, "vaca_dds15", rec.vaca_dds15);
			rx.add(record, "chkok", rec.chkok);
			rx.add(record, "chkreturn", rec.chkreturn);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<tempData>
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
			<proc_stat/>
			<proc_stat_nm/>
			<aply_yy/>
			<qq_clsf/>
			<vaca_dds1/>
			<vaca_dds2/>
			<vaca_dds3/>
			<vaca_dds4/>
			<vaca_dds5/>
			<vaca_dds6/>
			<vaca_dds7/>
			<vaca_dds8/>
			<vaca_dds9/>
			<vaca_dds10/>
			<vaca_dds11/>
			<vaca_dds12/>
			<vaca_dds13/>
			<vaca_dds14/>
			<vaca_dds15/>
			<chkok/>
			<chkreturn/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Sun Apr 26 16:38:00 KST 2009 */ %>