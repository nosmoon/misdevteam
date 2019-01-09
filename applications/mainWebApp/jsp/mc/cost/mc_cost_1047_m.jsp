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
	MC_COST_1047_MDataSet ds = (MC_COST_1047_MDataSet)request.getAttribute("ds");
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
			MC_COST_1047_MCURLISTRecord rec = (MC_COST_1047_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bucdnm", rec.bucdnm);
			rx.add(record, "bucd", rec.bucd);
			rx.add(record, "bunm", rec.bunm);
			//rx.add(record, "bucdnm", StringUtil.replaceToXml(rec.bucdnm));
			//rx.add(record, "bucd", StringUtil.replaceToXml(rec.bucd));
			//rx.add(record, "bunm", StringUtil.replaceToXml(rec.bunm));
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
<mc_cost_1047_m>
	<dataSet>
		<CURLIST>
			<record>
				<bucdnm/>
				<bucd/>
				<bunm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1047_m>
*/
%>

<% /* �ۼ��ð� : Wed May 06 11:48:33 KST 2009 */ %>