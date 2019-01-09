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
	PR_PRTEXEC_5040_LDataSet ds = (PR_PRTEXEC_5040_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_5040_LCURLISTRecord rec = (PR_PRTEXEC_5040_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd_h", rec.cmpy_cd);
			rx.add(record, "occr_dt_h", rec.occr_dt);
			rx.add(record, "hdqt_paper_clsf_h", rec.hdqt_paper_clsf);
			rx.add(record, "seq_h", rec.seq);
			rx.add(record, "prt_dt_h", rec.prt_dt);
			rx.add(record, "issu_dt_h", rec.issu_dt);
			rx.add(record, "fac_clsf_h", rec.fac_clsf);
			rx.add(record, "medi_cd_h", rec.medi_cd);
			rx.add(record, "sect_cd_h", rec.sect_cd);
			rx.add(record, "pap_std_h", rec.pap_std);
			rx.add(record, "issu_pcnt_h", rec.issu_pcnt);
			rx.add(record, "clr_pcnt_h", rec.clr_pcnt);
			rx.add(record, "bw_pcnt_h", rec.bw_pcnt);
			rx.add(record, "slip_qty_h", rec.slip_qty);
			rx.add(record, "is_cnt_ex_yn_h", rec.is_cnt_ex_yn);
			rx.add(record, "is_qty_inc_yn_h", rec.is_qty_inc_yn);
			rx.add(record, "add_prt_yn_h", rec.add_prt_yn);
			rx.add(record, "qunt_out_yn_h", rec.qunt_out_yn);
			rx.add(record, "duty_ovt_prt_yn_h", rec.duty_ovt_prt_yn);
			rx.add(record, "remk_h", rec.remk);
			rx.add(record, "clos_clsf_h","");
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
			<cmpy_cd/>
			<occr_dt/>
			<hdqt_paper_clsf/>
			<seq/>
			<prt_dt/>
			<issu_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<slip_qty/>
			<is_cnt_ex_yn/>
			<is_qty_inc_yn/>
			<add_prt_yn/>
			<qunt_out_yn/>
			<duty_ovt_prt_yn/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 12 17:15:51 KST 2009 */ %>