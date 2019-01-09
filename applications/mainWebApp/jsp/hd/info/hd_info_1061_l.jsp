<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1061_LDataSet ds = (HD_INFO_1061_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1061_LCURLISTRecord rec = (HD_INFO_1061_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "carr_seq", rec.carr_seq);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			rx.add(record, "dty", rec.dty);
			rx.add(record, "posk", StringUtil.replaceToXml(rec.posk));
			rx.add(record, "asaly", rec.asaly);
			rx.add(record, "lvcmpy_resn", StringUtil.replaceToXml(rec.lvcmpy_resn));
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.add(record, "natn_nm", StringUtil.replaceToXml(rec.natn_nm));
			rx.add(record, "duty_yys", rec.duty_yys);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "carr_aprv_yys", rec.carr_aprv_yys);
			rx.add(record, "carr_aprv_dds", rec.carr_aprv_dds);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<emp_no/>
			<carr_seq/>
			<in_cmpy_dt/>
			<lvcmpy_dt/>
			<offi_nm/>
			<dty/>
			<posk/>
			<saly/>
			<natn_cd/>
			<natn_nm/>
			<duty_mms/>
			<lvcmpy_resn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Feb 07 11:31:14 KST 2009 */ %>