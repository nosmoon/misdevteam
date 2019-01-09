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
	HD_AFFR_1108_LDataSet ds = (HD_AFFR_1108_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "dept_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1108_LCURLISTRecord rec = (HD_AFFR_1108_LCURLISTRecord)ds.curlist.get(i);
			if ("CONDO_CD1".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1108_LCURLISTRecord rec = (HD_AFFR_1108_LCURLISTRecord)ds.curlist.get(i);
			if ("CONDO_CD2".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		recordSet = rx.add(dataSet, "dept_cd_6", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1108_LCURLISTRecord rec = (HD_AFFR_1108_LCURLISTRecord)ds.curlist.get(i);
			if ("CONDO_CD3".equals(rec.getCd_type())){						
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
<tempData>
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Tue Jun 23 16:44:03 KST 2009 */ %>