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
	HD_TRIP_1304_LDataSet ds = (HD_TRIP_1304_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_TRIP_1304_LCURLIST4Record rec = (HD_TRIP_1304_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "e_cmpy_cd", rec.e_cmpy_cd);
			rx.add(record, "e_emp_no", rec.e_emp_no);
			rx.add(record, "e_occr_dt", rec.e_occr_dt);
			rx.add(record, "e_seq", rec.e_seq);
			rx.add(record, "e_sub_seq", rec.e_sub_seq);
			rx.add(record, "e_with_seq", rec.e_with_seq);
			rx.add(record, "e_etc_cost_ptcr", rec.e_etc_cost_ptcr);
			rx.add(record, "e_etc_cost", rec.e_etc_cost);
			rx.add(record, "e_etc_cost_neces", rec.e_etc_cost_neces);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_TRIP_1304_LCURLIST3Record rec = (HD_TRIP_1304_LCURLIST3Record)ds.curlist3.get(i);
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
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_TRIP_1304_LCURLIST2Record rec = (HD_TRIP_1304_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "g_cmpy_cd", rec.g_cmpy_cd);
			rx.add(record, "g_emp_no", rec.g_emp_no);
			rx.add(record, "g_occr_dt", rec.g_occr_dt);
			rx.add(record, "g_seq", rec.g_seq);
			rx.add(record, "g_with_seq", rec.g_with_seq);
			rx.add(record, "g_flnm", rec.g_nm_korn);
			rx.add(record, "g_dept_cd", rec.g_dept_cd);
			rx.add(record, "g_dept_nm", rec.g_dept_nm);
			rx.add(record, "g_dty_cd", rec.g_dty_cd);
			rx.add(record, "g_dty_nm", rec.g_dty_nm);
			rx.add(record, "g_posi_cd", rec.g_posi_cd);
			rx.add(record, "g_posi_nm", rec.g_posi_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1304_LCURLISTRecord rec = (HD_TRIP_1304_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "with_seq", rec.with_seq);
			rx.add(record, "nm_korn", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "busi_trip_purp", rec.busi_trip_purp);
			rx.add(record, "busi_trip_dest", rec.busi_trip_dest);
			rx.add(record, "busi_trip_frdt", rec.busi_trip_frdt);
			rx.add(record, "busi_trip_todt", rec.busi_trip_todt);
			rx.add(record, "busi_trip_dds", rec.busi_trip_dds);
			rx.add(record, "invit_instt", rec.invit_instt);
			rx.add(record, "busi_trip_fee_burd_clsf", rec.busi_trip_fee_burd_clsf);
			rx.add(record, "busi_trip_neces", rec.busi_trip_neces);
			rx.add(record, "aviat_fee", rec.aviat_fee);
			if(!rec.aviat_fee.equals("")){
				rx.add(record, "aviat_fee_yn", "1");
			}else{
				rx.add(record, "aviat_fee_yn", "");
			}
			rx.add(record, "stay_fee", rec.stay_fee);
			if(!rec.stay_fee.equals("")){
				rx.add(record, "stay_fee_yn", "1");
			}else{
				rx.add(record, "stay_fee_yn", "");
			}
			rx.add(record, "dd_fee", rec.dd_fee);
			if(!rec.dd_fee.equals("")){
				rx.add(record, "dd_fee_yn", "1");
			}else{
				rx.add(record, "dd_fee_yn", "");
			}
			rx.add(record, "ceph_use_yn", rec.ceph_use_yn);
			rx.add(record, "busi_trip_fee_stot", rec.busi_trip_fee_stot);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "genl_affrs_clsf", rec.genl_affrs_clsf);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "natn_cd", rec.natn_cd);
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
	<CURLIST4>
		<record>
			<e_cmpy_cd/>
			<e_emp_no/>
			<e_occr_dt/>
			<e_seq/>
			<e_sub_seq/>
			<e_etc_cost_ptcr/>
			<e_etc_cost/>
			<e_etc_cost_neces/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<d_cmpy_cd/>
			<d_emp_no/>
			<d_occr_dt/>
			<d_seq/>
			<d_sub_seq/>
			<d_start_area/>
			<d_midl_start_dt/>
			<d_dest/>
			<d_busi_trip_cont/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<g_cmpy_cd/>
			<g_emp_no/>
			<g_occr_dt/>
			<g_seq/>
			<g_with_seq/>
			<g_nm_korn/>
			<g_dept_cd/>
			<g_dept_nm/>
			<g_dty_cd/>
			<g_dty_nm/>
			<g_posi_cd/>
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
			<cmpy_cd/>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<with_seq/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<busi_trip_purp/>
			<busi_trip_dest/>
			<busi_trip_frdt/>
			<busi_trip_todt/>
			<busi_trip_dds/>
			<invit_instt/>
			<busi_trip_fee_burd_clsf/>
			<busi_trip_neces/>
			<aviat_fee/>
			<stay_fee/>
			<dd_fee/>
			<ceph_use_yn/>
			<busi_trip_fee_stot/>
			<remk/>
			<mis_no_actu/>
			<mis_no_hd/>
			<proc_stat/>
			<genl_affrs_clsf/>
			<proc_stat_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat May 09 13:46:44 KST 2009 */ %>