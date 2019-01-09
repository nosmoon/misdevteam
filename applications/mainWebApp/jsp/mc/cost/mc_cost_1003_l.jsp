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
	MC_COST_1003_LDataSet ds = (MC_COST_1003_LDataSet)request.getAttribute("ds");
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
			MC_COST_1003_LCURLISTRecord rec = (MC_COST_1003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bbpct_count", rec.bbpct_count);
			rx.add(record, "yeasancd_count", rec.yeasancd_count);
			rx.add(record, "cdbuseo_count", rec.cdbuseo_count);
			//rx.add(record, "bbpct_count", StringUtil.replaceToXml(rec.bbpct_count));
			//rx.add(record, "yeasancd_count", StringUtil.replaceToXml(rec.yeasancd_count));
			//rx.add(record, "cdbuseo_count", StringUtil.replaceToXml(rec.cdbuseo_count));
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
<mc_cost_1003_l>
	<dataSet>
		<CURLIST>
			<record>
				<bbpct_count/>
				<yeasancd_count/>
				<cdbuseo_count/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1003_l>
*/
%>

<% /* 작성시간 : Thu Apr 16 10:41:54 KST 2009 */ %>