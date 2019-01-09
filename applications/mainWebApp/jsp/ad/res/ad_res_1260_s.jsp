<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1260_SDataSet ds = (AD_RES_1260_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", ""); 
	int resForm = rx.add(resData, "resForm", "");

	try {

		rx.add(resForm, "medi_cd", ds.medi_cd);
		rx.add(resForm, "preng_occr_dt", ds.preng_occr_dt);
		rx.add(resForm, "preng_occr_seq", ds.preng_occr_seq);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.addCData(resForm, "dlco_nm", ds.dlco_nm);
		rx.addCData(resForm, "sect_nm", ds.sect_cd + ds.sect_seq); 
		rx.add(resForm, "dn", DigitUtil.cutUnderPoint(ds.dn,1));
		rx.add(resForm, "cm", DigitUtil.cutUnderPoint(ds.cm,1));
		rx.addCData(resForm, "chro_clsf_nm", ds.chro_clsf_nm); 
		rx.add(resForm, "chro_clsf", StringUtil.nvl(ds.chro_clsf, "1")); 
		rx.add(resForm, "uprc", ds.uprc);
		rx.add(resForm, "advt_fee", ds.advt_fee);
		rx.add(resForm, "vat", ds.vat);
		rx.add(resForm, "pubc_tot_amt", ds.pubc_tot_amt);
		rx.add(resForm, "pubc_side", ds.pubc_side);
		rx.add(resForm, "rtax_yn", ds.rtax_yn);
		rx.add(resForm, "tabl_yn", ds.tabl_yn);  
		rx.add(resForm, "hndl_clsf", StringUtil.nvl(ds.hndl_clsf, "1"));
		rx.add(resForm, "agn", ds.agn); 
		rx.addCData(resForm, "agn_nm", ds.agn_nm); 
		rx.add(resForm, "fee_rate", ds.fee_rate);   
		rx.add(resForm, "fee", ds.fee);
		rx.add(resForm, "hndl_plac_cd", ds.hndl_plac_cd);
		rx.add(resForm, "hndl_plac_nm", ds.hndl_plac_nm);
		rx.add(resForm, "coms_rate", ds.coms_rate); 
		rx.add(resForm, "coms", ds.coms); 
		rx.add(resForm, "advt_clas", StringUtil.nvl(ds.advt_clas, "1"));
		rx.add(resForm, "indt_clsf", ds.indt_clsf);  
		rx.addCData(resForm, "indt_clsf_nm", ds.indt_clsf_nm);
		rx.add(resForm, "mony_kind", StringUtil.nvl(ds.mony_kind, "KRW"));
		rx.add(resForm, "type_clsf", ds.type_clsf);
		rx.addCData(resForm, "type_clsf_nm", ds.type_clsf_nm);
		rx.add(resForm, "exrate", ds.exrate);
		rx.add(resForm, "pubc_clsf", StringUtil.nvl(ds.pubc_clsf, "1")); 
		rx.add(resForm, "grp_cmpy_cd", ds.grp_cmpy_cd);
		rx.add(resForm, "frex_cntr_amt", ds.frex_cntr_amt);
		rx.add(resForm, "edt_clsf", StringUtil.nvl(ds.edt_clsf,"8"));
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers);
		rx.addCData(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.addCData(resForm, "dept_nm", ds.dept_nm);
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
		rx.addCData(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm);    
		rx.addCData(resForm, "advt_cont", ds.advt_cont);
		rx.addCData(resForm, "remk", ds.remk); 
		rx.add(resForm, "bo_chrg_aprv_pers", ds.bo_chrg_aprv_pers);
		rx.add(resForm, "bo_chrg_aprv_dt", ds.bo_chrg_aprv_dt);
		rx.add(resForm, "chrg_aprv", "");
		rx.add(resForm, "chrg_aprv_pers", ds.chrg_aprv_pers); 
		rx.add(resForm, "chrg_aprv_dt", ds.chrg_aprv_dt);
		rx.add(resForm, "part_chf_aprv", ""); 
		rx.add(resForm, "part_chf_aprv_pers", ds.part_chf_aprv_pers);
		rx.add(resForm, "part_chf_aprv_dt", ds.part_chf_aprv_dt);
		rx.add(resForm, "team_chf_aprv", "");
		rx.add(resForm, "team_chf_aprv_pers", ds.team_chf_aprv_pers);
		rx.add(resForm, "team_chf_aprv_dt", ds.team_chf_aprv_dt);
		rx.add(resForm, "preng_clos_yn", ds.preng_clos_yn);
		rx.add(resForm, "preng_dt", ds.preng_dt);
		rx.add(resForm, "pubc_slip_no", ds.pubc_slip_no);
		rx.add(resForm, "incmg_pers", ds.incmg_pers);
		rx.add(resForm, "incmg_pers_nm", ds.incmg_pers_nm);
		rx.add(resForm, "incmg_dt_tm", ds.incmg_dt_tm);  
		rx.add(resForm, "fee_vat", ds.fee_vat);  
		rx.add(resForm, "coms_vat", ds.coms_vat);  
						
		rx.add(resForm, "srch_dt", "");  
		rx.add(resForm, "srch_plac", "");  
		rx.add(resForm, "cntc_plac", "");  
		rx.add(resForm, "tm", "");  
		rx.add(resForm, "sect_clsf", "");  
		rx.add(resForm, "cnfm_matt", ""); 
		rx.add(resForm, "bool_ext01", "N"); 
		rx.add(resForm, "bool_ext02", "N"); 
		
		//20160203 방일국요청 입금정보입력
		rx.add(resForm, "rcpm_yn"       ,StringUtil.nvl(ds.rcpm_yn, "N"));
		rx.add(resForm, "unrcpm_yn"     ,StringUtil.nvl(ds.unrcpm_yn, "N"));
		rx.add(resForm, "acct_num"      ,ds.acct_num    );
		rx.add(resForm, "tran_nm"       ,ds.tran_nm     );
		rx.add(resForm, "tran_amt"      ,ds.tran_amt    );
		rx.add(resForm, "tran_dt"       ,ds.tran_dt     );
		rx.add(resForm, "tran_schd_dt"  ,ds.tran_schd_dt);
		rx.add(resForm, "advt_emp_nm"   ,ds.advt_emp_nm );
		rx.add(resForm, "advt_email"    ,ds.advt_email  );
		rx.add(resForm, "advt_telno"    ,ds.advt_telno  );
		rx.add(resForm, "dtls_medi_cd"    ,ds.dtls_medi_cd  );		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>