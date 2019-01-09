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
	HD_INFO_1091_LDataSet ds = (HD_INFO_1091_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	tempData = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(tempData, "prtct_obj_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1091_LCURLISTRecord rec = (HD_INFO_1091_LCURLISTRecord)ds.curlist.get(i);
			if ("PRTCT_OBJ_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(tempData, "prtct_grad_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1091_LCURLISTRecord rec = (HD_INFO_1091_LCURLISTRecord)ds.curlist.get(i);
			if ("PRTCT_GRAD_CD".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		recordSet = rx.add(tempData, "prtct_appmt_ofbld_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_1091_LCURLISTRecord rec = (HD_INFO_1091_LCURLISTRecord)ds.curlist.get(i);
			if ("PRTCT_APPMT_OFBLD_CD".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
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

<% /* 작성시간 : Wed Feb 11 14:04:44 KST 2009 */ %>