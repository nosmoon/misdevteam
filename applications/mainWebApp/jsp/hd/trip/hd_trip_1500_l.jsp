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
	HD_TRIP_1500_LDataSet ds = (HD_TRIP_1500_LDataSet)request.getAttribute("ds");
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
			HD_TRIP_1500_LCURLISTRecord rec = (HD_TRIP_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "dept_cd", rec.dept_cd);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "emp_no", rec.emp_no);
			rx.addCData(record, "flnm", rec.flnm);
			rx.addCData(record, "dty_cd", rec.dty_cd);
			rx.addCData(record, "natn_nm", rec.natn_nm);
			rx.addCData(record, "busi_trip_dest", rec.busi_trip_dest);
			rx.addCData(record, "via_area", rec.via_area);
			rx.addCData(record, "busi_trip_frdt", rec.busi_trip_frdt);
			rx.addCData(record, "busi_trip_todt", rec.busi_trip_todt);
			rx.addCData(record, "invit_dds", rec.invit_dds);
			rx.addCData(record, "busi_trip_dds", rec.busi_trip_dds);
			rx.addCData(record, "busi_trip_purp", rec.busi_trip_purp);
			rx.addCData(record, "fix_dd_fee", rec.fix_dd_fee);
			rx.addCData(record, "fix_stay_fee", rec.fix_stay_fee);
			rx.addCData(record, "fix_aviat_fee", rec.fix_aviat_fee);
			rx.addCData(record, "fix_etc_cost", rec.fix_etc_cost);
			rx.addCData(record, "fix_cost_tot", rec.fix_cost_tot);
			rx.addCData(record, "adpay_no", rec.adpay_no);
			rx.addCData(record, "adpay_amt", rec.adpay_amt);
			rx.addCData(record, "expn_reso_no", rec.expn_reso_no);
			rx.addCData(record, "adjm_dd_fee", rec.adjm_dd_fee);
			rx.addCData(record, "adjm_stay_fee", rec.adjm_stay_fee);
			rx.addCData(record, "adjm_aviat_fee", rec.adjm_aviat_fee);
			rx.addCData(record, "adjm_etc_cost", rec.adjm_etc_cost);
			rx.addCData(record, "adjm_cost_tot", rec.adjm_cost_tot);
			rx.addCData(record, "minus_cost_tot", rec.minus_cost_tot);
			rx.addCData(record, "ceph_use_yn", rec.ceph_use_yn);
			rx.addCData(record, "ceph_use_nm", rec.ceph_use_nm);
			rx.addCData(record, "cmpy_cd", rec.cmpy_cd);
			rx.addCData(record, "occr_dt", rec.occr_dt);
			rx.addCData(record, "with_seq", rec.with_seq);
			rx.addCData(record, "seq", rec.seq);
			rx.addCData(record, "aviat_fee", rec.aviat_fee);
			rx.addCData(record, "stay_fee", rec.stay_fee);
			rx.addCData(record, "dd_fee", rec.dd_fee);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "natn_nm", StringUtil.replaceToXml(rec.natn_nm));
			//rx.add(record, "busi_trip_dest", StringUtil.replaceToXml(rec.busi_trip_dest));
			//rx.add(record, "via_area", StringUtil.replaceToXml(rec.via_area));
			//rx.add(record, "busi_trip_frdt", StringUtil.replaceToXml(rec.busi_trip_frdt));
			//rx.add(record, "busi_trip_todt", StringUtil.replaceToXml(rec.busi_trip_todt));
			//rx.add(record, "invit_dds", StringUtil.replaceToXml(rec.invit_dds));
			//rx.add(record, "busi_trip_dds", StringUtil.replaceToXml(rec.busi_trip_dds));
			//rx.add(record, "busi_trip_purp", StringUtil.replaceToXml(rec.busi_trip_purp));
			//rx.add(record, "fix_dd_fee", StringUtil.replaceToXml(rec.fix_dd_fee));
			//rx.add(record, "fix_stay_fee", StringUtil.replaceToXml(rec.fix_stay_fee));
			//rx.add(record, "fix_aviat_fee", StringUtil.replaceToXml(rec.fix_aviat_fee));
			//rx.add(record, "fix_etc_cost", StringUtil.replaceToXml(rec.fix_etc_cost));
			//rx.add(record, "fix_cost_tot", StringUtil.replaceToXml(rec.fix_cost_tot));
			//rx.add(record, "adpay_no", StringUtil.replaceToXml(rec.adpay_no));
			//rx.add(record, "adpay_amt", StringUtil.replaceToXml(rec.adpay_amt));
			//rx.add(record, "expn_reso_no", StringUtil.replaceToXml(rec.expn_reso_no));
			//rx.add(record, "adjm_dd_fee", StringUtil.replaceToXml(rec.adjm_dd_fee));
			//rx.add(record, "adjm_stay_fee", StringUtil.replaceToXml(rec.adjm_stay_fee));
			//rx.add(record, "adjm_aviat_fee", StringUtil.replaceToXml(rec.adjm_aviat_fee));
			//rx.add(record, "adjm_etc_cost", StringUtil.replaceToXml(rec.adjm_etc_cost));
			//rx.add(record, "adjm_cost_tot", StringUtil.replaceToXml(rec.adjm_cost_tot));
			//rx.add(record, "minus_cost_tot", StringUtil.replaceToXml(rec.minus_cost_tot));
			//rx.add(record, "ceph_use_yn", StringUtil.replaceToXml(rec.ceph_use_yn));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "with_seq", StringUtil.replaceToXml(rec.with_seq));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "aviat_fee", StringUtil.replaceToXml(rec.aviat_fee));
			//rx.add(record, "stay_fee", StringUtil.replaceToXml(rec.stay_fee));
			//rx.add(record, "dd_fee", StringUtil.replaceToXml(rec.dd_fee));
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
<hd_trip_1500_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<dty_cd/>
				<natn_nm/>
				<busi_trip_dest/>
				<via_area/>
				<busi_trip_frdt/>
				<busi_trip_todt/>
				<invit_dds/>
				<busi_trip_dds/>
				<busi_trip_purp/>
				<fix_dd_fee/>
				<fix_stay_fee/>
				<fix_aviat_fee/>
				<fix_etc_cost/>
				<fix_cost_tot/>
				<adpay_no/>
				<adpay_amt/>
				<expn_reso_no/>
				<adjm_dd_fee/>
				<adjm_stay_fee/>
				<adjm_aviat_fee/>
				<adjm_etc_cost/>
				<adjm_cost_tot/>
				<minus_cost_tot/>
				<ceph_use_yn/>
				<cmpy_cd/>
				<occr_dt/>
				<with_seq/>
				<seq/>
				<aviat_fee/>
				<stay_fee/>
				<dd_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_trip_1500_l>
*/
%>

<% /* 작성시간 : Mon Aug 24 22:26:05 KST 2009 */ %>