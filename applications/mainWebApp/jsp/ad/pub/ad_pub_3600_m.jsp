<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3600_MDataSet ds = (AD_PUB_3600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int cslcrg_pers_nm = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		cslcrg_pers_nm = rx.add(tempData, "cslcrg_pers_nm", "");
		int item  = rx.add( cslcrg_pers_nm , "item" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3600_MCURLISTRecord rec = (AD_PUB_3600_MCURLISTRecord)ds.curlist.get(i);
			item = rx.add(cslcrg_pers_nm, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm); 
		}

		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(tempData, "errcode", errcode);
		rx.add(tempData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<ad_pub_3600_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</ad_pub_3600_m>
*/
%>

<% /* 작성시간 : Mon Mar 02 14:07:11 KST 2015 */ %>