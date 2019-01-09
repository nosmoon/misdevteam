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
	HD_TRIP_1703_LDataSet ds = (HD_TRIP_1703_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
	//	recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1703_LCURLISTRecord rec = (HD_TRIP_1703_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "busi_trip_frdt", rec.busi_trip_frdt);
			rx.add(record, "busi_trip_todt", rec.busi_trip_todt);
			rx.add(record, "busi_trip_clsf", rec.busi_trip_clsf);
			rx.add(record, "busi_trip_purp", rec.busi_trip_purp);
			rx.add(record, "dd_fee", rec.dd_fee);
			rx.add(record, "busi_trip_dds", rec.busi_trip_dds);
			rx.add(record, "busi_trip_fee_stot", rec.busi_trip_fee_stot);
			rx.add(record, "stay_clsf", rec.stay_clsf);
			rx.add(record, "stay_area", rec.stay_area);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "rptv_posi_cd", rec.rptv_posi_cd);
			rx.add(record, "proc_clsf", rec.proc_clsf);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "rptv_posi_nm", rec.rptv_posi_nm);
			rx.add(record, "chkbox", "");
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<dept_nm/>
			<posi_nm/>
			<dty_nm/>
			<busi_trip_frdt/>
			<busi_trip_todt/>
			<busi_trip_clsf/>
			<busi_trip_purp/>
			<dd_fee/>
			<busi_trip_dds/>
			<busi_trip_fee_stot/>
			<stay_clsf/>
			<stay_area/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<rptv_posi_cd/>
			<proc_clsf/>
			<proc_stat_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 07 15:05:18 KST 2009 */ %>
