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
	MC_COST_2013_LDataSet ds = (MC_COST_2013_LDataSet)request.getAttribute("ds");
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
			MC_COST_2013_LCURLISTRecord rec = (MC_COST_2013_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cost_dstb_cd", rec.cost_dstb_cd);
			rx.add(record, "intfce_yn", rec.intfce_yn);
			//rx.add(record, "cost_dstb_cd", StringUtil.replaceToXml(rec.cost_dstb_cd));
			//rx.add(record, "intfce_yn", StringUtil.replaceToXml(rec.intfce_yn));
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
<mc_cost_2013_l>
	<dataSet>
		<CURLIST>
			<record>
				<cost_dstb_cd/>
				<intfce_yn/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_2013_l>
*/
%>

<% /* 작성시간 : Wed May 06 17:51:58 KST 2009 */ %>