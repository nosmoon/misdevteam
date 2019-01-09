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
	HD_INFO_5251_LDataSet ds = (HD_INFO_5251_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "Prvcarr", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5251_LCURLISTRecord rec = (HD_INFO_5251_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "carr_seq", rec.carr_seq);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "dty", rec.dty);
			rx.add(record, "posk", rec.posk);
			rx.add(record, "asaly", rec.asaly);
			rx.add(record, "lvcmpy_resn", rec.lvcmpy_resn);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.add(record, "natn_nm", rec.natn_nm);
			rx.add(record, "duty_yys", rec.duty_yys);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "carr_aprv_yys", rec.carr_aprv_yys);
			rx.add(record, "carr_aprv_dds", rec.carr_aprv_dds);
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
			<carr_seq/>
			<in_cmpy_dt/>
			<lvcmpy_dt/>
			<offi_nm/>
			<dty/>
			<posk/>
			<asaly/>
			<lvcmpy_resn/>
			<natn_cd/>
			<duty_yys/>
			<duty_dds/>
			<carr_aprv_yys/>
			<carr_aprv_dds/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 10 15:30:42 KST 2009 */ %>