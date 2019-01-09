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
	HD_INFO_1013_LDataSet ds = (HD_INFO_1013_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int depth1		= 0;

	try {
		recordSet = rx.add(root, "tempData", "");
		
		depth1 = rx.add(recordSet, "nativ_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1013_LCURLISTRecord rec = (HD_INFO_1013_LCURLISTRecord)ds.curlist.get(i);
			if ("NATIV_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "bank_cd_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1013_LCURLISTRecord rec = (HD_INFO_1013_LCURLISTRecord)ds.curlist.get(i);
			if ("BANK_CD_1".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		depth1 = rx.add(recordSet, "bank_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1013_LCURLISTRecord rec = (HD_INFO_1013_LCURLISTRecord)ds.curlist.get(i);
			if ("BANK_CD_2".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "bank_cd_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1013_LCURLISTRecord rec = (HD_INFO_1013_LCURLISTRecord)ds.curlist.get(i);
			if ("BANK_CD_3".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
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

<% /* 작성시간 : Tue Mar 03 14:36:19 KST 2009 */ %>