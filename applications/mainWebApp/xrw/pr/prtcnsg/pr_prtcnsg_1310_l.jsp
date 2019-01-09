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
	PR_PRTCNSG_1310_LDataSet ds = (PR_PRTCNSG_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTCNSG_1310_LCURLISTRecord rec = (PR_PRTCNSG_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "prt_basi_qty", rec.prt_basi_qty);
			rx.add(record, "prt_uprc_bw_1", rec.prt_uprc_bw_1);
			rx.add(record, "prt_uprc_clr_1", rec.prt_uprc_clr_1);
			rx.add(record, "prt_uprc_bw_2", rec.prt_uprc_bw_2);
			rx.add(record, "prt_uprc_clr_2", rec.prt_uprc_clr_2);
			rx.add(record, "pj_basi_qty", rec.pj_basi_qty);
			rx.add(record, "prt_pj_rate_bw_1", rec.prt_pj_rate_bw_1);
			rx.add(record, "prt_pj_rate_clr_1", rec.prt_pj_rate_clr_1);
			rx.add(record, "prt_pj_rate_bw_2", rec.prt_pj_rate_bw_2);
			rx.add(record, "prt_pj_rate_clr_2", rec.prt_pj_rate_clr_2);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_wgt", rec.paper_wgt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "eps_no", rec.eps_no);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "prt_basi_qty", StringUtil.replaceToXml(rec.prt_basi_qty));
			//rx.add(record, "prt_uprc_bw_1", StringUtil.replaceToXml(rec.prt_uprc_bw_1));
			//rx.add(record, "prt_uprc_clr_1", StringUtil.replaceToXml(rec.prt_uprc_clr_1));
			//rx.add(record, "prt_uprc_bw_2", StringUtil.replaceToXml(rec.prt_uprc_bw_2));
			//rx.add(record, "prt_uprc_clr_2", StringUtil.replaceToXml(rec.prt_uprc_clr_2));
			//rx.add(record, "pj_basi_qty", StringUtil.replaceToXml(rec.pj_basi_qty));
			//rx.add(record, "prt_pj_rate_bw_1", StringUtil.replaceToXml(rec.prt_pj_rate_bw_1));
			//rx.add(record, "prt_pj_rate_clr_1", StringUtil.replaceToXml(rec.prt_pj_rate_clr_1));
			//rx.add(record, "prt_pj_rate_bw_2", StringUtil.replaceToXml(rec.prt_pj_rate_bw_2));
			//rx.add(record, "prt_pj_rate_clr_2", StringUtil.replaceToXml(rec.prt_pj_rate_clr_2));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "eps_no", StringUtil.replaceToXml(rec.eps_no));
			//rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
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
<pr_prtcnsg_1310_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<fac_clsf/>
				<aply_dt/>
				<prt_basi_qty/>
				<prt_uprc_bw_1/>
				<prt_uprc_clr_1/>
				<prt_uprc_bw_2/>
				<prt_uprc_clr_2/>
				<pj_basi_qty/>
				<prt_pj_rate_bw_1/>
				<prt_pj_rate_clr_1/>
				<prt_pj_rate_bw_2/>
				<prt_pj_rate_clr_2/>
				<film_make_fee/>
				<pack_fee/>
				<paper_wgt/>
				<dlco_nm/>
				<eps_no/>
				<dlco_no/>
			</record>
		</CURLIST>
	</dataSet>
</pr_prtcnsg_1310_l>
*/
%>

<% /* 작성시간 : Fri May 22 10:47:51 KST 2009 */ %>