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
	HD_SRCH_1200_LDataSet ds = (HD_SRCH_1200_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1200_LCURLISTRecord rec = (HD_SRCH_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "birth_dt", rec.birth_dt);
			rx.add(record, "min_in_cmpy_dt", rec.min_in_cmpy_dt);
			rx.add(record, "lvcmpy_ck", rec.lvcmpy_ck);
			rx.add(record, "lvcmpy_dty_nm", rec.lvcmpy_dty_nm);
			rx.add(record, "lvcmpy_posi_nm", rec.lvcmpy_posi_nm);
			rx.add(record, "lvcmpy_emp_clsf_nm", rec.lvcmpy_emp_clsf_nm);
			rx.add(record, "lvcmpy_saly", rec.lvcmpy_saly);
			rx.add(record, "last_in_cmpy_saly", rec.last_in_cmpy_saly);
			rx.add(record, "now_saly", rec.now_saly);
			rx.add(record, "last_lvcmpy_dt", rec.last_lvcmpy_dt);
			rx.add(record, "last_in_cmpy_dt", rec.last_in_cmpy_dt);
			rx.add(record, "last_in_cmpy_dt_ck", rec.last_in_cmpy_dt_ck);
			rx.add(record, "old_cmpy_dt", rec.old_cmpy_dt);
			rx.add(record, "now_cmpy_dt", rec.now_cmpy_dt);
			rx.add(record, "tot_cmpy_dt", rec.tot_cmpy_dt);
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
			<nm_korn/>
			<cd_nm/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
			<emp_clsf_nm/>
			<birth_dt/>
			<min_in_cmpy_dt/>
			<lvcmpy_ck/>
			<lvcmpy_dty_nm/>
			<lvcmpy_posi_nm/>
			<lvcmpy_emp_clsf_nm/>
			<lvcmpy_saly/>
			<last_in_cmpy_saly/>
			<now_saly/>
			<last_lvcmpy_dt/>
			<last_in_cmpy_dt/>
			<last_in_cmpy_dt_ck/>
			<old_cmpy_dt/>
			<now_cmpy_dt/>
			<tot_cmpy_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 08 16:51:12 KST 2009 */ %>