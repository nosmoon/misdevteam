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
	FC_ACCT_1050_MDataSet ds = (FC_ACCT_1050_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");
	
	rx.add(comboSet, "xx_g_ymgbcd_010", ds.xx_g_ymgbcd_010);
	rx.add(comboSet, "xx_g_cdgb_010", ds.xx_g_cdgb_010);
	rx.add(comboSet, "xx_g_cdgb_020", ds.xx_g_cdgb_020);
	
	try {
		int mang_cd = rx.add(comboSet, "mang_cd", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_1050_MCURLISTRecord rec = (FC_ACCT_1050_MCURLISTRecord)ds.curlist.get(i);
			
			item  = rx.add( mang_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
			
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
<fc_acct_1050_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1050_m>
*/
%>

<% /* 작성시간 : Thu Dec 29 11:16:16 KST 2011 */ %>