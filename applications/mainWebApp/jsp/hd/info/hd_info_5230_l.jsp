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
	HD_INFO_5230_LDataSet ds = (HD_INFO_5230_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "Qulfpems", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5230_LCURLISTRecord rec = (HD_INFO_5230_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
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
			<qulf_pems_seq/>
			<qulf_pems_cd/>
			<qulf_pems_flnm/>
			<qulf_no/>
			<qulf_pems_nm/>
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

<% /* 작성시간 : Thu Apr 09 21:16:27 KST 2009 */ %>