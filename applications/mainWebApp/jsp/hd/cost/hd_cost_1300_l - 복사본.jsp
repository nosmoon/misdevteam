<%@page import="utils.system"%>
<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
System.out.println("호이");
	RwXml rx = new RwXml();
	System.out.println("우후");
	HD_COST_1300_LDataSet ds = (HD_COST_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

System.out.println("dd");
	try {
		/****** CURLIST2 BEGIN */
		
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");
		
		depth1 = rx.add(dataSet, "hd_use_type", "");
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_COST_1300_LCURLIST2Record rec = (HD_COST_1300_LCURLIST2Record)ds.curlist2.get(i);
			
			int record = rx.add(depth1, "item", "");
			     System.out.print(rec.cd);
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		/****** CURLIST2 END */
		
		recordSet = rx.add(dataSet, "CURLIST", "");
		
		depth1 = rx.add(dataSet, "hd_card_type", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COST_1300_LCURLISTRecord rec = (HD_COST_1300_LCURLISTRecord)ds.curlist.get(i);
			if ("HD_CARD_TYPE".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "hd_proc_stat", "");
			int record = rx.add(depth1, "item", "");
			rx.add(record, "value", "");
			rx.add(record, "label", "전체");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COST_1300_LCURLISTRecord rec = (HD_COST_1300_LCURLISTRecord)ds.curlist.get(i);
			if ("HD_PROC_STAT".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		/* for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COST_1300_LCURLISTRecord rec = (HD_COST_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd + " " + rec.cdnm);
		}*/
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
System.out.println("알");

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
	<CURLIST2>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
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

<% /* 작성시간 : Mon Apr 20 09:42:03 KST 2009 */ %>