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
	PR_OTHCNSM_2310_LDataSet ds = (PR_OTHCNSM_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_OTHCNSM_2310_LCURLIST2Record rec = (PR_OTHCNSM_2310_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "base_leas_fee", rec.base_leas_fee);
			rx.add(record, "real_leas_fee", rec.real_leas_fee);
			rx.add(record, "dest_fee", rec.dest_fee);
			rx.add(record, "etc_matr_fee_bw", rec.etc_matr_fee_bw);
			rx.add(record, "etc_matr_fee_clr", rec.etc_matr_fee_clr);
			rx.add(record, "leas_use_fee_bw", rec.leas_use_fee_bw);
			rx.add(record, "leas_use_fee_clr", rec.leas_use_fee_clr);
			rx.add(record, "paper_wgt", rec.paper_wgt);
      rx.add(record, "prt_pj_rate", rec.prt_pj_rate);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "prt_basi_qty", StringUtil.replaceToXml(rec.prt_basi_qty));
			//rx.add(record, "pj_basi_qty", StringUtil.replaceToXml(rec.pj_basi_qty));
			//rx.add(record, "prt_uprc_bw", StringUtil.replaceToXml(rec.prt_uprc_bw));
			//rx.add(record, "prt_uprc_clr", StringUtil.replaceToXml(rec.prt_uprc_clr));
			//rx.add(record, "prt_pj_rate_bw", StringUtil.replaceToXml(rec.prt_pj_rate_bw));
			//rx.add(record, "prt_pj_rate_clr", StringUtil.replaceToXml(rec.prt_pj_rate_clr));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "base_leas_fee", StringUtil.replaceToXml(rec.base_leas_fee));
			//rx.add(record, "real_leas_fee", StringUtil.replaceToXml(rec.real_leas_fee));
			//rx.add(record, "dest_fee", StringUtil.replaceToXml(rec.dest_fee));
			//rx.add(record, "etc_matr_fee_bw", StringUtil.replaceToXml(rec.etc_matr_fee_bw));
			//rx.add(record, "etc_matr_fee_clr", StringUtil.replaceToXml(rec.etc_matr_fee_clr));
			//rx.add(record, "leas_use_fee_bw", StringUtil.replaceToXml(rec.leas_use_fee_bw));
			//rx.add(record, "leas_use_fee_clr", StringUtil.replaceToXml(rec.leas_use_fee_clr));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_OTHCNSM_2310_LCURLIST1Record rec = (PR_OTHCNSM_2310_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "base_leas_fee", rec.base_leas_fee);
			rx.add(record, "real_leas_fee", rec.real_leas_fee);
			rx.add(record, "dest_fee", rec.dest_fee);
			rx.add(record, "etc_matr_fee_bw", rec.etc_matr_fee_bw);
			rx.add(record, "etc_matr_fee_clr", rec.etc_matr_fee_clr);
			rx.add(record, "leas_use_fee_bw", rec.leas_use_fee_bw);
			rx.add(record, "leas_use_fee_clr", rec.leas_use_fee_clr);
			rx.add(record, "paper_wgt", rec.paper_wgt);
      rx.add(record, "prt_pj_rate", rec.prt_pj_rate);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "prt_basi_qty", StringUtil.replaceToXml(rec.prt_basi_qty));
			//rx.add(record, "pj_basi_qty", StringUtil.replaceToXml(rec.pj_basi_qty));
			//rx.add(record, "prt_uprc_bw", StringUtil.replaceToXml(rec.prt_uprc_bw));
			//rx.add(record, "prt_uprc_clr", StringUtil.replaceToXml(rec.prt_uprc_clr));
			//rx.add(record, "prt_pj_rate_bw", StringUtil.replaceToXml(rec.prt_pj_rate_bw));
			//rx.add(record, "prt_pj_rate_clr", StringUtil.replaceToXml(rec.prt_pj_rate_clr));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "base_leas_fee", StringUtil.replaceToXml(rec.base_leas_fee));
			//rx.add(record, "real_leas_fee", StringUtil.replaceToXml(rec.real_leas_fee));
			//rx.add(record, "dest_fee", StringUtil.replaceToXml(rec.dest_fee));
			//rx.add(record, "etc_matr_fee_bw", StringUtil.replaceToXml(rec.etc_matr_fee_bw));
			//rx.add(record, "etc_matr_fee_clr", StringUtil.replaceToXml(rec.etc_matr_fee_clr));
			//rx.add(record, "leas_use_fee_bw", StringUtil.replaceToXml(rec.leas_use_fee_bw));
			//rx.add(record, "leas_use_fee_clr", StringUtil.replaceToXml(rec.leas_use_fee_clr));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<pr_othcnsm_2310_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<medi_cd/>
				<sect_cd/>
				<aply_dt/>
				<prt_basi_qty/>
				<pj_basi_qty/>
				<prt_uprc_bw/>
				<prt_uprc_clr/>
				<prt_pj_rate_bw/>
				<prt_pj_rate_clr/>
				<film_make_fee/>
				<pack_fee/>
				<base_leas_fee/>
				<real_leas_fee/>
				<dest_fee/>
				<etc_matr_fee_bw/>
				<etc_matr_fee_clr/>
				<leas_use_fee_bw/>
				<leas_use_fee_clr/>
				<paper_wgt/>
				<incmg_pers/>
				<incmg_dt_tm/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_othcnsm_2310_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_othcnsm_2310_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<medi_cd/>
				<sect_cd/>
				<aply_dt/>
				<prt_basi_qty/>
				<pj_basi_qty/>
				<prt_uprc_bw/>
				<prt_uprc_clr/>
				<prt_pj_rate_bw/>
				<prt_pj_rate_clr/>
				<film_make_fee/>
				<pack_fee/>
				<base_leas_fee/>
				<real_leas_fee/>
				<dest_fee/>
				<etc_matr_fee_bw/>
				<etc_matr_fee_clr/>
				<leas_use_fee_bw/>
				<leas_use_fee_clr/>
				<paper_wgt/>
				<incmg_pers/>
				<incmg_dt_tm/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_othcnsm_2310_l>
*/
%>

<% /* 작성시간 : Tue Sep 22 16:52:01 KST 2009 */ %>