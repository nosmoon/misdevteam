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
	CO_DLCO_1008_ADataSet ds = (CO_DLCO_1008_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int record = rx.add(root, "tempData", "");

	try {
		rx.add(record, "st_dlco_no", ds.st_dlco_no);
		rx.add(record, "ed_dlco_no", ds.ed_dlco_no);
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

<% /* 작성시간 : Tue Apr 14 19:50:25 KST 2009 */ %>