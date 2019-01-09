<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1002_ADataSet ds = (CO_DLCO_1002_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int record = 0;
	int recordSet = 0;
	record = rx.add(root, "tempData", "");

	try {
		CO_DLCO_1002_ACURLISTRecord rec = (CO_DLCO_1002_ACURLISTRecord)ds.curlist.get(0);
//		int record = rx.add(formData, "dlco", "");
		rx.add(record, "dlco_no", rec.dlco_no);
		rx.add(record, "ern", rec.ern);
		rx.add(record, "sys_clsf_cd", rec.sys_clsf_cd);
		rx.add(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
		rx.add(record, "dlco_nm", rec.dlco_nm);
		rx.add(record, "setl_bank", rec.setl_bank);
		rx.add(record, "acct_no", rec.acct_no);
		rx.add(record, "corp_clsf", rec.corp_clsf);
		rx.addCData(record, "rcpm_main_nm", rec.rcpm_main_nm);

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
			<dlco_no/>
			<ern/>
			<sys_clsf_cd/>
			<dlco_abrv_nm/>
			<dlco_nm/>
			<setl_bank/>
			<acct_no/>
			<corp_clsf/>
			<rcpm_main_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 11:40:48 KST 2009 */ %>