<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1406_LDataSet ds = (HD_DALON_1406_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int depth1		= 0;
	recordSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		depth1 = rx.add(recordSet, "dept_cd", "");
		
		//recordSet = rx.add(depth1, "item", "");
		//rx.add(recordSet, "value", "");
		//rx.add(recordSet, "label", "전체");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_1406_LCURLISTRecord rec = (HD_DALON_1406_LCURLISTRecord)ds.curlist.get(i);	
				recordSet = rx.add(depth1, "item", "");
				rx.add(recordSet, "value", rec.dept_cd);
				rx.add(recordSet, "label", StringUtil.replaceToXml(rec.dept_cd) + " " + StringUtil.replaceToXml(rec.abrv_nm));
		}

		//for(int i = 0; i < ds.curlist.size(); i++) {
			//HD_CO_1000_SCURLISTRecord rec = (HD_CO_1000_SCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "abrv_nm", rec.abrv_nm);
		//}
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<dept_cd/>
			<dept_nm/>
			<abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 09:24:33 KST 2009 */ %>