<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1005_LDataSet ds = (CO_DLCO_1005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int record = 0;
	formData = rx.add(root, "tempData", "");
	record = rx.add(formData, "resForm", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			if (i == 0) {
				CO_DLCO_1005_LCURLISTRecord rec = (CO_DLCO_1005_LCURLISTRecord)ds.curlist.get(i);
				//int record = rx.add(formData, "record", "");
				rx.add(record, "dlco_no", rec.dlco_no);
				rx.add(record, "ern", rec.ern);
				rx.add(record, "sys_clsf_cd", rec.sys_clsf_cd);
				rx.addCData(record, "sys_clsf_nm", rec.sys_clsf_nm);
				rx.addCData(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
				rx.addCData(record, "dlco_nm", rec.dlco_nm);
				rx.add(record, "zip_1", rec.zip_1);
				rx.add(record, "zip_2", rec.zip_2);
				rx.addCData(record, "addr", rec.addr);
				rx.add(record, "dtls_addr", rec.dtls_addr);
				rx.add(record, "frnc_pers_yn", rec.frnc_pers_yn);
				rx.add(record, "natn_cd", rec.natn_cd);
				rx.addCData(record, "natn_nm", rec.natn_nm);
				rx.add(record, "frnc_addr", rec.frnc_addr);
				rx.add(record, "natn_tel_no", rec.natn_tel_no);
				rx.add(record, "tel_no", rec.tel_no);
				rx.add(record, "fax_no", rec.fax_no);
				rx.add(record, "mang_no_2", rec.mang_no_2);
				rx.add(record, "presi_nm", rec.presi_nm);
				rx.add(record, "presi_prn", rec.presi_prn);
				rx.add(record, "presi_zip_1", rec.presi_zip_1);
				rx.add(record, "presi_zip_2", rec.presi_zip_2);
				rx.add(record, "presi_addr", rec.presi_addr);
				rx.add(record, "presi_dtls_addr", rec.presi_dtls_addr);
				rx.add(record, "presi_tel_no", rec.presi_tel_no);
				rx.add(record, "bizcond", rec.bizcond);
				rx.addCData(record, "item", rec.item);
				rx.add(record, "setl_bank", rec.setl_bank);
				rx.add(record, "setl_bank_nm", rec.setl_bank_nm);
				rx.add(record, "acct_no", rec.acct_no);
				rx.addCData(record, "rcpm_main_nm", rec.rcpm_main_nm);
				rx.add(record, "email", rec.email);
				rx.add(record, "elec_tax_stmt_yn", rec.elec_tax_stmt_yn);
				rx.add(record, "corp_clsf", rec.corp_clsf);
				rx.add(record, "corp_clsf_nm", rec.corp_clsf_nm);
				rx.add(record, "err_eps_no_aprv_yn", rec.err_eps_no_aprv_yn);
				rx.add(record, "err_eps_no_aprv_dt", rec.err_eps_no_aprv_dt);
				rx.add(record, "err_eps_no_aprv_pers", rec.err_eps_no_aprv_pers);
				rx.add(record, "incmg_pers_cmpy_cd", rec.incmg_pers_cmpy_cd);
				rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
				rx.add(record, "incmg_pers", rec.incmg_pers);
				rx.add(record, "incmg_nm", rec.incmg_nm);
				rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
				rx.add(record, "chg_pers_cmpy_cd", rec.chg_pers_cmpy_cd);
				rx.add(record, "chg_pers", rec.chg_pers);
				rx.add(record, "chg_nm", rec.chg_nm);
				rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
				rx.add(record, "txn_clsf", rec.txn_clsf);
				rx.add(record, "acct_stat", rec.acct_stat);
				
				String	acct_stat_nm = "";
				if("1".equals(rec.acct_stat)) 		acct_stat_nm = "등록";
				else if("2".equals(rec.acct_stat)) 	acct_stat_nm = "승인";
				else if("3".equals(rec.acct_stat)) 	acct_stat_nm = "취소";
				else if("9".equals(rec.acct_stat)) 	acct_stat_nm = "휴면";			
				
				rx.add(record, "acct_stat_nm", acct_stat_nm);  	
			}
		}
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
			<dlco_no/>
			<ern/>
			<sys_clsf_cd/>
			<sys_clsf_nm/>
			<dlco_abrv_nm/>
			<dlco_nm/>
			<zip_1/>
			<zip_2/>
			<addr/>
			<dtls_addr/>
			<frnc_pers_yn/>
			<natn_cd/>
			<natn_nm/>
			<frnc_addr/>
			<natn_tel_no/>
			<tel_no/>
			<fax_no/>
			<mang_no_2/>
			<presi_nm/>
			<presi_prn/>
			<presi_zip_1/>
			<presi_zip_2/>
			<presi_addr/>
			<presi_dtls_addr/>
			<presi_tel_no/>
			<bizcond/>
			<item/>
			<setl_bank/>
			<setl_bank_nm/>
			<acct_no/>
			<rcpm_main_nm/>
			<email/>
			<elec_tax_stmt_yn/>
			<corp_clsf/>
			<corp_clsf_nm/>
			<err_eps_no_aprv_yn/>
			<err_eps_no_aprv_dt/>
			<err_eps_no_aprv_pers/>
			<incmg_pers_cmpy_cd/>
			<incmg_pers_ipadd/>
			<incmg_pers/>
			<incmg_nm/>
			<incmg_dt_tm/>
			<chg_pers_cmpy_cd/>
			<chg_pers/>
			<chg_nm/>
			<chg_dt_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 08 21:09:15 KST 2009 */ %>