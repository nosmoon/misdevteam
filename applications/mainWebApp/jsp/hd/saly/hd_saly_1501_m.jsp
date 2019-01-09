<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1501_MDataSet ds = (HD_SALY_1501_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		
		rx.add(dataSet, "base_saly", ds.getBase_saly());  	
		rx.add(dataSet, "posk_saly", ds.getPosk_saly());    
		rx.add(dataSet, "dty_alon", ds.getDty_alon());          
		rx.add(dataSet, "posk_alon", ds.getPosk_alon());          
		rx.add(dataSet, "food_alon", ds.getFood_alon());         
		rx.add(dataSet, "care_alon", ds.getCare_alon());                
		rx.add(dataSet, "evngt_saly", ds.getEvngt_saly());          
		
				
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
<hd_saly_1003_m>
	<dataSet>
		<CURLIST>
			<record>
				<xx_col_hidden_010/>
				<xx_col_hidden_020/>
				<xx_col_caption_010/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1003_m>
*/
%>

<% /* 작성시간 : Mon Apr 18 14:38:31 KST 2011 */ %>