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
	HD_INFO_1010_LDataSet ds = (HD_INFO_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData	= 0;
	int recordSet	= 0;
	int dataSet		= 0;
	int depth1		= 0;

	try {
		recordSet = rx.add(root, "tempData", "");
		
		depth1 = rx.add(recordSet, "dtarea_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("DTAREA_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "dtplc_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("DTPLC_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		depth1 = rx.add(recordSet, "in_cmpy_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("IN_CMPY_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "open_invit_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("OPEN_INVIT_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "in_cmpy_resn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("IN_CMPY_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "lvcmpy_resn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("LVCMPY_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "last_appmt_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("LAST_APPMT_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "last_temp_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("LAST_TEMP_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "relg_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("RELG_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "blod_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("BLOD_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "aprv_in_cmpy_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1010_LCURLISTRecord rec = (HD_INFO_1010_LCURLISTRecord)ds.curlist.get(i);
			if ("APRV_IN_CMPY_CLSF".equals(rec.getCd_type())){
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

<% /* 작성시간 : Wed Jan 28 15:07:54 KST 2009 */ %>