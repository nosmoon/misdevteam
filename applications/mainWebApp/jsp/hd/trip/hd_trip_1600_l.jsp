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
	HD_TRIP_1600_LDataSet ds = (HD_TRIP_1600_LDataSet)request.getAttribute("ds");
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
			HD_TRIP_1600_LCURLISTRecord rec = (HD_TRIP_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "with_seq", rec.with_seq);
			rx.add(record, "nm_korn", rec.flnm);
			rx.add(record, "cd_nm", rec.cd_nm);
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
			rx.add(record, "stay_fee", rec.stay_fee);
			rx.add(record, "dd_fee", rec.dd_fee);
			rx.add(record, "ceph_use_yn", rec.ceph_use_yn);
			rx.add(record, "busi_trip_fee_stot", rec.busi_trip_fee_stot);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "genl_affrs_clsf", rec.genl_affrs_clsf);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "draft_dt", rec.draft_dt);
			rx.add(record, "adpay_no", rec.adpay_no);
			rx.add(record, "adpay_amt", rec.adpay_amt);
			rx.add(record, "adpay_plan_dt", rec.adpay_plan_dt);
			rx.add(record, "actu_pay_dt", rec.actu_pay_dt);
			rx.add(record, "expn_reso_no", rec.expn_reso_no);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.add(record, "invit_dds", rec.invit_dds);
			rx.add(record, "fix_aviat_fee", rec.fix_aviat_fee);
			rx.add(record, "adjm_aviat_fee", rec.adjm_aviat_fee);
			rx.add(record, "fix_stay_fee", rec.fix_stay_fee);
			rx.add(record, "adjm_stay_fee", rec.adjm_stay_fee);
			rx.add(record, "fix_dd_fee", rec.fix_dd_fee);
			rx.add(record, "adjm_dd_fee", rec.adjm_dd_fee);
			rx.add(record, "natn_nm", rec.natn_nm);
			rx.add(record, "fix_etc_cost", rec.fix_etc_cost);
			rx.add(record, "adjm_etc_cost", rec.adjm_etc_cost);
			int fix_cost_tot = Integer.valueOf(rec.fix_aviat_fee).intValue() + Integer.valueOf(rec.fix_stay_fee).intValue() + Integer.valueOf(rec.fix_dd_fee).intValue() + Integer.valueOf(rec.fix_etc_cost).intValue();
			rx.add(record, "fix_cost_tot", Integer.toString(fix_cost_tot));
			int adjm_cost_tot = Integer.valueOf(rec.adjm_aviat_fee).intValue() + Integer.valueOf(rec.adjm_stay_fee).intValue() + Integer.valueOf(rec.adjm_dd_fee).intValue() + Integer.valueOf(rec.adjm_etc_cost).intValue();
			rx.add(record, "adjm_cost_tot", Integer.toString(adjm_cost_tot));
			rx.add(record, "minus_cost_tot", Integer.toString(fix_cost_tot - adjm_cost_tot));
			 
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
			<with_seq/>
			<flnm/>
			<cd_nm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
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
			<proc_stat/>
			<genl_affrs_clsf/>
			<proc_stat_nm/>
			<draft_dt/>
			<adpay_no/>
			<adpay_amt/>
			<adpay_plan_dt/>
			<actu_pay_dt/>
			<expn_reso_no/>
			<natn_cd/>
			<invit_dds/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 18 11:43:55 KST 2009 */ %>