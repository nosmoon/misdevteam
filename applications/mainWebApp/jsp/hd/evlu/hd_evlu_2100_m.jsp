<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_2100_MDataSet ds = (HD_EVLU_2100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int initData = 0;
	initData = rx.add(root, "initData", "");
	
	int comboSet = 0;
	comboSet = rx.add(initData, "comboSet", "");

	try {
		int evlu_cd = rx.add(comboSet, "evlu_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_2100_MCURLISTRecord rec = (HD_EVLU_2100_MCURLISTRecord)ds.curlist.get(i);
			int item = rx.add(evlu_cd, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
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
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 21 11:27:20 KST 2009 */ %>