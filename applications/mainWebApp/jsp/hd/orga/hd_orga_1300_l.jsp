<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1300_LDataSet ds = (HD_ORGA_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1300_LCURLISTRecord rec = (HD_ORGA_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "item", "");
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			rx.add(record, "value", rec.dept_cd);
			rx.add(record, "label", rec.dept_cd + " " + StringUtil.replaceToXml(rec.dept_nm));
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
			<dept_cd/>
			<dept_nm/>
			<abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 10:26:51 KST 2009 */ %>