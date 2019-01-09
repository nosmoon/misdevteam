<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1107_LDataSet ds = (HD_DUTY_1107_LDataSet)request.getAttribute("ds");
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
			HD_DUTY_1107_LCURLISTRecord rec = (HD_DUTY_1107_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
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
<hd_duty_1107_l>
	<dataSet>
		<CURLIST>
			<record>
				<cnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_duty_1107_l>
*/
%>

<% /* 작성시간 : Tue Jul 21 22:38:13 KST 2009 */ %>