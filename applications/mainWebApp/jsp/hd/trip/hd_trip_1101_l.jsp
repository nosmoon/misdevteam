<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_1101_LDataSet ds = (HD_TRIP_1101_LDataSet)request.getAttribute("ds");
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
			HD_TRIP_1101_LCURLIST2Record rec = (HD_TRIP_1101_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "busi_trip_dt", rec.busi_trip_dt);
			rx.add(record, "start_area", StringUtil.replaceToXml(rec.start_area));
			//rx.add(record, "start_area", rec.start_area);
			rx.add(record, "via_area", StringUtil.replaceToXml(rec.via_area));
			//rx.add(record, "via_area", rec.via_area);
			rx.add(record, "ariv_area", StringUtil.replaceToXml(rec.ariv_area));
			//rx.add(record, "ariv_area", rec.ariv_area);
			rx.add(record, "stay_area", StringUtil.replaceToXml(rec.stay_area));
			//rx.add(record, "stay_area", rec.stay_area);
			rx.add(record, "path_clsf", rec.path_clsf);
			rx.add(record, "path_nm", StringUtil.replaceToXml(rec.path_nm));
			//rx.add(record, "path_nm", rec.path_nm);
			rx.add(record, "dd_fee", rec.dd_fee);
			rx.add(record, "stay_clsf", rec.stay_clsf);
			rx.add(record, "stay_nm", StringUtil.replaceToXml(rec.stay_nm));
			//rx.add(record, "stay_nm", rec.stay_nm);
			rx.add(record, "stay_fee", rec.stay_fee);
			rx.add(record, "trff_means_cd", rec.trff_means_cd);
			rx.add(record, "trff_means_nm", StringUtil.replaceToXml(rec.trff_means_nm));
			//rx.add(record, "trff_means_nm", rec.trff_means_nm);
			rx.add(record, "trff_means_etc", StringUtil.replaceToXml(rec.trff_means_etc));
			//rx.add(record, "trff_means_etc", rec.trff_means_etc);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1101_LCURLISTRecord rec = (HD_TRIP_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "busi_trip_fee_stot", rec.busi_trip_fee_stot);
			rx.add(record, "dd_fee", rec.dd_fee);
			rx.add(record, "busi_trip_dds", rec.busi_trip_dds);
			rx.add(record, "dd_stay_fee", rec.dd_stay_fee);
			rx.add(record, "stay_dds", rec.stay_dds);
			rx.add(record, "trff_fee", rec.trff_fee);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "rptv_posi_cd", rec.rptv_posi_cd);
			rx.add(record, "rptv_posi_nm", rec.rptv_posi_nm);
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
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<flnm/>
			<busi_trip_dt/>
			<start_area/>
			<via_area/>
			<ariv_area/>
			<stay_area/>
			<path_clsf/>
			<path_nm/>
			<dd_fee/>
			<stay_clsf/>
			<stay_nm/>
			<stay_fee/>
			<occr_dt/>
			<seq/>
			<sub_seq/>
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
			<emp_no/>
			<flnm/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<busi_trip_fee_stot/>
			<dd_fee/>
			<busi_trip_dds/>
			<dd_stay_fee/>
			<stay_dds/>
			<trff_fee/>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 07 20:59:24 KST 2009 */ %>