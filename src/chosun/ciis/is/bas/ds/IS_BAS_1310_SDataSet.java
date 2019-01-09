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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1310_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_b = new ArrayList();
	public ArrayList curlist_a = new ArrayList();
	public ArrayList curlist_d = new ArrayList();
	public ArrayList curlist_c = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_no;
	public String sp_comp_chrg_pers_emp_no;
	public String sp_comp_chrg_pers_emp_nm;
	public String use_sw;
	public String leaf_open_chrg_pers;
	public String leaf_open_chrg_pers_nm;
	public String leaf_now_chrg_pers;
	public String leaf_now_chrg_pers_nm;
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
	public String presi_prn;
	public String presi_zip_1;
	public String presi_zip_2;
	public String presi_addr;
	public String presi_dtls_addr;
	public String tel_no;
	public String fax_no;
	public String flag;

	public IS_BAS_1310_SDataSet(){}
	public IS_BAS_1310_SDataSet(String errcode, String errmsg, String dlco_clsf, String dlco_cd, String dlco_seq, String dlco_no, String sp_comp_chrg_pers_emp_no, String sp_comp_chrg_pers_emp_nm, String use_sw, String leaf_open_chrg_pers, String leaf_open_chrg_pers_nm, String leaf_now_chrg_pers, String leaf_now_chrg_pers_nm, String dept_cd, String sub_dept_cd, String bo_nm, String bo_zip_1, String bo_zip_2, String bo_addr, String bo_dtls_addr, String hdqt_sell_dept_cd, String hdqt_sell_sub_dept_cd, String hdqt_sell_area_cd, String cntr_stat_clsf, String malig_yn, String tax_stmt_cmpy_cd, String cu_acct_cd, String cntr_dt, String expy_dt, String leaf_sale_yn, String leaf_purc_yn, String dmang_bo_yn, String outsd_leaf_cmpy_yn, String vexc_cmpy_yn, String design_cmpy_yn, String excep_main_prt_plac_yn, String isgrp_yn, String sp_deal_yn, String jurs_dong_nm, String jurs_apt, String leaf_addr, String adms_dstc_cd, String adms_dstc_cd_nm, String asnt_dstc_cd, String asnt_dstc_cd_nm, String dstc_seqo, String srt_seqo, String wh_cd, String send_qty, String acwr_rmsg_ptph, String hmpg, String remk, String chg_pers, String chg_dt_tm, String dlco_abrv_nm, String dlco_nm, String ern, String bizcond, String item, String zip_1, String zip_2, String addr, String dtls_addr, String presi_nm, String presi_prn, String presi_zip_1, String presi_zip_2, String presi_addr, String presi_dtls_addr, String tel_no, String fax_no, String flag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd = dlco_cd;
		this.dlco_seq = dlco_seq;
		this.dlco_no = dlco_no;
		this.sp_comp_chrg_pers_emp_no = sp_comp_chrg_pers_emp_no;
		this.sp_comp_chrg_pers_emp_nm = sp_comp_chrg_pers_emp_nm;
		this.use_sw = use_sw;
		this.leaf_open_chrg_pers = leaf_open_chrg_pers;
		this.leaf_open_chrg_pers_nm = leaf_open_chrg_pers_nm;
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
		this.leaf_now_chrg_pers_nm = leaf_now_chrg_pers_nm;
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
		this.presi_prn = presi_prn;
		this.presi_zip_1 = presi_zip_1;
		this.presi_zip_2 = presi_zip_2;
		this.presi_addr = presi_addr;
		this.presi_dtls_addr = presi_dtls_addr;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.flag = flag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setSp_comp_chrg_pers_emp_nm(String sp_comp_chrg_pers_emp_nm){
		this.sp_comp_chrg_pers_emp_nm = sp_comp_chrg_pers_emp_nm;
	}

	public void setUse_sw(String use_sw){
		this.use_sw = use_sw;
	}

	public void setLeaf_open_chrg_pers(String leaf_open_chrg_pers){
		this.leaf_open_chrg_pers = leaf_open_chrg_pers;
	}

	public void setLeaf_open_chrg_pers_nm(String leaf_open_chrg_pers_nm){
		this.leaf_open_chrg_pers_nm = leaf_open_chrg_pers_nm;
	}

	public void setLeaf_now_chrg_pers(String leaf_now_chrg_pers){
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
	}

	public void setLeaf_now_chrg_pers_nm(String leaf_now_chrg_pers_nm){
		this.leaf_now_chrg_pers_nm = leaf_now_chrg_pers_nm;
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

	public void setPresi_prn(String presi_prn){
		this.presi_prn = presi_prn;
	}

	public void setPresi_zip_1(String presi_zip_1){
		this.presi_zip_1 = presi_zip_1;
	}

	public void setPresi_zip_2(String presi_zip_2){
		this.presi_zip_2 = presi_zip_2;
	}

	public void setPresi_addr(String presi_addr){
		this.presi_addr = presi_addr;
	}

	public void setPresi_dtls_addr(String presi_dtls_addr){
		this.presi_dtls_addr = presi_dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public String getSp_comp_chrg_pers_emp_nm(){
		return this.sp_comp_chrg_pers_emp_nm;
	}

	public String getUse_sw(){
		return this.use_sw;
	}

	public String getLeaf_open_chrg_pers(){
		return this.leaf_open_chrg_pers;
	}

	public String getLeaf_open_chrg_pers_nm(){
		return this.leaf_open_chrg_pers_nm;
	}

	public String getLeaf_now_chrg_pers(){
		return this.leaf_now_chrg_pers;
	}

	public String getLeaf_now_chrg_pers_nm(){
		return this.leaf_now_chrg_pers_nm;
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

	public String getPresi_prn(){
		return this.presi_prn;
	}

	public String getPresi_zip_1(){
		return this.presi_zip_1;
	}

	public String getPresi_zip_2(){
		return this.presi_zip_2;
	}

	public String getPresi_addr(){
		return this.presi_addr;
	}

	public String getPresi_dtls_addr(){
		return this.presi_dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getFlag(){
		return this.flag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_clsf = Util.checkString(cstmt.getString(8));
		this.dlco_cd = Util.checkString(cstmt.getString(9));
		this.dlco_seq = Util.checkString(cstmt.getString(10));
		this.dlco_no = Util.checkString(cstmt.getString(11));
		this.sp_comp_chrg_pers_emp_no = Util.checkString(cstmt.getString(12));
		this.sp_comp_chrg_pers_emp_nm = Util.checkString(cstmt.getString(13));
		this.use_sw = Util.checkString(cstmt.getString(14));
		this.leaf_open_chrg_pers = Util.checkString(cstmt.getString(15));
		this.leaf_open_chrg_pers_nm = Util.checkString(cstmt.getString(16));
		this.leaf_now_chrg_pers = Util.checkString(cstmt.getString(17));
		this.leaf_now_chrg_pers_nm = Util.checkString(cstmt.getString(18));
		this.dept_cd = Util.checkString(cstmt.getString(19));
		this.sub_dept_cd = Util.checkString(cstmt.getString(20));
		this.bo_nm = Util.checkString(cstmt.getString(21));
		this.bo_zip_1 = Util.checkString(cstmt.getString(22));
		this.bo_zip_2 = Util.checkString(cstmt.getString(23));
		this.bo_addr = Util.checkString(cstmt.getString(24));
		this.bo_dtls_addr = Util.checkString(cstmt.getString(25));
		this.hdqt_sell_dept_cd = Util.checkString(cstmt.getString(26));
		this.hdqt_sell_sub_dept_cd = Util.checkString(cstmt.getString(27));
		this.hdqt_sell_area_cd = Util.checkString(cstmt.getString(28));
		this.cntr_stat_clsf = Util.checkString(cstmt.getString(29));
		this.malig_yn = Util.checkString(cstmt.getString(30));
		this.tax_stmt_cmpy_cd = Util.checkString(cstmt.getString(31));
		this.cu_acct_cd = Util.checkString(cstmt.getString(32));
		this.cntr_dt = Util.checkString(cstmt.getString(33));
		this.expy_dt = Util.checkString(cstmt.getString(34));
		this.leaf_sale_yn = Util.checkString(cstmt.getString(35));
		this.leaf_purc_yn = Util.checkString(cstmt.getString(36));
		this.dmang_bo_yn = Util.checkString(cstmt.getString(37));
		this.outsd_leaf_cmpy_yn = Util.checkString(cstmt.getString(38));
		this.vexc_cmpy_yn = Util.checkString(cstmt.getString(39));
		this.design_cmpy_yn = Util.checkString(cstmt.getString(40));
		this.excep_main_prt_plac_yn = Util.checkString(cstmt.getString(41));
		this.isgrp_yn = Util.checkString(cstmt.getString(42));
		this.sp_deal_yn = Util.checkString(cstmt.getString(43));
		this.jurs_dong_nm = Util.checkString(cstmt.getString(44));
		this.jurs_apt = Util.checkString(cstmt.getString(45));
		this.leaf_addr = Util.checkString(cstmt.getString(46));
		this.adms_dstc_cd = Util.checkString(cstmt.getString(47));
		this.adms_dstc_cd_nm = Util.checkString(cstmt.getString(48));
		this.asnt_dstc_cd = Util.checkString(cstmt.getString(49));
		this.asnt_dstc_cd_nm = Util.checkString(cstmt.getString(50));
		this.dstc_seqo = Util.checkString(cstmt.getString(51));
		this.srt_seqo = Util.checkString(cstmt.getString(52));
		this.wh_cd = Util.checkString(cstmt.getString(53));
		this.send_qty = Util.checkString(cstmt.getString(54));
		this.acwr_rmsg_ptph = Util.checkString(cstmt.getString(55));
		this.hmpg = Util.checkString(cstmt.getString(56));
		this.remk = Util.checkString(cstmt.getString(57));
		this.chg_pers = Util.checkString(cstmt.getString(58));
		this.chg_dt_tm = Util.checkString(cstmt.getString(59));
		this.dlco_abrv_nm = Util.checkString(cstmt.getString(60));
		this.dlco_nm = Util.checkString(cstmt.getString(61));
		this.ern = Util.checkString(cstmt.getString(62));
		this.bizcond = Util.checkString(cstmt.getString(63));
		this.item = Util.checkString(cstmt.getString(64));
		this.zip_1 = Util.checkString(cstmt.getString(65));
		this.zip_2 = Util.checkString(cstmt.getString(66));
		this.addr = Util.checkString(cstmt.getString(67));
		this.dtls_addr = Util.checkString(cstmt.getString(68));
		this.presi_nm = Util.checkString(cstmt.getString(69));
		this.presi_prn = Util.checkString(cstmt.getString(70));
		this.presi_zip_1 = Util.checkString(cstmt.getString(71));
		this.presi_zip_2 = Util.checkString(cstmt.getString(72));
		this.presi_addr = Util.checkString(cstmt.getString(73));
		this.presi_dtls_addr = Util.checkString(cstmt.getString(74));
		this.tel_no = Util.checkString(cstmt.getString(75));
		this.fax_no = Util.checkString(cstmt.getString(76));
		this.flag = Util.checkString(cstmt.getString(77));
		ResultSet rset0 = (ResultSet) cstmt.getObject(78);
		while(rset0.next()){
			IS_BAS_1310_SCURLIST_ARecord rec = new IS_BAS_1310_SCURLIST_ARecord();
			rec.a_cmpy_cd = Util.checkString(rset0.getString("a_cmpy_cd"));
			rec.a_dlco_clsf = Util.checkString(rset0.getString("a_dlco_clsf"));
			rec.a_dlco_cd = Util.checkString(rset0.getString("a_dlco_cd"));
			rec.a_dlco_seq = Util.checkString(rset0.getString("a_dlco_seq"));
			rec.a_dlco_chrg_pers_seq = Util.checkString(rset0.getString("a_dlco_chrg_pers_seq"));
			rec.a_chrg_job_clsf = Util.checkString(rset0.getString("a_chrg_job_clsf"));
			rec.a_chrg_pers_nm = Util.checkString(rset0.getString("a_chrg_pers_nm"));
			rec.a_dept = Util.checkString(rset0.getString("a_dept"));
			rec.a_posi = Util.checkString(rset0.getString("a_posi"));
			rec.a_ptph_no = Util.checkString(rset0.getString("a_ptph_no"));
			rec.a_tel_no_1 = Util.checkString(rset0.getString("a_tel_no_1"));
			rec.a_tel_no_2 = Util.checkString(rset0.getString("a_tel_no_2"));
			rec.a_fax_no = Util.checkString(rset0.getString("a_fax_no"));
			rec.a_email = Util.checkString(rset0.getString("a_email"));
			rec.a_tax_asp_id = Util.checkString(rset0.getString("a_tax_asp_id"));
			rec.a_kind_erplace_no = Util.checkString(rset0.getString("a_kind_erplace_no"));
			rec.a_remk_matt = Util.checkString(rset0.getString("a_remk_matt"));
			rec.a_chg_pers = Util.checkString(rset0.getString("a_chg_pers"));
			rec.a_chg_dt_tm = Util.checkString(rset0.getString("a_chg_dt_tm"));
			this.curlist_a.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(79);
		while(rset1.next()){
			IS_BAS_1310_SCURLIST_BRecord rec = new IS_BAS_1310_SCURLIST_BRecord();
			rec.b_cmpy_cd = Util.checkString(rset1.getString("b_cmpy_cd"));
			rec.b_dlco_clsf = Util.checkString(rset1.getString("b_dlco_clsf"));
			rec.b_dlco_cd = Util.checkString(rset1.getString("b_dlco_cd"));
			rec.b_dlco_seq = Util.checkString(rset1.getString("b_dlco_seq"));
			rec.b_sale_item_cd = Util.checkString(rset1.getString("b_sale_item_cd"));
			rec.b_sale_item_nm = Util.checkString(rset1.getString("b_sale_item_nm"));
			rec.b_cntr_dt = Util.checkString(rset1.getString("b_cntr_dt"));
			rec.b_expy_dt = Util.checkString(rset1.getString("b_expy_dt"));
			rec.b_fst_clamt_mm = Util.checkString(rset1.getString("b_fst_clamt_mm"));
			rec.b_amt = Util.checkString(rset1.getString("b_amt"));
			rec.b_clamt_mthd_cd = Util.checkString(rset1.getString("b_clamt_mthd_cd"));
			rec.b_pay_cntr_clsf = Util.checkString(rset1.getString("b_pay_cntr_clsf"));
			rec.b_remk = Util.checkString(rset1.getString("b_remk"));
			rec.b_chg_pers = Util.checkString(rset1.getString("b_chg_pers"));
			this.curlist_b.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(80);
		while(rset2.next()){
			IS_BAS_1310_SCURLIST_CRecord rec = new IS_BAS_1310_SCURLIST_CRecord();
			rec.c_cmpy_cd = Util.checkString(rset2.getString("c_cmpy_cd"));
			rec.c_dlco_clsf = Util.checkString(rset2.getString("c_dlco_clsf"));
			rec.c_dlco_cd = Util.checkString(rset2.getString("c_dlco_cd"));
			rec.c_dlco_seq = Util.checkString(rset2.getString("c_dlco_seq"));
			rec.c_giro_seq = Util.checkString(rset2.getString("c_giro_seq"));
			rec.c_giro_no = Util.checkString(rset2.getString("c_giro_no"));
			rec.c_giro_clsf = Util.checkString(rset2.getString("c_giro_clsf"));
			rec.c_aprv_no = Util.checkString(rset2.getString("c_aprv_no"));
			rec.c_dnmn_pers = Util.checkString(rset2.getString("c_dnmn_pers"));
			rec.c_bank_no = Util.checkString(rset2.getString("c_bank_no"));
			rec.c_acct_no = Util.checkString(rset2.getString("c_acct_no"));
			rec.c_deps_pers = Util.checkString(rset2.getString("c_deps_pers"));
			rec.c_open_dt = Util.checkString(rset2.getString("c_open_dt"));
			rec.c_cdatmaplc_dt = Util.checkString(rset2.getString("c_cdatmaplc_dt"));
			rec.c_cdatmaprv_dt = Util.checkString(rset2.getString("c_cdatmaprv_dt"));
			rec.c_cdatmacpn_dt = Util.checkString(rset2.getString("c_cdatmacpn_dt"));
			rec.c_chg_pers = Util.checkString(rset2.getString("c_chg_pers"));
			rec.c_chg_dt_tm = Util.checkString(rset2.getString("c_chg_dt_tm"));
			this.curlist_c.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(81);
		while(rset3.next()){
			IS_BAS_1310_SCURLIST_DRecord rec = new IS_BAS_1310_SCURLIST_DRecord();
			rec.d_cmpy_cd = Util.checkString(rset3.getString("d_cmpy_cd"));
			rec.d_dlco_clsf = Util.checkString(rset3.getString("d_dlco_clsf"));
			rec.d_dlco_cd = Util.checkString(rset3.getString("d_dlco_cd"));
			rec.d_dlco_seq = Util.checkString(rset3.getString("d_dlco_seq"));
			rec.d_intn_tel_seq = Util.checkString(rset3.getString("d_intn_tel_seq"));
			rec.d_estb_dt = Util.checkString(rset3.getString("d_estb_dt"));
			rec.d_mang_no = Util.checkString(rset3.getString("d_mang_no"));
			rec.d_tel_no = Util.checkString(rset3.getString("d_tel_no"));
			rec.d_use_yn = Util.checkString(rset3.getString("d_use_yn"));
			rec.d_remk = Util.checkString(rset3.getString("d_remk"));
			rec.d_chg_dt_tm = Util.checkString(rset3.getString("d_chg_dt_tm"));
			this.curlist_d.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1310_SDataSet ds = (IS_BAS_1310_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BAS_1310_SCURLIST_ARecord curlist_aRec = (IS_BAS_1310_SCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_b.size(); i++){
		IS_BAS_1310_SCURLIST_BRecord curlist_bRec = (IS_BAS_1310_SCURLIST_BRecord)ds.curlist_b.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_c.size(); i++){
		IS_BAS_1310_SCURLIST_CRecord curlist_cRec = (IS_BAS_1310_SCURLIST_CRecord)ds.curlist_c.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_d.size(); i++){
		IS_BAS_1310_SCURLIST_DRecord curlist_dRec = (IS_BAS_1310_SCURLIST_DRecord)ds.curlist_d.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_clsf()%>
<%= ds.getDlco_cd()%>
<%= ds.getDlco_seq()%>
<%= ds.getDlco_no()%>
<%= ds.getSp_comp_chrg_pers_emp_no()%>
<%= ds.getSp_comp_chrg_pers_emp_nm()%>
<%= ds.getUse_sw()%>
<%= ds.getLeaf_open_chrg_pers()%>
<%= ds.getLeaf_open_chrg_pers_nm()%>
<%= ds.getLeaf_now_chrg_pers()%>
<%= ds.getLeaf_now_chrg_pers_nm()%>
<%= ds.getDept_cd()%>
<%= ds.getSub_dept_cd()%>
<%= ds.getBo_nm()%>
<%= ds.getBo_zip_1()%>
<%= ds.getBo_zip_2()%>
<%= ds.getBo_addr()%>
<%= ds.getBo_dtls_addr()%>
<%= ds.getHdqt_sell_dept_cd()%>
<%= ds.getHdqt_sell_sub_dept_cd()%>
<%= ds.getHdqt_sell_area_cd()%>
<%= ds.getCntr_stat_clsf()%>
<%= ds.getMalig_yn()%>
<%= ds.getTax_stmt_cmpy_cd()%>
<%= ds.getCu_acct_cd()%>
<%= ds.getCntr_dt()%>
<%= ds.getExpy_dt()%>
<%= ds.getLeaf_sale_yn()%>
<%= ds.getLeaf_purc_yn()%>
<%= ds.getDmang_bo_yn()%>
<%= ds.getOutsd_leaf_cmpy_yn()%>
<%= ds.getVexc_cmpy_yn()%>
<%= ds.getDesign_cmpy_yn()%>
<%= ds.getExcep_main_prt_plac_yn()%>
<%= ds.getIsgrp_yn()%>
<%= ds.getSp_deal_yn()%>
<%= ds.getJurs_dong_nm()%>
<%= ds.getJurs_apt()%>
<%= ds.getLeaf_addr()%>
<%= ds.getAdms_dstc_cd()%>
<%= ds.getAdms_dstc_cd_nm()%>
<%= ds.getAsnt_dstc_cd()%>
<%= ds.getAsnt_dstc_cd_nm()%>
<%= ds.getDstc_seqo()%>
<%= ds.getSrt_seqo()%>
<%= ds.getWh_cd()%>
<%= ds.getSend_qty()%>
<%= ds.getAcwr_rmsg_ptph()%>
<%= ds.getHmpg()%>
<%= ds.getRemk()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getDlco_abrv_nm()%>
<%= ds.getDlco_nm()%>
<%= ds.getErn()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getZip_1()%>
<%= ds.getZip_2()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getPresi_nm()%>
<%= ds.getPresi_prn()%>
<%= ds.getPresi_zip_1()%>
<%= ds.getPresi_zip_2()%>
<%= ds.getPresi_addr()%>
<%= ds.getPresi_dtls_addr()%>
<%= ds.getTel_no()%>
<%= ds.getFax_no()%>
<%= ds.getFlag()%>
<%= ds.getCurlist_a()%>
<%= ds.getCurlist_b()%>
<%= ds.getCurlist_c()%>
<%= ds.getCurlist_d()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.a_cmpy_cd%>
<%= curlist_aRec.a_dlco_clsf%>
<%= curlist_aRec.a_dlco_cd%>
<%= curlist_aRec.a_dlco_seq%>
<%= curlist_aRec.a_dlco_chrg_pers_seq%>
<%= curlist_aRec.a_chrg_job_clsf%>
<%= curlist_aRec.a_chrg_pers_nm%>
<%= curlist_aRec.a_dept%>
<%= curlist_aRec.a_posi%>
<%= curlist_aRec.a_ptph_no%>
<%= curlist_aRec.a_tel_no_1%>
<%= curlist_aRec.a_tel_no_2%>
<%= curlist_aRec.a_fax_no%>
<%= curlist_aRec.a_email%>
<%= curlist_aRec.a_tax_asp_id%>
<%= curlist_aRec.a_kind_erplace_no%>
<%= curlist_aRec.a_remk_matt%>
<%= curlist_aRec.a_chg_pers%>
<%= curlist_aRec.a_chg_dt_tm%>
<%= curlist_bRec.b_cmpy_cd%>
<%= curlist_bRec.b_dlco_clsf%>
<%= curlist_bRec.b_dlco_cd%>
<%= curlist_bRec.b_dlco_seq%>
<%= curlist_bRec.b_sale_item_cd%>
<%= curlist_bRec.b_sale_item_nm%>
<%= curlist_bRec.b_cntr_dt%>
<%= curlist_bRec.b_expy_dt%>
<%= curlist_bRec.b_fst_clamt_mm%>
<%= curlist_bRec.b_amt%>
<%= curlist_bRec.b_clamt_mthd_cd%>
<%= curlist_bRec.b_pay_cntr_clsf%>
<%= curlist_bRec.b_remk%>
<%= curlist_bRec.b_chg_pers%>
<%= curlist_cRec.c_cmpy_cd%>
<%= curlist_cRec.c_dlco_clsf%>
<%= curlist_cRec.c_dlco_cd%>
<%= curlist_cRec.c_dlco_seq%>
<%= curlist_cRec.c_giro_seq%>
<%= curlist_cRec.c_giro_no%>
<%= curlist_cRec.c_giro_clsf%>
<%= curlist_cRec.c_aprv_no%>
<%= curlist_cRec.c_dnmn_pers%>
<%= curlist_cRec.c_bank_no%>
<%= curlist_cRec.c_acct_no%>
<%= curlist_cRec.c_deps_pers%>
<%= curlist_cRec.c_open_dt%>
<%= curlist_cRec.c_cdatmaplc_dt%>
<%= curlist_cRec.c_cdatmaprv_dt%>
<%= curlist_cRec.c_cdatmacpn_dt%>
<%= curlist_cRec.c_chg_pers%>
<%= curlist_cRec.c_chg_dt_tm%>
<%= curlist_dRec.d_cmpy_cd%>
<%= curlist_dRec.d_dlco_clsf%>
<%= curlist_dRec.d_dlco_cd%>
<%= curlist_dRec.d_dlco_seq%>
<%= curlist_dRec.d_intn_tel_seq%>
<%= curlist_dRec.d_estb_dt%>
<%= curlist_dRec.d_mang_no%>
<%= curlist_dRec.d_tel_no%>
<%= curlist_dRec.d_use_yn%>
<%= curlist_dRec.d_remk%>
<%= curlist_dRec.d_chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 14:51:43 KST 2012 */