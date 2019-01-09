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
	FC_ACCT_2210_MDataSet ds = (FC_ACCT_2210_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int srch_budg_cd = rx.add(comboSet, "srch_budg_cd", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2210_MCURLISTRecord rec = (FC_ACCT_2210_MCURLISTRecord)ds.curlist.get(i);
	
			item  = rx.add( srch_budg_cd , "item" , "");
			rx.add ( item, "value", rec.budg_cd );
			rx.add ( item, "label", rec.budg_abrv_nm);
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
<fc_acct_2210_m>
	<dataSet>
		<CURLIST>
			<record>
				<acct_cd/>
				<acct_abrv_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2210_m>
*/
%>

<% /* 작성시간 : Mon Jan 02 11:21:00 KST 2012 */ %>