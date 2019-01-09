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
	HD_INFO_1071_LDataSet ds = (HD_INFO_1071_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1071_LCURLISTRecord rec = (HD_INFO_1071_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "qulf_pems_seq", rec.qulf_pems_seq);
			rx.add(record, "qulf_pems_cd", rec.qulf_pems_cd);
			rx.add(record, "qulf_pems_flnm", rec.qulf_pems_flnm);
			rx.add(record, "qulf_no", rec.qulf_no);
			rx.add(record, "qulf_pems_nm", rec.qulf_pems_nm);
			rx.add(record, "qulf_pems_issu_plac_cd", rec.qulf_pems_issu_plac_cd);
			rx.add(record, "qulf_pems_issu_plac_flnm", rec.qulf_pems_issu_plac_flnm);
			rx.add(record, "qulf_pems_issu_plac_nm", rec.qulf_pems_issu_plac_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
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
			<qulf_pems_seq/>
			<qulf_pems_cd/>
			<qulf_pems_flnm/>
			<qulf_no/>
			<qulf_perm_nm/>
			<qulf_pems_issu_plac_cd/>
			<qulf_pems_issu_plac_flnm/>
			<qulf_pems_issu_plac_nm/>
			<acqr_dt/>
			<mtry_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Feb 07 15:04:37 KST 2009 */ %>