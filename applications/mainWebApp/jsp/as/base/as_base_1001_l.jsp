<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.base.rec.*
	,	chosun.ciis.as.base.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_BASE_1001_LDataSet ds = (AS_BASE_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData	= 0;
	int recordSet	= 0;
	int dataSet		= 0;
	int depth1		= 0;
	dataSet = rx.add(root, "dataSet", "");
	
	try {
		rx.add(dataSet, "xx_dept_cd", ds.getXx_dept_cd());
		
		recordSet = rx.add(dataSet, "CURLIST", "");
		
		depth1 = rx.add(recordSet, "item_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_BASE_1001_LCURLISTRecord rec = (AS_BASE_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("ITEM_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cd_abrv_nm);		
				rx.add(record, "mang_cd_4", rec.mang_cd_4);		
			}
		}
		
		depth1 = rx.add(recordSet, "redm_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_BASE_1001_LCURLISTRecord rec = (AS_BASE_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("REDM_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);		
			}
		}
		
		depth1 = rx.add(recordSet, "redm_mthd_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_BASE_1001_LCURLISTRecord rec = (AS_BASE_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("REDM_MTHD_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		
		depth1 = rx.add(recordSet, "unit", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AS_BASE_1001_LCURLISTRecord rec = (AS_BASE_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("UNIT".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);		
			}
		}
		
		depth1 = rx.add(recordSet, "use_yn", "");				
		int record = rx.add(depth1, "item", "");
		rx.add(record, "value", "Y");
		rx.add(record, "label", "Y 예");		
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "N");
		rx.add(record, "label", "N 아니오");				
		
//		rx.add(recordSet, "totalcnt", ds.curlist.size());
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