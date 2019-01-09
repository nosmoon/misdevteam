<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_8006_LDataSet ds = (MT_PAPORD_8006_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_8006_LCURLISTRecord rec = (MT_PAPORD_8006_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "roll_a", rec.roll_a);
			rx.add(record, "roll_c", rec.roll_c);
			rx.add(record, "roll_b", rec.roll_b);
			//rx.add(record, "roll_a", StringUtil.replaceToXml(rec.roll_a));
			//rx.add(record, "roll_c", StringUtil.replaceToXml(rec.roll_c));
			//rx.add(record, "roll_b", StringUtil.replaceToXml(rec.roll_b));
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<mt_papord_8006_l>
	<dataSet>
		<CURLIST>
			<record>
				<roll_a/>
				<roll_c/>
				<roll_b/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_8006_l>
*/
%>

<% /* 작성시간 : Fri Oct 28 16:14:10 KST 2016 */ %>