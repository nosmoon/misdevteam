<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2175_ADataSet ds = (FC_ACCT_2175_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String batch_id = ds.batch_id;
	String smart_id = ds.smart_id;
	String smart_pw = ds.smart_pw;

	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "errcode", errcode);
	rx.add(dataSet, "errmsg", errmsg);
	rx.add(dataSet, "batch_id", batch_id);
	rx.add(dataSet, "smart_id", smart_id);
	rx.add(dataSet, "smart_pw", smart_pw);
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());

%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2175_a>
	<dataSet>
		<CURLIST>
			<record>
				<col/>
				<slip_occr_dt/>
				<slip_occr_cd/>
				<slip_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2175_a>
*/
%>

<% /* 작성시간 : Mon Mar 08 19:25:25 KST 2010 */ %>