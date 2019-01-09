/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6219_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String clsf_cd;
	public String md_rmk_26_e;
	public String md_rmk_26_f;
	public String md_rmk_26_g;
	public String md_rmk_26_h;
	public String md_rmk_26_i;
	public String md_rmk_26_j;
	public String me_bizcond_27;
	public String me_item_27;
	public String me_indt_27;
	public long me_amt_27;
	public String me_bizcond_28;
	public String me_item_28;
	public String me_indt_28;
	public long me_amt_28;
	public String me_bizcond_29;
	public String me_item_29;
	public String me_indt_29;
	public long me_amt_29;
	public String me_bizcond_30;
	public String me_item_30;
	public String me_indt_30;
	public long me_amt_30;
	public long me_amt_31;
	public String mf_tax_agnt_nm;
	public String mf_tax_agnt_ern;
	public String mf_tax_agnt_tel_no;
	public String ml_bizcond_78;
	public String ml_item_78;
	public String ml_indt_78;
	public long ml_amt_78;
	public String ml_bizcond_79;
	public String ml_item_79;
	public String ml_indt_79;
	public long ml_amt_79;
	public String ml_bizcond_80;
	public String ml_item_80;
	public String ml_indt_80;
	public long ml_amt_80;
	public long ml_amt_81;
	public long mm_amt_82;
	public long mm_amt_83;
	public String decl_dt;

	public FC_ACCT_6219_ADM(){}
	public FC_ACCT_6219_ADM(String flag, String incmg_pers, String incmg_pers_ipadd, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String clsf_cd, String md_rmk_26_e, String md_rmk_26_f, String md_rmk_26_g, String md_rmk_26_h, String md_rmk_26_i, String md_rmk_26_j, String me_bizcond_27, String me_item_27, String me_indt_27, long me_amt_27, String me_bizcond_28, String me_item_28, String me_indt_28, long me_amt_28, String me_bizcond_29, String me_item_29, String me_indt_29, long me_amt_29, String me_bizcond_30, String me_item_30, String me_indt_30, long me_amt_30, long me_amt_31, String mf_tax_agnt_nm, String mf_tax_agnt_ern, String mf_tax_agnt_tel_no, String ml_bizcond_78, String ml_item_78, String ml_indt_78, long ml_amt_78, String ml_bizcond_79, String ml_item_79, String ml_indt_79, long ml_amt_79, String ml_bizcond_80, String ml_item_80, String ml_indt_80, long ml_amt_80, long ml_amt_81, long mm_amt_82, long mm_amt_83, String decl_dt){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.clsf_cd = clsf_cd;
		this.md_rmk_26_e = md_rmk_26_e;
		this.md_rmk_26_f = md_rmk_26_f;
		this.md_rmk_26_g = md_rmk_26_g;
		this.md_rmk_26_h = md_rmk_26_h;
		this.md_rmk_26_i = md_rmk_26_i;
		this.md_rmk_26_j = md_rmk_26_j;
		this.me_bizcond_27 = me_bizcond_27;
		this.me_item_27 = me_item_27;
		this.me_indt_27 = me_indt_27;
		this.me_amt_27 = me_amt_27;
		this.me_bizcond_28 = me_bizcond_28;
		this.me_item_28 = me_item_28;
		this.me_indt_28 = me_indt_28;
		this.me_amt_28 = me_amt_28;
		this.me_bizcond_29 = me_bizcond_29;
		this.me_item_29 = me_item_29;
		this.me_indt_29 = me_indt_29;
		this.me_amt_29 = me_amt_29;
		this.me_bizcond_30 = me_bizcond_30;
		this.me_item_30 = me_item_30;
		this.me_indt_30 = me_indt_30;
		this.me_amt_30 = me_amt_30;
		this.me_amt_31 = me_amt_31;
		this.mf_tax_agnt_nm = mf_tax_agnt_nm;
		this.mf_tax_agnt_ern = mf_tax_agnt_ern;
		this.mf_tax_agnt_tel_no = mf_tax_agnt_tel_no;
		this.ml_bizcond_78 = ml_bizcond_78;
		this.ml_item_78 = ml_item_78;
		this.ml_indt_78 = ml_indt_78;
		this.ml_amt_78 = ml_amt_78;
		this.ml_bizcond_79 = ml_bizcond_79;
		this.ml_item_79 = ml_item_79;
		this.ml_indt_79 = ml_indt_79;
		this.ml_amt_79 = ml_amt_79;
		this.ml_bizcond_80 = ml_bizcond_80;
		this.ml_item_80 = ml_item_80;
		this.ml_indt_80 = ml_indt_80;
		this.ml_amt_80 = ml_amt_80;
		this.ml_amt_81 = ml_amt_81;
		this.mm_amt_82 = mm_amt_82;
		this.mm_amt_83 = mm_amt_83;
		this.decl_dt = decl_dt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setMd_rmk_26_e(String md_rmk_26_e){
		this.md_rmk_26_e = md_rmk_26_e;
	}

	public void setMd_rmk_26_f(String md_rmk_26_f){
		this.md_rmk_26_f = md_rmk_26_f;
	}

	public void setMd_rmk_26_g(String md_rmk_26_g){
		this.md_rmk_26_g = md_rmk_26_g;
	}

	public void setMd_rmk_26_h(String md_rmk_26_h){
		this.md_rmk_26_h = md_rmk_26_h;
	}

	public void setMd_rmk_26_i(String md_rmk_26_i){
		this.md_rmk_26_i = md_rmk_26_i;
	}

	public void setMd_rmk_26_j(String md_rmk_26_j){
		this.md_rmk_26_j = md_rmk_26_j;
	}

	public void setMe_bizcond_27(String me_bizcond_27){
		this.me_bizcond_27 = me_bizcond_27;
	}

	public void setMe_item_27(String me_item_27){
		this.me_item_27 = me_item_27;
	}

	public void setMe_indt_27(String me_indt_27){
		this.me_indt_27 = me_indt_27;
	}

	public void setMe_amt_27(long me_amt_27){
		this.me_amt_27 = me_amt_27;
	}

	public void setMe_bizcond_28(String me_bizcond_28){
		this.me_bizcond_28 = me_bizcond_28;
	}

	public void setMe_item_28(String me_item_28){
		this.me_item_28 = me_item_28;
	}

	public void setMe_indt_28(String me_indt_28){
		this.me_indt_28 = me_indt_28;
	}

	public void setMe_amt_28(long me_amt_28){
		this.me_amt_28 = me_amt_28;
	}

	public void setMe_bizcond_29(String me_bizcond_29){
		this.me_bizcond_29 = me_bizcond_29;
	}

	public void setMe_item_29(String me_item_29){
		this.me_item_29 = me_item_29;
	}

	public void setMe_indt_29(String me_indt_29){
		this.me_indt_29 = me_indt_29;
	}

	public void setMe_amt_29(long me_amt_29){
		this.me_amt_29 = me_amt_29;
	}

	public void setMe_bizcond_30(String me_bizcond_30){
		this.me_bizcond_30 = me_bizcond_30;
	}

	public void setMe_item_30(String me_item_30){
		this.me_item_30 = me_item_30;
	}

	public void setMe_indt_30(String me_indt_30){
		this.me_indt_30 = me_indt_30;
	}

	public void setMe_amt_30(long me_amt_30){
		this.me_amt_30 = me_amt_30;
	}

	public void setMe_amt_31(long me_amt_31){
		this.me_amt_31 = me_amt_31;
	}

	public void setMf_tax_agnt_nm(String mf_tax_agnt_nm){
		this.mf_tax_agnt_nm = mf_tax_agnt_nm;
	}

	public void setMf_tax_agnt_ern(String mf_tax_agnt_ern){
		this.mf_tax_agnt_ern = mf_tax_agnt_ern;
	}

	public void setMf_tax_agnt_tel_no(String mf_tax_agnt_tel_no){
		this.mf_tax_agnt_tel_no = mf_tax_agnt_tel_no;
	}

	public void setMl_bizcond_78(String ml_bizcond_78){
		this.ml_bizcond_78 = ml_bizcond_78;
	}

	public void setMl_item_78(String ml_item_78){
		this.ml_item_78 = ml_item_78;
	}

	public void setMl_indt_78(String ml_indt_78){
		this.ml_indt_78 = ml_indt_78;
	}

	public void setMl_amt_78(long ml_amt_78){
		this.ml_amt_78 = ml_amt_78;
	}

	public void setMl_bizcond_79(String ml_bizcond_79){
		this.ml_bizcond_79 = ml_bizcond_79;
	}

	public void setMl_item_79(String ml_item_79){
		this.ml_item_79 = ml_item_79;
	}

	public void setMl_indt_79(String ml_indt_79){
		this.ml_indt_79 = ml_indt_79;
	}

	public void setMl_amt_79(long ml_amt_79){
		this.ml_amt_79 = ml_amt_79;
	}

	public void setMl_bizcond_80(String ml_bizcond_80){
		this.ml_bizcond_80 = ml_bizcond_80;
	}

	public void setMl_item_80(String ml_item_80){
		this.ml_item_80 = ml_item_80;
	}

	public void setMl_indt_80(String ml_indt_80){
		this.ml_indt_80 = ml_indt_80;
	}

	public void setMl_amt_80(long ml_amt_80){
		this.ml_amt_80 = ml_amt_80;
	}

	public void setMl_amt_81(long ml_amt_81){
		this.ml_amt_81 = ml_amt_81;
	}

	public void setMm_amt_82(long mm_amt_82){
		this.mm_amt_82 = mm_amt_82;
	}

	public void setMm_amt_83(long mm_amt_83){
		this.mm_amt_83 = mm_amt_83;
	}

	public void setDecl_dt(String decl_dt){
		this.decl_dt = decl_dt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getMd_rmk_26_e(){
		return this.md_rmk_26_e;
	}

	public String getMd_rmk_26_f(){
		return this.md_rmk_26_f;
	}

	public String getMd_rmk_26_g(){
		return this.md_rmk_26_g;
	}

	public String getMd_rmk_26_h(){
		return this.md_rmk_26_h;
	}

	public String getMd_rmk_26_i(){
		return this.md_rmk_26_i;
	}

	public String getMd_rmk_26_j(){
		return this.md_rmk_26_j;
	}

	public String getMe_bizcond_27(){
		return this.me_bizcond_27;
	}

	public String getMe_item_27(){
		return this.me_item_27;
	}

	public String getMe_indt_27(){
		return this.me_indt_27;
	}

	public long getMe_amt_27(){
		return this.me_amt_27;
	}

	public String getMe_bizcond_28(){
		return this.me_bizcond_28;
	}

	public String getMe_item_28(){
		return this.me_item_28;
	}

	public String getMe_indt_28(){
		return this.me_indt_28;
	}

	public long getMe_amt_28(){
		return this.me_amt_28;
	}

	public String getMe_bizcond_29(){
		return this.me_bizcond_29;
	}

	public String getMe_item_29(){
		return this.me_item_29;
	}

	public String getMe_indt_29(){
		return this.me_indt_29;
	}

	public long getMe_amt_29(){
		return this.me_amt_29;
	}

	public String getMe_bizcond_30(){
		return this.me_bizcond_30;
	}

	public String getMe_item_30(){
		return this.me_item_30;
	}

	public String getMe_indt_30(){
		return this.me_indt_30;
	}

	public long getMe_amt_30(){
		return this.me_amt_30;
	}

	public long getMe_amt_31(){
		return this.me_amt_31;
	}

	public String getMf_tax_agnt_nm(){
		return this.mf_tax_agnt_nm;
	}

	public String getMf_tax_agnt_ern(){
		return this.mf_tax_agnt_ern;
	}

	public String getMf_tax_agnt_tel_no(){
		return this.mf_tax_agnt_tel_no;
	}

	public String getMl_bizcond_78(){
		return this.ml_bizcond_78;
	}

	public String getMl_item_78(){
		return this.ml_item_78;
	}

	public String getMl_indt_78(){
		return this.ml_indt_78;
	}

	public long getMl_amt_78(){
		return this.ml_amt_78;
	}

	public String getMl_bizcond_79(){
		return this.ml_bizcond_79;
	}

	public String getMl_item_79(){
		return this.ml_item_79;
	}

	public String getMl_indt_79(){
		return this.ml_indt_79;
	}

	public long getMl_amt_79(){
		return this.ml_amt_79;
	}

	public String getMl_bizcond_80(){
		return this.ml_bizcond_80;
	}

	public String getMl_item_80(){
		return this.ml_item_80;
	}

	public String getMl_indt_80(){
		return this.ml_indt_80;
	}

	public long getMl_amt_80(){
		return this.ml_amt_80;
	}

	public long getMl_amt_81(){
		return this.ml_amt_81;
	}

	public long getMm_amt_82(){
		return this.mm_amt_82;
	}

	public long getMm_amt_83(){
		return this.mm_amt_83;
	}

	public String getDecl_dt(){
		return this.decl_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6219_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6219_ADM dm = (FC_ACCT_6219_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.erplace_cd);
		cstmt.setString(8, dm.vat_fr_yymm);
		cstmt.setString(9, dm.vat_to_yymm);
		cstmt.setString(10, dm.clsf_cd);
		cstmt.setString(11, dm.md_rmk_26_e);
		cstmt.setString(12, dm.md_rmk_26_f);
		cstmt.setString(13, dm.md_rmk_26_g);
		cstmt.setString(14, dm.md_rmk_26_h);
		cstmt.setString(15, dm.md_rmk_26_i);
		cstmt.setString(16, dm.md_rmk_26_j);
		cstmt.setString(17, dm.me_bizcond_27);
		cstmt.setString(18, dm.me_item_27);
		cstmt.setString(19, dm.me_indt_27);
		cstmt.setLong(20, dm.me_amt_27);
		cstmt.setString(21, dm.me_bizcond_28);
		cstmt.setString(22, dm.me_item_28);
		cstmt.setString(23, dm.me_indt_28);
		cstmt.setLong(24, dm.me_amt_28);
		cstmt.setString(25, dm.me_bizcond_29);
		cstmt.setString(26, dm.me_item_29);
		cstmt.setString(27, dm.me_indt_29);
		cstmt.setLong(28, dm.me_amt_29);
		cstmt.setString(29, dm.me_bizcond_30);
		cstmt.setString(30, dm.me_item_30);
		cstmt.setString(31, dm.me_indt_30);
		cstmt.setLong(32, dm.me_amt_30);
		cstmt.setLong(33, dm.me_amt_31);
		cstmt.setString(34, dm.mf_tax_agnt_nm);
		cstmt.setString(35, dm.mf_tax_agnt_ern);
		cstmt.setString(36, dm.mf_tax_agnt_tel_no);
		cstmt.setString(37, dm.ml_bizcond_78);
		cstmt.setString(38, dm.ml_item_78);
		cstmt.setString(39, dm.ml_indt_78);
		cstmt.setLong(40, dm.ml_amt_78);
		cstmt.setString(41, dm.ml_bizcond_79);
		cstmt.setString(42, dm.ml_item_79);
		cstmt.setString(43, dm.ml_indt_79);
		cstmt.setLong(44, dm.ml_amt_79);
		cstmt.setString(45, dm.ml_bizcond_80);
		cstmt.setString(46, dm.ml_item_80);
		cstmt.setString(47, dm.ml_indt_80);
		cstmt.setLong(48, dm.ml_amt_80);
		cstmt.setLong(49, dm.ml_amt_81);
		cstmt.setLong(50, dm.mm_amt_82);
		cstmt.setLong(51, dm.mm_amt_83);
		cstmt.setString(52, dm.decl_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6219_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("md_rmk_26_e = [" + getMd_rmk_26_e() + "]");
		System.out.println("md_rmk_26_f = [" + getMd_rmk_26_f() + "]");
		System.out.println("md_rmk_26_g = [" + getMd_rmk_26_g() + "]");
		System.out.println("md_rmk_26_h = [" + getMd_rmk_26_h() + "]");
		System.out.println("md_rmk_26_i = [" + getMd_rmk_26_i() + "]");
		System.out.println("md_rmk_26_j = [" + getMd_rmk_26_j() + "]");
		System.out.println("me_bizcond_27 = [" + getMe_bizcond_27() + "]");
		System.out.println("me_item_27 = [" + getMe_item_27() + "]");
		System.out.println("me_indt_27 = [" + getMe_indt_27() + "]");
		System.out.println("me_amt_27 = [" + getMe_amt_27() + "]");
		System.out.println("me_bizcond_28 = [" + getMe_bizcond_28() + "]");
		System.out.println("me_item_28 = [" + getMe_item_28() + "]");
		System.out.println("me_indt_28 = [" + getMe_indt_28() + "]");
		System.out.println("me_amt_28 = [" + getMe_amt_28() + "]");
		System.out.println("me_bizcond_29 = [" + getMe_bizcond_29() + "]");
		System.out.println("me_item_29 = [" + getMe_item_29() + "]");
		System.out.println("me_indt_29 = [" + getMe_indt_29() + "]");
		System.out.println("me_amt_29 = [" + getMe_amt_29() + "]");
		System.out.println("me_bizcond_30 = [" + getMe_bizcond_30() + "]");
		System.out.println("me_item_30 = [" + getMe_item_30() + "]");
		System.out.println("me_indt_30 = [" + getMe_indt_30() + "]");
		System.out.println("me_amt_30 = [" + getMe_amt_30() + "]");
		System.out.println("me_amt_31 = [" + getMe_amt_31() + "]");
		System.out.println("mf_tax_agnt_nm = [" + getMf_tax_agnt_nm() + "]");
		System.out.println("mf_tax_agnt_ern = [" + getMf_tax_agnt_ern() + "]");
		System.out.println("mf_tax_agnt_tel_no = [" + getMf_tax_agnt_tel_no() + "]");
		System.out.println("ml_bizcond_78 = [" + getMl_bizcond_78() + "]");
		System.out.println("ml_item_78 = [" + getMl_item_78() + "]");
		System.out.println("ml_indt_78 = [" + getMl_indt_78() + "]");
		System.out.println("ml_amt_78 = [" + getMl_amt_78() + "]");
		System.out.println("ml_bizcond_79 = [" + getMl_bizcond_79() + "]");
		System.out.println("ml_item_79 = [" + getMl_item_79() + "]");
		System.out.println("ml_indt_79 = [" + getMl_indt_79() + "]");
		System.out.println("ml_amt_79 = [" + getMl_amt_79() + "]");
		System.out.println("ml_bizcond_80 = [" + getMl_bizcond_80() + "]");
		System.out.println("ml_item_80 = [" + getMl_item_80() + "]");
		System.out.println("ml_indt_80 = [" + getMl_indt_80() + "]");
		System.out.println("ml_amt_80 = [" + getMl_amt_80() + "]");
		System.out.println("ml_amt_81 = [" + getMl_amt_81() + "]");
		System.out.println("mm_amt_82 = [" + getMm_amt_82() + "]");
		System.out.println("mm_amt_83 = [" + getMm_amt_83() + "]");
		System.out.println("decl_dt = [" + getDecl_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String md_rmk_26_e = req.getParameter("md_rmk_26_e");
if( md_rmk_26_e == null){
	System.out.println(this.toString+" : md_rmk_26_e is null" );
}else{
	System.out.println(this.toString+" : md_rmk_26_e is "+md_rmk_26_e );
}
String md_rmk_26_f = req.getParameter("md_rmk_26_f");
if( md_rmk_26_f == null){
	System.out.println(this.toString+" : md_rmk_26_f is null" );
}else{
	System.out.println(this.toString+" : md_rmk_26_f is "+md_rmk_26_f );
}
String md_rmk_26_g = req.getParameter("md_rmk_26_g");
if( md_rmk_26_g == null){
	System.out.println(this.toString+" : md_rmk_26_g is null" );
}else{
	System.out.println(this.toString+" : md_rmk_26_g is "+md_rmk_26_g );
}
String md_rmk_26_h = req.getParameter("md_rmk_26_h");
if( md_rmk_26_h == null){
	System.out.println(this.toString+" : md_rmk_26_h is null" );
}else{
	System.out.println(this.toString+" : md_rmk_26_h is "+md_rmk_26_h );
}
String md_rmk_26_i = req.getParameter("md_rmk_26_i");
if( md_rmk_26_i == null){
	System.out.println(this.toString+" : md_rmk_26_i is null" );
}else{
	System.out.println(this.toString+" : md_rmk_26_i is "+md_rmk_26_i );
}
String md_rmk_26_j = req.getParameter("md_rmk_26_j");
if( md_rmk_26_j == null){
	System.out.println(this.toString+" : md_rmk_26_j is null" );
}else{
	System.out.println(this.toString+" : md_rmk_26_j is "+md_rmk_26_j );
}
String me_bizcond_27 = req.getParameter("me_bizcond_27");
if( me_bizcond_27 == null){
	System.out.println(this.toString+" : me_bizcond_27 is null" );
}else{
	System.out.println(this.toString+" : me_bizcond_27 is "+me_bizcond_27 );
}
String me_item_27 = req.getParameter("me_item_27");
if( me_item_27 == null){
	System.out.println(this.toString+" : me_item_27 is null" );
}else{
	System.out.println(this.toString+" : me_item_27 is "+me_item_27 );
}
String me_indt_27 = req.getParameter("me_indt_27");
if( me_indt_27 == null){
	System.out.println(this.toString+" : me_indt_27 is null" );
}else{
	System.out.println(this.toString+" : me_indt_27 is "+me_indt_27 );
}
String me_amt_27 = req.getParameter("me_amt_27");
if( me_amt_27 == null){
	System.out.println(this.toString+" : me_amt_27 is null" );
}else{
	System.out.println(this.toString+" : me_amt_27 is "+me_amt_27 );
}
String me_bizcond_28 = req.getParameter("me_bizcond_28");
if( me_bizcond_28 == null){
	System.out.println(this.toString+" : me_bizcond_28 is null" );
}else{
	System.out.println(this.toString+" : me_bizcond_28 is "+me_bizcond_28 );
}
String me_item_28 = req.getParameter("me_item_28");
if( me_item_28 == null){
	System.out.println(this.toString+" : me_item_28 is null" );
}else{
	System.out.println(this.toString+" : me_item_28 is "+me_item_28 );
}
String me_indt_28 = req.getParameter("me_indt_28");
if( me_indt_28 == null){
	System.out.println(this.toString+" : me_indt_28 is null" );
}else{
	System.out.println(this.toString+" : me_indt_28 is "+me_indt_28 );
}
String me_amt_28 = req.getParameter("me_amt_28");
if( me_amt_28 == null){
	System.out.println(this.toString+" : me_amt_28 is null" );
}else{
	System.out.println(this.toString+" : me_amt_28 is "+me_amt_28 );
}
String me_bizcond_29 = req.getParameter("me_bizcond_29");
if( me_bizcond_29 == null){
	System.out.println(this.toString+" : me_bizcond_29 is null" );
}else{
	System.out.println(this.toString+" : me_bizcond_29 is "+me_bizcond_29 );
}
String me_item_29 = req.getParameter("me_item_29");
if( me_item_29 == null){
	System.out.println(this.toString+" : me_item_29 is null" );
}else{
	System.out.println(this.toString+" : me_item_29 is "+me_item_29 );
}
String me_indt_29 = req.getParameter("me_indt_29");
if( me_indt_29 == null){
	System.out.println(this.toString+" : me_indt_29 is null" );
}else{
	System.out.println(this.toString+" : me_indt_29 is "+me_indt_29 );
}
String me_amt_29 = req.getParameter("me_amt_29");
if( me_amt_29 == null){
	System.out.println(this.toString+" : me_amt_29 is null" );
}else{
	System.out.println(this.toString+" : me_amt_29 is "+me_amt_29 );
}
String me_bizcond_30 = req.getParameter("me_bizcond_30");
if( me_bizcond_30 == null){
	System.out.println(this.toString+" : me_bizcond_30 is null" );
}else{
	System.out.println(this.toString+" : me_bizcond_30 is "+me_bizcond_30 );
}
String me_item_30 = req.getParameter("me_item_30");
if( me_item_30 == null){
	System.out.println(this.toString+" : me_item_30 is null" );
}else{
	System.out.println(this.toString+" : me_item_30 is "+me_item_30 );
}
String me_indt_30 = req.getParameter("me_indt_30");
if( me_indt_30 == null){
	System.out.println(this.toString+" : me_indt_30 is null" );
}else{
	System.out.println(this.toString+" : me_indt_30 is "+me_indt_30 );
}
String me_amt_30 = req.getParameter("me_amt_30");
if( me_amt_30 == null){
	System.out.println(this.toString+" : me_amt_30 is null" );
}else{
	System.out.println(this.toString+" : me_amt_30 is "+me_amt_30 );
}
String me_amt_31 = req.getParameter("me_amt_31");
if( me_amt_31 == null){
	System.out.println(this.toString+" : me_amt_31 is null" );
}else{
	System.out.println(this.toString+" : me_amt_31 is "+me_amt_31 );
}
String mf_tax_agnt_nm = req.getParameter("mf_tax_agnt_nm");
if( mf_tax_agnt_nm == null){
	System.out.println(this.toString+" : mf_tax_agnt_nm is null" );
}else{
	System.out.println(this.toString+" : mf_tax_agnt_nm is "+mf_tax_agnt_nm );
}
String mf_tax_agnt_ern = req.getParameter("mf_tax_agnt_ern");
if( mf_tax_agnt_ern == null){
	System.out.println(this.toString+" : mf_tax_agnt_ern is null" );
}else{
	System.out.println(this.toString+" : mf_tax_agnt_ern is "+mf_tax_agnt_ern );
}
String mf_tax_agnt_tel_no = req.getParameter("mf_tax_agnt_tel_no");
if( mf_tax_agnt_tel_no == null){
	System.out.println(this.toString+" : mf_tax_agnt_tel_no is null" );
}else{
	System.out.println(this.toString+" : mf_tax_agnt_tel_no is "+mf_tax_agnt_tel_no );
}
String ml_bizcond_78 = req.getParameter("ml_bizcond_78");
if( ml_bizcond_78 == null){
	System.out.println(this.toString+" : ml_bizcond_78 is null" );
}else{
	System.out.println(this.toString+" : ml_bizcond_78 is "+ml_bizcond_78 );
}
String ml_item_78 = req.getParameter("ml_item_78");
if( ml_item_78 == null){
	System.out.println(this.toString+" : ml_item_78 is null" );
}else{
	System.out.println(this.toString+" : ml_item_78 is "+ml_item_78 );
}
String ml_indt_78 = req.getParameter("ml_indt_78");
if( ml_indt_78 == null){
	System.out.println(this.toString+" : ml_indt_78 is null" );
}else{
	System.out.println(this.toString+" : ml_indt_78 is "+ml_indt_78 );
}
String ml_amt_78 = req.getParameter("ml_amt_78");
if( ml_amt_78 == null){
	System.out.println(this.toString+" : ml_amt_78 is null" );
}else{
	System.out.println(this.toString+" : ml_amt_78 is "+ml_amt_78 );
}
String ml_bizcond_79 = req.getParameter("ml_bizcond_79");
if( ml_bizcond_79 == null){
	System.out.println(this.toString+" : ml_bizcond_79 is null" );
}else{
	System.out.println(this.toString+" : ml_bizcond_79 is "+ml_bizcond_79 );
}
String ml_item_79 = req.getParameter("ml_item_79");
if( ml_item_79 == null){
	System.out.println(this.toString+" : ml_item_79 is null" );
}else{
	System.out.println(this.toString+" : ml_item_79 is "+ml_item_79 );
}
String ml_indt_79 = req.getParameter("ml_indt_79");
if( ml_indt_79 == null){
	System.out.println(this.toString+" : ml_indt_79 is null" );
}else{
	System.out.println(this.toString+" : ml_indt_79 is "+ml_indt_79 );
}
String ml_amt_79 = req.getParameter("ml_amt_79");
if( ml_amt_79 == null){
	System.out.println(this.toString+" : ml_amt_79 is null" );
}else{
	System.out.println(this.toString+" : ml_amt_79 is "+ml_amt_79 );
}
String ml_bizcond_80 = req.getParameter("ml_bizcond_80");
if( ml_bizcond_80 == null){
	System.out.println(this.toString+" : ml_bizcond_80 is null" );
}else{
	System.out.println(this.toString+" : ml_bizcond_80 is "+ml_bizcond_80 );
}
String ml_item_80 = req.getParameter("ml_item_80");
if( ml_item_80 == null){
	System.out.println(this.toString+" : ml_item_80 is null" );
}else{
	System.out.println(this.toString+" : ml_item_80 is "+ml_item_80 );
}
String ml_indt_80 = req.getParameter("ml_indt_80");
if( ml_indt_80 == null){
	System.out.println(this.toString+" : ml_indt_80 is null" );
}else{
	System.out.println(this.toString+" : ml_indt_80 is "+ml_indt_80 );
}
String ml_amt_80 = req.getParameter("ml_amt_80");
if( ml_amt_80 == null){
	System.out.println(this.toString+" : ml_amt_80 is null" );
}else{
	System.out.println(this.toString+" : ml_amt_80 is "+ml_amt_80 );
}
String ml_amt_81 = req.getParameter("ml_amt_81");
if( ml_amt_81 == null){
	System.out.println(this.toString+" : ml_amt_81 is null" );
}else{
	System.out.println(this.toString+" : ml_amt_81 is "+ml_amt_81 );
}
String mm_amt_82 = req.getParameter("mm_amt_82");
if( mm_amt_82 == null){
	System.out.println(this.toString+" : mm_amt_82 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_82 is "+mm_amt_82 );
}
String mm_amt_83 = req.getParameter("mm_amt_83");
if( mm_amt_83 == null){
	System.out.println(this.toString+" : mm_amt_83 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_83 is "+mm_amt_83 );
}
String decl_dt = req.getParameter("decl_dt");
if( decl_dt == null){
	System.out.println(this.toString+" : decl_dt is null" );
}else{
	System.out.println(this.toString+" : decl_dt is "+decl_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String md_rmk_26_e = Util.checkString(req.getParameter("md_rmk_26_e"));
String md_rmk_26_f = Util.checkString(req.getParameter("md_rmk_26_f"));
String md_rmk_26_g = Util.checkString(req.getParameter("md_rmk_26_g"));
String md_rmk_26_h = Util.checkString(req.getParameter("md_rmk_26_h"));
String md_rmk_26_i = Util.checkString(req.getParameter("md_rmk_26_i"));
String md_rmk_26_j = Util.checkString(req.getParameter("md_rmk_26_j"));
String me_bizcond_27 = Util.checkString(req.getParameter("me_bizcond_27"));
String me_item_27 = Util.checkString(req.getParameter("me_item_27"));
String me_indt_27 = Util.checkString(req.getParameter("me_indt_27"));
String me_amt_27 = Util.checkString(req.getParameter("me_amt_27"));
String me_bizcond_28 = Util.checkString(req.getParameter("me_bizcond_28"));
String me_item_28 = Util.checkString(req.getParameter("me_item_28"));
String me_indt_28 = Util.checkString(req.getParameter("me_indt_28"));
String me_amt_28 = Util.checkString(req.getParameter("me_amt_28"));
String me_bizcond_29 = Util.checkString(req.getParameter("me_bizcond_29"));
String me_item_29 = Util.checkString(req.getParameter("me_item_29"));
String me_indt_29 = Util.checkString(req.getParameter("me_indt_29"));
String me_amt_29 = Util.checkString(req.getParameter("me_amt_29"));
String me_bizcond_30 = Util.checkString(req.getParameter("me_bizcond_30"));
String me_item_30 = Util.checkString(req.getParameter("me_item_30"));
String me_indt_30 = Util.checkString(req.getParameter("me_indt_30"));
String me_amt_30 = Util.checkString(req.getParameter("me_amt_30"));
String me_amt_31 = Util.checkString(req.getParameter("me_amt_31"));
String mf_tax_agnt_nm = Util.checkString(req.getParameter("mf_tax_agnt_nm"));
String mf_tax_agnt_ern = Util.checkString(req.getParameter("mf_tax_agnt_ern"));
String mf_tax_agnt_tel_no = Util.checkString(req.getParameter("mf_tax_agnt_tel_no"));
String ml_bizcond_78 = Util.checkString(req.getParameter("ml_bizcond_78"));
String ml_item_78 = Util.checkString(req.getParameter("ml_item_78"));
String ml_indt_78 = Util.checkString(req.getParameter("ml_indt_78"));
String ml_amt_78 = Util.checkString(req.getParameter("ml_amt_78"));
String ml_bizcond_79 = Util.checkString(req.getParameter("ml_bizcond_79"));
String ml_item_79 = Util.checkString(req.getParameter("ml_item_79"));
String ml_indt_79 = Util.checkString(req.getParameter("ml_indt_79"));
String ml_amt_79 = Util.checkString(req.getParameter("ml_amt_79"));
String ml_bizcond_80 = Util.checkString(req.getParameter("ml_bizcond_80"));
String ml_item_80 = Util.checkString(req.getParameter("ml_item_80"));
String ml_indt_80 = Util.checkString(req.getParameter("ml_indt_80"));
String ml_amt_80 = Util.checkString(req.getParameter("ml_amt_80"));
String ml_amt_81 = Util.checkString(req.getParameter("ml_amt_81"));
String mm_amt_82 = Util.checkString(req.getParameter("mm_amt_82"));
String mm_amt_83 = Util.checkString(req.getParameter("mm_amt_83"));
String decl_dt = Util.checkString(req.getParameter("decl_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String md_rmk_26_e = Util.Uni2Ksc(Util.checkString(req.getParameter("md_rmk_26_e")));
String md_rmk_26_f = Util.Uni2Ksc(Util.checkString(req.getParameter("md_rmk_26_f")));
String md_rmk_26_g = Util.Uni2Ksc(Util.checkString(req.getParameter("md_rmk_26_g")));
String md_rmk_26_h = Util.Uni2Ksc(Util.checkString(req.getParameter("md_rmk_26_h")));
String md_rmk_26_i = Util.Uni2Ksc(Util.checkString(req.getParameter("md_rmk_26_i")));
String md_rmk_26_j = Util.Uni2Ksc(Util.checkString(req.getParameter("md_rmk_26_j")));
String me_bizcond_27 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_bizcond_27")));
String me_item_27 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_item_27")));
String me_indt_27 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_indt_27")));
String me_amt_27 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_amt_27")));
String me_bizcond_28 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_bizcond_28")));
String me_item_28 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_item_28")));
String me_indt_28 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_indt_28")));
String me_amt_28 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_amt_28")));
String me_bizcond_29 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_bizcond_29")));
String me_item_29 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_item_29")));
String me_indt_29 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_indt_29")));
String me_amt_29 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_amt_29")));
String me_bizcond_30 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_bizcond_30")));
String me_item_30 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_item_30")));
String me_indt_30 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_indt_30")));
String me_amt_30 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_amt_30")));
String me_amt_31 = Util.Uni2Ksc(Util.checkString(req.getParameter("me_amt_31")));
String mf_tax_agnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mf_tax_agnt_nm")));
String mf_tax_agnt_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("mf_tax_agnt_ern")));
String mf_tax_agnt_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mf_tax_agnt_tel_no")));
String ml_bizcond_78 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_bizcond_78")));
String ml_item_78 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_item_78")));
String ml_indt_78 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_indt_78")));
String ml_amt_78 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_amt_78")));
String ml_bizcond_79 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_bizcond_79")));
String ml_item_79 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_item_79")));
String ml_indt_79 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_indt_79")));
String ml_amt_79 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_amt_79")));
String ml_bizcond_80 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_bizcond_80")));
String ml_item_80 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_item_80")));
String ml_indt_80 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_indt_80")));
String ml_amt_80 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_amt_80")));
String ml_amt_81 = Util.Uni2Ksc(Util.checkString(req.getParameter("ml_amt_81")));
String mm_amt_82 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_82")));
String mm_amt_83 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_83")));
String decl_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("decl_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setClsf_cd(clsf_cd);
dm.setMd_rmk_26_e(md_rmk_26_e);
dm.setMd_rmk_26_f(md_rmk_26_f);
dm.setMd_rmk_26_g(md_rmk_26_g);
dm.setMd_rmk_26_h(md_rmk_26_h);
dm.setMd_rmk_26_i(md_rmk_26_i);
dm.setMd_rmk_26_j(md_rmk_26_j);
dm.setMe_bizcond_27(me_bizcond_27);
dm.setMe_item_27(me_item_27);
dm.setMe_indt_27(me_indt_27);
dm.setMe_amt_27(me_amt_27);
dm.setMe_bizcond_28(me_bizcond_28);
dm.setMe_item_28(me_item_28);
dm.setMe_indt_28(me_indt_28);
dm.setMe_amt_28(me_amt_28);
dm.setMe_bizcond_29(me_bizcond_29);
dm.setMe_item_29(me_item_29);
dm.setMe_indt_29(me_indt_29);
dm.setMe_amt_29(me_amt_29);
dm.setMe_bizcond_30(me_bizcond_30);
dm.setMe_item_30(me_item_30);
dm.setMe_indt_30(me_indt_30);
dm.setMe_amt_30(me_amt_30);
dm.setMe_amt_31(me_amt_31);
dm.setMf_tax_agnt_nm(mf_tax_agnt_nm);
dm.setMf_tax_agnt_ern(mf_tax_agnt_ern);
dm.setMf_tax_agnt_tel_no(mf_tax_agnt_tel_no);
dm.setMl_bizcond_78(ml_bizcond_78);
dm.setMl_item_78(ml_item_78);
dm.setMl_indt_78(ml_indt_78);
dm.setMl_amt_78(ml_amt_78);
dm.setMl_bizcond_79(ml_bizcond_79);
dm.setMl_item_79(ml_item_79);
dm.setMl_indt_79(ml_indt_79);
dm.setMl_amt_79(ml_amt_79);
dm.setMl_bizcond_80(ml_bizcond_80);
dm.setMl_item_80(ml_item_80);
dm.setMl_indt_80(ml_indt_80);
dm.setMl_amt_80(ml_amt_80);
dm.setMl_amt_81(ml_amt_81);
dm.setMm_amt_82(mm_amt_82);
dm.setMm_amt_83(mm_amt_83);
dm.setDecl_dt(decl_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 18:39:16 KST 2015 */