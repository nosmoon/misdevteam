<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_2023_LDataSet ds = (MC_COST_2023_LDataSet)request.getAttribute("ds");
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
			MC_COST_2023_LCURLISTRecord rec = (MC_COST_2023_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "workdate", rec.workdate);
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "workdate", StringUtil.replaceToXml(rec.workdate));
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
<mc_cost_2023_l>
	<dataSet>
		<CURLIST>
			<record>
				<clos_yn/>
				<workdate/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_2023_l>
*/
%>

<% /* 작성시간 : Thu Jul 16 14:39:16 KST 2009 */ %>