<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1080_LDataSet ds = (HD_INFO_1080_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int tempData = 0;
	int depth1		= 0;
	tempData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		depth1 = rx.add(tempData, "frnc_word_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("FRNC_WORD_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_us", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_US".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_de", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_DE".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_fr", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_FR".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_jp", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_JP".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_ch", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_CH".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_es", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_ES".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_ru", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_RU".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_et", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_ET".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		depth1 = rx.add(tempData, "test_ko", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1080_LCURLISTRecord rec = (HD_INFO_1080_LCURLISTRecord)ds.curlist.get(i);
			if ("TEST_KO".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + StringUtil.replaceToXml(rec.cd_abrv_nm));
			}
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<hd_info_1080_l>
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
</hd_info_1080_l>
*/
%>

<% /* 작성시간 : Tue Aug 11 17:43:18 KST 2009 */ %>