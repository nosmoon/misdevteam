/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1315_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_no;
	public String sp_comp_chrg_pers_emp_no;
	public String use_sw;
	public String leaf_open_chrg_pers;
	public String leaf_now_chrg_pers;
	public String dept_cd;
	public String sub_dept_cd;
	public String bo_nm;
	public String bo_zip_1;
	public String bo_zip_2;
	public String bo_addr;
	public String bo_dtls_addr;
	public String hdqt_sell_dept_cd;
	public String hdqt_sell_sub_dept_cd;
	public String hdqt_sell_area_cd;
	public String cntr_stat_clsf;
	public String malig_yn;
	public String tax_stmt_cmpy_cd;
	public String cu_acct_cd;
	public String cntr_dt;
	public String expy_dt;
	public String leaf_sale_yn;
	public String leaf_purc_yn;
	public String dmang_bo_yn;
	public String outsd_leaf_cmpy_yn;
	public String vexc_cmpy_yn;
	public String design_cmpy_yn;
	public String excep_main_prt_plac_yn;
	public String isgrp_yn;
	public String sp_deal_yn;
	public String jurs_dong_nm;
	public String jurs_apt;
	public String leaf_addr;
	public String adms_dstc_cd;
	public String adms_dstc_cd_nm;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;
	public String dstc_seqo;
	public String srt_seqo;
	public String wh_cd;
	public String send_qty;
	public String acwr_rmsg_ptph;
	public String hmpg;
	public String remk;
	public String chg_pers;
	public String chg_dt_tm;
	public String dlco_abrv_nm;
	public String dlco_nm;
	public String ern;
	public String bizcond;
	public String item;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String presi_nm;
	public String tel_no;
	public String fax_no;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String a_mode;
	public String a_dlco_chrg_pers_seq;
	public String a_chrg_job_clsf;
	public String a_chrg_pers_nm;
	public String a_dept;
	public String a_posi;
	public String a_ptph_no;
	public String a_tel_no_1;
	public String a_tel_no_2;
	public String a_fax_no;
	public String a_email;
	public String a_tax_asp_id;
	public String a_kind_erplace_no;
	public String a_remk_matt;
	public String b_mode;
	public String b_sale_item_cd;
	public String b_cntr_dt;
	public String b_expy_dt;
	public String b_fst_clamt_mm;
	public String b_amt;
	public String b_clamt_mthd_cd;
	public String b_pay_cntr_clsf;
	public String b_remk;
	public String c_mode;
	public String c_giro_seq;
	public String c_giro_no;
	public String c_giro_clsf;
	public String c_aprv_no;
	public String c_dnmn_pers;
	public String c_bank_no;
	public String c_acct_no;
	public String c_deps_pers;
	public String c_open_dt;
	public String c_cdatmaplc_dt;
	public String c_cdatmaprv_dt;
	public String c_cdatmacpn_dt;
	public String d_mode;
	public String d_intn_tel_seq;
	public String d_estb_dt;
	public String d_mang_no;
	public String d_tel_no;
	public String d_use_yn;
	public String d_remk;

	public IS_BAS_1315_ADM(){}
	public IS_BAS_1315_ADM(String cmpy_cd, String dlco_clsf, String dlco_cd, String dlco_seq, String dlco_no, String sp_comp_chrg_pers_emp_no, String use_sw, String leaf_open_chrg_pers, String leaf_now_chrg_pers, String dept_cd, String sub_dept_cd, String bo_nm, String bo_zip_1, String bo_zip_2, String bo_addr, String bo_dtls_addr, String hdqt_sell_dept_cd, String hdqt_sell_sub_dept_cd, String hdqt_sell_area_cd, String cntr_stat_clsf, String malig_yn, String tax_stmt_cmpy_cd, String cu_acct_cd, String cntr_dt, String expy_dt, String leaf_sale_yn, String leaf_purc_yn, String dmang_bo_yn, String outsd_leaf_cmpy_yn, String vexc_cmpy_yn, String design_cmpy_yn, String excep_main_prt_plac_yn, String isgrp_yn, String sp_deal_yn, String jurs_dong_nm, String jurs_apt, String leaf_addr, String adms_dstc_cd, String adms_dstc_cd_nm, String asnt_dstc_cd, String asnt_dstc_cd_nm, String dstc_seqo, String srt_seqo, String wh_cd, String send_qty, String acwr_rmsg_ptph, String hmpg, String remk, String chg_pers, String chg_dt_tm, String dlco_abrv_nm, String dlco_nm, String ern, String bizcond, String item, String zip_1, String zip_2, String addr, String dtls_addr, String presi_nm, String tel_no, String fax_no, String incmg_pers_ip, String incmg_pers, String a_mode, String a_dlco_chrg_pers_seq, String a_chrg_job_clsf, String a_chrg_pers_nm, String a_dept, String a_posi, String a_ptph_no, String a_tel_no_1, String a_tel_no_2, String a_fax_no, String a_email, String a_tax_asp_id, String a_kind_erplace_no, String a_remk_matt, String b_mode, String b_sale_item_cd, String b_cntr_dt, String b_expy_dt, String b_fst_clamt_mm, String b_amt, String b_clamt_mthd_cd, String b_pay_cntr_clsf, String b_remk, String c_mode, String c_giro_seq, String c_giro_no, String c_giro_clsf, String c_aprv_no, String c_dnmn_pers, String c_bank_no, String c_acct_no, String c_deps_pers, String c_open_dt, String c_cdatmaplc_dt, String c_cdatmaprv_dt, String c_cdatmacpn_dt, String d_mode, String d_intn_tel_seq, String d_estb_dt, String d_mang_no, String d_tel_no, String d_use_yn, String d_remk){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.dlco_no = dlco_no;
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
		this.use_sw = use_sw;
		this.leaf_open_chrg_pers = leaf_open_chrg_pers;
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.bo_nm = bo_nm;
		this.bo_zip_1 = bo_zip_1;
		this.bo_zip_2 = bo_zip_2;
		this.bo_addr = bo_addr;
		this.bo_dtls_addr = bo_dtls_addr;
		this.hdqt_sell_dept_cd = hdqt_sell_dept_cd;
		this.hdqt_sell_sub_dept_cd = hdqt_sell_sub_dept_cd;
		this.hdqt_sell_area_cd = hdqt_sell_area_cd;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.malig_yn = malig_yn;
		this.tax_stmt_cmpy_cd = tax_stmt_cmpy_cd;
		this.cu_acct_cd = cu_acct_cd;
		this.cntr_dt = cntr_dt;
		this.expy_dt = expy_dt;
		this.leaf_sale_yn = leaf_sale_yn;
		this.leaf_purc_yn = leaf_purc_yn;
		this.dmang_bo_yn = dmang_bo_yn;
		this.outsd_leaf_cmpy_yn = outsd_leaf_cmpy_yn;
		this.vexc_cmpy_yn = vexc_cmpy_yn;
		this.design_cmpy_yn = design_cmpy_yn;
		this.excep_main_prt_plac_yn = excep_main_prt_plac_yn;
		this.isgrp_yn = isgrp_yn;
		this.sp_deal_yn = sp_deal_yn;
		this.jurs_dong_nm = jurs_dong_nm;
		this.jurs_apt = jurs_apt;
		this.leaf_addr = leaf_addr;
		this.adms_dstc_cd = adms_dstc_cd;
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
		this.asnt_dstc_cd = asnt_dstc_cd;
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
		this.dstc_seqo = dstc_seqo;
		this.srt_seqo = srt_seqo;
		this.wh_cd = wh_cd;
		this.send_qty = send_qty;
		this.acwr_rmsg_ptph = acwr_rmsg_ptph;
		this.hmpg = hmpg;
		this.remk = remk;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.bizcond = bizcond;
		this.item = item;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.presi_nm = presi_nm;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.a_mode = a_mode;
		this.a_dlco_chrg_pers_seq = a_dlco_chrg_pers_seq;
		this.a_chrg_job_clsf = a_chrg_job_clsf;
		this.a_chrg_pers_nm = a_chrg_pers_nm;
		this.a_dept = a_dept;
		this.a_posi = a_posi;
		this.a_ptph_no = a_ptph_no;
		this.a_tel_no_1 = a_tel_no_1;
		this.a_tel_no_2 = a_tel_no_2;
		this.a_fax_no = a_fax_no;
		this.a_email = a_email;
		this.a_tax_asp_id = a_tax_asp_id;
		this.a_kind_erplace_no = a_kind_erplace_no;
		this.a_remk_matt = a_remk_matt;
		this.b_mode = b_mode;
		this.b_sale_item_cd = b_sale_item_cd;
		this.b_cntr_dt = b_cntr_dt;
		this.b_expy_dt = b_expy_dt;
		this.b_fst_clamt_mm = b_fst_clamt_mm;
		this.b_amt = b_amt;
		this.b_clamt_mthd_cd = b_clamt_mthd_cd;
		this.b_pay_cntr_clsf = b_pay_cntr_clsf;
		this.b_remk = b_remk;
		this.c_mode = c_mode;
		this.c_giro_seq = c_giro_seq;
		this.c_giro_no = c_giro_no;
		this.c_giro_clsf = c_giro_clsf;
		this.c_aprv_no = c_aprv_no;
		this.c_dnmn_pers = c_dnmn_pers;
		this.c_bank_no = c_bank_no;
		this.c_acct_no = c_acct_no;
		this.c_deps_pers = c_deps_pers;
		this.c_open_dt = c_open_dt;
		this.c_cdatmaplc_dt = c_cdatmaplc_dt;
		this.c_cdatmaprv_dt = c_cdatmaprv_dt;
		this.c_cdatmacpn_dt = c_cdatmacpn_dt;
		this.d_mode = d_mode;
		this.d_intn_tel_seq = d_intn_tel_seq;
		this.d_estb_dt = d_estb_dt;
		this.d_mang_no = d_mang_no;
		this.d_tel_no = d_tel_no;
		this.d_use_yn = d_use_yn;
		this.d_remk = d_remk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSp_comp_chrg_pers_emp_no(String sp_comp_chrg_pers_emp_no){
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
	}

	public void setUse_sw(String use_sw){
		this.use_sw = use_sw;
	}

	public void setLeaf_open_chrg_pers(String leaf_open_chrg_pers){
		this.leaf_open_chrg_pers = leaf_open_chrg_pers;
	}

	public void setLeaf_now_chrg_pers(String leaf_now_chrg_pers){
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_zip_1(String bo_zip_1){
		this.bo_zip_1 = bo_zip_1;
	}

	public void setBo_zip_2(String bo_zip_2){
		this.bo_zip_2 = bo_zip_2;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setBo_dtls_addr(String bo_dtls_addr){
		this.bo_dtls_addr = bo_dtls_addr;
	}

	public void setHdqt_sell_dept_cd(String hdqt_sell_dept_cd){
		this.hdqt_sell_dept_cd = hdqt_sell_dept_cd;
	}

	public void setHdqt_sell_sub_dept_cd(String hdqt_sell_sub_dept_cd){
		this.hdqt_sell_sub_dept_cd = hdqt_sell_sub_dept_cd;
	}

	public void setHdqt_sell_area_cd(String hdqt_sell_area_cd){
		this.hdqt_sell_area_cd = hdqt_sell_area_cd;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setMalig_yn(String malig_yn){
		this.malig_yn = malig_yn;
	}

	public void setTax_stmt_cmpy_cd(String tax_stmt_cmpy_cd){
		this.tax_stmt_cmpy_cd = tax_stmt_cmpy_cd;
	}

	public void setCu_acct_cd(String cu_acct_cd){
		this.cu_acct_cd = cu_acct_cd;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setExpy_dt(String expy_dt){
		this.expy_dt = expy_dt;
	}

	public void setLeaf_sale_yn(String leaf_sale_yn){
		this.leaf_sale_yn = leaf_sale_yn;
	}

	public void setLeaf_purc_yn(String leaf_purc_yn){
		this.leaf_purc_yn = leaf_purc_yn;
	}

	public void setDmang_bo_yn(String dmang_bo_yn){
		this.dmang_bo_yn = dmang_bo_yn;
	}

	public void setOutsd_leaf_cmpy_yn(String outsd_leaf_cmpy_yn){
		this.outsd_leaf_cmpy_yn = outsd_leaf_cmpy_yn;
	}

	public void setVexc_cmpy_yn(String vexc_cmpy_yn){
		this.vexc_cmpy_yn = vexc_cmpy_yn;
	}

	public void setDesign_cmpy_yn(String design_cmpy_yn){
		this.design_cmpy_yn = design_cmpy_yn;
	}

	public void setExcep_main_prt_plac_yn(String excep_main_prt_plac_yn){
		this.excep_main_prt_plac_yn = excep_main_prt_plac_yn;
	}

	public void setIsgrp_yn(String isgrp_yn){
		this.isgrp_yn = isgrp_yn;
	}

	public void setSp_deal_yn(String sp_deal_yn){
		this.sp_deal_yn = sp_deal_yn;
	}

	public void setJurs_dong_nm(String jurs_dong_nm){
		this.jurs_dong_nm = jurs_dong_nm;
	}

	public void setJurs_apt(String jurs_apt){
		this.jurs_apt = jurs_apt;
	}

	public void setLeaf_addr(String leaf_addr){
		this.leaf_addr = leaf_addr;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setAdms_dstc_cd_nm(String adms_dstc_cd_nm){
		this.adms_dstc_cd_nm = adms_dstc_cd_nm;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setDstc_seqo(String dstc_seqo){
		this.dstc_seqo = dstc_seqo;
	}

	public void setSrt_seqo(String srt_seqo){
		this.srt_seqo = srt_seqo;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSend_qty(String send_qty){
		this.send_qty = send_qty;
	}

	public void setAcwr_rmsg_ptph(String acwr_rmsg_ptph){
		this.acwr_rmsg_ptph = acwr_rmsg_ptph;
	}

	public void setHmpg(String hmpg){
		this.hmpg = hmpg;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setA_mode(String a_mode){
		this.a_mode = a_mode;
	}

	public void setA_dlco_chrg_pers_seq(String a_dlco_chrg_pers_seq){
		this.a_dlco_chrg_pers_seq = a_dlco_chrg_pers_seq;
	}

	public void setA_chrg_job_clsf(String a_chrg_job_clsf){
		this.a_chrg_job_clsf = a_chrg_job_clsf;
	}

	public void setA_chrg_pers_nm(String a_chrg_pers_nm){
		this.a_chrg_pers_nm = a_chrg_pers_nm;
	}

	public void setA_dept(String a_dept){
		this.a_dept = a_dept;
	}

	public void setA_posi(String a_posi){
		this.a_posi = a_posi;
	}

	public void setA_ptph_no(String a_ptph_no){
		this.a_ptph_no = a_ptph_no;
	}

	public void setA_tel_no_1(String a_tel_no_1){
		this.a_tel_no_1 = a_tel_no_1;
	}

	public void setA_tel_no_2(String a_tel_no_2){
		this.a_tel_no_2 = a_tel_no_2;
	}

	public void setA_fax_no(String a_fax_no){
		this.a_fax_no = a_fax_no;
	}

	public void setA_email(String a_email){
		this.a_email = a_email;
	}

	public void setA_tax_asp_id(String a_tax_asp_id){
		this.a_tax_asp_id = a_tax_asp_id;
	}

	public void setA_kind_erplace_no(String a_kind_erplace_no){
		this.a_kind_erplace_no = a_kind_erplace_no;
	}

	public void setA_remk_matt(String a_remk_matt){
		this.a_remk_matt = a_remk_matt;
	}

	public void setB_mode(String b_mode){
		this.b_mode = b_mode;
	}

	public void setB_sale_item_cd(String b_sale_item_cd){
		this.b_sale_item_cd = b_sale_item_cd;
	}

	public void setB_cntr_dt(String b_cntr_dt){
		this.b_cntr_dt = b_cntr_dt;
	}

	public void setB_expy_dt(String b_expy_dt){
		this.b_expy_dt = b_expy_dt;
	}

	public void setB_fst_clamt_mm(String b_fst_clamt_mm){
		this.b_fst_clamt_mm = b_fst_clamt_mm;
	}

	public void setB_amt(String b_amt){
		this.b_amt = b_amt;
	}

	public void setB_clamt_mthd_cd(String b_clamt_mthd_cd){
		this.b_clamt_mthd_cd = b_clamt_mthd_cd;
	}

	public void setB_pay_cntr_clsf(String b_pay_cntr_clsf){
		this.b_pay_cntr_clsf = b_pay_cntr_clsf;
	}

	public void setB_remk(String b_remk){
		this.b_remk = b_remk;
	}

	public void setC_mode(String c_mode){
		this.c_mode = c_mode;
	}

	public void setC_giro_seq(String c_giro_seq){
		this.c_giro_seq = c_giro_seq;
	}

	public void setC_giro_no(String c_giro_no){
		this.c_giro_no = c_giro_no;
	}

	public void setC_giro_clsf(String c_giro_clsf){
		this.c_giro_clsf = c_giro_clsf;
	}

	public void setC_aprv_no(String c_aprv_no){
		this.c_aprv_no = c_aprv_no;
	}

	public void setC_dnmn_pers(String c_dnmn_pers){
		this.c_dnmn_pers = c_dnmn_pers;
	}

	public void setC_bank_no(String c_bank_no){
		this.c_bank_no = c_bank_no;
	}

	public void setC_acct_no(String c_acct_no){
		this.c_acct_no = c_acct_no;
	}

	public void setC_deps_pers(String c_deps_pers){
		this.c_deps_pers = c_deps_pers;
	}

	public void setC_open_dt(String c_open_dt){
		this.c_open_dt = c_open_dt;
	}

	public void setC_cdatmaplc_dt(String c_cdatmaplc_dt){
		this.c_cdatmaplc_dt = c_cdatmaplc_dt;
	}

	public void setC_cdatmaprv_dt(String c_cdatmaprv_dt){
		this.c_cdatmaprv_dt = c_cdatmaprv_dt;
	}

	public void setC_cdatmacpn_dt(String c_cdatmacpn_dt){
		this.c_cdatmacpn_dt = c_cdatmacpn_dt;
	}

	public void setD_mode(String d_mode){
		this.d_mode = d_mode;
	}

	public void setD_intn_tel_seq(String d_intn_tel_seq){
		this.d_intn_tel_seq = d_intn_tel_seq;
	}

	public void setD_estb_dt(String d_estb_dt){
		this.d_estb_dt = d_estb_dt;
	}

	public void setD_mang_no(String d_mang_no){
		this.d_mang_no = d_mang_no;
	}

	public void setD_tel_no(String d_tel_no){
		this.d_tel_no = d_tel_no;
	}

	public void setD_use_yn(String d_use_yn){
		this.d_use_yn = d_use_yn;
	}

	public void setD_remk(String d_remk){
		this.d_remk = d_remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSp_comp_chrg_pers_emp_no(){
		return this.sp_comp_chrg_pers_emp_no;
	}

	public String getUse_sw(){
		return this.use_sw;
	}

	public String getLeaf_open_chrg_pers(){
		return this.leaf_open_chrg_pers;
	}

	public String getLeaf_now_chrg_pers(){
		return this.leaf_now_chrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_zip_1(){
		return this.bo_zip_1;
	}

	public String getBo_zip_2(){
		return this.bo_zip_2;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getBo_dtls_addr(){
		return this.bo_dtls_addr;
	}

	public String getHdqt_sell_dept_cd(){
		return this.hdqt_sell_dept_cd;
	}

	public String getHdqt_sell_sub_dept_cd(){
		return this.hdqt_sell_sub_dept_cd;
	}

	public String getHdqt_sell_area_cd(){
		return this.hdqt_sell_area_cd;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getMalig_yn(){
		return this.malig_yn;
	}

	public String getTax_stmt_cmpy_cd(){
		return this.tax_stmt_cmpy_cd;
	}

	public String getCu_acct_cd(){
		return this.cu_acct_cd;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getExpy_dt(){
		return this.expy_dt;
	}

	public String getLeaf_sale_yn(){
		return this.leaf_sale_yn;
	}

	public String getLeaf_purc_yn(){
		return this.leaf_purc_yn;
	}

	public String getDmang_bo_yn(){
		return this.dmang_bo_yn;
	}

	public String getOutsd_leaf_cmpy_yn(){
		return this.outsd_leaf_cmpy_yn;
	}

	public String getVexc_cmpy_yn(){
		return this.vexc_cmpy_yn;
	}

	public String getDesign_cmpy_yn(){
		return this.design_cmpy_yn;
	}

	public String getExcep_main_prt_plac_yn(){
		return this.excep_main_prt_plac_yn;
	}

	public String getIsgrp_yn(){
		return this.isgrp_yn;
	}

	public String getSp_deal_yn(){
		return this.sp_deal_yn;
	}

	public String getJurs_dong_nm(){
		return this.jurs_dong_nm;
	}

	public String getJurs_apt(){
		return this.jurs_apt;
	}

	public String getLeaf_addr(){
		return this.leaf_addr;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getAdms_dstc_cd_nm(){
		return this.adms_dstc_cd_nm;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getDstc_seqo(){
		return this.dstc_seqo;
	}

	public String getSrt_seqo(){
		return this.srt_seqo;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSend_qty(){
		return this.send_qty;
	}

	public String getAcwr_rmsg_ptph(){
		return this.acwr_rmsg_ptph;
	}

	public String getHmpg(){
		return this.hmpg;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getA_mode(){
		return this.a_mode;
	}

	public String getA_dlco_chrg_pers_seq(){
		return this.a_dlco_chrg_pers_seq;
	}

	public String getA_chrg_job_clsf(){
		return this.a_chrg_job_clsf;
	}

	public String getA_chrg_pers_nm(){
		return this.a_chrg_pers_nm;
	}

	public String getA_dept(){
		return this.a_dept;
	}

	public String getA_posi(){
		return this.a_posi;
	}

	public String getA_ptph_no(){
		return this.a_ptph_no;
	}

	public String getA_tel_no_1(){
		return this.a_tel_no_1;
	}

	public String getA_tel_no_2(){
		return this.a_tel_no_2;
	}

	public String getA_fax_no(){
		return this.a_fax_no;
	}

	public String getA_email(){
		return this.a_email;
	}

	public String getA_tax_asp_id(){
		return this.a_tax_asp_id;
	}

	public String getA_kind_erplace_no(){
		return this.a_kind_erplace_no;
	}

	public String getA_remk_matt(){
		return this.a_remk_matt;
	}

	public String getB_mode(){
		return this.b_mode;
	}

	public String getB_sale_item_cd(){
		return this.b_sale_item_cd;
	}

	public String getB_cntr_dt(){
		return this.b_cntr_dt;
	}

	public String getB_expy_dt(){
		return this.b_expy_dt;
	}

	public String getB_fst_clamt_mm(){
		return this.b_fst_clamt_mm;
	}

	public String getB_amt(){
		return this.b_amt;
	}

	public String getB_clamt_mthd_cd(){
		return this.b_clamt_mthd_cd;
	}

	public String getB_pay_cntr_clsf(){
		return this.b_pay_cntr_clsf;
	}

	public String getB_remk(){
		return this.b_remk;
	}

	public String getC_mode(){
		return this.c_mode;
	}

	public String getC_giro_seq(){
		return this.c_giro_seq;
	}

	public String getC_giro_no(){
		return this.c_giro_no;
	}

	public String getC_giro_clsf(){
		return this.c_giro_clsf;
	}

	public String getC_aprv_no(){
		return this.c_aprv_no;
	}

	public String getC_dnmn_pers(){
		return this.c_dnmn_pers;
	}

	public String getC_bank_no(){
		return this.c_bank_no;
	}

	public String getC_acct_no(){
		return this.c_acct_no;
	}

	public String getC_deps_pers(){
		return this.c_deps_pers;
	}

	public String getC_open_dt(){
		return this.c_open_dt;
	}

	public String getC_cdatmaplc_dt(){
		return this.c_cdatmaplc_dt;
	}

	public String getC_cdatmaprv_dt(){
		return this.c_cdatmaprv_dt;
	}

	public String getC_cdatmacpn_dt(){
		return this.c_cdatmacpn_dt;
	}

	public String getD_mode(){
		return this.d_mode;
	}

	public String getD_intn_tel_seq(){
		return this.d_intn_tel_seq;
	}

	public String getD_estb_dt(){
		return this.d_estb_dt;
	}

	public String getD_mang_no(){
		return this.d_mang_no;
	}

	public String getD_tel_no(){
		return this.d_tel_no;
	}

	public String getD_use_yn(){
		return this.d_use_yn;
	}

	public String getD_remk(){
		return this.d_remk;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1315_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1315_ADM dm = (IS_BAS_1315_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.setString(6, dm.dlco_seq);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.sp_comp_chrg_pers_emp_no);
		cstmt.setString(9, dm.use_sw);
		cstmt.setString(10, dm.leaf_open_chrg_pers);
		cstmt.setString(11, dm.leaf_now_chrg_pers);
		cstmt.setString(12, dm.dept_cd);
		cstmt.setString(13, dm.sub_dept_cd);
		cstmt.setString(14, dm.bo_nm);
		cstmt.setString(15, dm.bo_zip_1);
		cstmt.setString(16, dm.bo_zip_2);
		cstmt.setString(17, dm.bo_addr);
		cstmt.setString(18, dm.bo_dtls_addr);
		cstmt.setString(19, dm.hdqt_sell_dept_cd);
		cstmt.setString(20, dm.hdqt_sell_sub_dept_cd);
		cstmt.setString(21, dm.hdqt_sell_area_cd);
		cstmt.setString(22, dm.cntr_stat_clsf);
		cstmt.setString(23, dm.malig_yn);
		cstmt.setString(24, dm.tax_stmt_cmpy_cd);
		cstmt.setString(25, dm.cu_acct_cd);
		cstmt.setString(26, dm.cntr_dt);
		cstmt.setString(27, dm.expy_dt);
		cstmt.setString(28, dm.leaf_sale_yn);
		cstmt.setString(29, dm.leaf_purc_yn);
		cstmt.setString(30, dm.dmang_bo_yn);
		cstmt.setString(31, dm.outsd_leaf_cmpy_yn);
		cstmt.setString(32, dm.vexc_cmpy_yn);
		cstmt.setString(33, dm.design_cmpy_yn);
		cstmt.setString(34, dm.excep_main_prt_plac_yn);
		cstmt.setString(35, dm.isgrp_yn);
		cstmt.setString(36, dm.sp_deal_yn);
		cstmt.setString(37, dm.jurs_dong_nm);
		cstmt.setString(38, dm.jurs_apt);
		cstmt.setString(39, dm.leaf_addr);
		cstmt.setString(40, dm.adms_dstc_cd);
		cstmt.setString(41, dm.adms_dstc_cd_nm);
		cstmt.setString(42, dm.asnt_dstc_cd);
		cstmt.setString(43, dm.asnt_dstc_cd_nm);
		cstmt.setString(44, dm.dstc_seqo);
		cstmt.setString(45, dm.srt_seqo);
		cstmt.setString(46, dm.wh_cd);
		cstmt.setString(47, dm.send_qty);
		cstmt.setString(48, dm.acwr_rmsg_ptph);
		cstmt.setString(49, dm.hmpg);
		cstmt.setString(50, dm.remk);
		cstmt.setString(51, dm.chg_pers);
		cstmt.setString(52, dm.chg_dt_tm);
		cstmt.setString(53, dm.dlco_abrv_nm);
		cstmt.setString(54, dm.dlco_nm);
		cstmt.setString(55, dm.ern);
		cstmt.setString(56, dm.bizcond);
		cstmt.setString(57, dm.item);
		cstmt.setString(58, dm.zip_1);
		cstmt.setString(59, dm.zip_2);
		cstmt.setString(60, dm.addr);
		cstmt.setString(61, dm.dtls_addr);
		cstmt.setString(62, dm.presi_nm);
		cstmt.setString(63, dm.tel_no);
		cstmt.setString(64, dm.fax_no);
		cstmt.setString(65, dm.incmg_pers_ip);
		cstmt.setString(66, dm.incmg_pers);
		cstmt.setString(67, dm.a_mode);
		cstmt.setString(68, dm.a_dlco_chrg_pers_seq);
		cstmt.setString(69, dm.a_chrg_job_clsf);
		cstmt.setString(70, dm.a_chrg_pers_nm);
		cstmt.setString(71, dm.a_dept);
		cstmt.setString(72, dm.a_posi);
		cstmt.setString(73, dm.a_ptph_no);
		cstmt.setString(74, dm.a_tel_no_1);
		cstmt.setString(75, dm.a_tel_no_2);
		cstmt.setString(76, dm.a_fax_no);
		cstmt.setString(77, dm.a_email);
		cstmt.setString(78, dm.a_tax_asp_id);
		cstmt.setString(79, dm.a_kind_erplace_no);
		cstmt.setString(80, dm.a_remk_matt);
		cstmt.setString(81, dm.b_mode);
		cstmt.setString(82, dm.b_sale_item_cd);
		cstmt.setString(83, dm.b_cntr_dt);
		cstmt.setString(84, dm.b_expy_dt);
		cstmt.setString(85, dm.b_fst_clamt_mm);
		cstmt.setString(86, dm.b_amt);
		cstmt.setString(87, dm.b_clamt_mthd_cd);
		cstmt.setString(88, dm.b_pay_cntr_clsf);
		cstmt.setString(89, dm.b_remk);
		cstmt.setString(90, dm.c_mode);
		cstmt.setString(91, dm.c_giro_seq);
		cstmt.setString(92, dm.c_giro_no);
		cstmt.setString(93, dm.c_giro_clsf);
		cstmt.setString(94, dm.c_aprv_no);
		cstmt.setString(95, dm.c_dnmn_pers);
		cstmt.setString(96, dm.c_bank_no);
		cstmt.setString(97, dm.c_acct_no);
		cstmt.setString(98, dm.c_deps_pers);
		cstmt.setString(99, dm.c_open_dt);
		cstmt.setString(100, dm.c_cdatmaplc_dt);
		cstmt.setString(101, dm.c_cdatmaprv_dt);
		cstmt.setString(102, dm.c_cdatmacpn_dt);
		cstmt.setString(103, dm.d_mode);
		cstmt.setString(104, dm.d_intn_tel_seq);
		cstmt.setString(105, dm.d_estb_dt);
		cstmt.setString(106, dm.d_mang_no);
		cstmt.setString(107, dm.d_tel_no);
		cstmt.setString(108, dm.d_use_yn);
		cstmt.setString(109, dm.d_remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1315_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_seq = [" + getDlco_seq() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sp_comp_chrg_pers_emp_no = [" + getSp_comp_chrg_pers_emp_no() + "]");
		System.out.println("use_sw = [" + getUse_sw() + "]");
		System.out.println("leaf_open_chrg_pers = [" + getLeaf_open_chrg_pers() + "]");
		System.out.println("leaf_now_chrg_pers = [" + getLeaf_now_chrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("bo_zip_1 = [" + getBo_zip_1() + "]");
		System.out.println("bo_zip_2 = [" + getBo_zip_2() + "]");
		System.out.println("bo_addr = [" + getBo_addr() + "]");
		System.out.println("bo_dtls_addr = [" + getBo_dtls_addr() + "]");
		System.out.println("hdqt_sell_dept_cd = [" + getHdqt_sell_dept_cd() + "]");
		System.out.println("hdqt_sell_sub_dept_cd = [" + getHdqt_sell_sub_dept_cd() + "]");
		System.out.println("hdqt_sell_area_cd = [" + getHdqt_sell_area_cd() + "]");
		System.out.println("cntr_stat_clsf = [" + getCntr_stat_clsf() + "]");
		System.out.println("malig_yn = [" + getMalig_yn() + "]");
		System.out.println("tax_stmt_cmpy_cd = [" + getTax_stmt_cmpy_cd() + "]");
		System.out.println("cu_acct_cd = [" + getCu_acct_cd() + "]");
		System.out.println("cntr_dt = [" + getCntr_dt() + "]");
		System.out.println("expy_dt = [" + getExpy_dt() + "]");
		System.out.println("leaf_sale_yn = [" + getLeaf_sale_yn() + "]");
		System.out.println("leaf_purc_yn = [" + getLeaf_purc_yn() + "]");
		System.out.println("dmang_bo_yn = [" + getDmang_bo_yn() + "]");
		System.out.println("outsd_leaf_cmpy_yn = [" + getOutsd_leaf_cmpy_yn() + "]");
		System.out.println("vexc_cmpy_yn = [" + getVexc_cmpy_yn() + "]");
		System.out.println("design_cmpy_yn = [" + getDesign_cmpy_yn() + "]");
		System.out.println("excep_main_prt_plac_yn = [" + getExcep_main_prt_plac_yn() + "]");
		System.out.println("isgrp_yn = [" + getIsgrp_yn() + "]");
		System.out.println("sp_deal_yn = [" + getSp_deal_yn() + "]");
		System.out.println("jurs_dong_nm = [" + getJurs_dong_nm() + "]");
		System.out.println("jurs_apt = [" + getJurs_apt() + "]");
		System.out.println("leaf_addr = [" + getLeaf_addr() + "]");
		System.out.println("adms_dstc_cd = [" + getAdms_dstc_cd() + "]");
		System.out.println("adms_dstc_cd_nm = [" + getAdms_dstc_cd_nm() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
		System.out.println("asnt_dstc_cd_nm = [" + getAsnt_dstc_cd_nm() + "]");
		System.out.println("dstc_seqo = [" + getDstc_seqo() + "]");
		System.out.println("srt_seqo = [" + getSrt_seqo() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
		System.out.println("send_qty = [" + getSend_qty() + "]");
		System.out.println("acwr_rmsg_ptph = [" + getAcwr_rmsg_ptph() + "]");
		System.out.println("hmpg = [" + getHmpg() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
		System.out.println("dlco_abrv_nm = [" + getDlco_abrv_nm() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("bizcond = [" + getBizcond() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("zip_1 = [" + getZip_1() + "]");
		System.out.println("zip_2 = [" + getZip_2() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("fax_no = [" + getFax_no() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("a_mode = [" + getA_mode() + "]");
		System.out.println("a_dlco_chrg_pers_seq = [" + getA_dlco_chrg_pers_seq() + "]");
		System.out.println("a_chrg_job_clsf = [" + getA_chrg_job_clsf() + "]");
		System.out.println("a_chrg_pers_nm = [" + getA_chrg_pers_nm() + "]");
		System.out.println("a_dept = [" + getA_dept() + "]");
		System.out.println("a_posi = [" + getA_posi() + "]");
		System.out.println("a_ptph_no = [" + getA_ptph_no() + "]");
		System.out.println("a_tel_no_1 = [" + getA_tel_no_1() + "]");
		System.out.println("a_tel_no_2 = [" + getA_tel_no_2() + "]");
		System.out.println("a_fax_no = [" + getA_fax_no() + "]");
		System.out.println("a_email = [" + getA_email() + "]");
		System.out.println("a_tax_asp_id = [" + getA_tax_asp_id() + "]");
		System.out.println("a_kind_erplace_no = [" + getA_kind_erplace_no() + "]");
		System.out.println("a_remk_matt = [" + getA_remk_matt() + "]");
		System.out.println("b_mode = [" + getB_mode() + "]");
		System.out.println("b_sale_item_cd = [" + getB_sale_item_cd() + "]");
		System.out.println("b_cntr_dt = [" + getB_cntr_dt() + "]");
		System.out.println("b_expy_dt = [" + getB_expy_dt() + "]");
		System.out.println("b_fst_clamt_mm = [" + getB_fst_clamt_mm() + "]");
		System.out.println("b_amt = [" + getB_amt() + "]");
		System.out.println("b_clamt_mthd_cd = [" + getB_clamt_mthd_cd() + "]");
		System.out.println("b_pay_cntr_clsf = [" + getB_pay_cntr_clsf() + "]");
		System.out.println("b_remk = [" + getB_remk() + "]");
		System.out.println("c_mode = [" + getC_mode() + "]");
		System.out.println("c_giro_seq = [" + getC_giro_seq() + "]");
		System.out.println("c_giro_no = [" + getC_giro_no() + "]");
		System.out.println("c_giro_clsf = [" + getC_giro_clsf() + "]");
		System.out.println("c_aprv_no = [" + getC_aprv_no() + "]");
		System.out.println("c_dnmn_pers = [" + getC_dnmn_pers() + "]");
		System.out.println("c_bank_no = [" + getC_bank_no() + "]");
		System.out.println("c_acct_no = [" + getC_acct_no() + "]");
		System.out.println("c_deps_pers = [" + getC_deps_pers() + "]");
		System.out.println("c_open_dt = [" + getC_open_dt() + "]");
		System.out.println("c_cdatmaplc_dt = [" + getC_cdatmaplc_dt() + "]");
		System.out.println("c_cdatmaprv_dt = [" + getC_cdatmaprv_dt() + "]");
		System.out.println("c_cdatmacpn_dt = [" + getC_cdatmacpn_dt() + "]");
		System.out.println("d_mode = [" + getD_mode() + "]");
		System.out.println("d_intn_tel_seq = [" + getD_intn_tel_seq() + "]");
		System.out.println("d_estb_dt = [" + getD_estb_dt() + "]");
		System.out.println("d_mang_no = [" + getD_mang_no() + "]");
		System.out.println("d_tel_no = [" + getD_tel_no() + "]");
		System.out.println("d_use_yn = [" + getD_use_yn() + "]");
		System.out.println("d_remk = [" + getD_remk() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_seq = req.getParameter("dlco_seq");
if( dlco_seq == null){
	System.out.println(this.toString+" : dlco_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_seq is "+dlco_seq );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sp_comp_chrg_pers_emp_no = req.getParameter("sp_comp_chrg_pers_emp_no");
if( sp_comp_chrg_pers_emp_no == null){
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : sp_comp_chrg_pers_emp_no is "+sp_comp_chrg_pers_emp_no );
}
String use_sw = req.getParameter("use_sw");
if( use_sw == null){
	System.out.println(this.toString+" : use_sw is null" );
}else{
	System.out.println(this.toString+" : use_sw is "+use_sw );
}
String leaf_open_chrg_pers = req.getParameter("leaf_open_chrg_pers");
if( leaf_open_chrg_pers == null){
	System.out.println(this.toString+" : leaf_open_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : leaf_open_chrg_pers is "+leaf_open_chrg_pers );
}
String leaf_now_chrg_pers = req.getParameter("leaf_now_chrg_pers");
if( leaf_now_chrg_pers == null){
	System.out.println(this.toString+" : leaf_now_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : leaf_now_chrg_pers is "+leaf_now_chrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String bo_zip_1 = req.getParameter("bo_zip_1");
if( bo_zip_1 == null){
	System.out.println(this.toString+" : bo_zip_1 is null" );
}else{
	System.out.println(this.toString+" : bo_zip_1 is "+bo_zip_1 );
}
String bo_zip_2 = req.getParameter("bo_zip_2");
if( bo_zip_2 == null){
	System.out.println(this.toString+" : bo_zip_2 is null" );
}else{
	System.out.println(this.toString+" : bo_zip_2 is "+bo_zip_2 );
}
String bo_addr = req.getParameter("bo_addr");
if( bo_addr == null){
	System.out.println(this.toString+" : bo_addr is null" );
}else{
	System.out.println(this.toString+" : bo_addr is "+bo_addr );
}
String bo_dtls_addr = req.getParameter("bo_dtls_addr");
if( bo_dtls_addr == null){
	System.out.println(this.toString+" : bo_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : bo_dtls_addr is "+bo_dtls_addr );
}
String hdqt_sell_dept_cd = req.getParameter("hdqt_sell_dept_cd");
if( hdqt_sell_dept_cd == null){
	System.out.println(this.toString+" : hdqt_sell_dept_cd is null" );
}else{
	System.out.println(this.toString+" : hdqt_sell_dept_cd is "+hdqt_sell_dept_cd );
}
String hdqt_sell_sub_dept_cd = req.getParameter("hdqt_sell_sub_dept_cd");
if( hdqt_sell_sub_dept_cd == null){
	System.out.println(this.toString+" : hdqt_sell_sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : hdqt_sell_sub_dept_cd is "+hdqt_sell_sub_dept_cd );
}
String hdqt_sell_area_cd = req.getParameter("hdqt_sell_area_cd");
if( hdqt_sell_area_cd == null){
	System.out.println(this.toString+" : hdqt_sell_area_cd is null" );
}else{
	System.out.println(this.toString+" : hdqt_sell_area_cd is "+hdqt_sell_area_cd );
}
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
}
String malig_yn = req.getParameter("malig_yn");
if( malig_yn == null){
	System.out.println(this.toString+" : malig_yn is null" );
}else{
	System.out.println(this.toString+" : malig_yn is "+malig_yn );
}
String tax_stmt_cmpy_cd = req.getParameter("tax_stmt_cmpy_cd");
if( tax_stmt_cmpy_cd == null){
	System.out.println(this.toString+" : tax_stmt_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_cmpy_cd is "+tax_stmt_cmpy_cd );
}
String cu_acct_cd = req.getParameter("cu_acct_cd");
if( cu_acct_cd == null){
	System.out.println(this.toString+" : cu_acct_cd is null" );
}else{
	System.out.println(this.toString+" : cu_acct_cd is "+cu_acct_cd );
}
String cntr_dt = req.getParameter("cntr_dt");
if( cntr_dt == null){
	System.out.println(this.toString+" : cntr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_dt is "+cntr_dt );
}
String expy_dt = req.getParameter("expy_dt");
if( expy_dt == null){
	System.out.println(this.toString+" : expy_dt is null" );
}else{
	System.out.println(this.toString+" : expy_dt is "+expy_dt );
}
String leaf_sale_yn = req.getParameter("leaf_sale_yn");
if( leaf_sale_yn == null){
	System.out.println(this.toString+" : leaf_sale_yn is null" );
}else{
	System.out.println(this.toString+" : leaf_sale_yn is "+leaf_sale_yn );
}
String leaf_purc_yn = req.getParameter("leaf_purc_yn");
if( leaf_purc_yn == null){
	System.out.println(this.toString+" : leaf_purc_yn is null" );
}else{
	System.out.println(this.toString+" : leaf_purc_yn is "+leaf_purc_yn );
}
String dmang_bo_yn = req.getParameter("dmang_bo_yn");
if( dmang_bo_yn == null){
	System.out.println(this.toString+" : dmang_bo_yn is null" );
}else{
	System.out.println(this.toString+" : dmang_bo_yn is "+dmang_bo_yn );
}
String outsd_leaf_cmpy_yn = req.getParameter("outsd_leaf_cmpy_yn");
if( outsd_leaf_cmpy_yn == null){
	System.out.println(this.toString+" : outsd_leaf_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : outsd_leaf_cmpy_yn is "+outsd_leaf_cmpy_yn );
}
String vexc_cmpy_yn = req.getParameter("vexc_cmpy_yn");
if( vexc_cmpy_yn == null){
	System.out.println(this.toString+" : vexc_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_yn is "+vexc_cmpy_yn );
}
String design_cmpy_yn = req.getParameter("design_cmpy_yn");
if( design_cmpy_yn == null){
	System.out.println(this.toString+" : design_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : design_cmpy_yn is "+design_cmpy_yn );
}
String excep_main_prt_plac_yn = req.getParameter("excep_main_prt_plac_yn");
if( excep_main_prt_plac_yn == null){
	System.out.println(this.toString+" : excep_main_prt_plac_yn is null" );
}else{
	System.out.println(this.toString+" : excep_main_prt_plac_yn is "+excep_main_prt_plac_yn );
}
String isgrp_yn = req.getParameter("isgrp_yn");
if( isgrp_yn == null){
	System.out.println(this.toString+" : isgrp_yn is null" );
}else{
	System.out.println(this.toString+" : isgrp_yn is "+isgrp_yn );
}
String sp_deal_yn = req.getParameter("sp_deal_yn");
if( sp_deal_yn == null){
	System.out.println(this.toString+" : sp_deal_yn is null" );
}else{
	System.out.println(this.toString+" : sp_deal_yn is "+sp_deal_yn );
}
String jurs_dong_nm = req.getParameter("jurs_dong_nm");
if( jurs_dong_nm == null){
	System.out.println(this.toString+" : jurs_dong_nm is null" );
}else{
	System.out.println(this.toString+" : jurs_dong_nm is "+jurs_dong_nm );
}
String jurs_apt = req.getParameter("jurs_apt");
if( jurs_apt == null){
	System.out.println(this.toString+" : jurs_apt is null" );
}else{
	System.out.println(this.toString+" : jurs_apt is "+jurs_apt );
}
String leaf_addr = req.getParameter("leaf_addr");
if( leaf_addr == null){
	System.out.println(this.toString+" : leaf_addr is null" );
}else{
	System.out.println(this.toString+" : leaf_addr is "+leaf_addr );
}
String adms_dstc_cd = req.getParameter("adms_dstc_cd");
if( adms_dstc_cd == null){
	System.out.println(this.toString+" : adms_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_cd is "+adms_dstc_cd );
}
String adms_dstc_cd_nm = req.getParameter("adms_dstc_cd_nm");
if( adms_dstc_cd_nm == null){
	System.out.println(this.toString+" : adms_dstc_cd_nm is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_cd_nm is "+adms_dstc_cd_nm );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
}
String asnt_dstc_cd_nm = req.getParameter("asnt_dstc_cd_nm");
if( asnt_dstc_cd_nm == null){
	System.out.println(this.toString+" : asnt_dstc_cd_nm is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd_nm is "+asnt_dstc_cd_nm );
}
String dstc_seqo = req.getParameter("dstc_seqo");
if( dstc_seqo == null){
	System.out.println(this.toString+" : dstc_seqo is null" );
}else{
	System.out.println(this.toString+" : dstc_seqo is "+dstc_seqo );
}
String srt_seqo = req.getParameter("srt_seqo");
if( srt_seqo == null){
	System.out.println(this.toString+" : srt_seqo is null" );
}else{
	System.out.println(this.toString+" : srt_seqo is "+srt_seqo );
}
String wh_cd = req.getParameter("wh_cd");
if( wh_cd == null){
	System.out.println(this.toString+" : wh_cd is null" );
}else{
	System.out.println(this.toString+" : wh_cd is "+wh_cd );
}
String send_qty = req.getParameter("send_qty");
if( send_qty == null){
	System.out.println(this.toString+" : send_qty is null" );
}else{
	System.out.println(this.toString+" : send_qty is "+send_qty );
}
String acwr_rmsg_ptph = req.getParameter("acwr_rmsg_ptph");
if( acwr_rmsg_ptph == null){
	System.out.println(this.toString+" : acwr_rmsg_ptph is null" );
}else{
	System.out.println(this.toString+" : acwr_rmsg_ptph is "+acwr_rmsg_ptph );
}
String hmpg = req.getParameter("hmpg");
if( hmpg == null){
	System.out.println(this.toString+" : hmpg is null" );
}else{
	System.out.println(this.toString+" : hmpg is "+hmpg );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
}
String dlco_abrv_nm = req.getParameter("dlco_abrv_nm");
if( dlco_abrv_nm == null){
	System.out.println(this.toString+" : dlco_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_abrv_nm is "+dlco_abrv_nm );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String bizcond = req.getParameter("bizcond");
if( bizcond == null){
	System.out.println(this.toString+" : bizcond is null" );
}else{
	System.out.println(this.toString+" : bizcond is "+bizcond );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
}
String zip_1 = req.getParameter("zip_1");
if( zip_1 == null){
	System.out.println(this.toString+" : zip_1 is null" );
}else{
	System.out.println(this.toString+" : zip_1 is "+zip_1 );
}
String zip_2 = req.getParameter("zip_2");
if( zip_2 == null){
	System.out.println(this.toString+" : zip_2 is null" );
}else{
	System.out.println(this.toString+" : zip_2 is "+zip_2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String a_mode = req.getParameter("a_mode");
if( a_mode == null){
	System.out.println(this.toString+" : a_mode is null" );
}else{
	System.out.println(this.toString+" : a_mode is "+a_mode );
}
String a_dlco_chrg_pers_seq = req.getParameter("a_dlco_chrg_pers_seq");
if( a_dlco_chrg_pers_seq == null){
	System.out.println(this.toString+" : a_dlco_chrg_pers_seq is null" );
}else{
	System.out.println(this.toString+" : a_dlco_chrg_pers_seq is "+a_dlco_chrg_pers_seq );
}
String a_chrg_job_clsf = req.getParameter("a_chrg_job_clsf");
if( a_chrg_job_clsf == null){
	System.out.println(this.toString+" : a_chrg_job_clsf is null" );
}else{
	System.out.println(this.toString+" : a_chrg_job_clsf is "+a_chrg_job_clsf );
}
String a_chrg_pers_nm = req.getParameter("a_chrg_pers_nm");
if( a_chrg_pers_nm == null){
	System.out.println(this.toString+" : a_chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : a_chrg_pers_nm is "+a_chrg_pers_nm );
}
String a_dept = req.getParameter("a_dept");
if( a_dept == null){
	System.out.println(this.toString+" : a_dept is null" );
}else{
	System.out.println(this.toString+" : a_dept is "+a_dept );
}
String a_posi = req.getParameter("a_posi");
if( a_posi == null){
	System.out.println(this.toString+" : a_posi is null" );
}else{
	System.out.println(this.toString+" : a_posi is "+a_posi );
}
String a_ptph_no = req.getParameter("a_ptph_no");
if( a_ptph_no == null){
	System.out.println(this.toString+" : a_ptph_no is null" );
}else{
	System.out.println(this.toString+" : a_ptph_no is "+a_ptph_no );
}
String a_tel_no_1 = req.getParameter("a_tel_no_1");
if( a_tel_no_1 == null){
	System.out.println(this.toString+" : a_tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : a_tel_no_1 is "+a_tel_no_1 );
}
String a_tel_no_2 = req.getParameter("a_tel_no_2");
if( a_tel_no_2 == null){
	System.out.println(this.toString+" : a_tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : a_tel_no_2 is "+a_tel_no_2 );
}
String a_fax_no = req.getParameter("a_fax_no");
if( a_fax_no == null){
	System.out.println(this.toString+" : a_fax_no is null" );
}else{
	System.out.println(this.toString+" : a_fax_no is "+a_fax_no );
}
String a_email = req.getParameter("a_email");
if( a_email == null){
	System.out.println(this.toString+" : a_email is null" );
}else{
	System.out.println(this.toString+" : a_email is "+a_email );
}
String a_tax_asp_id = req.getParameter("a_tax_asp_id");
if( a_tax_asp_id == null){
	System.out.println(this.toString+" : a_tax_asp_id is null" );
}else{
	System.out.println(this.toString+" : a_tax_asp_id is "+a_tax_asp_id );
}
String a_kind_erplace_no = req.getParameter("a_kind_erplace_no");
if( a_kind_erplace_no == null){
	System.out.println(this.toString+" : a_kind_erplace_no is null" );
}else{
	System.out.println(this.toString+" : a_kind_erplace_no is "+a_kind_erplace_no );
}
String a_remk_matt = req.getParameter("a_remk_matt");
if( a_remk_matt == null){
	System.out.println(this.toString+" : a_remk_matt is null" );
}else{
	System.out.println(this.toString+" : a_remk_matt is "+a_remk_matt );
}
String b_mode = req.getParameter("b_mode");
if( b_mode == null){
	System.out.println(this.toString+" : b_mode is null" );
}else{
	System.out.println(this.toString+" : b_mode is "+b_mode );
}
String b_sale_item_cd = req.getParameter("b_sale_item_cd");
if( b_sale_item_cd == null){
	System.out.println(this.toString+" : b_sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : b_sale_item_cd is "+b_sale_item_cd );
}
String b_cntr_dt = req.getParameter("b_cntr_dt");
if( b_cntr_dt == null){
	System.out.println(this.toString+" : b_cntr_dt is null" );
}else{
	System.out.println(this.toString+" : b_cntr_dt is "+b_cntr_dt );
}
String b_expy_dt = req.getParameter("b_expy_dt");
if( b_expy_dt == null){
	System.out.println(this.toString+" : b_expy_dt is null" );
}else{
	System.out.println(this.toString+" : b_expy_dt is "+b_expy_dt );
}
String b_fst_clamt_mm = req.getParameter("b_fst_clamt_mm");
if( b_fst_clamt_mm == null){
	System.out.println(this.toString+" : b_fst_clamt_mm is null" );
}else{
	System.out.println(this.toString+" : b_fst_clamt_mm is "+b_fst_clamt_mm );
}
String b_amt = req.getParameter("b_amt");
if( b_amt == null){
	System.out.println(this.toString+" : b_amt is null" );
}else{
	System.out.println(this.toString+" : b_amt is "+b_amt );
}
String b_clamt_mthd_cd = req.getParameter("b_clamt_mthd_cd");
if( b_clamt_mthd_cd == null){
	System.out.println(this.toString+" : b_clamt_mthd_cd is null" );
}else{
	System.out.println(this.toString+" : b_clamt_mthd_cd is "+b_clamt_mthd_cd );
}
String b_pay_cntr_clsf = req.getParameter("b_pay_cntr_clsf");
if( b_pay_cntr_clsf == null){
	System.out.println(this.toString+" : b_pay_cntr_clsf is null" );
}else{
	System.out.println(this.toString+" : b_pay_cntr_clsf is "+b_pay_cntr_clsf );
}
String b_remk = req.getParameter("b_remk");
if( b_remk == null){
	System.out.println(this.toString+" : b_remk is null" );
}else{
	System.out.println(this.toString+" : b_remk is "+b_remk );
}
String c_mode = req.getParameter("c_mode");
if( c_mode == null){
	System.out.println(this.toString+" : c_mode is null" );
}else{
	System.out.println(this.toString+" : c_mode is "+c_mode );
}
String c_giro_seq = req.getParameter("c_giro_seq");
if( c_giro_seq == null){
	System.out.println(this.toString+" : c_giro_seq is null" );
}else{
	System.out.println(this.toString+" : c_giro_seq is "+c_giro_seq );
}
String c_giro_no = req.getParameter("c_giro_no");
if( c_giro_no == null){
	System.out.println(this.toString+" : c_giro_no is null" );
}else{
	System.out.println(this.toString+" : c_giro_no is "+c_giro_no );
}
String c_giro_clsf = req.getParameter("c_giro_clsf");
if( c_giro_clsf == null){
	System.out.println(this.toString+" : c_giro_clsf is null" );
}else{
	System.out.println(this.toString+" : c_giro_clsf is "+c_giro_clsf );
}
String c_aprv_no = req.getParameter("c_aprv_no");
if( c_aprv_no == null){
	System.out.println(this.toString+" : c_aprv_no is null" );
}else{
	System.out.println(this.toString+" : c_aprv_no is "+c_aprv_no );
}
String c_dnmn_pers = req.getParameter("c_dnmn_pers");
if( c_dnmn_pers == null){
	System.out.println(this.toString+" : c_dnmn_pers is null" );
}else{
	System.out.println(this.toString+" : c_dnmn_pers is "+c_dnmn_pers );
}
String c_bank_no = req.getParameter("c_bank_no");
if( c_bank_no == null){
	System.out.println(this.toString+" : c_bank_no is null" );
}else{
	System.out.println(this.toString+" : c_bank_no is "+c_bank_no );
}
String c_acct_no = req.getParameter("c_acct_no");
if( c_acct_no == null){
	System.out.println(this.toString+" : c_acct_no is null" );
}else{
	System.out.println(this.toString+" : c_acct_no is "+c_acct_no );
}
String c_deps_pers = req.getParameter("c_deps_pers");
if( c_deps_pers == null){
	System.out.println(this.toString+" : c_deps_pers is null" );
}else{
	System.out.println(this.toString+" : c_deps_pers is "+c_deps_pers );
}
String c_open_dt = req.getParameter("c_open_dt");
if( c_open_dt == null){
	System.out.println(this.toString+" : c_open_dt is null" );
}else{
	System.out.println(this.toString+" : c_open_dt is "+c_open_dt );
}
String c_cdatmaplc_dt = req.getParameter("c_cdatmaplc_dt");
if( c_cdatmaplc_dt == null){
	System.out.println(this.toString+" : c_cdatmaplc_dt is null" );
}else{
	System.out.println(this.toString+" : c_cdatmaplc_dt is "+c_cdatmaplc_dt );
}
String c_cdatmaprv_dt = req.getParameter("c_cdatmaprv_dt");
if( c_cdatmaprv_dt == null){
	System.out.println(this.toString+" : c_cdatmaprv_dt is null" );
}else{
	System.out.println(this.toString+" : c_cdatmaprv_dt is "+c_cdatmaprv_dt );
}
String c_cdatmacpn_dt = req.getParameter("c_cdatmacpn_dt");
if( c_cdatmacpn_dt == null){
	System.out.println(this.toString+" : c_cdatmacpn_dt is null" );
}else{
	System.out.println(this.toString+" : c_cdatmacpn_dt is "+c_cdatmacpn_dt );
}
String d_mode = req.getParameter("d_mode");
if( d_mode == null){
	System.out.println(this.toString+" : d_mode is null" );
}else{
	System.out.println(this.toString+" : d_mode is "+d_mode );
}
String d_intn_tel_seq = req.getParameter("d_intn_tel_seq");
if( d_intn_tel_seq == null){
	System.out.println(this.toString+" : d_intn_tel_seq is null" );
}else{
	System.out.println(this.toString+" : d_intn_tel_seq is "+d_intn_tel_seq );
}
String d_estb_dt = req.getParameter("d_estb_dt");
if( d_estb_dt == null){
	System.out.println(this.toString+" : d_estb_dt is null" );
}else{
	System.out.println(this.toString+" : d_estb_dt is "+d_estb_dt );
}
String d_mang_no = req.getParameter("d_mang_no");
if( d_mang_no == null){
	System.out.println(this.toString+" : d_mang_no is null" );
}else{
	System.out.println(this.toString+" : d_mang_no is "+d_mang_no );
}
String d_tel_no = req.getParameter("d_tel_no");
if( d_tel_no == null){
	System.out.println(this.toString+" : d_tel_no is null" );
}else{
	System.out.println(this.toString+" : d_tel_no is "+d_tel_no );
}
String d_use_yn = req.getParameter("d_use_yn");
if( d_use_yn == null){
	System.out.println(this.toString+" : d_use_yn is null" );
}else{
	System.out.println(this.toString+" : d_use_yn is "+d_use_yn );
}
String d_remk = req.getParameter("d_remk");
if( d_remk == null){
	System.out.println(this.toString+" : d_remk is null" );
}else{
	System.out.println(this.toString+" : d_remk is "+d_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_seq = Util.checkString(req.getParameter("dlco_seq"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sp_comp_chrg_pers_emp_no = Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no"));
String use_sw = Util.checkString(req.getParameter("use_sw"));
String leaf_open_chrg_pers = Util.checkString(req.getParameter("leaf_open_chrg_pers"));
String leaf_now_chrg_pers = Util.checkString(req.getParameter("leaf_now_chrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String bo_zip_1 = Util.checkString(req.getParameter("bo_zip_1"));
String bo_zip_2 = Util.checkString(req.getParameter("bo_zip_2"));
String bo_addr = Util.checkString(req.getParameter("bo_addr"));
String bo_dtls_addr = Util.checkString(req.getParameter("bo_dtls_addr"));
String hdqt_sell_dept_cd = Util.checkString(req.getParameter("hdqt_sell_dept_cd"));
String hdqt_sell_sub_dept_cd = Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd"));
String hdqt_sell_area_cd = Util.checkString(req.getParameter("hdqt_sell_area_cd"));
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String malig_yn = Util.checkString(req.getParameter("malig_yn"));
String tax_stmt_cmpy_cd = Util.checkString(req.getParameter("tax_stmt_cmpy_cd"));
String cu_acct_cd = Util.checkString(req.getParameter("cu_acct_cd"));
String cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
String expy_dt = Util.checkString(req.getParameter("expy_dt"));
String leaf_sale_yn = Util.checkString(req.getParameter("leaf_sale_yn"));
String leaf_purc_yn = Util.checkString(req.getParameter("leaf_purc_yn"));
String dmang_bo_yn = Util.checkString(req.getParameter("dmang_bo_yn"));
String outsd_leaf_cmpy_yn = Util.checkString(req.getParameter("outsd_leaf_cmpy_yn"));
String vexc_cmpy_yn = Util.checkString(req.getParameter("vexc_cmpy_yn"));
String design_cmpy_yn = Util.checkString(req.getParameter("design_cmpy_yn"));
String excep_main_prt_plac_yn = Util.checkString(req.getParameter("excep_main_prt_plac_yn"));
String isgrp_yn = Util.checkString(req.getParameter("isgrp_yn"));
String sp_deal_yn = Util.checkString(req.getParameter("sp_deal_yn"));
String jurs_dong_nm = Util.checkString(req.getParameter("jurs_dong_nm"));
String jurs_apt = Util.checkString(req.getParameter("jurs_apt"));
String leaf_addr = Util.checkString(req.getParameter("leaf_addr"));
String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
String adms_dstc_cd_nm = Util.checkString(req.getParameter("adms_dstc_cd_nm"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String asnt_dstc_cd_nm = Util.checkString(req.getParameter("asnt_dstc_cd_nm"));
String dstc_seqo = Util.checkString(req.getParameter("dstc_seqo"));
String srt_seqo = Util.checkString(req.getParameter("srt_seqo"));
String wh_cd = Util.checkString(req.getParameter("wh_cd"));
String send_qty = Util.checkString(req.getParameter("send_qty"));
String acwr_rmsg_ptph = Util.checkString(req.getParameter("acwr_rmsg_ptph"));
String hmpg = Util.checkString(req.getParameter("hmpg"));
String remk = Util.checkString(req.getParameter("remk"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
String dlco_abrv_nm = Util.checkString(req.getParameter("dlco_abrv_nm"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String zip_1 = Util.checkString(req.getParameter("zip_1"));
String zip_2 = Util.checkString(req.getParameter("zip_2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String a_mode = Util.checkString(req.getParameter("a_mode"));
String a_dlco_chrg_pers_seq = Util.checkString(req.getParameter("a_dlco_chrg_pers_seq"));
String a_chrg_job_clsf = Util.checkString(req.getParameter("a_chrg_job_clsf"));
String a_chrg_pers_nm = Util.checkString(req.getParameter("a_chrg_pers_nm"));
String a_dept = Util.checkString(req.getParameter("a_dept"));
String a_posi = Util.checkString(req.getParameter("a_posi"));
String a_ptph_no = Util.checkString(req.getParameter("a_ptph_no"));
String a_tel_no_1 = Util.checkString(req.getParameter("a_tel_no_1"));
String a_tel_no_2 = Util.checkString(req.getParameter("a_tel_no_2"));
String a_fax_no = Util.checkString(req.getParameter("a_fax_no"));
String a_email = Util.checkString(req.getParameter("a_email"));
String a_tax_asp_id = Util.checkString(req.getParameter("a_tax_asp_id"));
String a_kind_erplace_no = Util.checkString(req.getParameter("a_kind_erplace_no"));
String a_remk_matt = Util.checkString(req.getParameter("a_remk_matt"));
String b_mode = Util.checkString(req.getParameter("b_mode"));
String b_sale_item_cd = Util.checkString(req.getParameter("b_sale_item_cd"));
String b_cntr_dt = Util.checkString(req.getParameter("b_cntr_dt"));
String b_expy_dt = Util.checkString(req.getParameter("b_expy_dt"));
String b_fst_clamt_mm = Util.checkString(req.getParameter("b_fst_clamt_mm"));
String b_amt = Util.checkString(req.getParameter("b_amt"));
String b_clamt_mthd_cd = Util.checkString(req.getParameter("b_clamt_mthd_cd"));
String b_pay_cntr_clsf = Util.checkString(req.getParameter("b_pay_cntr_clsf"));
String b_remk = Util.checkString(req.getParameter("b_remk"));
String c_mode = Util.checkString(req.getParameter("c_mode"));
String c_giro_seq = Util.checkString(req.getParameter("c_giro_seq"));
String c_giro_no = Util.checkString(req.getParameter("c_giro_no"));
String c_giro_clsf = Util.checkString(req.getParameter("c_giro_clsf"));
String c_aprv_no = Util.checkString(req.getParameter("c_aprv_no"));
String c_dnmn_pers = Util.checkString(req.getParameter("c_dnmn_pers"));
String c_bank_no = Util.checkString(req.getParameter("c_bank_no"));
String c_acct_no = Util.checkString(req.getParameter("c_acct_no"));
String c_deps_pers = Util.checkString(req.getParameter("c_deps_pers"));
String c_open_dt = Util.checkString(req.getParameter("c_open_dt"));
String c_cdatmaplc_dt = Util.checkString(req.getParameter("c_cdatmaplc_dt"));
String c_cdatmaprv_dt = Util.checkString(req.getParameter("c_cdatmaprv_dt"));
String c_cdatmacpn_dt = Util.checkString(req.getParameter("c_cdatmacpn_dt"));
String d_mode = Util.checkString(req.getParameter("d_mode"));
String d_intn_tel_seq = Util.checkString(req.getParameter("d_intn_tel_seq"));
String d_estb_dt = Util.checkString(req.getParameter("d_estb_dt"));
String d_mang_no = Util.checkString(req.getParameter("d_mang_no"));
String d_tel_no = Util.checkString(req.getParameter("d_tel_no"));
String d_use_yn = Util.checkString(req.getParameter("d_use_yn"));
String d_remk = Util.checkString(req.getParameter("d_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_seq")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sp_comp_chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_comp_chrg_pers_emp_no")));
String use_sw = Util.Uni2Ksc(Util.checkString(req.getParameter("use_sw")));
String leaf_open_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_open_chrg_pers")));
String leaf_now_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_now_chrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String bo_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_zip_1")));
String bo_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_zip_2")));
String bo_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_addr")));
String bo_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_dtls_addr")));
String hdqt_sell_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_sell_dept_cd")));
String hdqt_sell_sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_sell_sub_dept_cd")));
String hdqt_sell_area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_sell_area_cd")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String malig_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("malig_yn")));
String tax_stmt_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_cmpy_cd")));
String cu_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cu_acct_cd")));
String cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt")));
String expy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("expy_dt")));
String leaf_sale_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_sale_yn")));
String leaf_purc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_purc_yn")));
String dmang_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dmang_bo_yn")));
String outsd_leaf_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_leaf_cmpy_yn")));
String vexc_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_yn")));
String design_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("design_cmpy_yn")));
String excep_main_prt_plac_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("excep_main_prt_plac_yn")));
String isgrp_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("isgrp_yn")));
String sp_deal_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_deal_yn")));
String jurs_dong_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("jurs_dong_nm")));
String jurs_apt = Util.Uni2Ksc(Util.checkString(req.getParameter("jurs_apt")));
String leaf_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_addr")));
String adms_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_cd")));
String adms_dstc_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_cd_nm")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
String asnt_dstc_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd_nm")));
String dstc_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("dstc_seqo")));
String srt_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("srt_seqo")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
String send_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("send_qty")));
String acwr_rmsg_ptph = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_rmsg_ptph")));
String hmpg = Util.Uni2Ksc(Util.checkString(req.getParameter("hmpg")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
String dlco_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_abrv_nm")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_1")));
String zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String a_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("a_mode")));
String a_dlco_chrg_pers_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("a_dlco_chrg_pers_seq")));
String a_chrg_job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("a_chrg_job_clsf")));
String a_chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("a_chrg_pers_nm")));
String a_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("a_dept")));
String a_posi = Util.Uni2Ksc(Util.checkString(req.getParameter("a_posi")));
String a_ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("a_ptph_no")));
String a_tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("a_tel_no_1")));
String a_tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("a_tel_no_2")));
String a_fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("a_fax_no")));
String a_email = Util.Uni2Ksc(Util.checkString(req.getParameter("a_email")));
String a_tax_asp_id = Util.Uni2Ksc(Util.checkString(req.getParameter("a_tax_asp_id")));
String a_kind_erplace_no = Util.Uni2Ksc(Util.checkString(req.getParameter("a_kind_erplace_no")));
String a_remk_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_remk_matt")));
String b_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("b_mode")));
String b_sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("b_sale_item_cd")));
String b_cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_cntr_dt")));
String b_expy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_expy_dt")));
String b_fst_clamt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("b_fst_clamt_mm")));
String b_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("b_amt")));
String b_clamt_mthd_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("b_clamt_mthd_cd")));
String b_pay_cntr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("b_pay_cntr_clsf")));
String b_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("b_remk")));
String c_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("c_mode")));
String c_giro_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("c_giro_seq")));
String c_giro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_giro_no")));
String c_giro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c_giro_clsf")));
String c_aprv_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_aprv_no")));
String c_dnmn_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("c_dnmn_pers")));
String c_bank_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_bank_no")));
String c_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_acct_no")));
String c_deps_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("c_deps_pers")));
String c_open_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_open_dt")));
String c_cdatmaplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_cdatmaplc_dt")));
String c_cdatmaprv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_cdatmaprv_dt")));
String c_cdatmacpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("c_cdatmacpn_dt")));
String d_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("d_mode")));
String d_intn_tel_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("d_intn_tel_seq")));
String d_estb_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("d_estb_dt")));
String d_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("d_mang_no")));
String d_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("d_tel_no")));
String d_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("d_use_yn")));
String d_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("d_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_cd(dlco_cd);
dm.setDlco_seq(dlco_seq);
dm.setDlco_no(dlco_no);
dm.setSp_comp_chrg_pers_emp_no(sp_comp_chrg_pers_emp_no);
dm.setUse_sw(use_sw);
dm.setLeaf_open_chrg_pers(leaf_open_chrg_pers);
dm.setLeaf_now_chrg_pers(leaf_now_chrg_pers);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setBo_nm(bo_nm);
dm.setBo_zip_1(bo_zip_1);
dm.setBo_zip_2(bo_zip_2);
dm.setBo_addr(bo_addr);
dm.setBo_dtls_addr(bo_dtls_addr);
dm.setHdqt_sell_dept_cd(hdqt_sell_dept_cd);
dm.setHdqt_sell_sub_dept_cd(hdqt_sell_sub_dept_cd);
dm.setHdqt_sell_area_cd(hdqt_sell_area_cd);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setMalig_yn(malig_yn);
dm.setTax_stmt_cmpy_cd(tax_stmt_cmpy_cd);
dm.setCu_acct_cd(cu_acct_cd);
dm.setCntr_dt(cntr_dt);
dm.setExpy_dt(expy_dt);
dm.setLeaf_sale_yn(leaf_sale_yn);
dm.setLeaf_purc_yn(leaf_purc_yn);
dm.setDmang_bo_yn(dmang_bo_yn);
dm.setOutsd_leaf_cmpy_yn(outsd_leaf_cmpy_yn);
dm.setVexc_cmpy_yn(vexc_cmpy_yn);
dm.setDesign_cmpy_yn(design_cmpy_yn);
dm.setExcep_main_prt_plac_yn(excep_main_prt_plac_yn);
dm.setIsgrp_yn(isgrp_yn);
dm.setSp_deal_yn(sp_deal_yn);
dm.setJurs_dong_nm(jurs_dong_nm);
dm.setJurs_apt(jurs_apt);
dm.setLeaf_addr(leaf_addr);
dm.setAdms_dstc_cd(adms_dstc_cd);
dm.setAdms_dstc_cd_nm(adms_dstc_cd_nm);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setAsnt_dstc_cd_nm(asnt_dstc_cd_nm);
dm.setDstc_seqo(dstc_seqo);
dm.setSrt_seqo(srt_seqo);
dm.setWh_cd(wh_cd);
dm.setSend_qty(send_qty);
dm.setAcwr_rmsg_ptph(acwr_rmsg_ptph);
dm.setHmpg(hmpg);
dm.setRemk(remk);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
dm.setDlco_abrv_nm(dlco_abrv_nm);
dm.setDlco_nm(dlco_nm);
dm.setErn(ern);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setZip_1(zip_1);
dm.setZip_2(zip_2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setPresi_nm(presi_nm);
dm.setTel_no(tel_no);
dm.setFax_no(fax_no);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setA_mode(a_mode);
dm.setA_dlco_chrg_pers_seq(a_dlco_chrg_pers_seq);
dm.setA_chrg_job_clsf(a_chrg_job_clsf);
dm.setA_chrg_pers_nm(a_chrg_pers_nm);
dm.setA_dept(a_dept);
dm.setA_posi(a_posi);
dm.setA_ptph_no(a_ptph_no);
dm.setA_tel_no_1(a_tel_no_1);
dm.setA_tel_no_2(a_tel_no_2);
dm.setA_fax_no(a_fax_no);
dm.setA_email(a_email);
dm.setA_tax_asp_id(a_tax_asp_id);
dm.setA_kind_erplace_no(a_kind_erplace_no);
dm.setA_remk_matt(a_remk_matt);
dm.setB_mode(b_mode);
dm.setB_sale_item_cd(b_sale_item_cd);
dm.setB_cntr_dt(b_cntr_dt);
dm.setB_expy_dt(b_expy_dt);
dm.setB_fst_clamt_mm(b_fst_clamt_mm);
dm.setB_amt(b_amt);
dm.setB_clamt_mthd_cd(b_clamt_mthd_cd);
dm.setB_pay_cntr_clsf(b_pay_cntr_clsf);
dm.setB_remk(b_remk);
dm.setC_mode(c_mode);
dm.setC_giro_seq(c_giro_seq);
dm.setC_giro_no(c_giro_no);
dm.setC_giro_clsf(c_giro_clsf);
dm.setC_aprv_no(c_aprv_no);
dm.setC_dnmn_pers(c_dnmn_pers);
dm.setC_bank_no(c_bank_no);
dm.setC_acct_no(c_acct_no);
dm.setC_deps_pers(c_deps_pers);
dm.setC_open_dt(c_open_dt);
dm.setC_cdatmaplc_dt(c_cdatmaplc_dt);
dm.setC_cdatmaprv_dt(c_cdatmaprv_dt);
dm.setC_cdatmacpn_dt(c_cdatmacpn_dt);
dm.setD_mode(d_mode);
dm.setD_intn_tel_seq(d_intn_tel_seq);
dm.setD_estb_dt(d_estb_dt);
dm.setD_mang_no(d_mang_no);
dm.setD_tel_no(d_tel_no);
dm.setD_use_yn(d_use_yn);
dm.setD_remk(d_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 14:57:58 KST 2012 */