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
	HD_TRIP_1100_LDataSet ds = (HD_TRIP_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_TRIP_1100_LCURLIST1Record rec = (HD_TRIP_1100_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "tmp_dr_amt", rec.tmp_dr_amt);
			rx.add(record, "tmp_crdt_amt", rec.tmp_crdt_amt);
			rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "titl", rec.titl);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "titl2", StringUtil.replaceToXml(rec.titl2));
			//rx.add(record, "titl2", rec.titl2);
		}
		rx.add(dataSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_TRIP_1100_LCURLISTRecord rec = (HD_TRIP_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "send", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "busi_trip_frdt", rec.busi_trip_frdt);
			rx.add(record, "busi_trip_todt", rec.busi_trip_todt);
			rx.add(record, "busi_trip_clsf", rec.busi_trip_clsf);
			rx.add(record, "busi_trip_nm", rec.busi_trip_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "flnm", rec.flnm);
			rx.addCData(record, "busi_trip_purp", StringUtil.replaceToXml(rec.busi_trip_purp));
			//rx.add(record, "busi_trip_purp", rec.busi_trip_purp);
			rx.add(record, "trff_means_cd", rec.trff_means_cd);
			rx.add(record, "trff_means_nm", rec.trff_means_nm);
			rx.addCData(record, "trff_means_etc", StringUtil.replaceToXml(rec.trff_means_etc));
			//rx.add(record, "trff_means_etc", rec.trff_means_etc);
			rx.add(record, "slip_proc_seq", rec.slip_proc_seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "busi_trip_fee_stot", rec.busi_trip_fee_stot);
			rx.add(record, "cost_fix_clsf", rec.cost_fix_clsf);		
			rx.add(record, "cost_fix_clsf_chk", rec.cost_fix_clsf_chk);		
			rx.add(record, "emp_no", rec.emp_no);	
			rx.add(record, "slip_clsf_yn", rec.slip_clsf_yn);		
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "medi_cd2", rec.medi_cd_2);
			rx.add(record, "dtls_medi_cd2", rec.dtls_medi_cd_2);
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
	<CURLIST>
		<record>
			<busi_trip_frdt/>
			<busi_trip_todt/>
			<busi_trip_clsf/>
			<dept_cd/>
			<dept_nm/>
			<flnm/>
			<busi_trip_purp/>
			<trff_means_cd/>
			<trff_means_nm/>
			<proc_clsf/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 03 15:10:23 KST 2009 */ %>