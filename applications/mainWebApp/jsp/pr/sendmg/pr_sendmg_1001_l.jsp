<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.sendmg.rec.*
	,	chosun.ciis.pr.sendmg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_SENDMG_1001_LDataSet ds = (PR_SENDMG_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		formData = rx.add(recordSet, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_SENDMG_1001_LCURLISTRecord rec = (PR_SENDMG_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "sun", rec.sun);
			rx.add(record, "sun_dt", rec.sun_dt);
			rx.add(record, "sun_cnt", rec.sun_cnt);
			rx.add(record, "mon", rec.mon);
			rx.add(record, "mon_dt", rec.mon_dt);
			rx.add(record, "mon_cnt", rec.mon_cnt);
			rx.add(record, "tue", rec.tue);
			rx.add(record, "tue_dt", rec.tue_dt);
			rx.add(record, "tue_cnt", rec.tue_cnt);
			rx.add(record, "wed", rec.wed);
			rx.add(record, "wed_dt", rec.wed_dt);
			rx.add(record, "wed_cnt", rec.wed_cnt);
			rx.add(record, "thr", rec.thr);
			rx.add(record, "thr_dt", rec.thr_dt);
			rx.add(record, "thr_cnt", rec.thr_cnt);
			rx.add(record, "fri", rec.fri);
			rx.add(record, "fri_dt", rec.fri_dt);
			rx.add(record, "fri_cnt", rec.fri_cnt);
			rx.add(record, "sat", rec.sat);
			rx.add(record, "sat_dt", rec.sat_dt);
			rx.add(record, "sat_cnt", rec.sat_cnt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		formData = rx.add(recordSet, "send_medi_cd", "");
		rx.add(formData, "send_medi_cd", ds.send_medi_cd);
	}
	catch (Exception e) {
	}
	finally {
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
			<sun/>
			<sun_cnt/>
			<mon/>
			<mon_cnt/>
			<tue/>
			<tue_cnt/>
			<wed/>
			<wed_cnt/>
			<thr/>
			<thr_cnt/>
			<fri/>
			<fri_cnt/>
			<sat/>
			<sat_cnt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 19:41:39 KST 2009 */ %>