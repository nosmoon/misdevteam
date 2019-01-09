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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_1021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_type_cd;
	public String budg_cd;
	public String budg_cdnm;
	public String ycbrnm1;
	public String ycbrnm2;
	public String ycbrnm3;
	public String ycbrnm4;
	public String budg_clas_cd;
	public String cyov_yn;
	public String lesd_yn;
	public String advc_cndt_yn;
	public String fixfee_yn;
	public String posbfee_yn;
	public String limt_chk_yn;
	public String medi_dstb_cd;
	public String whco_comn_cost_yn;
	public String whco_ndstb_cd;
	public String dstb_acct_cd;
	public String via_dept_cd;
	public String drcr_bal_clsf;
	public String use_bgn_dt;
	public String use_end_dt;
	public String item_01;
	public String item_02;
	public String item_03;
	public String item_04;
	public String item_05;
	public String item_06;
	public String item_07;
	public String item_08;
	public String item_09;
	public String item_10;
	public String item_11;
	public String item_12;
	public String item_13;
	public String item_14;
	public String item_15;
	public String item_16;
	public String item_17;
	public String item_18;
	public String item_19;
	public String item_20;
	public String item_21;
	public String item_22;
	public String item_23;
	public String item_24;
	public String item_25;
	public String item_26;
	public String item_27;
	public String item_28;
	public String item_29;
	public String item_30;
	public String item_31;
	public String item_32;
	public String item_33;
	public String item_34;
	public String item_35;
	public String item_36;

	public MC_BUDG_1021_LCURLISTRecord(){}

	public void setBudg_type_cd(String budg_type_cd){
		this.budg_type_cd = budg_type_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setYcbrnm1(String ycbrnm1){
		this.ycbrnm1 = ycbrnm1;
	}

	public void setYcbrnm2(String ycbrnm2){
		this.ycbrnm2 = ycbrnm2;
	}

	public void setYcbrnm3(String ycbrnm3){
		this.ycbrnm3 = ycbrnm3;
	}

	public void setYcbrnm4(String ycbrnm4){
		this.ycbrnm4 = ycbrnm4;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setCyov_yn(String cyov_yn){
		this.cyov_yn = cyov_yn;
	}

	public void setLesd_yn(String lesd_yn){
		this.lesd_yn = lesd_yn;
	}

	public void setAdvc_cndt_yn(String advc_cndt_yn){
		this.advc_cndt_yn = advc_cndt_yn;
	}

	public void setFixfee_yn(String fixfee_yn){
		this.fixfee_yn = fixfee_yn;
	}

	public void setPosbfee_yn(String posbfee_yn){
		this.posbfee_yn = posbfee_yn;
	}

	public void setLimt_chk_yn(String limt_chk_yn){
		this.limt_chk_yn = limt_chk_yn;
	}

	public void setMedi_dstb_cd(String medi_dstb_cd){
		this.medi_dstb_cd = medi_dstb_cd;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setDstb_acct_cd(String dstb_acct_cd){
		this.dstb_acct_cd = dstb_acct_cd;
	}

	public void setVia_dept_cd(String via_dept_cd){
		this.via_dept_cd = via_dept_cd;
	}

	public void setDrcr_bal_clsf(String drcr_bal_clsf){
		this.drcr_bal_clsf = drcr_bal_clsf;
	}

	public void setUse_bgn_dt(String use_bgn_dt){
		this.use_bgn_dt = use_bgn_dt;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public void setItem_01(String item_01){
		this.item_01 = item_01;
	}

	public void setItem_02(String item_02){
		this.item_02 = item_02;
	}

	public void setItem_03(String item_03){
		this.item_03 = item_03;
	}

	public void setItem_04(String item_04){
		this.item_04 = item_04;
	}

	public void setItem_05(String item_05){
		this.item_05 = item_05;
	}

	public void setItem_06(String item_06){
		this.item_06 = item_06;
	}

	public void setItem_07(String item_07){
		this.item_07 = item_07;
	}

	public void setItem_08(String item_08){
		this.item_08 = item_08;
	}

	public void setItem_09(String item_09){
		this.item_09 = item_09;
	}

	public void setItem_10(String item_10){
		this.item_10 = item_10;
	}

	public void setItem_11(String item_11){
		this.item_11 = item_11;
	}

	public void setItem_12(String item_12){
		this.item_12 = item_12;
	}

	public void setItem_13(String item_13){
		this.item_13 = item_13;
	}

	public void setItem_14(String item_14){
		this.item_14 = item_14;
	}

	public void setItem_15(String item_15){
		this.item_15 = item_15;
	}

	public void setItem_16(String item_16){
		this.item_16 = item_16;
	}

	public void setItem_17(String item_17){
		this.item_17 = item_17;
	}

	public void setItem_18(String item_18){
		this.item_18 = item_18;
	}

	public void setItem_19(String item_19){
		this.item_19 = item_19;
	}

	public void setItem_20(String item_20){
		this.item_20 = item_20;
	}

	public void setItem_21(String item_21){
		this.item_21 = item_21;
	}

	public void setItem_22(String item_22){
		this.item_22 = item_22;
	}

	public void setItem_23(String item_23){
		this.item_23 = item_23;
	}

	public void setItem_24(String item_24){
		this.item_24 = item_24;
	}

	public void setItem_25(String item_25){
		this.item_25 = item_25;
	}

	public void setItem_26(String item_26){
		this.item_26 = item_26;
	}

	public void setItem_27(String item_27){
		this.item_27 = item_27;
	}

	public void setItem_28(String item_28){
		this.item_28 = item_28;
	}

	public void setItem_29(String item_29){
		this.item_29 = item_29;
	}

	public void setItem_30(String item_30){
		this.item_30 = item_30;
	}

	public void setItem_31(String item_31){
		this.item_31 = item_31;
	}

	public void setItem_32(String item_32){
		this.item_32 = item_32;
	}

	public void setItem_33(String item_33){
		this.item_33 = item_33;
	}

	public void setItem_34(String item_34){
		this.item_34 = item_34;
	}

	public void setItem_35(String item_35){
		this.item_35 = item_35;
	}

	public void setItem_36(String item_36){
		this.item_36 = item_36;
	}

	public String getBudg_type_cd(){
		return this.budg_type_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getYcbrnm1(){
		return this.ycbrnm1;
	}

	public String getYcbrnm2(){
		return this.ycbrnm2;
	}

	public String getYcbrnm3(){
		return this.ycbrnm3;
	}

	public String getYcbrnm4(){
		return this.ycbrnm4;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getCyov_yn(){
		return this.cyov_yn;
	}

	public String getLesd_yn(){
		return this.lesd_yn;
	}

	public String getAdvc_cndt_yn(){
		return this.advc_cndt_yn;
	}

	public String getFixfee_yn(){
		return this.fixfee_yn;
	}

	public String getPosbfee_yn(){
		return this.posbfee_yn;
	}

	public String getLimt_chk_yn(){
		return this.limt_chk_yn;
	}

	public String getMedi_dstb_cd(){
		return this.medi_dstb_cd;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getDstb_acct_cd(){
		return this.dstb_acct_cd;
	}

	public String getVia_dept_cd(){
		return this.via_dept_cd;
	}

	public String getDrcr_bal_clsf(){
		return this.drcr_bal_clsf;
	}

	public String getUse_bgn_dt(){
		return this.use_bgn_dt;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}

	public String getItem_01(){
		return this.item_01;
	}

	public String getItem_02(){
		return this.item_02;
	}

	public String getItem_03(){
		return this.item_03;
	}

	public String getItem_04(){
		return this.item_04;
	}

	public String getItem_05(){
		return this.item_05;
	}

	public String getItem_06(){
		return this.item_06;
	}

	public String getItem_07(){
		return this.item_07;
	}

	public String getItem_08(){
		return this.item_08;
	}

	public String getItem_09(){
		return this.item_09;
	}

	public String getItem_10(){
		return this.item_10;
	}

	public String getItem_11(){
		return this.item_11;
	}

	public String getItem_12(){
		return this.item_12;
	}

	public String getItem_13(){
		return this.item_13;
	}

	public String getItem_14(){
		return this.item_14;
	}

	public String getItem_15(){
		return this.item_15;
	}

	public String getItem_16(){
		return this.item_16;
	}

	public String getItem_17(){
		return this.item_17;
	}

	public String getItem_18(){
		return this.item_18;
	}

	public String getItem_19(){
		return this.item_19;
	}

	public String getItem_20(){
		return this.item_20;
	}

	public String getItem_21(){
		return this.item_21;
	}

	public String getItem_22(){
		return this.item_22;
	}

	public String getItem_23(){
		return this.item_23;
	}

	public String getItem_24(){
		return this.item_24;
	}

	public String getItem_25(){
		return this.item_25;
	}

	public String getItem_26(){
		return this.item_26;
	}

	public String getItem_27(){
		return this.item_27;
	}

	public String getItem_28(){
		return this.item_28;
	}

	public String getItem_29(){
		return this.item_29;
	}

	public String getItem_30(){
		return this.item_30;
	}

	public String getItem_31(){
		return this.item_31;
	}

	public String getItem_32(){
		return this.item_32;
	}

	public String getItem_33(){
		return this.item_33;
	}

	public String getItem_34(){
		return this.item_34;
	}

	public String getItem_35(){
		return this.item_35;
	}

	public String getItem_36(){
		return this.item_36;
	}
}

/* 작성시간 : Mon May 11 21:09:56 KST 2009 */