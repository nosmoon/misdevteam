<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1202_LDataSet ds = (HD_VACA_1202_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData2", "");

	try {
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1202_LCURLISTRecord rec = (HD_VACA_1202_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aply_yy", rec.aply_yy);
			rx.add(record, "year_vaca_dds", rec.year_vaca_dds);
			rx.add(record, "add_vaca_dds", rec.add_vaca_dds);
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "duty_vaca_dds", rec.duty_vaca_dds);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<tempData>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<aply_yy/>
			<year_vaca_dds/>
			<add_vaca_dds/>
			<use_vaca_dds/>
			<duty_vaca_dds/>
			<rmn_vaca_dds/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Thu Apr 23 18:08:50 KST 2009 */ %>