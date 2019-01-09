<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1001_LDataSet ds = (HD_INFO_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//dataSet = rx.add(root, "dataSet", "");
	int record = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1001_LCURLISTRecord rec = (HD_INFO_1001_LCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "nm_chin", rec.nm_chin);
			rx.add(record, "nm_engl", rec.nm_engl);
			rx.add(record, "emp_dtls_clsf", rec.emp_dtls_clsf);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "emp_clsf_cd", rec.emp_clsf_cd);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.addCData(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "alon_pay_dept_yn", rec.alon_pay_dept_yn);
			rx.add(record, "addm_dept_cd", rec.addm_dept_cd);
			rx.add(record, "addm_dept_nm", rec.addm_dept_nm);
			rx.add(record, "addm_dty_cd", rec.addm_dty_cd);
			rx.add(record, "addm_dty_nm", rec.addm_dty_nm);
			rx.add(record, "addm_posi_cd", rec.addm_posi_cd);
			rx.add(record, "addm_posi_nm", rec.addm_posi_nm);
			rx.add(record, "addm_alon_pay_dept_yn", rec.addm_alon_pay_dept_yn);
			rx.add(record, "dspch_enpr_main_clsf", rec.dspch_enpr_main_clsf);
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
			<prn/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<in_cmpy_dt/>
			<addm_dept_cd/>
			<addm_dept_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 02 15:37:46 KST 2009 */ %>