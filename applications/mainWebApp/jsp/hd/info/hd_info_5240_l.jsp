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
	HD_INFO_5240_LDataSet ds = (HD_INFO_5240_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");
		
		depth1 = rx.add(dataSet, "majr_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("MAJR_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "plcw_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("PLCW_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
/*		depth1 = rx.add(dataSet, "grdu_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("GRDU_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}		
	*/	
		depth1 = rx.add(dataSet, "natn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("NATN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	
		
		depth1 = rx.add(dataSet, "sclgg_kind_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("SCLGG_KIND_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	

		depth1 = rx.add(dataSet, "schir_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("SCHIR_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	

		depth1 = rx.add(dataSet, "scl_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("SCL_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	

		depth1 = rx.add(dataSet, "g_gradu_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_GRADU_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	
		
		
		depth1 = rx.add(dataSet, "g_univ_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_UNIV_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	

		depth1 = rx.add(dataSet, "g_col_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_COL_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	
		
		depth1 = rx.add(dataSet, "g_high_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_HIGH_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	
		
		depth1 = rx.add(dataSet, "g_mid_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_MID_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}		

		depth1 = rx.add(dataSet, "g_pri_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_PRI_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	

		depth1 = rx.add(dataSet, "g_no_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5240_LCURLISTRecord rec = (HD_INFO_5240_LCURLISTRecord)ds.curlist.get(i);
			if ("G_NO_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}	
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

<% /* 작성시간 : Mon Apr 13 10:25:42 KST 2009 */ %>