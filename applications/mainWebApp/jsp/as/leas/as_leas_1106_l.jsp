<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1106_LDataSet ds = (AS_LEAS_1106_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_LEAS_1106_LCURLIST1Record rec = (AS_LEAS_1106_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_size", rec.aset_size);
			rx.add(record, "leas_dlco_ern", rec.leas_dlco_ern);
			rx.add(record, "leas_dlco_nm", rec.leas_dlco_nm);
			//rx.add(record, "aset_size", StringUtil.replaceToXml(rec.aset_size));
			//rx.add(record, "leas_dlco_ern", StringUtil.replaceToXml(rec.leas_dlco_ern));
			//rx.add(record, "leas_dlco_nm", StringUtil.replaceToXml(rec.leas_dlco_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<as_leas_1106_l>
	<dataSet>
		<CURLIST1>
			<record>
				<aset_size/>
				<leas_dlco_ern/>
				<leas_dlco_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</as_leas_1106_l>
*/
%>

<% /* 작성시간 : Fri Apr 10 13:58:27 KST 2009 */ %>