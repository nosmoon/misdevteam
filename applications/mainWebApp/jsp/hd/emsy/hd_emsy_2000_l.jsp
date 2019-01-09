<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.emsy.rec.*
	,	chosun.ciis.hd.emsy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	dataSet = rx.add(root, "dataSet", "");

	try {

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
<hd_emsy_2002_l>
	<dataSet>
		<CURLIST>
			<record>
				<ov_saly_clos_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_emsy_2002_l>
*/
%>

<% /* 작성시간 : Mon Oct 11 17:34:13 KST 2010 */ %>