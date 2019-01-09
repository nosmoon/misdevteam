<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_4006_LDataSet ds = (MC_BUDG_4006_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4006_LCURLISTRecord rec = (MC_BUDG_4006_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_clas_cd", rec.budg_clas_cd);
			rx.add(record, "prt_clsf_cd", rec.prt_clsf_cd);
			rx.add(record, "gf_commcdnm_prt_clsf_cd", rec.gf_commcdnm_prt_clsf_cd);
			rx.add(record, "budg_type_cd", rec.budg_type_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			rx.add(record, "clas_cd1", rec.clas_cd1);
			rx.add(record, "yf_brnm_budg_clas_cd1", rec.yf_brnm_budg_clas_cd1);
			rx.add(record, "clas_cd2", rec.clas_cd2);
			rx.add(record, "yf_budg_clas_cd2", rec.yf_budg_clas_cd2);
			rx.add(record, "clas_cd3", rec.clas_cd3);
			rx.add(record, "yf_budg_clas_cd3", rec.yf_budg_clas_cd3);
			rx.add(record, "clas_cd4", rec.clas_cd4);
			rx.add(record, "yf_budg_clas_cd4", rec.yf_budg_clas_cd4);
			rx.add(record, "cyov_yn", rec.cyov_yn);
			rx.add(record, "lesd_yn", rec.lesd_yn);
			rx.add(record, "advc_cndt_yn", rec.advc_cndt_yn);
			rx.add(record, "limt_chk_yn", rec.limt_chk_yn);
			rx.add(record, "posbfee_yn", rec.posbfee_yn);
			rx.add(record, "fixfee_yn", rec.fixfee_yn);
			rx.add(record, "medi_dstb_cd", rec.medi_dstb_cd);
			rx.add(record, "gf_commcdnm_medi_dstb_cd", rec.gf_commcdnm_medi_dstb_cd);
			rx.add(record, "whco_ndstb_cd", rec.whco_ndstb_cd);
			rx.add(record, "gf_commcdnm_ycjsbbcd", rec.gf_commcdnm_ycjsbbcd);
			rx.add(record, "whco_comn_cost_yn", rec.whco_comn_cost_yn);
			rx.add(record, "via_dept_cd", rec.via_dept_cd);
			rx.add(record, "if_buseonm_dept_cd", rec.if_buseonm_dept_cd);
			rx.add(record, "dstb_acct_cd", rec.dstb_acct_cd);
			rx.add(record, "drcr_bal_clsf", rec.drcr_bal_clsf);
			rx.add(record, "use_bgn_dt", rec.use_bgn_dt);
			rx.add(record, "use_end_dt", rec.use_end_dt);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "ycentdate", rec.ycentdate);
			//rx.add(record, "budg_clas_cd", StringUtil.replaceToXml(rec.budg_clas_cd));
			//rx.add(record, "prt_clsf_cd", StringUtil.replaceToXml(rec.prt_clsf_cd));
			//rx.add(record, "gf_commcdnm_prt_clsf_cd", StringUtil.replaceToXml(rec.gf_commcdnm_prt_clsf_cd));
			//rx.add(record, "budg_type_cd", StringUtil.replaceToXml(rec.budg_type_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
			//rx.add(record, "clas_cd1", StringUtil.replaceToXml(rec.clas_cd1));
			//rx.add(record, "yf_brnm_budg_clas_cd1", StringUtil.replaceToXml(rec.yf_brnm_budg_clas_cd1));
			//rx.add(record, "clas_cd2", StringUtil.replaceToXml(rec.clas_cd2));
			//rx.add(record, "yf_budg_clas_cd2", StringUtil.replaceToXml(rec.yf_budg_clas_cd2));
			//rx.add(record, "clas_cd3", StringUtil.replaceToXml(rec.clas_cd3));
			//rx.add(record, "yf_budg_clas_cd3", StringUtil.replaceToXml(rec.yf_budg_clas_cd3));
			//rx.add(record, "clas_cd4", StringUtil.replaceToXml(rec.clas_cd4));
			//rx.add(record, "yf_budg_clas_cd4", StringUtil.replaceToXml(rec.yf_budg_clas_cd4));
			//rx.add(record, "cyov_yn", StringUtil.replaceToXml(rec.cyov_yn));
			//rx.add(record, "lesd_yn", StringUtil.replaceToXml(rec.lesd_yn));
			//rx.add(record, "advc_cndt_yn", StringUtil.replaceToXml(rec.advc_cndt_yn));
			//rx.add(record, "limt_chk_yn", StringUtil.replaceToXml(rec.limt_chk_yn));
			//rx.add(record, "posbfee_yn", StringUtil.replaceToXml(rec.posbfee_yn));
			//rx.add(record, "fixfee_yn", StringUtil.replaceToXml(rec.fixfee_yn));
			//rx.add(record, "medi_dstb_cd", StringUtil.replaceToXml(rec.medi_dstb_cd));
			//rx.add(record, "gf_commcdnm_medi_dstb_cd", StringUtil.replaceToXml(rec.gf_commcdnm_medi_dstb_cd));
			//rx.add(record, "whco_ndstb_cd", StringUtil.replaceToXml(rec.whco_ndstb_cd));
			//rx.add(record, "gf_commcdnm_ycjsbbcd", StringUtil.replaceToXml(rec.gf_commcdnm_ycjsbbcd));
			//rx.add(record, "whco_comn_cost_yn", StringUtil.replaceToXml(rec.whco_comn_cost_yn));
			//rx.add(record, "via_dept_cd", StringUtil.replaceToXml(rec.via_dept_cd));
			//rx.add(record, "if_buseonm_dept_cd", StringUtil.replaceToXml(rec.if_buseonm_dept_cd));
			//rx.add(record, "dstb_acct_cd", StringUtil.replaceToXml(rec.dstb_acct_cd));
			//rx.add(record, "drcr_bal_clsf", StringUtil.replaceToXml(rec.drcr_bal_clsf));
			//rx.add(record, "use_bgn_dt", StringUtil.replaceToXml(rec.use_bgn_dt));
			//rx.add(record, "use_end_dt", StringUtil.replaceToXml(rec.use_end_dt));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
			//rx.add(record, "dlco_clsf", StringUtil.replaceToXml(rec.dlco_clsf));
			//rx.add(record, "ycentdate", StringUtil.replaceToXml(rec.ycentdate));
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
<mc_budg_4006_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_clas_cd/>
				<prt_clsf_cd/>
				<gf_commcdnm_prt_clsf_cd/>
				<budg_type_cd/>
				<budg_cdnm/>
				<budg_abrv_nm/>
				<clas_cd1/>
				<yf_brnm_budg_clas_cd1/>
				<clas_cd2/>
				<yf_budg_clas_cd2/>
				<clas_cd3/>
				<yf_budg_clas_cd3/>
				<clas_cd4/>
				<yf_budg_clas_cd4/>
				<cyov_yn/>
				<lesd_yn/>
				<advc_cndt_yn/>
				<limt_chk_yn/>
				<posbfee_yn/>
				<fixfee_yn/>
				<medi_dstb_cd/>
				<gf_commcdnm_medi_dstb_cd/>
				<whco_ndstb_cd/>
				<gf_commcdnm_ycjsbbcd/>
				<whco_comn_cost_yn/>
				<via_dept_cd/>
				<if_buseonm_dept_cd/>
				<dstb_acct_cd/>
				<drcr_bal_clsf/>
				<use_bgn_dt/>
				<use_end_dt/>
				<use_yn/>
				<dlco_clsf/>
				<ycentdate/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4006_l>
*/
%>

<% /* 작성시간 : Sat May 23 10:59:32 KST 2009 */ %>