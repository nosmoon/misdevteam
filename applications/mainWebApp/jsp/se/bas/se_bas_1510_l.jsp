<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_BAS_1510_LDataSet ds = (SE_BAS_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** JOBLIST BEGIN */
		recordSet = rx.add(dataSet, "JOBLIST", "");

		for(int i = 0; i < ds.joblist.size(); i++) {
			SE_BAS_1510_LJOBLISTRecord rec = (SE_BAS_1510_LJOBLISTRecord)ds.joblist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_emp_nm", rec.chrg_emp_nm);
			rx.add(record, "clos_pers_emp_nm", rec.clos_pers_emp_nm);
			rx.add(record, "clos_proc_dt", rec.clos_proc_dt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "work_remk_1", rec.work_remk_1);
			rx.add(record, "work_remk_2", rec.work_remk_2);
		}
		/****** JOBLIST END */

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
	<JOBLIST>
		<record>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<chrg_emp_nm/>
			<clos_pers_emp_nm/>
			<clos_proc_dt/>
			<clos_yn/>
			<work_remk_1/>
			<work_remk_2/>
		</record>
	</JOBLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Aug 21 10:44:09 KST 2009 */ %>