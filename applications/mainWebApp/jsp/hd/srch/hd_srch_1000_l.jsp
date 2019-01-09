<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1000_LDataSet ds = (HD_SRCH_1000_LDataSet)request.getAttribute("ds");
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

		
		
		depth1 = rx.add(dataSet, "emp_clsf_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_1000_LCURLISTRecord rec = (HD_SRCH_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "dty_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_1000_LCURLISTRecord rec = (HD_SRCH_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("DTY_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "posi_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SRCH_1000_LCURLISTRecord rec = (HD_SRCH_1000_LCURLISTRecord)ds.curlist.get(i);
			if ("POSI_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
	//	for(int i = 0; i < ds.curlist.size(); i++) {
	//		HD_SRCH_1000_LCURLISTRecord rec = (HD_SRCH_1000_LCURLISTRecord)ds.curlist.get(i);
	//		int record = rx.add(recordSet, "record", "");
	//		rx.add(record, "cd_type", rec.cd_type);
	//		rx.add(record, "cd", rec.cd);
	//		rx.add(record, "cdnm", rec.cdnm);
	//		rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
	//	}
	//	rx.add(recordSet, "totalcnt", ds.curlist.size());
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

<% /* 작성시간 : Thu Mar 19 11:01:18 KST 2009 */ %>