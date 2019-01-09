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
	HD_TRIP_2100_LDataSet ds = (HD_TRIP_2100_LDataSet)request.getAttribute("ds");
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
			HD_TRIP_2100_LCURLISTRecord rec = (HD_TRIP_2100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "biz_trip_dest", rec.biz_trip_dest);
			rx.add(record, "biz_trip_frdt", rec.biz_trip_frdt);
			rx.add(record, "biz_trip_todt", rec.biz_trip_todt);
			rx.add(record, "biz_trip_dds", rec.biz_trip_dds);
			rx.add(record, "biz_trip_purp", rec.biz_trip_purp);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "biz_trip_dest", StringUtil.replaceToXml(rec.biz_trip_dest));
			//rx.add(record, "biz_trip_frdt", StringUtil.replaceToXml(rec.biz_trip_frdt));
			//rx.add(record, "biz_trip_todt", StringUtil.replaceToXml(rec.biz_trip_todt));
			//rx.add(record, "biz_trip_dds", StringUtil.replaceToXml(rec.biz_trip_dds));
			//rx.add(record, "biz_trip_purp", StringUtil.replaceToXml(rec.biz_trip_purp));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_trip_2100_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<biz_trip_dest/>
				<biz_trip_frdt/>
				<biz_trip_todt/>
				<biz_trip_dds/>
				<biz_trip_purp/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_trip_2100_l>
*/
%>

<% /* 작성시간 : Tue May 03 16:14:29 KST 2011 */ %>