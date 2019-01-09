<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1010_LDataSet ds = (HD_LVCMPY_1010_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_1010_LCURLISTRecord rec = (HD_LVCMPY_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "lvcmpy_nm", rec.lvcmpy_nm);
			rx.add(record, "lvcmpy_clsf", rec.lvcmpy_clsf);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "lvcmpy_nm", StringUtil.replaceToXml(rec.lvcmpy_nm));
			//rx.add(record, "lvcmpy_clsf", StringUtil.replaceToXml(rec.lvcmpy_clsf));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
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
<hd_lvcmpy_1010_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<lvcmpy_nm/>
				<lvcmpy_clsf/>
				<lvcmpy_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_1010_l>
*/
%>

<% /* 작성시간 : Tue Aug 04 16:54:40 KST 2009 */ %>