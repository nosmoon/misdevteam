<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.co.rec.*
	,	chosun.ciis.fc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_CO_8120_LDataSet ds = (FC_CO_8120_LDataSet)request.getAttribute("ds");
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
			FC_CO_8120_LCURLISTRecord rec = (FC_CO_8120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "checked", rec.checked);
			rx.add(record, "leas_no", rec.leas_no);
			rx.add(record, "leas_nm", rec.leas_nm);
			//rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			//rx.add(record, "leas_no", StringUtil.replaceToXml(rec.leas_no));
			//rx.add(record, "leas_nm", StringUtil.replaceToXml(rec.leas_nm));
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
<fc_co_8120_l>
	<dataSet>
		<CURLIST>
			<record>
				<checked/>
				<leas_no/>
				<leas_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_co_8120_l>
*/
%>

<% /* 작성시간 : Wed Apr 22 11:53:37 KST 2009 */ %>