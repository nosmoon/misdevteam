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
	HD_TRIP_1307_LDataSet ds = (HD_TRIP_1307_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1307_LCURLISTRecord rec = (HD_TRIP_1307_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "d_midl_start_dt", rec.day);
			rx.add(record, "d_cmpy_cd", "");
			rx.add(record, "d_emp_no", "");
			rx.add(record, "d_occr_dt", "");
			rx.add(record, "d_seq", "");
			rx.add(record, "d_sub_seq", "");
			rx.add(record, "d_start_area", "");
			rx.add(record, "d_dest", "");
			rx.add(record, "d_busi_trip_cont", "");
			rx.add(record, "d_with_seq", "");
			//rx.add(record, "day", StringUtil.replaceToXml(rec.day));
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
TrustForm의 Instance 선언부에 복사해서 사용
<hd_trip_1307_l>
	<dataSet>
		<CURLIST>
			<record>
				<day/>
			</record>
		</CURLIST>
	</dataSet>
</hd_trip_1307_l>
*/
%>

<% /* 작성시간 : Sat Aug 22 13:16:50 KST 2009 */ %>