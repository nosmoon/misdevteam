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
	CO_COCD_1300_MDataSet ds = (CO_COCD_1300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int comboSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int cmpy_cd = rx.add(comboSet, "cmpy_cd", "");
		//item  = rx.add( cmpy_cd , "item" , "");			
		//rx.add ( item, "value", "");
		//rx.add ( item, "label", "전체");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_COCD_1300_MCURLISTRecord rec = (CO_COCD_1300_MCURLISTRecord)ds.curlist.get(i);
			
			item  = rx.add( cmpy_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		

	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_cocd_1300_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cd_nm/>
			</record>
		</CURLIST>
	</dataSet>
</co_cocd_1300_m>
*/
%>

<% /* 작성시간 : Mon Dec 26 15:41:40 KST 2011 */ %>