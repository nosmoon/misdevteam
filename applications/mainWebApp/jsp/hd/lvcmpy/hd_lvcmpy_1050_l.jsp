<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1050_LDataSet ds = (HD_LVCMPY_1050_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_1050_LCURLISTRecord rec = (HD_LVCMPY_1050_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "check", "");
			rx.add(record, "cmpy_cd_1", rec.cmpy_cd_1);
			rx.add(record, "duty_dt_1", rec.duty_dt_1);
			rx.add(record, "emp_no_1", rec.emp_no_1);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "hody_nm", rec.hody_nm);
			rx.add(record, "cmpy_cd_2", rec.cmpy_cd_2);
			rx.add(record, "duty_dt_2", rec.duty_dt_2);
			rx.add(record, "emp_no_2", rec.emp_no_2);
			rx.add(record, "base_alon", rec.base_alon);
			rx.add(record, "cmpn_alon", rec.cmpn_alon);
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
			<cmpy_cd_1/>
			<duty_dt_1/>
			<emp_no_1/>
			<hody_clsf/>
			<hody_nm/>
			<cmpy_cd_2/>
			<duty_dt_2/>
			<emp_no_2/>
			<base_alon/>
			<cmpn_alon/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 29 21:06:42 KST 2009 */ %>