<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.card.rec.*
	,	chosun.ciis.hd.card.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CARD_1020_MDataSet ds = (HD_CARD_1020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int depth1 = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		depth1 = rx.add(dataSet, "open_invit", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CARD_1020_MCURLISTRecord rec = (HD_CARD_1020_MCURLISTRecord)ds.curlist.get(i);
			if ("OPEN_INVIT".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
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
			<dept_nm/>
			<dept_cd/>
			<emp_no/>
			<nm_korn/>
			<dty_cd/>
			<posi_cd/>
			<dty_nm/>
			<posi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 15 16:24:35 KST 2009 */ %>