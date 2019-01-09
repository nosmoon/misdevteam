<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1003_LDataSet ds = (HD_ORGA_1003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "main", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1003_LCURLISTRecord rec = (HD_ORGA_1003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "pre_dept_cd", rec.pre_dept_cd);
			rx.add(record, "pre_dept_nm", rec.pre_dept_nm);
			rx.add(record, "pre_dept_flnm", rec.pre_dept_cd + ' ' + rec.pre_dept_nm);
			rx.add(record, "chg_aft_dept_cd", rec.chg_aft_dept_cd);
			rx.add(record, "chg_aft_dept_nm", rec.chg_aft_dept_nm);
			rx.add(record, "chg_aft_dept_flnm", rec.chg_aft_dept_cd + ' ' + rec.chg_aft_dept_nm);
			rx.add(record, "dept_clsf", rec.dept_clsf);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
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
			<dept_cd/>
			<seq/>
			<dept_nm/>
			<pre_dept_cd/>
			<pre_dept_nm/>
			<chg_aft_dept_cd/>
			<chg_aft_dept_nm/>
			<dept_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 16 13:52:05 KST 2009 */ %>