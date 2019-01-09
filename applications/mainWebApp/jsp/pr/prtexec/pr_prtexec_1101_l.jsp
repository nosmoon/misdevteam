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
	PR_PRTEXEC_1101_LDataSet ds = (PR_PRTEXEC_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1101_LCURLISTRecord rec = (PR_PRTEXEC_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "ecnt", rec.ecnt);			
			rx.add(record, "rmsg_tm", rec.rmsg_tm);
			rx.add(record, "off_plat_tm", rec.off_plat_tm);
			rx.add(record, "off_plat_end_tm", rec.off_plat_end_tm);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "real_prt_qty", rec.real_prt_qty);
			rx.add(record, "bad_nwsp_qty", rec.bad_nwsp_qty);
			rx.add(record, "card_qty", rec.card_qty);
			rx.add(record, "dqty", rec.dqty);
			rx.add(record, "apcut_err", rec.apcut_err);
			rx.add(record, "driv_cut_err", rec.driv_cut_err);
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
			<fac_clsf/>
			<fac_clsf_nm/>
			<medi_cd/>
			<ecnt/>
			<ecnt_nm/>
			<medi_nm/>
			<off_plat_tm/>
			<trsm_end_basi_tm/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<prt_qty/>
			<bad_nwsp_qty/>
			<dqty/>
			<dt_tm_stop_tms/>
			<fail_tms/>
			<prt_ex_qunt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 21 21:25:02 KST 2009 */ %>