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
	int root = RwXml.rootNodeID;

	int resData2 = rx.add(root, "resData2", "");
	
	int gridData = rx.add(resData2, "gridData", "");
	for(int i=0; i<10; i++){	
		int curlist1 = rx.add(gridData, "curlist1", "");
		rx.add(curlist1, "sel_chk", "true");
		rx.add(curlist1, "nm_korn", "임꺽정"+(i+1));
	}

	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
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

<% /* 작성시간 : Tue Apr 14 21:28:02 KST 2009 */ %>