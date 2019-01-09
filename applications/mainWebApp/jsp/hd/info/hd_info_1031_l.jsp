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
	HD_INFO_1031_LDataSet ds = (HD_INFO_1031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	int depth1		= 0;
	tempData = rx.add(root, "tempData", "");

	try {
	    rx.add(tempData, "xx_caption_01", ds.getXx_caption_01());
	    
		depth1 = rx.add(tempData, "faml_rshp_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1031_LCURLISTRecord rec = (HD_INFO_1031_LCURLISTRecord)ds.curlist.get(i);
			if ("FAML_RSHP_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		//int tm_record1 = rx.add(depth1, "item", "");
		//rx.add(tm_record1, "value", "");
		//rx.add(tm_record1, "label", "");
		
		depth1 = rx.add(tempData, "schir_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1031_LCURLISTRecord rec = (HD_INFO_1031_LCURLISTRecord)ds.curlist.get(i);
			if ("SCHIR_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		int tm_record2 = rx.add(depth1, "item", "");
		rx.add(tm_record2, "value", "");
		rx.add(tm_record2, "label", "");
		
		depth1 = rx.add(tempData, "ocpn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1031_LCURLISTRecord rec = (HD_INFO_1031_LCURLISTRecord)ds.curlist.get(i);
			if ("OCPN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		int tm_record3 = rx.add(depth1, "item", "");
		rx.add(tm_record3, "value", "");
		rx.add(tm_record3, "label", "");
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

<% /* 작성시간 : Mon Feb 02 20:14:44 KST 2009 */ %>