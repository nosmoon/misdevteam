<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_1400_LDataSet ds = (PR_PRTEXEC_1400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "form", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1400_LCURLISTRecord rec = (PR_PRTEXEC_1400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "sep_prtn_pcnt", rec.sep_prtn_pcnt);
			rx.add(record, "hdqt_paper_nm", rec.hdqt_paper_nm);
			rx.add(record, "pc_paper_nm", rec.pc_paper_nm);
			rx.add(record, "sn_paper_nm", rec.sn_paper_nm);
			rx.add(record, "bp_paper_nm", rec.bp_paper_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipaddr", rec.incmg_pers_ipaddr);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "medi_clsf", StringUtil.replaceToXml(rec.medi_clsf));
			//rx.add(record, "issu_pcnt", StringUtil.replaceToXml(rec.issu_pcnt));
			//rx.add(record, "clr_pcnt", StringUtil.replaceToXml(rec.clr_pcnt));
			//rx.add(record, "bw_pcnt", StringUtil.replaceToXml(rec.bw_pcnt));
			//rx.add(record, "sep_prtn_pcnt", StringUtil.replaceToXml(rec.sep_prtn_pcnt));
			//rx.add(record, "hdqt_paper_nm", StringUtil.replaceToXml(rec.hdqt_paper_nm));
			//rx.add(record, "pc_paper_nm", StringUtil.replaceToXml(rec.pc_paper_nm));
			//rx.add(record, "sn_paper_nm", StringUtil.replaceToXml(rec.sn_paper_nm));
			//rx.add(record, "bp_paper_nm", StringUtil.replaceToXml(rec.bp_paper_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_pers_ipaddr", StringUtil.replaceToXml(rec.incmg_pers_ipaddr));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
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
<pr_prtexec_1400_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<issu_dt/>
				<medi_clsf/>
				<issu_pcnt/>
				<clr_pcnt/>
				<bw_pcnt/>
				<sep_prtn_pcnt/>
				<hdqt_paper_nm/>
				<pc_paper_nm/>
				<sn_paper_nm/>
				<bp_paper_nm/>
				<remk/>
				<incmg_pers/>
				<incmg_pers_ipaddr/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</pr_prtexec_1400_l>
*/
%>

<% /* 작성시간 : Tue Aug 11 17:56:19 KST 2009 */ %>