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
	HD_TRIP_1502_LDataSet ds = (HD_TRIP_1502_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_TRIP_1502_LCURLIST4Record rec = (HD_TRIP_1502_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "e_cmpy_cd", rec.e_cmpy_cd);
			rx.add(record, "e_emp_no", rec.e_emp_no);
			rx.add(record, "e_occr_dt", rec.e_occr_dt);
			rx.add(record, "e_seq", rec.e_seq);
			rx.add(record, "e_sub_seq", rec.e_sub_seq);
			rx.add(record, "e_with_seq", rec.e_with_seq);
			rx.add(record, "e_etc_cost_ptcr", rec.e_etc_cost_ptcr);
			rx.add(record, "e_etc_cost", rec.e_etc_cost);
			rx.add(record, "e_fix_etc_cost", rec.e_fix_etc_cost);
			rx.add(record, "e_adjm_etc_cost", rec.e_adjm_etc_cost);
			rx.add(record, "e_etc_cost_neces", rec.e_etc_cost_neces);
			//rx.add(record, "e_cmpy_cd", StringUtil.replaceToXml(rec.e_cmpy_cd));
			//rx.add(record, "e_emp_no", StringUtil.replaceToXml(rec.e_emp_no));
			//rx.add(record, "e_occr_dt", StringUtil.replaceToXml(rec.e_occr_dt));
			//rx.add(record, "e_seq", StringUtil.replaceToXml(rec.e_seq));
			//rx.add(record, "e_sub_seq", StringUtil.replaceToXml(rec.e_sub_seq));
			//rx.add(record, "e_with_seq", StringUtil.replaceToXml(rec.e_with_seq));
			//rx.add(record, "e_etc_cost_ptcr", StringUtil.replaceToXml(rec.e_etc_cost_ptcr));
			//rx.add(record, "e_etc_cost", StringUtil.replaceToXml(rec.e_etc_cost));
			//rx.add(record, "e_fix_etc_cost", StringUtil.replaceToXml(rec.e_fix_etc_cost));
			//rx.add(record, "e_adjm_etc_cost", StringUtil.replaceToXml(rec.e_adjm_etc_cost));
			//rx.add(record, "e_etc_cost_neces", StringUtil.replaceToXml(rec.e_etc_cost_neces));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_TRIP_1502_LCURLIST3Record rec = (HD_TRIP_1502_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "d_cmpy_cd", rec.d_cmpy_cd);
			rx.add(record, "d_emp_no", rec.d_emp_no);
			rx.add(record, "d_occr_dt", rec.d_occr_dt);
			rx.add(record, "d_seq", rec.d_seq);
			rx.add(record, "d_sub_seq", rec.d_sub_seq);
			rx.add(record, "d_with_seq", rec.d_with_seq);
			rx.add(record, "d_start_area", rec.d_start_area);
			rx.add(record, "d_midl_start_dt", rec.d_midl_start_dt);
			rx.add(record, "d_dest", rec.d_dest);
			rx.add(record, "d_busi_trip_cont", rec.d_busi_trip_cont);
			//rx.add(record, "d_cmpy_cd", StringUtil.replaceToXml(rec.d_cmpy_cd));
			//rx.add(record, "d_emp_no", StringUtil.replaceToXml(rec.d_emp_no));
			//rx.add(record, "d_occr_dt", StringUtil.replaceToXml(rec.d_occr_dt));
			//rx.add(record, "d_seq", StringUtil.replaceToXml(rec.d_seq));
			//rx.add(record, "d_sub_seq", StringUtil.replaceToXml(rec.d_sub_seq));
			//rx.add(record, "d_with_seq", StringUtil.replaceToXml(rec.d_with_seq));
			//rx.add(record, "d_start_area", StringUtil.replaceToXml(rec.d_start_area));
			//rx.add(record, "d_midl_start_dt", StringUtil.replaceToXml(rec.d_midl_start_dt));
			//rx.add(record, "d_dest", StringUtil.replaceToXml(rec.d_dest));
			//rx.add(record, "d_busi_trip_cont", StringUtil.replaceToXml(rec.d_busi_trip_cont));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

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
<hd_trip_1502_l>
	<dataSet>
		<CURLIST4>
			<record>
				<e_cmpy_cd/>
				<e_emp_no/>
				<e_occr_dt/>
				<e_seq/>
				<e_sub_seq/>
				<e_with_seq/>
				<e_etc_cost_ptcr/>
				<e_etc_cost/>
				<e_fix_etc_cost/>
				<e_adjm_etc_cost/>
				<e_etc_cost_neces/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_trip_1502_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_trip_1502_l>
	<dataSet>
		<CURLIST3>
			<record>
				<d_cmpy_cd/>
				<d_emp_no/>
				<d_occr_dt/>
				<d_seq/>
				<d_sub_seq/>
				<d_with_seq/>
				<d_start_area/>
				<d_midl_start_dt/>
				<d_dest/>
				<d_busi_trip_cont/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_trip_1502_l>
*/
%>

<% /* 작성시간 : Tue Aug 25 10:09:00 KST 2009 */ %>