<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.common.rec.*
	,	chosun.ciis.mt.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMON_MATR_0003_LDataSet ds = (MT_COMMON_MATR_0003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMON_MATR_0003_LCURLISTRecord rec = (MT_COMMON_MATR_0003_LCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			rx.add(dataSet, "matr_cd", rec.matr_cd);
			rx.add(dataSet, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			rx.add(dataSet, "dlco_nm", rec.dlco_nm);
			rx.add(dataSet, "dlco_no", rec.dlco_no);
			rx.add(dataSet, "ern", rec.ern);
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
			<matr_cd/>
			<matr_nm/>
			<unit/>
			<purc_uprc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 10 09:31:25 KST 2009 */ %>