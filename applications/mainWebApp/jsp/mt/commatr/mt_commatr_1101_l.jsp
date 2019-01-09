<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,   chosun.ciis.co.base.util.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_1101_LDataSet ds = (MT_COMMATR_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		if( ds.curlist.size() > 0 ) {
			MT_COMMATR_1101_LCURLISTRecord rec = (MT_COMMATR_1101_LCURLISTRecord)ds.curlist.get(0);
			int record = rx.add(dataSet, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
		}
		else {
			int record = rx.add(dataSet, "matr_nm", "");
		}
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
			<matr_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 19 20:03:12 KST 2009 */ %>