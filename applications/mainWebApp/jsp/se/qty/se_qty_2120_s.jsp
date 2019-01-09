<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.ds.*
	,	chosun.ciis.se.qty.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_2120_s.jsp
* 기능 : 특판신청 - 상세 조회
* 작성일자 : 2009-03-04
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_2120_SDataSet ds = (SE_QTY_2120_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "sect_cd", ds.sect_cd);
		}
		if(ds.curlist.size() > 0) {
			SE_QTY_2120_SCURLISTRecord rec = (SE_QTY_2120_SCURLISTRecord)ds.curlist.get(0);
			rx.add(resform, "reg_dt", rec.reg_dt);
			rx.add(resform, "reg_seq", rec.reg_seq);
			rx.add(resform, "medi_cd", rec.medi_cd);
			rx.add(resform, "qty", rec.qty);
			rx.add(resform, "aplc_pers_nm", rec.aplc_pers_nm);
			rx.add(resform, "aplc_pers_tel_no_1", rec.aplc_pers_tel_no_1);
			rx.add(resform, "aplc_pers_tel_no_2", rec.aplc_pers_tel_no_2);
			rx.add(resform, "aplc_pers_tel_no_3", rec.aplc_pers_tel_no_3);
			rx.add(resform, "aplc_pers_ptph_no_1", rec.aplc_pers_ptph_no_1);
			rx.add(resform, "aplc_pers_ptph_no_2", rec.aplc_pers_ptph_no_2);
			rx.add(resform, "aplc_pers_ptph_no_3", rec.aplc_pers_ptph_no_3);
			rx.add(resform, "dlv_zip_1", rec.dlv_zip_1);
			rx.add(resform, "dlv_zip_2", rec.dlv_zip_2);
			rx.add(resform, "dlv_addr", rec.dlv_addr);
			rx.add(resform, "dlv_dtls_addr", rec.dlv_dtls_addr);
			rx.add(resform, "stmt_issu_req_yn", rec.stmt_issu_req_yn);
			rx.add(resform, "sell_clsf", rec.sell_clsf);
			rx.add(resform, "rcpm_pers", rec.rcpm_pers);
			rx.add(resform, "setl_acct_no", rec.setl_acct_no);
			rx.add(resform, "amt", rec.amt);			
			rx.add(resform, "acpn_chrg_pers", "");
			rx.add(resform, "acpn_chrg_pers_nm", "");
			rx.add(resform, "acpn_chrg_pers_cntc_plac", rec.acpn_chrg_pers_cntc_plac);
			rx.add(resform, "acpn_chrg_pers_cmpy_cd", "");
			rx.add(resform, "acpn_chrg_pers_dept_cd", "");
			rx.add(resform, "acpn_chrg_pers_dept_nm", "");
			rx.add(resform, "cnfm_stat_clsf_nm", rec.cnfm_stat_clsf_nm);
			rx.add(resform, "cnfm_msg", rec.cnfm_msg);
			rx.add(resform, "cnfm_chrg_flnm", rec.cnfm_chrg_flnm);
			rx.add(resform, "cnfm_dt", rec.cnfm_dt);
			rx.add(resform, "arvl_clsf", rec.arvl_clsf);
			rx.add(resform, "bo_cd", rec.bo_cd+rec.send_plac_seq);
			rx.add(resform, "send_plac_nm", rec.send_plac_nm);
			rx.add(resform, "clos_yn", rec.clos_yn);
			rx.add(resform, "issu_dt", rec.issu_dt);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<reg_dt/>
			<reg_seq/>
			<medi_cd/>
			<qty/>
			<aplc_pers_nm/>
			<aplc_pers_tel_no_1/>
			<aplc_pers_tel_no_2/>
			<aplc_pers_tel_no_3/>
			<aplc_pers_ptph_no_1/>
			<aplc_pers_ptph_no_2/>
			<aplc_pers_ptph_no_3/>
			<dlv_zip_1/>
			<dlv_zip_2/>
			<dlv_addr/>
			<dlv_dtls_addr/>
			<stmt_issu_req_yn/>
			<sell_clsf/>
			<rcpm_pers/>
			<setl_acct_no/>
			<amt/>
			<acpn_chrg_pers/>
			<acpn_chrg_pers_nm/>
			<acpn_chrg_pers_cntc_plac/>
			<acpn_chrg_pers_dept_nm/>
			<cnfm_stat_clsf_nm/>
			<cnfm_msg/>
			<cnfm_chrg_flnm/>
			<cnfm_dt/>
			<arvl_clsf/>
			<bo_cd/>
			<send_plac_nm/>
			<send_plac_seq/>
			<clos_yn/>
			<issu_dt/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<sect_cd/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Mar 04 16:14:42 KST 2009 */ %>