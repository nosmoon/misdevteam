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
	HD_AFFR_1500_IDataSet ds = (HD_AFFR_1500_IDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "SCL_EXPS_CLSF", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1500_ICURLISTRecord rec = (HD_AFFR_1500_ICURLISTRecord)ds.curlist.get(i);
			if ("SCL_EXPS_CLSF".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}		
		recordSet = rx.add(dataSet, "FIX_RATE_CLSF", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1500_ICURLISTRecord rec = (HD_AFFR_1500_ICURLISTRecord)ds.curlist.get(i);
			if ("FIX_RATE_CLSF".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}		
		recordSet = rx.add(dataSet, "PAY_RATIO_CLSF", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_1500_ICURLISTRecord rec = (HD_AFFR_1500_ICURLISTRecord)ds.curlist.get(i);
			if ("PAY_RATIO_CLSF".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}		
		
 
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
TrustForm�� Instance ����ο� �����ؼ� ���
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

<% /* �ۼ��ð� : Mon Mar 16 20:41:57 KST 2009 */ %>