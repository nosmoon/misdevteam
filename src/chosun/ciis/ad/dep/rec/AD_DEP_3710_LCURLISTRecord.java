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


package chosun.ciis.ad.dep.rec;

import java.sql.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.ds.*;

/**
 * 
 */


public class AD_DEP_3710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String rept_no;
	public String dlco_no;
	public String dlco_nm;
	public String eps_clsf;
	public String enty_clsf;
	public String slcrg_pers;
	public String mchrg_pers;
	public String sue_chrg_pers;
	public String sue_chrg_pers_nm;
	public String dlay_rcpm_plan_dt;
	public String fpymt_dt;
	public String pubc_frdt;
	public String pubc_todt;
	public String pubc_amt;
	public String rcpm_amt;
	public String unrcp_amt;
	public String dhon_frdt;
	public String dhon_todt;
	public String dhon_amt;
	public String dhon_bal;
	public String aft_rcpm_amt;
	public String aft_rcpm_dt;
	public String aft_bal;
	public String chk_01;
	public String chk_02;
	public String chk_03;
	public String chk_04;
	public String chk_05;
	public String chk_06;
	public String chk_07;
	public String chk_08;
	public String chk_09;

	public AD_DEP_3710_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setEps_clsf(String eps_clsf){
		this.eps_clsf = eps_clsf;
	}

	public void setEnty_clsf(String enty_clsf){
		this.enty_clsf = enty_clsf;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setSue_chrg_pers(String sue_chrg_pers){
		this.sue_chrg_pers = sue_chrg_pers;
	}

	public void setSue_chrg_pers_nm(String sue_chrg_pers_nm){
		this.sue_chrg_pers_nm = sue_chrg_pers_nm;
	}

	public void setDlay_rcpm_plan_dt(String dlay_rcpm_plan_dt){
		this.dlay_rcpm_plan_dt = dlay_rcpm_plan_dt;
	}

	public void setFpymt_dt(String fpymt_dt){
		this.fpymt_dt = fpymt_dt;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setDhon_frdt(String dhon_frdt){
		this.dhon_frdt = dhon_frdt;
	}

	public void setDhon_todt(String dhon_todt){
		this.dhon_todt = dhon_todt;
	}

	public void setDhon_amt(String dhon_amt){
		this.dhon_amt = dhon_amt;
	}

	public void setDhon_bal(String dhon_bal){
		this.dhon_bal = dhon_bal;
	}

	public void setAft_rcpm_amt(String aft_rcpm_amt){
		this.aft_rcpm_amt = aft_rcpm_amt;
	}

	public void setAft_rcpm_dt(String aft_rcpm_dt){
		this.aft_rcpm_dt = aft_rcpm_dt;
	}

	public void setAft_bal(String aft_bal){
		this.aft_bal = aft_bal;
	}

	public void setChk_01(String chk_01){
		this.chk_01 = chk_01;
	}

	public void setChk_02(String chk_02){
		this.chk_02 = chk_02;
	}

	public void setChk_03(String chk_03){
		this.chk_03 = chk_03;
	}

	public void setChk_04(String chk_04){
		this.chk_04 = chk_04;
	}

	public void setChk_05(String chk_05){
		this.chk_05 = chk_05;
	}

	public void setChk_06(String chk_06){
		this.chk_06 = chk_06;
	}

	public void setChk_07(String chk_07){
		this.chk_07 = chk_07;
	}

	public void setChk_08(String chk_08){
		this.chk_08 = chk_08;
	}

	public void setChk_09(String chk_09){
		this.chk_09 = chk_09;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getEps_clsf(){
		return this.eps_clsf;
	}

	public String getEnty_clsf(){
		return this.enty_clsf;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getSue_chrg_pers(){
		return this.sue_chrg_pers;
	}

	public String getSue_chrg_pers_nm(){
		return this.sue_chrg_pers_nm;
	}

	public String getDlay_rcpm_plan_dt(){
		return this.dlay_rcpm_plan_dt;
	}

	public String getFpymt_dt(){
		return this.fpymt_dt;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getDhon_frdt(){
		return this.dhon_frdt;
	}

	public String getDhon_todt(){
		return this.dhon_todt;
	}

	public String getDhon_amt(){
		return this.dhon_amt;
	}

	public String getDhon_bal(){
		return this.dhon_bal;
	}

	public String getAft_rcpm_amt(){
		return this.aft_rcpm_amt;
	}

	public String getAft_rcpm_dt(){
		return this.aft_rcpm_dt;
	}

	public String getAft_bal(){
		return this.aft_bal;
	}

	public String getChk_01(){
		return this.chk_01;
	}

	public String getChk_02(){
		return this.chk_02;
	}

	public String getChk_03(){
		return this.chk_03;
	}

	public String getChk_04(){
		return this.chk_04;
	}

	public String getChk_05(){
		return this.chk_05;
	}

	public String getChk_06(){
		return this.chk_06;
	}

	public String getChk_07(){
		return this.chk_07;
	}

	public String getChk_08(){
		return this.chk_08;
	}

	public String getChk_09(){
		return this.chk_09;
	}
}

/* 작성시간 : Sat Sep 05 12:23:08 KST 2009 */