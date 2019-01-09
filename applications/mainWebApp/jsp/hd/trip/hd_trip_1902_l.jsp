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
	HD_TRIP_1902_LDataSet ds = (HD_TRIP_1902_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1902_LCURLISTRecord rec = (HD_TRIP_1902_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "busi_trip_frdt", StringUtil.replaceToXml(rec.busi_trip_frdt));
			rx.add(record, "busi_trip_todt", StringUtil.replaceToXml(rec.busi_trip_todt));
			rx.add(record, "busi_trip_clsf", StringUtil.replaceToXml(rec.busi_trip_clsf));
			rx.add(record, "busi_trip_purp", StringUtil.replaceToXml(rec.busi_trip_purp));
			rx.add(record, "dd_fee", StringUtil.replaceToXml(rec.dd_fee));
			rx.add(record, "busi_trip_dds", StringUtil.replaceToXml(rec.busi_trip_dds));
			rx.add(record, "busi_trip_fee_stot", StringUtil.replaceToXml(rec.busi_trip_fee_stot));
			rx.add(record, "stay_clsf", StringUtil.replaceToXml(rec.stay_clsf));
			rx.add(record, "stay_clsf_nm", StringUtil.replaceToXml(rec.stay_clsf_nm));
			rx.add(record, "stay_area", StringUtil.replaceToXml(rec.stay_area));
			rx.add(record, "slip_proc_mang_dt", StringUtil.replaceToXml(rec.slip_proc_mang_dt));
			rx.add(record, "slip_proc_mang_seq", StringUtil.replaceToXml(rec.slip_proc_mang_seq));
			rx.add(record, "slip_proc_mang_seq_num", StringUtil.replaceToXml(rec.slip_proc_mang_seq_num));
			rx.add(record, "proc_clsf", StringUtil.replaceToXml(rec.proc_clsf));
			rx.add(record, "proc_clsf_nm", StringUtil.replaceToXml(rec.proc_clsf_nm));
			rx.add(record, "rptv_posi_cd", StringUtil.replaceToXml(rec.rptv_posi_cd));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "tmp_crdt_amt", StringUtil.replaceToXml(rec.tmp_crdt_amt));
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "titl2", StringUtil.replaceToXml(rec.titl2));
			rx.add(record, "cost_fix_clsf", rec.cost_fix_clsf);
			rx.add(record, "cost_fix_clsf_chk", rec.cost_fix_clsf_chk);
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "flnm", rec.flnm);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dty_cd", rec.dty_cd);
			//rx.add(record, "posi_cd", rec.posi_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "busi_trip_frdt", rec.busi_trip_frdt);
			//rx.add(record, "busi_trip_todt", rec.busi_trip_todt);
			//rx.add(record, "busi_trip_clsf", rec.busi_trip_clsf);
			//rx.add(record, "busi_trip_purp", rec.busi_trip_purp);
			//rx.add(record, "dd_fee", rec.dd_fee);
			//rx.add(record, "busi_trip_dds", rec.busi_trip_dds);
			//rx.add(record, "busi_trip_fee_stot", rec.busi_trip_fee_stot);
			//rx.add(record, "stay_clsf", rec.stay_clsf);
			//rx.add(record, "stay_clsf_nm", rec.stay_clsf_nm);
			//rx.add(record, "stay_area", rec.stay_area);
			//rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			//rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			//rx.add(record, "slip_proc_mang_seq_num", rec.slip_proc_mang_seq_num);
			//rx.add(record, "proc_clsf", rec.proc_clsf);
			//rx.add(record, "proc_clsf_nm", rec.proc_clsf_nm);
			//rx.add(record, "rptv_posi_cd", rec.rptv_posi_cd);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			//rx.add(record, "titl", rec.titl);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "titl2", rec.titl2);
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
<hd_trip_1902_l>
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
				<stay_clsf_nm/>
				<stay_area/>
				<slip_proc_mang_dt/>
				<slip_proc_mang_seq/>
				<slip_proc_mang_seq_num/>
				<proc_clsf/>
				<proc_clsf_nm/>
				<rptv_posi_cd/>
				<actu_slip_no/>
				<tmp_crdt_amt/>
				<titl/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<titl2/>
			</record>
		</CURLIST>
	</dataSet>
</hd_trip_1902_l>
*/
%>

<% /* 작성시간 : Thu Aug 06 16:33:00 KST 2009 */ %>