<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_9996_LDataSet ds = (HD_TRIP_9996_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_TRIP_9996_LCURLIST2Record rec = (HD_TRIP_9996_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_frdt", rec.aply_frdt);
			rx.add(record, "aply_todt", rec.aply_todt);
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "aply_frdt", StringUtil.replaceToXml(rec.aply_frdt));
			//rx.add(record, "aply_todt", StringUtil.replaceToXml(rec.aply_todt));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_TRIP_9996_LCURLIST1Record rec = (HD_TRIP_9996_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_frdt", rec.aply_frdt);
			rx.add(record, "aply_todt", rec.aply_todt);
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "aply_frdt", StringUtil.replaceToXml(rec.aply_frdt));
			//rx.add(record, "aply_todt", StringUtil.replaceToXml(rec.aply_todt));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_trip_9996_l>
	<dataSet>
		<CURLIST2>
			<record>
				<aply_frdt/>
				<aply_todt/>
				<cnt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_trip_9996_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_trip_9996_l>
	<dataSet>
		<CURLIST1>
			<record>
				<aply_frdt/>
				<aply_todt/>
				<cnt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_trip_9996_l>
*/
%>

<% /* 작성시간 : Sun Aug 09 14:28:17 KST 2009 */ %>