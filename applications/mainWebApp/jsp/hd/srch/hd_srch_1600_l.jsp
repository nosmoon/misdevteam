<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1600_LDataSet ds = (HD_SRCH_1600_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	
	try {
		/****** CURLIST BEGIN */
	//	recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_1600_LCURLISTRecord rec = (HD_SRCH_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_name", rec.dept_name);
			rx.add(record, "dty_name", rec.dty_name);
			rx.add(record, "posi_name", rec.posi_name);
			rx.add(record, "addm_dept_cd", rec.addm_dept_cd);
			rx.add(record, "addm_insd_dept_cd", rec.addm_insd_dept_cd);
			rx.add(record, "addm_dty_cd", rec.addm_dty_cd);
			rx.add(record, "addm_posi_cd", rec.addm_posi_cd);
			rx.add(record, "addm_dept_name", rec.addm_dept_name);
			rx.add(record, "addm_dty_name", rec.addm_dty_name);
			rx.add(record, "addm_posi_name", rec.addm_posi_name);
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
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<prn/>
			<in_cmpy_dt/>
			<emp_clsf/>
			<emp_dtls_clsf/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<nm_korn/>
			<dept_name/>
			<dty_name/>
			<posi_name/>
			<addm_dept_cd/>
			<addm_insd_dept_cd/>
			<addm_dty_cd/>
			<addm_posi_cd/>
			<addm_dept_name/>
			<addm_dty_name/>
			<addm_posi_name/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 20:41:38 KST 2009 */ %>