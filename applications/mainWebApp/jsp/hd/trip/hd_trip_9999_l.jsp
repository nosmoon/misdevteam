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
	HD_TRIP_9999_LDataSet ds = (HD_TRIP_9999_LDataSet)request.getAttribute("ds");
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
			HD_TRIP_9999_LCURLISTRecord rec = (HD_TRIP_9999_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "new_aply_basi_dt", "");
			rx.add(record, "area_clsf", rec.area_clsf);
			rx.add(record, "cost_clsf", rec.cost_clsf);
			rx.add(record, "posi_clsf", rec.posi_clsf);
			rx.add(record, "busi_trip_cost", rec.busi_trip_cost);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "aply_basi_dt", StringUtil.replaceToXml(rec.aply_basi_dt));
			//rx.add(record, "area_clsf", StringUtil.replaceToXml(rec.area_clsf));
			//rx.add(record, "cost_clsf", StringUtil.replaceToXml(rec.cost_clsf));
			//rx.add(record, "posi_clsf", StringUtil.replaceToXml(rec.posi_clsf));
			//rx.add(record, "busi_trip_cost", StringUtil.replaceToXml(rec.busi_trip_cost));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<hd_trip_9999_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<aply_basi_dt/>
				<area_clsf/>
				<cost_clsf/>
				<posi_clsf/>
				<busi_trip_cost/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_trip_9999_l>
*/
%>

<% /* 작성시간 : Mon Aug 31 19:56:09 KST 2009 */ %>