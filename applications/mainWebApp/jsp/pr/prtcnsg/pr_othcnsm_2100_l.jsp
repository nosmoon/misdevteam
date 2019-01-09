<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_OTHCNSM_2100_LDataSet ds = (PR_OTHCNSM_2100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "film_qunt", ds.film_qunt);
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "gridData4", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST4Record rec = (PR_OTHCNSM_2100_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "prt_fee", rec.prt_fee);
			rx.add(record, "paper_amt", rec.paper_amt);
			rx.add(record, "psplat_use_amt", rec.psplat_use_amt);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "ink_use_amt", rec.ink_use_amt);
			rx.add(record, "dest_fee", rec.dest_fee);
			rx.add(record, "base_leas_fee", rec.base_leas_fee);
			rx.add(record, "real_leas_fee", rec.real_leas_fee);
			rx.add(record, "leas_use_fee_bw", rec.leas_use_fee);
			rx.add(record, "etc_matr_fee_bw", rec.etc_matr_fee);
			rx.add(record, "total", rec.total);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "prt_fee", StringUtil.replaceToXml(rec.prt_fee));
			//rx.add(record, "paper_amt", StringUtil.replaceToXml(rec.paper_amt));
			//rx.add(record, "psplat_use_amt", StringUtil.replaceToXml(rec.psplat_use_amt));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
			//rx.add(record, "total", StringUtil.replaceToXml(rec.total));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST3", "");

    int record1 = rx.add(dataSet, "curlist3", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST3Record rec = (PR_OTHCNSM_2100_LCURLIST3Record)ds.curlist3.get(0);
			rx.add(record1, "film_use_qunt", rec.film_use_qunt);
	    rx.add(record1, "ink_use_qunt", rec.ink_use_qunt);
			rx.add(record1, "paper_wgt", rec.paper_wgt);
			rx.add(record1, "seq_curlist3", rec.seq);
			rx.add(record1, "occr_dt_curlist3", rec.occr_dt);

      rx.add(record1, "dest_qunt", rec.dest_qunt);
      rx.add(record1, "prd_cnt", rec.prd_cnt);
      rx.add(record1, "prt_bgn_tm", rec.prt_bgn_tm);
      rx.add(record1, "prt_end_tm", rec.prt_end_tm);
			
			//rx.add(record, "film_use_qunt", StringUtil.replaceToXml(rec.film_use_qunt));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
		}
    rx.add(record1, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST9 BEGIN */
		recordSet = rx.add(dataSet, "gridData9", "");
		for(int i = 0; i < ds.curlist9.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST9Record rec = (PR_OTHCNSM_2100_LCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ink_matr", rec.ink_matr);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "ink_uprc", rec.ink_uprc);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "ink_fee", rec.ink_fee);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			//rx.add(record, "ink_matr", StringUtil.replaceToXml(rec.ink_matr));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "ink_uprc", StringUtil.replaceToXml(rec.ink_uprc));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "ink_fee", StringUtil.replaceToXml(rec.ink_fee));
		}
		rx.add(recordSet, "totalcnt", ds.curlist9.size());
		/****** CURLIST8 END */
		
		/****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "gridData8", "");
		for(int i = 0; i < ds.curlist8.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST8Record rec = (PR_OTHCNSM_2100_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "psplat_clsf", rec.psplat_clsf);
			rx.add(record, "psplat_fee", rec.psplat_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "psplat_qunt", rec.psplat_qunt);
			rx.add(record, "nul_plat_cnt", rec.nul_plat_cnt);
			rx.add(record, "psplat_amt", rec.psplat_amt);
			rx.add(record, "gnaw_amt", rec.gnaw_amt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			//rx.add(record, "paper_uprc", StringUtil.replaceToXml(rec.paper_uprc));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */
		
		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "gridData7", "");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST7Record rec = (PR_OTHCNSM_2100_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "paper_uprc", rec.paper_uprc);
			//rx.add(record, "paper_uprc", StringUtil.replaceToXml(rec.paper_uprc));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "gridData6", "");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST6Record rec = (PR_OTHCNSM_2100_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_uprc", rec.paper_uprc);
			rx.add(record, "paper_wgt", rec.paper_wgt);
			rx.add(record, "dest_fee", rec.dest_fee);
			rx.add(record, "base_leas_fee", rec.base_leas_fee);
			rx.add(record, "real_leas_fee", rec.real_leas_fee);
			rx.add(record, "leas_use_fee_bw", rec.leas_use_fee_bw);
			rx.add(record, "leas_use_fee_clr", rec.leas_use_fee_clr);
			rx.add(record, "etc_matr_fee_bw", rec.etc_matr_fee_bw);
			rx.add(record, "etc_matr_fee_clr", rec.etc_matr_fee_clr);
			rx.add(record, "prt_pj_rate", rec.prt_pj_rate);
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
			//rx.add(record, "pj_basi_qty", StringUtil.replaceToXml(rec.pj_basi_qty));
			//rx.add(record, "prt_pj_rate_bw_1", StringUtil.replaceToXml(rec.prt_pj_rate_bw_1));
			//rx.add(record, "prt_pj_rate_clr_1", StringUtil.replaceToXml(rec.prt_pj_rate_clr_1));
			//rx.add(record, "prt_pj_rate_bw_2", StringUtil.replaceToXml(rec.prt_pj_rate_bw_2));
			//rx.add(record, "prt_pj_rate_clr_2", StringUtil.replaceToXml(rec.prt_pj_rate_clr_2));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "eps_no", StringUtil.replaceToXml(rec.eps_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "gridData5", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			PR_OTHCNSM_2100_LCURLIST5Record rec = (PR_OTHCNSM_2100_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_qty", rec.issu_qty);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "paper_uprc", rec.paper_uprc.equals("") ? "0" : rec.paper_uprc);
			rx.add(record, "tot_bw_pcnt", Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.bw_pcnt));
			rx.add(record, "tot_clr_pcnt", Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.clr_pcnt));
			rx.add(record, "total", (Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.bw_pcnt)+(Integer.parseInt(rec.issu_qty)* Integer.parseInt(rec.clr_pcnt))));
			rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			rx.add(record, "pj_wgt", rec.pj_wgt);
			rx.add(record, "prt_wgt", rec.prt_wgt);
			rx.add(record, "logic_wgt", "0");
			//rx.add(record, "issu_qty", StringUtil.replaceToXml(rec.issu_qty));
			//rx.add(record, "pap_std", StringUtil.replaceToXml(rec.pap_std));
			//rx.add(record, "issu_pcnt", StringUtil.replaceToXml(rec.issu_pcnt));
			//rx.add(record, "bw_pcnt", StringUtil.replaceToXml(rec.bw_pcnt));
			//rx.add(record, "clr_pcnt", StringUtil.replaceToXml(rec.clr_pcnt));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST4>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<prt_fee/>
				<paper_amt/>
				<psplat_use_amt/>
				<film_make_fee/>
				<gnaw_fee/>
				<pack_fee/>
				<paper_portage/>
				<total/>
			</record>
		</CURLIST4>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST3>
			<record>
				<film_use_qunt/>
				<paper_wgt/>
				<seq/>
			</record>
		</CURLIST3>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST2>
			<record>
				<data/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST1>
			<record>
				<psplat_clsf/>
				<use_qunt/>
				<nul_plat_cnt/>
				<psplat_fee/>
				<gnaw_fee/>
				<cmpy_cd/>
				<seq/>
				<occr_dt/>
				<sub_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST7>
			<record>
				<paper_uprc/>
				<paper_portage/>
			</record>
		</CURLIST7>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST6>
			<record>
				<film_make_fee/>
				<pack_fee/>
				<paper_portage/>
				<pj_basi_qty/>
				<prt_pj_rate_bw_1/>
				<prt_pj_rate_clr_1/>
				<prt_pj_rate_bw_2/>
				<prt_pj_rate_clr_2/>
				<paper_wgt/>
				<eps_no/>
			</record>
		</CURLIST6>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2100_l>
	<dataSet>
		<CURLIST5>
			<record>
				<issu_qty/>
				<pap_std/>
				<issu_pcnt/>
				<bw_pcnt/>
				<clr_pcnt/>
				<paper_portage/>
			</record>
		</CURLIST5>
	</dataSet>
</pr_othcnsm_2100_l>
*/
%>

<% /* 작성시간 : Thu Sep 24 12:33:31 KST 2009 */ %>