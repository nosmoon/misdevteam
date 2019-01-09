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
	MC_COST_2012_LDataSet ds = (MC_COST_2012_LDataSet)request.getAttribute("ds");
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
			MC_COST_2012_LCURLISTRecord rec = (MC_COST_2012_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cost_dstb_cd", rec.cost_dstb_cd);
			rx.add(record, "wbbcdnm", rec.wbbcdnm);
			rx.add(record, "total_qty", rec.total_qty);
			//rx.add(record, "cost_dstb_cd", StringUtil.replaceToXml(rec.cost_dstb_cd));
			//rx.add(record, "wbbcdnm", StringUtil.replaceToXml(rec.wbbcdnm));
			//rx.add(record, "total_qty", StringUtil.replaceToXml(rec.total_qty));
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
<mc_cost_2012_l>
	<dataSet>
		<CURLIST>
			<record>
				<cost_dstb_cd/>
				<wbbcdnm/>
				<total_qty/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_2012_l>
*/
%>

<% /* 작성시간 : Wed May 06 17:51:58 KST 2009 */ %>