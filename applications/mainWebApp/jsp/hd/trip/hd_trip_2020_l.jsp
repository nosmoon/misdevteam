<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_2020_LDataSet ds = (HD_TRIP_2020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		
		
		depth1 = rx.add(dataSet, "dspch_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_2020_LCURLISTRecord rec = (HD_TRIP_2020_LCURLISTRecord)ds.curlist.get(i);
			if ("DSPCH_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		
		
		
		depth1 = rx.add(dataSet, "pay_basi_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_2020_LCURLISTRecord rec = (HD_TRIP_2020_LCURLISTRecord)ds.curlist.get(i);
			if ("PAY_BASI_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "aply_basi_dt", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_TRIP_2020_LCURLIST2Record rec = (HD_TRIP_2020_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(depth1, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

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

<% /* 작성시간 : Tue May 12 16:34:18 KST 2009 */ %>