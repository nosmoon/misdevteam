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
	HD_TRIP_1700_LDataSet ds = (HD_TRIP_1700_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int depth1 = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		
		depth1 = rx.add(dataSet, "stay_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1700_LCURLISTRecord rec = (HD_TRIP_1700_LCURLISTRecord)ds.curlist.get(i);
			if ("STAY_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		
		recordSet = rx.add(dataSet, "base_alon_clsf", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_TRIP_1700_LCURLIST2Record rec = (HD_TRIP_1700_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_basi_clsf", rec.pay_basi_clsf);
			rx.add(record, "dspch_clsf", rec.dspch_clsf);
			rx.add(record, "base_alon", rec.base_alon);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		
		
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

<% /* 작성시간 : Wed May 06 19:19:51 KST 2009 */ %>