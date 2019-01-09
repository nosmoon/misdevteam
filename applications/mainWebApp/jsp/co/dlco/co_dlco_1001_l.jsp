<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1001_LDataSet ds = (CO_DLCO_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = "";
	String errmsg = "";

//	dataSet = rx.add(root, "resData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(root, "tempData", "");

		depth1 = rx.add(recordSet, "sys_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1001_LCURLISTRecord rec = (CO_DLCO_1001_LCURLISTRecord)ds.curlist.get(i);
			
			if ("SYS_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.getCd());
				rx.add(record, "label", rec.getCd_abrv_nm());
			}
		}
		
		depth1 = rx.add(recordSet, "natn_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1001_LCURLISTRecord rec = (CO_DLCO_1001_LCURLISTRecord)ds.curlist.get(i);
			
			if ("NATN_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.getCd());
				rx.add(record, "label", rec.getCd_abrv_nm());
			}
		}
		
		depth1 = rx.add(recordSet, "setl_bank", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1001_LCURLISTRecord rec = (CO_DLCO_1001_LCURLISTRecord)ds.curlist.get(i);
			
			if ("SETL_BANK".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.getCd());
				rx.add(record, "label", rec.getCd_abrv_nm());
			}
		}
		//법인구분
		depth1 = rx.add(recordSet, "corp_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1001_LCURLISTRecord rec = (CO_DLCO_1001_LCURLISTRecord)ds.curlist.get(i);
			
			if ("CORP_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.getCd());
				rx.add(record, "label", rec.getCd_abrv_nm());
			}
		}
		
		depth1 = rx.add(recordSet, "setl_yn", ds.setl_yn);
		
		depth1 = rx.add(recordSet, "txn_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1001_LCURLISTRecord rec = (CO_DLCO_1001_LCURLISTRecord)ds.curlist.get(i);
			
			if ("TXN_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.getCd());
				rx.add(record, "label", rec.getCd_abrv_nm());
			}
		}
		
//		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jan 13 11:50:06 KST 2009 */ %>