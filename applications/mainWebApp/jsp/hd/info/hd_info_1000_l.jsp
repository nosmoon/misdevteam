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
	HD_INFO_1000_LDataSet ds = (HD_INFO_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData	= 0;
	int recordSet	= 0;
	int dataSet		= 0;
	int depth1		= 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(recordSet, "cmpy_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("CMPY_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "emp_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "dtplc_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("DTPLC_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "dtarea_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("DTAREA_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "dty_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("DTY_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "addm_dty_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("ADDM_DTY_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "posi_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("POSI_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "addm_posi_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("ADDM_POSI_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "emp_dtls_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_DTLS_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "in_cmpy_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("IN_CMPY_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "in_cmpy_resn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("IN_CMPY_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "open_invit_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("OPEN_INVIT_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "lvcmpy_resn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("LVCMPY_RESN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "recom_pers_rshp_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("RECOM_PERS_RSHP_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "relg_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("RELG_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(recordSet, "last_appmt_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1000_LCURLISTRecord rec = (HD_INFO_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("LAST_APPMT_CD".equals(rec.getCd_type())){
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

<% /* 작성시간 : Wed Jan 28 12:09:47 KST 2009 */ %>