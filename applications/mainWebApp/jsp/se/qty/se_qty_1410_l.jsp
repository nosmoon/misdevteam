<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_QTY_1410_LDataSet ds = (SE_QTY_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	dataSet = rx.add(root, "gridData", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1410_LCURLISTRecord rec = (SE_QTY_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "tms", rec.tms);
			rx.add(record, "curmm_val_qty", rec.curmm_val_qty);
			rx.add(record, "curmm_no_val_qty", rec.curmm_no_val_qty);
			rx.add(record, "curmm_issu_qty", rec.curmm_issu_qty);
			rx.add(record, "gnr_enty_qty", rec.gnr_enty_qty);
			rx.add(record, "isenty_qty", rec.isenty_qty);
			rx.add(record, "isicdc_qty", rec.isicdc_qty);
			rx.add(record, "rdr_extn_enty_qty", rec.rdr_extn_enty_qty);
			rx.add(record, "val_movm_qty", rec.val_movm_qty);
			rx.add(record, "val_icdc_qty", rec.val_icdc_qty);
		}

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
			<tms/>
			<curmm_val_qty/>
			<curmm_no_val_qty/>
			<curmm_issu_qty/>
			<gnr_enty_qty/>
			<isenty_qty/>
			<isicdc_qty/>
			<rdr_extn_enty_qty/>
			<val_movm_qty/>
			<val_icdc_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 19 19:09:38 KST 2009 */ %>