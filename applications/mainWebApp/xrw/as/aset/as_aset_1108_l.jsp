<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1108_LDataSet ds = (AS_ASET_1108_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1108_LCURLISTRecord rec = (AS_ASET_1108_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "orgin_acqr_amt", rec.orgin_acqr_amt);
			rx.add(record, "buy_clsf_nm", rec.buy_clsf_nm);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.add(record, "aset_usag", rec.aset_usag);
			rx.add(record, "aset_size", rec.aset_size);
			rx.add(record, "aset_loca", rec.aset_loca);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<aset_no/>
			<aset_nm/>
			<dept_nm/>
			<acqr_dt/>
			<orgin_acqr_amt/>
			<buy_clsf_nm/>
			<aset_qunt_cnt/>
			<aset_usag/>
			<aset_size/>
			<aset_loca/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Mar 26 17:14:33 KST 2009 */ %>