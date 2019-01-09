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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1840_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rdr_extn_yymm;
	public String mode;
	public String seq;
	public String staf_no;
	public String staf_nm;
	public String acty_area;
	public String prn;
	public String a_hous_rdr_extn_qty;
	public String a_apt_rdr_extn_qty;
	public String a_shop_rdr_extn_qty;
	public String a_hous_ufth_qty;
	public String a_apt_ufth_qty;
	public String a_shop_ufth_qty;
	public String a_hous_fix_qty;
	public String a_apt_fix_qty;
	public String a_shop_fix_qty;
	public String b_hous_rdr_extn_qty;
	public String b_apt_rdr_extn_qty;
	public String b_shop_rdr_extn_qty;
	public String b_hous_ufth_qty;
	public String b_apt_ufth_qty;
	public String b_shop_ufth_qty;
	public String b_hous_fix_qty;
	public String b_apt_fix_qty;
	public String b_shop_fix_qty;
	public String rdr_extn_alon;
	public String leader_alon;
	public String jungbuhonam_spc_acty_cost;
	public String mvin_team_spc_acty_cost;
	public String no_val_shrt_fee;
	public String rdr_extn_sctn_clsi_fee;
	public String etc_alon_1;
	public String etc_alon_2;
	public String etc_alon_3;
	public String pre_pay_dduc;
	public String etc_dduc_1;
	public String etc_dduc_2;
	public String etc_dduc_3;
	public String stot_amt;
	public String tax_amt_dduc;
	public String res_tax_dduc;
	public String real_pay_amt;
	public String wclam_subm_yn;
	public String clos_yn;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String setl_bank;
	public String rcpm_main_nm;
	public String acct_no;
	public String pay_plan_dt;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SP_SAL_1840_ADM(){}
	public SP_SAL_1840_ADM(String cmpy_cd, String rdr_extn_yymm, String mode, String seq, String staf_no, String staf_nm, String acty_area, String prn, String a_hous_rdr_extn_qty, String a_apt_rdr_extn_qty, String a_shop_rdr_extn_qty, String a_hous_ufth_qty, String a_apt_ufth_qty, String a_shop_ufth_qty, String a_hous_fix_qty, String a_apt_fix_qty, String a_shop_fix_qty, String b_hous_rdr_extn_qty, String b_apt_rdr_extn_qty, String b_shop_rdr_extn_qty, String b_hous_ufth_qty, String b_apt_ufth_qty, String b_shop_ufth_qty, String b_hous_fix_qty, String b_apt_fix_qty, String b_shop_fix_qty, String rdr_extn_alon, String leader_alon, String jungbuhonam_spc_acty_cost, String mvin_team_spc_acty_cost, String no_val_shrt_fee, String rdr_extn_sctn_clsi_fee, String etc_alon_1, String etc_alon_2, String etc_alon_3, String pre_pay_dduc, String etc_dduc_1, String etc_dduc_2, String etc_dduc_3, String stot_amt, String tax_amt_dduc, String res_tax_dduc, String real_pay_amt, String wclam_subm_yn, String clos_yn, String dlco_clsf_cd, String dlco_cd, String setl_bank, String rcpm_main_nm, String acct_no, String pay_plan_dt, String remk, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.rdr_extn_yymm = rdr_extn_yymm;
		this.mode = mode;
		this.seq = seq;
		this.staf_no = staf_no;
		this.staf_nm = staf_nm;
		this.acty_area = acty_area;
		this.prn = prn;
		this.a_hous_rdr_extn_qty = a_hous_rdr_extn_qty;
		this.a_apt_rdr_extn_qty = a_apt_rdr_extn_qty;
		this.a_shop_rdr_extn_qty = a_shop_rdr_extn_qty;
		this.a_hous_ufth_qty = a_hous_ufth_qty;
		this.a_apt_ufth_qty = a_apt_ufth_qty;
		this.a_shop_ufth_qty = a_shop_ufth_qty;
		this.a_hous_fix_qty = a_hous_fix_qty;
		this.a_apt_fix_qty = a_apt_fix_qty;
		this.a_shop_fix_qty = a_shop_fix_qty;
		this.b_hous_rdr_extn_qty = b_hous_rdr_extn_qty;
		this.b_apt_rdr_extn_qty = b_apt_rdr_extn_qty;
		this.b_shop_rdr_extn_qty = b_shop_rdr_extn_qty;
		this.b_hous_ufth_qty = b_hous_ufth_qty;
		this.b_apt_ufth_qty = b_apt_ufth_qty;
		this.b_shop_ufth_qty = b_shop_ufth_qty;
		this.b_hous_fix_qty = b_hous_fix_qty;
		this.b_apt_fix_qty = b_apt_fix_qty;
		this.b_shop_fix_qty = b_shop_fix_qty;
		this.rdr_extn_alon = rdr_extn_alon;
		this.leader_alon = leader_alon;
		this.jungbuhonam_spc_acty_cost = jungbuhonam_spc_acty_cost;
		this.mvin_team_spc_acty_cost = mvin_team_spc_acty_cost;
		this.no_val_shrt_fee = no_val_shrt_fee;
		this.rdr_extn_sctn_clsi_fee = rdr_extn_sctn_clsi_fee;
		this.etc_alon_1 = etc_alon_1;
		this.etc_alon_2 = etc_alon_2;
		this.etc_alon_3 = etc_alon_3;
		this.pre_pay_dduc = pre_pay_dduc;
		this.etc_dduc_1 = etc_dduc_1;
		this.etc_dduc_2 = etc_dduc_2;
		this.etc_dduc_3 = etc_dduc_3;
		this.stot_amt = stot_amt;
		this.tax_amt_dduc = tax_amt_dduc;
		this.res_tax_dduc = res_tax_dduc;
		this.real_pay_amt = real_pay_amt;
		this.wclam_subm_yn = wclam_subm_yn;
		this.clos_yn = clos_yn;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.setl_bank = setl_bank;
		this.rcpm_main_nm = rcpm_main_nm;
		this.acct_no = acct_no;
		this.pay_plan_dt = pay_plan_dt;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRdr_extn_yymm(String rdr_extn_yymm){
		this.rdr_extn_yymm = rdr_extn_yymm;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setStaf_no(String staf_no){
		this.staf_no = staf_no;
	}

	public void setStaf_nm(String staf_nm){
		this.staf_nm = staf_nm;
	}

	public void setActy_area(String acty_area){
		this.acty_area = acty_area;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setA_hous_rdr_extn_qty(String a_hous_rdr_extn_qty){
		this.a_hous_rdr_extn_qty = a_hous_rdr_extn_qty;
	}

	public void setA_apt_rdr_extn_qty(String a_apt_rdr_extn_qty){
		this.a_apt_rdr_extn_qty = a_apt_rdr_extn_qty;
	}

	public void setA_shop_rdr_extn_qty(String a_shop_rdr_extn_qty){
		this.a_shop_rdr_extn_qty = a_shop_rdr_extn_qty;
	}

	public void setA_hous_ufth_qty(String a_hous_ufth_qty){
		this.a_hous_ufth_qty = a_hous_ufth_qty;
	}

	public void setA_apt_ufth_qty(String a_apt_ufth_qty){
		this.a_apt_ufth_qty = a_apt_ufth_qty;
	}

	public void setA_shop_ufth_qty(String a_shop_ufth_qty){
		this.a_shop_ufth_qty = a_shop_ufth_qty;
	}

	public void setA_hous_fix_qty(String a_hous_fix_qty){
		this.a_hous_fix_qty = a_hous_fix_qty;
	}

	public void setA_apt_fix_qty(String a_apt_fix_qty){
		this.a_apt_fix_qty = a_apt_fix_qty;
	}

	public void setA_shop_fix_qty(String a_shop_fix_qty){
		this.a_shop_fix_qty = a_shop_fix_qty;
	}

	public void setB_hous_rdr_extn_qty(String b_hous_rdr_extn_qty){
		this.b_hous_rdr_extn_qty = b_hous_rdr_extn_qty;
	}

	public void setB_apt_rdr_extn_qty(String b_apt_rdr_extn_qty){
		this.b_apt_rdr_extn_qty = b_apt_rdr_extn_qty;
	}

	public void setB_shop_rdr_extn_qty(String b_shop_rdr_extn_qty){
		this.b_shop_rdr_extn_qty = b_shop_rdr_extn_qty;
	}

	public void setB_hous_ufth_qty(String b_hous_ufth_qty){
		this.b_hous_ufth_qty = b_hous_ufth_qty;
	}

	public void setB_apt_ufth_qty(String b_apt_ufth_qty){
		this.b_apt_ufth_qty = b_apt_ufth_qty;
	}

	public void setB_shop_ufth_qty(String b_shop_ufth_qty){
		this.b_shop_ufth_qty = b_shop_ufth_qty;
	}

	public void setB_hous_fix_qty(String b_hous_fix_qty){
		this.b_hous_fix_qty = b_hous_fix_qty;
	}

	public void setB_apt_fix_qty(String b_apt_fix_qty){
		this.b_apt_fix_qty = b_apt_fix_qty;
	}

	public void setB_shop_fix_qty(String b_shop_fix_qty){
		this.b_shop_fix_qty = b_shop_fix_qty;
	}

	public void setRdr_extn_alon(String rdr_extn_alon){
		this.rdr_extn_alon = rdr_extn_alon;
	}

	public void setLeader_alon(String leader_alon){
		this.leader_alon = leader_alon;
	}

	public void setJungbuhonam_spc_acty_cost(String jungbuhonam_spc_acty_cost){
		this.jungbuhonam_spc_acty_cost = jungbuhonam_spc_acty_cost;
	}

	public void setMvin_team_spc_acty_cost(String mvin_team_spc_acty_cost){
		this.mvin_team_spc_acty_cost = mvin_team_spc_acty_cost;
	}

	public void setNo_val_shrt_fee(String no_val_shrt_fee){
		this.no_val_shrt_fee = no_val_shrt_fee;
	}

	public void setRdr_extn_sctn_clsi_fee(String rdr_extn_sctn_clsi_fee){
		this.rdr_extn_sctn_clsi_fee = rdr_extn_sctn_clsi_fee;
	}

	public void setEtc_alon_1(String etc_alon_1){
		this.etc_alon_1 = etc_alon_1;
	}

	public void setEtc_alon_2(String etc_alon_2){
		this.etc_alon_2 = etc_alon_2;
	}

	public void setEtc_alon_3(String etc_alon_3){
		this.etc_alon_3 = etc_alon_3;
	}

	public void setPre_pay_dduc(String pre_pay_dduc){
		this.pre_pay_dduc = pre_pay_dduc;
	}

	public void setEtc_dduc_1(String etc_dduc_1){
		this.etc_dduc_1 = etc_dduc_1;
	}

	public void setEtc_dduc_2(String etc_dduc_2){
		this.etc_dduc_2 = etc_dduc_2;
	}

	public void setEtc_dduc_3(String etc_dduc_3){
		this.etc_dduc_3 = etc_dduc_3;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setTax_amt_dduc(String tax_amt_dduc){
		this.tax_amt_dduc = tax_amt_dduc;
	}

	public void setRes_tax_dduc(String res_tax_dduc){
		this.res_tax_dduc = res_tax_dduc;
	}

	public void setReal_pay_amt(String real_pay_amt){
		this.real_pay_amt = real_pay_amt;
	}

	public void setWclam_subm_yn(String wclam_subm_yn){
		this.wclam_subm_yn = wclam_subm_yn;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setPay_plan_dt(String pay_plan_dt){
		this.pay_plan_dt = pay_plan_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRdr_extn_yymm(){
		return this.rdr_extn_yymm;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getStaf_no(){
		return this.staf_no;
	}

	public String getStaf_nm(){
		return this.staf_nm;
	}

	public String getActy_area(){
		return this.acty_area;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getA_hous_rdr_extn_qty(){
		return this.a_hous_rdr_extn_qty;
	}

	public String getA_apt_rdr_extn_qty(){
		return this.a_apt_rdr_extn_qty;
	}

	public String getA_shop_rdr_extn_qty(){
		return this.a_shop_rdr_extn_qty;
	}

	public String getA_hous_ufth_qty(){
		return this.a_hous_ufth_qty;
	}

	public String getA_apt_ufth_qty(){
		return this.a_apt_ufth_qty;
	}

	public String getA_shop_ufth_qty(){
		return this.a_shop_ufth_qty;
	}

	public String getA_hous_fix_qty(){
		return this.a_hous_fix_qty;
	}

	public String getA_apt_fix_qty(){
		return this.a_apt_fix_qty;
	}

	public String getA_shop_fix_qty(){
		return this.a_shop_fix_qty;
	}

	public String getB_hous_rdr_extn_qty(){
		return this.b_hous_rdr_extn_qty;
	}

	public String getB_apt_rdr_extn_qty(){
		return this.b_apt_rdr_extn_qty;
	}

	public String getB_shop_rdr_extn_qty(){
		return this.b_shop_rdr_extn_qty;
	}

	public String getB_hous_ufth_qty(){
		return this.b_hous_ufth_qty;
	}

	public String getB_apt_ufth_qty(){
		return this.b_apt_ufth_qty;
	}

	public String getB_shop_ufth_qty(){
		return this.b_shop_ufth_qty;
	}

	public String getB_hous_fix_qty(){
		return this.b_hous_fix_qty;
	}

	public String getB_apt_fix_qty(){
		return this.b_apt_fix_qty;
	}

	public String getB_shop_fix_qty(){
		return this.b_shop_fix_qty;
	}

	public String getRdr_extn_alon(){
		return this.rdr_extn_alon;
	}

	public String getLeader_alon(){
		return this.leader_alon;
	}

	public String getJungbuhonam_spc_acty_cost(){
		return this.jungbuhonam_spc_acty_cost;
	}

	public String getMvin_team_spc_acty_cost(){
		return this.mvin_team_spc_acty_cost;
	}

	public String getNo_val_shrt_fee(){
		return this.no_val_shrt_fee;
	}

	public String getRdr_extn_sctn_clsi_fee(){
		return this.rdr_extn_sctn_clsi_fee;
	}

	public String getEtc_alon_1(){
		return this.etc_alon_1;
	}

	public String getEtc_alon_2(){
		return this.etc_alon_2;
	}

	public String getEtc_alon_3(){
		return this.etc_alon_3;
	}

	public String getPre_pay_dduc(){
		return this.pre_pay_dduc;
	}

	public String getEtc_dduc_1(){
		return this.etc_dduc_1;
	}

	public String getEtc_dduc_2(){
		return this.etc_dduc_2;
	}

	public String getEtc_dduc_3(){
		return this.etc_dduc_3;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getTax_amt_dduc(){
		return this.tax_amt_dduc;
	}

	public String getRes_tax_dduc(){
		return this.res_tax_dduc;
	}

	public String getReal_pay_amt(){
		return this.real_pay_amt;
	}

	public String getWclam_subm_yn(){
		return this.wclam_subm_yn;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getPay_plan_dt(){
		return this.pay_plan_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1840_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1840_ADM dm = (SP_SAL_1840_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rdr_extn_yymm);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.staf_no);
		cstmt.setString(8, dm.staf_nm);
		cstmt.setString(9, dm.acty_area);
		cstmt.setString(10, dm.prn);
		cstmt.setString(11, dm.a_hous_rdr_extn_qty);
		cstmt.setString(12, dm.a_apt_rdr_extn_qty);
		cstmt.setString(13, dm.a_shop_rdr_extn_qty);
		cstmt.setString(14, dm.a_hous_ufth_qty);
		cstmt.setString(15, dm.a_apt_ufth_qty);
		cstmt.setString(16, dm.a_shop_ufth_qty);
		cstmt.setString(17, dm.a_hous_fix_qty);
		cstmt.setString(18, dm.a_apt_fix_qty);
		cstmt.setString(19, dm.a_shop_fix_qty);
		cstmt.setString(20, dm.b_hous_rdr_extn_qty);
		cstmt.setString(21, dm.b_apt_rdr_extn_qty);
		cstmt.setString(22, dm.b_shop_rdr_extn_qty);
		cstmt.setString(23, dm.b_hous_ufth_qty);
		cstmt.setString(24, dm.b_apt_ufth_qty);
		cstmt.setString(25, dm.b_shop_ufth_qty);
		cstmt.setString(26, dm.b_hous_fix_qty);
		cstmt.setString(27, dm.b_apt_fix_qty);
		cstmt.setString(28, dm.b_shop_fix_qty);
		cstmt.setString(29, dm.rdr_extn_alon);
		cstmt.setString(30, dm.leader_alon);
		cstmt.setString(31, dm.jungbuhonam_spc_acty_cost);
		cstmt.setString(32, dm.mvin_team_spc_acty_cost);
		cstmt.setString(33, dm.no_val_shrt_fee);
		cstmt.setString(34, dm.rdr_extn_sctn_clsi_fee);
		cstmt.setString(35, dm.etc_alon_1);
		cstmt.setString(36, dm.etc_alon_2);
		cstmt.setString(37, dm.etc_alon_3);
		cstmt.setString(38, dm.pre_pay_dduc);
		cstmt.setString(39, dm.etc_dduc_1);
		cstmt.setString(40, dm.etc_dduc_2);
		cstmt.setString(41, dm.etc_dduc_3);
		cstmt.setString(42, dm.stot_amt);
		cstmt.setString(43, dm.tax_amt_dduc);
		cstmt.setString(44, dm.res_tax_dduc);
		cstmt.setString(45, dm.real_pay_amt);
		cstmt.setString(46, dm.wclam_subm_yn);
		cstmt.setString(47, dm.clos_yn);
		cstmt.setString(48, dm.dlco_clsf_cd);
		cstmt.setString(49, dm.dlco_cd);
		cstmt.setString(50, dm.setl_bank);
		cstmt.setString(51, dm.rcpm_main_nm);
		cstmt.setString(52, dm.acct_no);
		cstmt.setString(53, dm.pay_plan_dt);
		cstmt.setString(54, dm.remk);
		cstmt.setString(55, dm.incmg_pers);
		cstmt.setString(56, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1840_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rdr_extn_yymm = [" + getRdr_extn_yymm() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("staf_no = [" + getStaf_no() + "]");
		System.out.println("staf_nm = [" + getStaf_nm() + "]");
		System.out.println("acty_area = [" + getActy_area() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("a_hous_rdr_extn_qty = [" + getA_hous_rdr_extn_qty() + "]");
		System.out.println("a_apt_rdr_extn_qty = [" + getA_apt_rdr_extn_qty() + "]");
		System.out.println("a_shop_rdr_extn_qty = [" + getA_shop_rdr_extn_qty() + "]");
		System.out.println("a_hous_ufth_qty = [" + getA_hous_ufth_qty() + "]");
		System.out.println("a_apt_ufth_qty = [" + getA_apt_ufth_qty() + "]");
		System.out.println("a_shop_ufth_qty = [" + getA_shop_ufth_qty() + "]");
		System.out.println("a_hous_fix_qty = [" + getA_hous_fix_qty() + "]");
		System.out.println("a_apt_fix_qty = [" + getA_apt_fix_qty() + "]");
		System.out.println("a_shop_fix_qty = [" + getA_shop_fix_qty() + "]");
		System.out.println("b_hous_rdr_extn_qty = [" + getB_hous_rdr_extn_qty() + "]");
		System.out.println("b_apt_rdr_extn_qty = [" + getB_apt_rdr_extn_qty() + "]");
		System.out.println("b_shop_rdr_extn_qty = [" + getB_shop_rdr_extn_qty() + "]");
		System.out.println("b_hous_ufth_qty = [" + getB_hous_ufth_qty() + "]");
		System.out.println("b_apt_ufth_qty = [" + getB_apt_ufth_qty() + "]");
		System.out.println("b_shop_ufth_qty = [" + getB_shop_ufth_qty() + "]");
		System.out.println("b_hous_fix_qty = [" + getB_hous_fix_qty() + "]");
		System.out.println("b_apt_fix_qty = [" + getB_apt_fix_qty() + "]");
		System.out.println("b_shop_fix_qty = [" + getB_shop_fix_qty() + "]");
		System.out.println("rdr_extn_alon = [" + getRdr_extn_alon() + "]");
		System.out.println("leader_alon = [" + getLeader_alon() + "]");
		System.out.println("jungbuhonam_spc_acty_cost = [" + getJungbuhonam_spc_acty_cost() + "]");
		System.out.println("mvin_team_spc_acty_cost = [" + getMvin_team_spc_acty_cost() + "]");
		System.out.println("no_val_shrt_fee = [" + getNo_val_shrt_fee() + "]");
		System.out.println("rdr_extn_sctn_clsi_fee = [" + getRdr_extn_sctn_clsi_fee() + "]");
		System.out.println("etc_alon_1 = [" + getEtc_alon_1() + "]");
		System.out.println("etc_alon_2 = [" + getEtc_alon_2() + "]");
		System.out.println("etc_alon_3 = [" + getEtc_alon_3() + "]");
		System.out.println("pre_pay_dduc = [" + getPre_pay_dduc() + "]");
		System.out.println("etc_dduc_1 = [" + getEtc_dduc_1() + "]");
		System.out.println("etc_dduc_2 = [" + getEtc_dduc_2() + "]");
		System.out.println("etc_dduc_3 = [" + getEtc_dduc_3() + "]");
		System.out.println("stot_amt = [" + getStot_amt() + "]");
		System.out.println("tax_amt_dduc = [" + getTax_amt_dduc() + "]");
		System.out.println("res_tax_dduc = [" + getRes_tax_dduc() + "]");
		System.out.println("real_pay_amt = [" + getReal_pay_amt() + "]");
		System.out.println("wclam_subm_yn = [" + getWclam_subm_yn() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("setl_bank = [" + getSetl_bank() + "]");
		System.out.println("rcpm_main_nm = [" + getRcpm_main_nm() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("pay_plan_dt = [" + getPay_plan_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String rdr_extn_yymm = req.getParameter("rdr_extn_yymm");
if( rdr_extn_yymm == null){
	System.out.println(this.toString+" : rdr_extn_yymm is null" );
}else{
	System.out.println(this.toString+" : rdr_extn_yymm is "+rdr_extn_yymm );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String staf_no = req.getParameter("staf_no");
if( staf_no == null){
	System.out.println(this.toString+" : staf_no is null" );
}else{
	System.out.println(this.toString+" : staf_no is "+staf_no );
}
String staf_nm = req.getParameter("staf_nm");
if( staf_nm == null){
	System.out.println(this.toString+" : staf_nm is null" );
}else{
	System.out.println(this.toString+" : staf_nm is "+staf_nm );
}
String acty_area = req.getParameter("acty_area");
if( acty_area == null){
	System.out.println(this.toString+" : acty_area is null" );
}else{
	System.out.println(this.toString+" : acty_area is "+acty_area );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String a_hous_rdr_extn_qty = req.getParameter("a_hous_rdr_extn_qty");
if( a_hous_rdr_extn_qty == null){
	System.out.println(this.toString+" : a_hous_rdr_extn_qty is null" );
}else{
	System.out.println(this.toString+" : a_hous_rdr_extn_qty is "+a_hous_rdr_extn_qty );
}
String a_apt_rdr_extn_qty = req.getParameter("a_apt_rdr_extn_qty");
if( a_apt_rdr_extn_qty == null){
	System.out.println(this.toString+" : a_apt_rdr_extn_qty is null" );
}else{
	System.out.println(this.toString+" : a_apt_rdr_extn_qty is "+a_apt_rdr_extn_qty );
}
String a_shop_rdr_extn_qty = req.getParameter("a_shop_rdr_extn_qty");
if( a_shop_rdr_extn_qty == null){
	System.out.println(this.toString+" : a_shop_rdr_extn_qty is null" );
}else{
	System.out.println(this.toString+" : a_shop_rdr_extn_qty is "+a_shop_rdr_extn_qty );
}
String a_hous_ufth_qty = req.getParameter("a_hous_ufth_qty");
if( a_hous_ufth_qty == null){
	System.out.println(this.toString+" : a_hous_ufth_qty is null" );
}else{
	System.out.println(this.toString+" : a_hous_ufth_qty is "+a_hous_ufth_qty );
}
String a_apt_ufth_qty = req.getParameter("a_apt_ufth_qty");
if( a_apt_ufth_qty == null){
	System.out.println(this.toString+" : a_apt_ufth_qty is null" );
}else{
	System.out.println(this.toString+" : a_apt_ufth_qty is "+a_apt_ufth_qty );
}
String a_shop_ufth_qty = req.getParameter("a_shop_ufth_qty");
if( a_shop_ufth_qty == null){
	System.out.println(this.toString+" : a_shop_ufth_qty is null" );
}else{
	System.out.println(this.toString+" : a_shop_ufth_qty is "+a_shop_ufth_qty );
}
String a_hous_fix_qty = req.getParameter("a_hous_fix_qty");
if( a_hous_fix_qty == null){
	System.out.println(this.toString+" : a_hous_fix_qty is null" );
}else{
	System.out.println(this.toString+" : a_hous_fix_qty is "+a_hous_fix_qty );
}
String a_apt_fix_qty = req.getParameter("a_apt_fix_qty");
if( a_apt_fix_qty == null){
	System.out.println(this.toString+" : a_apt_fix_qty is null" );
}else{
	System.out.println(this.toString+" : a_apt_fix_qty is "+a_apt_fix_qty );
}
String a_shop_fix_qty = req.getParameter("a_shop_fix_qty");
if( a_shop_fix_qty == null){
	System.out.println(this.toString+" : a_shop_fix_qty is null" );
}else{
	System.out.println(this.toString+" : a_shop_fix_qty is "+a_shop_fix_qty );
}
String b_hous_rdr_extn_qty = req.getParameter("b_hous_rdr_extn_qty");
if( b_hous_rdr_extn_qty == null){
	System.out.println(this.toString+" : b_hous_rdr_extn_qty is null" );
}else{
	System.out.println(this.toString+" : b_hous_rdr_extn_qty is "+b_hous_rdr_extn_qty );
}
String b_apt_rdr_extn_qty = req.getParameter("b_apt_rdr_extn_qty");
if( b_apt_rdr_extn_qty == null){
	System.out.println(this.toString+" : b_apt_rdr_extn_qty is null" );
}else{
	System.out.println(this.toString+" : b_apt_rdr_extn_qty is "+b_apt_rdr_extn_qty );
}
String b_shop_rdr_extn_qty = req.getParameter("b_shop_rdr_extn_qty");
if( b_shop_rdr_extn_qty == null){
	System.out.println(this.toString+" : b_shop_rdr_extn_qty is null" );
}else{
	System.out.println(this.toString+" : b_shop_rdr_extn_qty is "+b_shop_rdr_extn_qty );
}
String b_hous_ufth_qty = req.getParameter("b_hous_ufth_qty");
if( b_hous_ufth_qty == null){
	System.out.println(this.toString+" : b_hous_ufth_qty is null" );
}else{
	System.out.println(this.toString+" : b_hous_ufth_qty is "+b_hous_ufth_qty );
}
String b_apt_ufth_qty = req.getParameter("b_apt_ufth_qty");
if( b_apt_ufth_qty == null){
	System.out.println(this.toString+" : b_apt_ufth_qty is null" );
}else{
	System.out.println(this.toString+" : b_apt_ufth_qty is "+b_apt_ufth_qty );
}
String b_shop_ufth_qty = req.getParameter("b_shop_ufth_qty");
if( b_shop_ufth_qty == null){
	System.out.println(this.toString+" : b_shop_ufth_qty is null" );
}else{
	System.out.println(this.toString+" : b_shop_ufth_qty is "+b_shop_ufth_qty );
}
String b_hous_fix_qty = req.getParameter("b_hous_fix_qty");
if( b_hous_fix_qty == null){
	System.out.println(this.toString+" : b_hous_fix_qty is null" );
}else{
	System.out.println(this.toString+" : b_hous_fix_qty is "+b_hous_fix_qty );
}
String b_apt_fix_qty = req.getParameter("b_apt_fix_qty");
if( b_apt_fix_qty == null){
	System.out.println(this.toString+" : b_apt_fix_qty is null" );
}else{
	System.out.println(this.toString+" : b_apt_fix_qty is "+b_apt_fix_qty );
}
String b_shop_fix_qty = req.getParameter("b_shop_fix_qty");
if( b_shop_fix_qty == null){
	System.out.println(this.toString+" : b_shop_fix_qty is null" );
}else{
	System.out.println(this.toString+" : b_shop_fix_qty is "+b_shop_fix_qty );
}
String rdr_extn_alon = req.getParameter("rdr_extn_alon");
if( rdr_extn_alon == null){
	System.out.println(this.toString+" : rdr_extn_alon is null" );
}else{
	System.out.println(this.toString+" : rdr_extn_alon is "+rdr_extn_alon );
}
String leader_alon = req.getParameter("leader_alon");
if( leader_alon == null){
	System.out.println(this.toString+" : leader_alon is null" );
}else{
	System.out.println(this.toString+" : leader_alon is "+leader_alon );
}
String jungbuhonam_spc_acty_cost = req.getParameter("jungbuhonam_spc_acty_cost");
if( jungbuhonam_spc_acty_cost == null){
	System.out.println(this.toString+" : jungbuhonam_spc_acty_cost is null" );
}else{
	System.out.println(this.toString+" : jungbuhonam_spc_acty_cost is "+jungbuhonam_spc_acty_cost );
}
String mvin_team_spc_acty_cost = req.getParameter("mvin_team_spc_acty_cost");
if( mvin_team_spc_acty_cost == null){
	System.out.println(this.toString+" : mvin_team_spc_acty_cost is null" );
}else{
	System.out.println(this.toString+" : mvin_team_spc_acty_cost is "+mvin_team_spc_acty_cost );
}
String no_val_shrt_fee = req.getParameter("no_val_shrt_fee");
if( no_val_shrt_fee == null){
	System.out.println(this.toString+" : no_val_shrt_fee is null" );
}else{
	System.out.println(this.toString+" : no_val_shrt_fee is "+no_val_shrt_fee );
}
String rdr_extn_sctn_clsi_fee = req.getParameter("rdr_extn_sctn_clsi_fee");
if( rdr_extn_sctn_clsi_fee == null){
	System.out.println(this.toString+" : rdr_extn_sctn_clsi_fee is null" );
}else{
	System.out.println(this.toString+" : rdr_extn_sctn_clsi_fee is "+rdr_extn_sctn_clsi_fee );
}
String etc_alon_1 = req.getParameter("etc_alon_1");
if( etc_alon_1 == null){
	System.out.println(this.toString+" : etc_alon_1 is null" );
}else{
	System.out.println(this.toString+" : etc_alon_1 is "+etc_alon_1 );
}
String etc_alon_2 = req.getParameter("etc_alon_2");
if( etc_alon_2 == null){
	System.out.println(this.toString+" : etc_alon_2 is null" );
}else{
	System.out.println(this.toString+" : etc_alon_2 is "+etc_alon_2 );
}
String etc_alon_3 = req.getParameter("etc_alon_3");
if( etc_alon_3 == null){
	System.out.println(this.toString+" : etc_alon_3 is null" );
}else{
	System.out.println(this.toString+" : etc_alon_3 is "+etc_alon_3 );
}
String pre_pay_dduc = req.getParameter("pre_pay_dduc");
if( pre_pay_dduc == null){
	System.out.println(this.toString+" : pre_pay_dduc is null" );
}else{
	System.out.println(this.toString+" : pre_pay_dduc is "+pre_pay_dduc );
}
String etc_dduc_1 = req.getParameter("etc_dduc_1");
if( etc_dduc_1 == null){
	System.out.println(this.toString+" : etc_dduc_1 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_1 is "+etc_dduc_1 );
}
String etc_dduc_2 = req.getParameter("etc_dduc_2");
if( etc_dduc_2 == null){
	System.out.println(this.toString+" : etc_dduc_2 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_2 is "+etc_dduc_2 );
}
String etc_dduc_3 = req.getParameter("etc_dduc_3");
if( etc_dduc_3 == null){
	System.out.println(this.toString+" : etc_dduc_3 is null" );
}else{
	System.out.println(this.toString+" : etc_dduc_3 is "+etc_dduc_3 );
}
String stot_amt = req.getParameter("stot_amt");
if( stot_amt == null){
	System.out.println(this.toString+" : stot_amt is null" );
}else{
	System.out.println(this.toString+" : stot_amt is "+stot_amt );
}
String tax_amt_dduc = req.getParameter("tax_amt_dduc");
if( tax_amt_dduc == null){
	System.out.println(this.toString+" : tax_amt_dduc is null" );
}else{
	System.out.println(this.toString+" : tax_amt_dduc is "+tax_amt_dduc );
}
String res_tax_dduc = req.getParameter("res_tax_dduc");
if( res_tax_dduc == null){
	System.out.println(this.toString+" : res_tax_dduc is null" );
}else{
	System.out.println(this.toString+" : res_tax_dduc is "+res_tax_dduc );
}
String real_pay_amt = req.getParameter("real_pay_amt");
if( real_pay_amt == null){
	System.out.println(this.toString+" : real_pay_amt is null" );
}else{
	System.out.println(this.toString+" : real_pay_amt is "+real_pay_amt );
}
String wclam_subm_yn = req.getParameter("wclam_subm_yn");
if( wclam_subm_yn == null){
	System.out.println(this.toString+" : wclam_subm_yn is null" );
}else{
	System.out.println(this.toString+" : wclam_subm_yn is "+wclam_subm_yn );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String setl_bank = req.getParameter("setl_bank");
if( setl_bank == null){
	System.out.println(this.toString+" : setl_bank is null" );
}else{
	System.out.println(this.toString+" : setl_bank is "+setl_bank );
}
String rcpm_main_nm = req.getParameter("rcpm_main_nm");
if( rcpm_main_nm == null){
	System.out.println(this.toString+" : rcpm_main_nm is null" );
}else{
	System.out.println(this.toString+" : rcpm_main_nm is "+rcpm_main_nm );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String pay_plan_dt = req.getParameter("pay_plan_dt");
if( pay_plan_dt == null){
	System.out.println(this.toString+" : pay_plan_dt is null" );
}else{
	System.out.println(this.toString+" : pay_plan_dt is "+pay_plan_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rdr_extn_yymm = Util.checkString(req.getParameter("rdr_extn_yymm"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String staf_no = Util.checkString(req.getParameter("staf_no"));
String staf_nm = Util.checkString(req.getParameter("staf_nm"));
String acty_area = Util.checkString(req.getParameter("acty_area"));
String prn = Util.checkString(req.getParameter("prn"));
String a_hous_rdr_extn_qty = Util.checkString(req.getParameter("a_hous_rdr_extn_qty"));
String a_apt_rdr_extn_qty = Util.checkString(req.getParameter("a_apt_rdr_extn_qty"));
String a_shop_rdr_extn_qty = Util.checkString(req.getParameter("a_shop_rdr_extn_qty"));
String a_hous_ufth_qty = Util.checkString(req.getParameter("a_hous_ufth_qty"));
String a_apt_ufth_qty = Util.checkString(req.getParameter("a_apt_ufth_qty"));
String a_shop_ufth_qty = Util.checkString(req.getParameter("a_shop_ufth_qty"));
String a_hous_fix_qty = Util.checkString(req.getParameter("a_hous_fix_qty"));
String a_apt_fix_qty = Util.checkString(req.getParameter("a_apt_fix_qty"));
String a_shop_fix_qty = Util.checkString(req.getParameter("a_shop_fix_qty"));
String b_hous_rdr_extn_qty = Util.checkString(req.getParameter("b_hous_rdr_extn_qty"));
String b_apt_rdr_extn_qty = Util.checkString(req.getParameter("b_apt_rdr_extn_qty"));
String b_shop_rdr_extn_qty = Util.checkString(req.getParameter("b_shop_rdr_extn_qty"));
String b_hous_ufth_qty = Util.checkString(req.getParameter("b_hous_ufth_qty"));
String b_apt_ufth_qty = Util.checkString(req.getParameter("b_apt_ufth_qty"));
String b_shop_ufth_qty = Util.checkString(req.getParameter("b_shop_ufth_qty"));
String b_hous_fix_qty = Util.checkString(req.getParameter("b_hous_fix_qty"));
String b_apt_fix_qty = Util.checkString(req.getParameter("b_apt_fix_qty"));
String b_shop_fix_qty = Util.checkString(req.getParameter("b_shop_fix_qty"));
String rdr_extn_alon = Util.checkString(req.getParameter("rdr_extn_alon"));
String leader_alon = Util.checkString(req.getParameter("leader_alon"));
String jungbuhonam_spc_acty_cost = Util.checkString(req.getParameter("jungbuhonam_spc_acty_cost"));
String mvin_team_spc_acty_cost = Util.checkString(req.getParameter("mvin_team_spc_acty_cost"));
String no_val_shrt_fee = Util.checkString(req.getParameter("no_val_shrt_fee"));
String rdr_extn_sctn_clsi_fee = Util.checkString(req.getParameter("rdr_extn_sctn_clsi_fee"));
String etc_alon_1 = Util.checkString(req.getParameter("etc_alon_1"));
String etc_alon_2 = Util.checkString(req.getParameter("etc_alon_2"));
String etc_alon_3 = Util.checkString(req.getParameter("etc_alon_3"));
String pre_pay_dduc = Util.checkString(req.getParameter("pre_pay_dduc"));
String etc_dduc_1 = Util.checkString(req.getParameter("etc_dduc_1"));
String etc_dduc_2 = Util.checkString(req.getParameter("etc_dduc_2"));
String etc_dduc_3 = Util.checkString(req.getParameter("etc_dduc_3"));
String stot_amt = Util.checkString(req.getParameter("stot_amt"));
String tax_amt_dduc = Util.checkString(req.getParameter("tax_amt_dduc"));
String res_tax_dduc = Util.checkString(req.getParameter("res_tax_dduc"));
String real_pay_amt = Util.checkString(req.getParameter("real_pay_amt"));
String wclam_subm_yn = Util.checkString(req.getParameter("wclam_subm_yn"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String setl_bank = Util.checkString(req.getParameter("setl_bank"));
String rcpm_main_nm = Util.checkString(req.getParameter("rcpm_main_nm"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String pay_plan_dt = Util.checkString(req.getParameter("pay_plan_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rdr_extn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extn_yymm")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String staf_no = Util.Uni2Ksc(Util.checkString(req.getParameter("staf_no")));
String staf_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("staf_nm")));
String acty_area = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_area")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String a_hous_rdr_extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_hous_rdr_extn_qty")));
String a_apt_rdr_extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_apt_rdr_extn_qty")));
String a_shop_rdr_extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_shop_rdr_extn_qty")));
String a_hous_ufth_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_hous_ufth_qty")));
String a_apt_ufth_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_apt_ufth_qty")));
String a_shop_ufth_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_shop_ufth_qty")));
String a_hous_fix_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_hous_fix_qty")));
String a_apt_fix_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_apt_fix_qty")));
String a_shop_fix_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("a_shop_fix_qty")));
String b_hous_rdr_extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_hous_rdr_extn_qty")));
String b_apt_rdr_extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_apt_rdr_extn_qty")));
String b_shop_rdr_extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_shop_rdr_extn_qty")));
String b_hous_ufth_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_hous_ufth_qty")));
String b_apt_ufth_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_apt_ufth_qty")));
String b_shop_ufth_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_shop_ufth_qty")));
String b_hous_fix_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_hous_fix_qty")));
String b_apt_fix_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_apt_fix_qty")));
String b_shop_fix_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("b_shop_fix_qty")));
String rdr_extn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extn_alon")));
String leader_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("leader_alon")));
String jungbuhonam_spc_acty_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("jungbuhonam_spc_acty_cost")));
String mvin_team_spc_acty_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("mvin_team_spc_acty_cost")));
String no_val_shrt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("no_val_shrt_fee")));
String rdr_extn_sctn_clsi_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extn_sctn_clsi_fee")));
String etc_alon_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_alon_1")));
String etc_alon_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_alon_2")));
String etc_alon_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_alon_3")));
String pre_pay_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_pay_dduc")));
String etc_dduc_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_1")));
String etc_dduc_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_2")));
String etc_dduc_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_dduc_3")));
String stot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("stot_amt")));
String tax_amt_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_amt_dduc")));
String res_tax_dduc = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax_dduc")));
String real_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("real_pay_amt")));
String wclam_subm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wclam_subm_yn")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String setl_bank = Util.Uni2Ksc(Util.checkString(req.getParameter("setl_bank")));
String rcpm_main_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_main_nm")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String pay_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plan_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRdr_extn_yymm(rdr_extn_yymm);
dm.setMode(mode);
dm.setSeq(seq);
dm.setStaf_no(staf_no);
dm.setStaf_nm(staf_nm);
dm.setActy_area(acty_area);
dm.setPrn(prn);
dm.setA_hous_rdr_extn_qty(a_hous_rdr_extn_qty);
dm.setA_apt_rdr_extn_qty(a_apt_rdr_extn_qty);
dm.setA_shop_rdr_extn_qty(a_shop_rdr_extn_qty);
dm.setA_hous_ufth_qty(a_hous_ufth_qty);
dm.setA_apt_ufth_qty(a_apt_ufth_qty);
dm.setA_shop_ufth_qty(a_shop_ufth_qty);
dm.setA_hous_fix_qty(a_hous_fix_qty);
dm.setA_apt_fix_qty(a_apt_fix_qty);
dm.setA_shop_fix_qty(a_shop_fix_qty);
dm.setB_hous_rdr_extn_qty(b_hous_rdr_extn_qty);
dm.setB_apt_rdr_extn_qty(b_apt_rdr_extn_qty);
dm.setB_shop_rdr_extn_qty(b_shop_rdr_extn_qty);
dm.setB_hous_ufth_qty(b_hous_ufth_qty);
dm.setB_apt_ufth_qty(b_apt_ufth_qty);
dm.setB_shop_ufth_qty(b_shop_ufth_qty);
dm.setB_hous_fix_qty(b_hous_fix_qty);
dm.setB_apt_fix_qty(b_apt_fix_qty);
dm.setB_shop_fix_qty(b_shop_fix_qty);
dm.setRdr_extn_alon(rdr_extn_alon);
dm.setLeader_alon(leader_alon);
dm.setJungbuhonam_spc_acty_cost(jungbuhonam_spc_acty_cost);
dm.setMvin_team_spc_acty_cost(mvin_team_spc_acty_cost);
dm.setNo_val_shrt_fee(no_val_shrt_fee);
dm.setRdr_extn_sctn_clsi_fee(rdr_extn_sctn_clsi_fee);
dm.setEtc_alon_1(etc_alon_1);
dm.setEtc_alon_2(etc_alon_2);
dm.setEtc_alon_3(etc_alon_3);
dm.setPre_pay_dduc(pre_pay_dduc);
dm.setEtc_dduc_1(etc_dduc_1);
dm.setEtc_dduc_2(etc_dduc_2);
dm.setEtc_dduc_3(etc_dduc_3);
dm.setStot_amt(stot_amt);
dm.setTax_amt_dduc(tax_amt_dduc);
dm.setRes_tax_dduc(res_tax_dduc);
dm.setReal_pay_amt(real_pay_amt);
dm.setWclam_subm_yn(wclam_subm_yn);
dm.setClos_yn(clos_yn);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setSetl_bank(setl_bank);
dm.setRcpm_main_nm(rcpm_main_nm);
dm.setAcct_no(acct_no);
dm.setPay_plan_dt(pay_plan_dt);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 30 18:27:10 KST 2012 */