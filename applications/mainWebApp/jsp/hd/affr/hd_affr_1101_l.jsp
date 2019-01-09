<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1101_LDataSet ds = (HD_AFFR_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "dept_cd_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("GEE_CD1".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("CONDO_CD1".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("GEE_CD2".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("CONDO_CD2".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_5", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("GEE_CD3".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_6", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("CONDO_CD3".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}		
		recordSet = rx.add(dataSet, "dept_cd_7", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1101_LCURLISTRecord rec = (HD_AFFR_1101_LCURLISTRecord)ds.curlist.get(i);
			if ("COMP_GEE".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
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

<% /* 작성시간 : Thu Mar 12 20:46:39 KST 2009 */ %>