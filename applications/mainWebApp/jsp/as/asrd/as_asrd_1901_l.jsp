<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.asrd.rec.*
	,	chosun.ciis.as.asrd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASRD_1901_LDataSet ds = (AS_ASRD_1901_LDataSet)request.getAttribute("ds");
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
			AS_ASRD_1901_LCURLISTRecord rec = (AS_ASRD_1901_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "aset_stat", rec.aset_stat);
			rx.addCData(record, "aset_loca", rec.aset_loca);
			rx.addCData(record, "aset_size", rec.aset_size);
			rx.add(record, "aset_usag", rec.aset_usag);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "orgin_acqr_amt", rec.orgin_acqr_amt);
			rx.add(record, "un_redm_amt", rec.un_redm_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "dlco_ern", rec.dlco_ern);
			rx.add(record, "budg_cd", rec.budg_cd);
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
			<aset_no/>
			<aset_nm/>
			<aset_stat/>
			<aset_loca/>
			<aset_size/>
			<aset_usag/>
			<dept_nm/>
			<acqr_dt/>
			<orgin_acqr_amt/>
			<un_redm_amt/>
			<vat_amt/>
			<sale_dt/>
			<sale_amt/>
			<dlco_ern/>
			<budg_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 18:08:42 KST 2009 */ %>