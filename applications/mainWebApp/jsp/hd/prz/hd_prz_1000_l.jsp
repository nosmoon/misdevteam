<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.prz.rec.*
	,	chosun.ciis.hd.prz.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_PRZ_1000_LDataSet ds = (HD_PRZ_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	// dataSet = rx.add(root, "initData", "");
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRZ_1000_LCURLISTRecord rec = (HD_PRZ_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "infoData", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "req_pers_emp_no", "");
			rx.add(record, "req_pers_dept_cd", "");
			rx.add(record, "atic_pubc_dt", "");
			rx.add(record, "atic_pubc_side", "");
			rx.add(record, "case_nm", "");
			rx.add(record, "prz_cont", "");
			rx.add(record, "aplc_clsf", "");
			rx.add(record, "obj_clsf", "");
			rx.add(record, "prz_pnsh_cd", "");
			rx.add(record, "ov_cmpy_cd", "");
			rx.add(record, "ov_occr_dt", "");
			rx.add(record, "ov_max_seq", "");
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
			<nm_korn/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 23 15:09:51 KST 2009 */ %>