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
	HD_INFO_1051_LDataSet ds = (HD_INFO_1051_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	int depth1	  = 0;
	tempData = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(tempData, "tel_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1051_LCURLISTRecord rec = (HD_INFO_1051_LCURLISTRecord)ds.curlist.get(i);
			if ("TEL_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		depth1 = rx.add(tempData, "htel_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1051_LCURLISTRecord rec = (HD_INFO_1051_LCURLISTRecord)ds.curlist.get(i);
			if ("HTEL_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		depth1 = rx.add(tempData, "email_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1051_LCURLISTRecord rec = (HD_INFO_1051_LCURLISTRecord)ds.curlist.get(i);
			if ("EMAIL_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cdnm);
				rx.add(record, "label", rec.cdnm);
			}
		}
		/****** CURLIST END */

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

<% /* 작성시간 : Wed Feb 04 14:17:59 KST 2009 */ %>