<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8121_LDataSet ds = (FC_FUNC_8121_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_8121_LCURLISTRecord rec = (FC_FUNC_8121_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "column_nm", rec.column_nm);
			rx.add(record, "leas_a", rec.leas_a);
			rx.add(record, "leas_b", rec.leas_b);
			rx.add(record, "leas_c", rec.leas_c);
			rx.add(record, "leas_d", rec.leas_d);
			//rx.add(record, "column_nm", StringUtil.replaceToXml(rec.column_nm));
			//rx.add(record, "leas_a", StringUtil.replaceToXml(rec.leas_a));
			//rx.add(record, "leas_b", StringUtil.replaceToXml(rec.leas_b));
			//rx.add(record, "leas_c", StringUtil.replaceToXml(rec.leas_c));
			//rx.add(record, "leas_d", StringUtil.replaceToXml(rec.leas_d));
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
<fc_func_8121_l>
	<dataSet>
		<CURLIST>
			<record>
				<column_nm/>
				<leas_a/>
				<leas_b/>
				<leas_c/>
				<leas_d/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_8121_l>
*/
%>

<% /* 작성시간 : Wed Apr 22 16:48:37 KST 2009 */ %>