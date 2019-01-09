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
	AS_ASET_1106_LDataSet ds = (AS_ASET_1106_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1106_LCURLISTRecord rec = (AS_ASET_1106_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "cur_acqr_amt", rec.cur_acqr_amt);
			rx.add(record, "tot_redm_amt", rec.tot_redm_amt);
			rx.add(record, "un_redm_amt", rec.un_redm_amt);
			rx.add(record, "chg_amt", rec.chg_amt);
			rx.add(record, "chg_vat_amt", rec.chg_vat_amt);
			rx.add(record, "sale_pfls_amt", rec.sale_pfls_amt);
			rx.add(record, "remk", rec.remk);
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
			<cur_acqr_amt/>
			<tot_redm_amt/>
			<un_redm_amt/>
			<chg_amt/>
			<chg_vat_amt/>
			<sale_pfls_amt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 15:36:33 KST 2009 */ %>