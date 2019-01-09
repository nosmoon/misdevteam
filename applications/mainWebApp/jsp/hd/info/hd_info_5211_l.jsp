<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5211_LDataSet ds = (HD_INFO_5211_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(dataSet, "faml_rshp_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5211_LCURLISTRecord rec = (HD_INFO_5211_LCURLISTRecord)ds.curlist.get(i);
			if ("FAML_RSHP_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "schir_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5211_LCURLISTRecord rec = (HD_INFO_5211_LCURLISTRecord)ds.curlist.get(i);
			if ("SCHIR_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "ocpn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5211_LCURLISTRecord rec = (HD_INFO_5211_LCURLISTRecord)ds.curlist.get(i);
			if ("OCPN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}

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
<dataSet>
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 10:41:27 KST 2009 */ %>