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
	MC_COST_1023_LDataSet ds = (MC_COST_1023_LDataSet)request.getAttribute("ds");
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
			MC_COST_1023_LCURLISTRecord rec = (MC_COST_1023_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<mc_cost_1023_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1023_l>
*/
%>

<% /* �ۼ��ð� : Wed Jul 15 15:48:11 KST 2009 */ %>