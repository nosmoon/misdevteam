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
	HD_INFO_1020_LDataSet ds = (HD_INFO_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	int depth1		= 0;
	tempData = rx.add(root, "tempData", "");

	try {
		
		depth1 = rx.add(tempData, "majr_clsf_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("MAJR_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "majr_clsf_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("MAJR_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "majr_clsf_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("MAJR_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "plcw_cd", "");	// 소재지
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("PLCW_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "grdu_clsf", "");	// 졸업구분
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("GRDU_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "natn_cd", "");	// 국가구분
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("NATN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "sclgg_kind_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("SCLGG_KIND_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "schir_cd", "");	// 학위
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("SCHIR_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "scl_clsf", "");	// 학교구분
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1020_LCURLISTRecord rec = (HD_INFO_1020_LCURLISTRecord)ds.curlist.get(i);
			if ("SCL_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		//depth1 = rx.add(tempData, "scl_clsf", "");
		//int record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "01");
		//rx.add(record, "label", "01 초등학교");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "02");
		//rx.add(record, "label", "02 중학교");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "03");
		//rx.add(record, "label", "03 고등학교");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "04");
		//rx.add(record, "label", "04 전문대학");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "05");
		//rx.add(record, "label", "05 대학교");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "06");
		//rx.add(record, "label", "06 대학교1");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "07");
		//rx.add(record, "label", "07 대학원");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "08");
		//rx.add(record, "label", "08 대학원1");
		//record = rx.add(depth1, "item", "");
		//rx.add(record, "value", "09");
		//rx.add(record, "label", "09 대학원2");
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

<% /* 작성시간 : Fri Jan 30 18:42:58 KST 2009 */ %>