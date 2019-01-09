<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1002_LDataSet ds = (HD_DUTY_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1002_LCURLISTRecord rec = (HD_DUTY_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "clndr_dt", rec.clndr_dt);
			rx.add(record, "clndr_wkdy", rec.clndr_wkdy);
			rx.add(record, "hody_clsf", rec.hody_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "clndr_tm", "");
			
			//if(!"40".equals(rec.hody_clsf)){
			//	int record = rx.add(dataSet, "record", "");
			//	rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//	rx.add(record, "clndr_dt", rec.clndr_dt);
			//	rx.add(record, "clndr_wkdy", rec.clndr_wkdy);
			//	rx.add(record, "hody_clsf", rec.hody_clsf);
			//	rx.add(record, "remk", rec.remk);
			//	rx.add(record, "clndr_tm", "");
			//}
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<clndr_dt/>
			<clndr_wkdy/>
			<hody_clsf/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 18 17:16:30 KST 2009 */ %>