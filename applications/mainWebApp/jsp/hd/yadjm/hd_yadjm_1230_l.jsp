<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1230_LDataSet ds = (HD_YADJM_1230_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		System.out.println("ds.curlist.size() = "+ds.curlist.size());
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_1230_LCURLISTRecord rec = (HD_YADJM_1230_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");

			rx.add(record, "cmpy_cd",rec.cmpy_cd);                         
			rx.add(record, "adjm_rvrs_yy",rec.adjm_rvrs_yy);                    
			rx.add(record, "adjm_clsf",rec.adjm_clsf);                       
			rx.add(record, "emp_no",rec.emp_no);                          
			rx.add(record, "wedd_tms",rec.wedd_tms);                        
			rx.add(record, "movm_tms",rec.movm_tms);                        
			rx.add(record, "fnrl_tms",rec.fnrl_tms);                        
			rx.add(record, "prsn_pens_2000yy_aft",rec.prsn_pens_2000yy_aft);            
			rx.add(record, "pens_low_out_2001yy_aft",rec.pens_low_out_2001yy_aft);         
			rx.add(record, "crdt_non_pcc_use",rec.crdt_non_pcc_use);                
			rx.add(record, "cash_rcpt",rec.cash_rcpt);                       
			rx.add(record, "edu_cost_giro_pymt_amt",rec.edu_cost_giro_pymt_amt);          
			rx.add(record, "invsm_cmpd_invsm_amt",rec.invsm_cmpd_invsm_amt);            
			rx.add(record, "emp_stok_ownr_out_pens",rec.emp_stok_ownr_out_pens);          
			rx.add(record, "lvcmpy_pens_incm_dduc",rec.lvcmpy_pens_incm_dduc);           
			rx.add(record, "plac_cmpy_plac_trad_authr_inc",rec.plac_cmpy_plac_trad_authr_inc);   
			rx.add(record, "ltrm_stok_type_savg_incm_dduc",rec.ltrm_stok_type_savg_incm_dduc);   
			rx.add(record, "hous_loan_amt_int",rec.hous_loan_amt_int);               
			rx.add(record, "tax_paymt_cmpd_dduc",rec.tax_paymt_cmpd_dduc);             
			rx.add(record, "dona_polt_fund_10",rec.dona_polt_fund_10);               
			rx.add(record, "forn_duty_plac",rec.forn_duty_plac);                  
			rx.add(record, "forn_duty_dty",rec.forn_duty_dty);                   
			rx.add(record, "forn_duty_prd_frdt",rec.forn_duty_prd_frdt);              
			rx.add(record, "forn_duty_prd_todt",rec.forn_duty_prd_todt);              
			rx.add(record, "forn_duty_tot_saly",rec.forn_duty_tot_saly);              
			rx.add(record, "tax_paymt_offi_nm",rec.tax_paymt_offi_nm);               
			rx.add(record, "tax_paymt_amt_frex",rec.tax_paymt_amt_frex);              
			rx.add(record, "tax_paymt_amt_won",rec.tax_paymt_amt_won);               
			rx.add(record, "forn_duty_clsf",rec.forn_duty_clsf);                  
			rx.add(record, "txn_obj_addm_amt",rec.txn_obj_addm_amt);                
			rx.add(record, "ltrm_stok_type_savg_incm_dduc1",rec.ltrm_stok_type_savg_incm_dduc1);  
			rx.add(record, "ltrm_stok_type_savg_incm_dduc2",rec.ltrm_stok_type_savg_incm_dduc2);  
			rx.add(record, "ltrm_stok_type_savg_incm_dduc3",rec.ltrm_stok_type_savg_incm_dduc3);  
			rx.add(record, "hous_subc_savg",rec.hous_subc_savg);                  
			rx.add(record, "labr_hous_savg",rec.labr_hous_savg);                  
			rx.add(record, "ltrm_hous_savg",rec.ltrm_hous_savg);                  

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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<nm_korn/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 23 15:09:51 KST 2009 */ %>