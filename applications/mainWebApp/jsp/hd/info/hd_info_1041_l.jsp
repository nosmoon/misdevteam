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
	HD_INFO_1041_LDataSet ds = (HD_INFO_1041_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	int depth1		= 0;
	tempData = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(tempData, "army_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("ARMY_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "forc_clsi_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("FORC_CLSI_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "army_svc_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("ARMY_SVC_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "cmmd_army_part_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("CMMD_ARMY_PART_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "sold_main_spc_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("SOLD_MAIN_SPC_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "cls_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("CLS_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "out_army_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("OUT_ARMY_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "army_un_finish_resn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("ARMY_UN_FINSH_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(tempData, "rsv_forc_form_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1041_LCURLISTRecord rec = (HD_INFO_1041_LCURLISTRecord)ds.curlist.get(i);
			if ("RSV_FORC_FORM_CD".equals(rec.getCd_type())){
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

<% /* 작성시간 : Wed Feb 04 10:29:37 KST 2009 */ %>