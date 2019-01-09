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
	FC_ACCT_2040_MDataSet ds = (FC_ACCT_2040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");
	
	rx.add(comboSet, "xx_dept_cd_l", ds.xx_dept_cd_l);
	
	try {
		int acct_cd = rx.add(comboSet, "acct_cd", "");

		for(int i = 0; i < ds.cur_acct_list.size(); i++) {
			FC_ACCT_2040_MCUR_ACCT_LISTRecord rec = (FC_ACCT_2040_MCUR_ACCT_LISTRecord)ds.cur_acct_list.get(i);
			
			item  = rx.add( acct_cd , "item" , "");
			rx.add ( item, "value", rec.acct_cd );
			rx.add ( item, "label", rec.acct_abrv_nm);
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
<fc_acct_2040_m>
	<dataSet>
		<CUR_ACCT_LIST>
			<record>
				<acct_cd/>
				<acct_abrv_nm/>
			</record>
		</CUR_ACCT_LIST>
	</dataSet>
</fc_acct_2040_m>
*/
%>

<% /* 작성시간 : Wed Dec 28 10:33:33 KST 2011 */ %>