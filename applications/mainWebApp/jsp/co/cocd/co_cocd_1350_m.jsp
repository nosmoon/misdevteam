<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1350_MDataSet ds = (CO_COCD_1350_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist = rx.add(root, "curlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_COCD_1350_MCURLISTRecord rec = (CO_COCD_1350_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist, "record", "");
			
			rx.add(record, "menu_id", rec.menu_id);
			rx.addCData(record, "menu_nm", rec.menu_nm);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_cocd_1350_m>
	<dataSet>
		<CURLIST>
			<record>
				<menu_id/>
				<menu_nm/>
			</record>
		</CURLIST>
	</dataSet>
</co_cocd_1350_m>
*/
%>

<% /* 작성시간 : Mon Dec 26 20:36:51 KST 2011 */ %>