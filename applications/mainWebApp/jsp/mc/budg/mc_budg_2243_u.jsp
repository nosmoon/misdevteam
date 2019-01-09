<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_2243_UDataSet ds = (MC_BUDG_2243_UDataSet)request.getAttribute("ds");
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
			MC_BUDG_2243_UCURLISTRecord rec = (MC_BUDG_2243_UCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rv_i", rec.rv_i);
			rx.add(record, "rv_s", rec.rv_s);
			rx.add(record, "rv_f", rec.rv_f);
			//rx.add(record, "rv_i", StringUtil.replaceToXml(rec.rv_i));
			//rx.add(record, "rv_s", StringUtil.replaceToXml(rec.rv_s));
			//rx.add(record, "rv_f", StringUtil.replaceToXml(rec.rv_f));
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
<mc_budg_2243_u>
	<dataSet>
		<CURLIST>
			<record>
				<rv_i/>
				<rv_s/>
				<rv_f/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2243_u>
*/
%>

<% /* 작성시간 : Wed May 06 15:53:15 KST 2009 */ %>