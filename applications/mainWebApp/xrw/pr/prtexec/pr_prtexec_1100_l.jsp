<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_1100_LDataSet ds = (PR_PRTEXEC_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1100_LCURLISTRecord rec = (PR_PRTEXEC_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "clr_off_plat_tm", rec.clr_off_plat_tm);
			rx.add(record, "off_plat_end_tm", rec.off_plat_end_tm);
			rx.add(record, "trsm_end_tm", rec.trsm_end_tm);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "real_prt_qty", rec.real_prt_qty);
			rx.add(record, "bad_nwsp_qty", rec.bad_nwsp_qty);
			rx.add(record, "card_qty", rec.card_qty);
			rx.add(record, "dqty", rec.dqty);
			rx.add(record, "dt_tm_stop_tms", rec.dt_tm_stop_tms);
			rx.add(record, "fail_tms", rec.fail_tms);
			rx.add(record, "apcut_err_tms", rec.apcut_err_tms);
			rx.add(record, "driv_susp_prgr_tms", rec.driv_susp_prgr_tms);
			rx.add(record, "basi_clr_off_plat_tm", rec.basi_clr_off_plat_tm);
			rx.add(record, "basi_off_plat_tm", rec.basi_off_plat_tm);
			rx.add(record, "basi_trsm_end_tm", rec.basi_trsm_end_tm);
			rx.add(record, "basi_prt_bgn_tm", rec.basi_prt_bgn_tm);
			rx.add(record, "basi_prt_end_tm", rec.basi_prt_end_tm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "prt_ex_qunt", rec.prt_ex_qunt);
			rx.add(record, "out_gate", rec.out_gate);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
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
			<prt_dt/>
			<fac_clsf/>
			<medi_cd/>
			<ecnt/>
			<seq/>
			<clr_off_plat_tm/>
			<trsm_end_tm/>
			<off_plat_end_tm/>
			<prt_bgn_tm/>
			<prt_end_tm/>
			<slip_qty/>
			<real_prt_qty/>
			<bad_nwsp_qty/>
			<card_qty/>
			<dqty/>
			<dt_tm_stop_tms/>
			<fail_tms/>
			<apcut_err_tms/>
			<driv_susp_prgr_tms/>
			<basi_clr_off_plat_tm/>
			<basi_off_plat_tm/>
			<basi_trsm_end_tm/>
			<basi_prt_bgn_tm/>
			<basi_prt_end_tm/>
			<remk/>
			<prt_ex_qunt/>
			<out_gate/>
			<medi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 21 18:52:48 KST 2009 */ %>