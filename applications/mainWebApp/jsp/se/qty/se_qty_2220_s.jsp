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
* ���ϸ� : se_qty_2220_s.jsp
* ��� : Ư�ǽ�û����-����ȸ
* �ۼ����� : 2009-03-05
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_2220_SDataSet ds = (SE_QTY_2220_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "sect_cd", ds.sect_cd);
		}
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2220_SCURLISTRecord rec = (SE_QTY_2220_SCURLISTRecord)ds.curlist.get(i);
			rx.add(resform, "reg_dt", rec.reg_dt);
			rx.add(resform, "reg_seq", rec.reg_seq);
			rx.add(resform, "medi_cd", rec.medi_cd);
			rx.add(resform, "qty", rec.qty);
			rx.add(resform, "prt_rfl_qty", rec.prt_rfl_qty);
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
			rx.add(resform, "acpn_chrg_pers_nm", rec.acpn_chrg_pers_nm);
			rx.add(resform, "acpn_chrg_pers_cntc_plac", rec.acpn_chrg_pers_cntc_plac);
			rx.add(resform, "acpn_chrg_pers_dept_nm", rec.acpn_chrg_pers_dept_nm);
			rx.add(resform, "cnfm_stat_clsf", rec.cnfm_stat_clsf);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<reg_dt/>
			<reg_seq/>
			<medi_cd/>
			<qty/>
			<prt_rfl_qty/>
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
			<acpn_chrg_pers_nm/>
			<acpn_chrg_pers_cntc_plac/>
			<acpn_chrg_pers_dept_nm/>
			<cnfm_stat_clsf/>
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
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<sect_cd/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Thu Mar 05 15:30:44 KST 2009 */ %>