<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1160_LDataSet ds = (FC_FUNC_1160_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
    int resData = 0;
    int gridData = 0;
	int dataSet = 0;
    int MMDHONNOTEBAL = 0;

	String errcode = "";
	String errmsg = "";

	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** MMDHONNOTEBAL BEGIN */
		MMDHONNOTEBAL = rx.add(dataSet, "MMDHONNOTEBAL", "");

		for(int i = 0; i < ds.mmdhonnotebal.size(); i++) {
			FC_FUNC_1160_LMMDHONNOTEBALRecord rec = (FC_FUNC_1160_LMMDHONNOTEBALRecord)ds.mmdhonnotebal.get(i);
			int record = rx.add(MMDHONNOTEBAL, "record", "");
			rx.add(record, "basiyymm", rec.basiyymm);
			rx.add(record, "occrcnt", rec.occrcnt);
			rx.add(record, "occramt", rec.occramt);
			rx.add(record, "extnccnt", rec.extnccnt);
			rx.add(record, "extncamt", rec.extncamt);
			rx.add(record, "bddbcnt", rec.bddbcnt);
			rx.add(record, "bddbamt", rec.bddbamt);
			rx.add(record, "balcnt", rec.balcnt);
			rx.add(record, "balamt", rec.balamt);
		}
		rx.add(MMDHONNOTEBAL, "totalcnt", ds.mmdhonnotebal.size());
		/****** MMDHONNOTEBAL END */

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
	<MMDHONNOTEBAL>
		<record>
			<basiyymm/>
			<occrcnt/>
			<occramt/>
			<extnccnt/>
			<extncamt/>
			<bddbcnt/>
			<bddbamt/>
			<balcnt/>
			<balamt/>
		</record>
	</MMDHONNOTEBAL>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 05 11:36:23 KST 2009 */ %>
