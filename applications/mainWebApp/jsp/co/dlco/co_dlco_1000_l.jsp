<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1000_LDataSet ds = (CO_DLCO_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int levelSet1 = 0;
	int levelSet2 = 0;
	int levelSet3 = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "gridData", "");
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
//		levelSet1 = rx.add(dataSet, "tempData", "");
		recordSet = rx.add(dataSet, "main", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1000_LCURLISTRecord rec = (CO_DLCO_1000_LCURLISTRecord)ds.curlist.get(i);

			levelSet2 = rx.add(recordSet, "record", "");
			rx.addCData(levelSet2, "ern", rec.getErn());
			rx.addCData(levelSet2, "dlco_no", rec.getDlco_no());
			rx.addCData(levelSet2, "dlco_nm", rec.getDlco_nm());
			rx.addCData(levelSet2, "dlco_abrv_nm", rec.getDlco_abrv_nm());
//			rx.add(levelSet2, "dlco_nm", StringUtil.replaceToXml(rec.getDlco_nm()));
//			rx.add(levelSet2, "dlco_abrv_nm", StringUtil.replaceToXml(rec.getDlco_abrv_nm()));
			rx.addCData(levelSet2, "sys_clsf_cd", rec.getSys_clsf_cd());
			rx.addCData(levelSet2, "zip_1", rec.getZip_1());
			rx.addCData(levelSet2, "zip_2", rec.getZip_2());
			rx.addCData(levelSet2, "addr", rec.getAddr());
			rx.addCData(levelSet2, "dtls_addr", rec.getDtls_addr());
			rx.addCData(levelSet2, "tel_no", rec.getTel_no());
			rx.addCData(levelSet2, "fax_no", rec.getFax_no());
			rx.addCData(levelSet2, "mang_no_2", rec.getMang_no_2());
			rx.addCData(levelSet2, "natn_tel_no", rec.getNatn_tel_no());
			
			rx.addCData(levelSet2, "presi_nm", rec.getPresi_nm());
			rx.addCData(levelSet2, "presi_prn", rec.getPresi_prn());
			rx.addCData(levelSet2, "presi_tel_no", rec.getPresi_tel_no());
			rx.addCData(levelSet2, "presi_addr", rec.getPresi_addr());
			rx.addCData(levelSet2, "presi_dtls_addr", rec.getPresi_dtls_addr());
			rx.addCData(levelSet2, "presi_zip_1", rec.getPresi_zip_1());
			rx.addCData(levelSet2, "presi_zip_2", rec.getPresi_zip_2());
			rx.addCData(levelSet2, "natn_cd", rec.getNatn_cd());
			rx.addCData(levelSet2, "frnc_addr", rec.getFrnc_addr());
			rx.addCData(levelSet2, "bizcond", rec.getBizcond());
			rx.addCData(levelSet2, "item", rec.getItem());
			
			rx.addCData(levelSet2, "setl_bank", rec.getSetl_bank());
			rx.addCData(levelSet2, "acct_no", rec.getAcct_no());
			rx.addCData(levelSet2, "email", rec.getEmail());
			rx.addCData(levelSet2, "elec_tax_stmt_yn", rec.getElec_tax_stmt_yn());
			rx.addCData(levelSet2, "corp_clsf", rec.getCorp_clsf());
			rx.addCData(levelSet2, "frnc_pers_yn", rec.getFrnc_pers_yn());
//			rx.add(levelSet2, "rcpm_main_nm", rec.getRcpm_main_nm());
			rx.addCData(levelSet2, "rcpm_main_nm", rec.getRcpm_main_nm());
			rx.addCData(levelSet2, "err_eps_no_aprv_yn", rec.getErr_eps_no_aprv_yn());

			rx.addCData(levelSet2, "incmg_pers_cmpy_cd", rec.getIncmg_pers_cmpy_cd());
			rx.addCData(levelSet2, "incmg_pers", rec.getIncmg_pers());
			rx.addCData(levelSet2, "incmg_nm", rec.getIncmg_nm());
			rx.addCData(levelSet2, "incmg_dt_tm", rec.getIncmg_dt_tm());
			rx.addCData(levelSet2, "chg_pers_cmpy_cd", rec.getChg_pers_cmpy_cd());
			rx.addCData(levelSet2, "chg_pers", rec.getChg_pers());
			rx.addCData(levelSet2, "chg_nm", rec.getChg_nm());
			rx.addCData(levelSet2, "chg_dt_tm", rec.getChg_dt_tm());
			rx.addCData(levelSet2, "txn_clsf", rec.getTxn_clsf());
			rx.addCData(levelSet2, "acct_stat", rec.getAcct_stat());			  
			String	acct_stat_nm = "";
			if("1".equals(rec.acct_stat)) 		acct_stat_nm = "등록";
			else if("2".equals(rec.acct_stat)) 	acct_stat_nm = "승인";
			else if("3".equals(rec.acct_stat)) 	acct_stat_nm = "취소";
			else if("9".equals(rec.acct_stat)) 	acct_stat_nm = "휴면";			
			rx.addCData(levelSet2, "acct_stat_nm", acct_stat_nm);  			
			
		}
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
		<tree_itemset>
			<label/>
			<value/>
			<img/>
			<sel_img/>
		</tree_itemset>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jan 13 11:50:06 KST 2009 */ %>