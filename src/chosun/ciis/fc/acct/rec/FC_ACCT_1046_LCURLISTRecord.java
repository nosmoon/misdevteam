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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1046_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insd_acct_cd;
	public String acct_cd;
	public String acct_subj_nm;
	public String acct_abrv_nm;
	public String slip_incmg_exne;
	public String drcr_occr_clsf;
	public String drcr_bal_clsf;
	public String tbs_exne;
	public String balsht_exne;
	public String pfls_stat_exne;
	public String setoff_yn;
	public String supr_acct_cd;
	public String vip_aset_debt_exne;
	public String acct_levl;
	public String use_yn;
	public String use_dt;
	public String wste_dt;
	public String incmg_dt_tm;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String acct_nm_styl;

	public FC_ACCT_1046_LCURLISTRecord(){}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setAcct_abrv_nm(String acct_abrv_nm){
		this.acct_abrv_nm = acct_abrv_nm;
	}

	public void setSlip_incmg_exne(String slip_incmg_exne){
		this.slip_incmg_exne = slip_incmg_exne;
	}

	public void setDrcr_occr_clsf(String drcr_occr_clsf){
		this.drcr_occr_clsf = drcr_occr_clsf;
	}

	public void setDrcr_bal_clsf(String drcr_bal_clsf){
		this.drcr_bal_clsf = drcr_bal_clsf;
	}

	public void setTbs_exne(String tbs_exne){
		this.tbs_exne = tbs_exne;
	}

	public void setBalsht_exne(String balsht_exne){
		this.balsht_exne = balsht_exne;
	}

	public void setPfls_stat_exne(String pfls_stat_exne){
		this.pfls_stat_exne = pfls_stat_exne;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setSupr_acct_cd(String supr_acct_cd){
		this.supr_acct_cd = supr_acct_cd;
	}

	public void setVip_aset_debt_exne(String vip_aset_debt_exne){
		this.vip_aset_debt_exne = vip_aset_debt_exne;
	}

	public void setAcct_levl(String acct_levl){
		this.acct_levl = acct_levl;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setAcct_nm_styl(String acct_nm_styl){
		this.acct_nm_styl = acct_nm_styl;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getAcct_abrv_nm(){
		return this.acct_abrv_nm;
	}

	public String getSlip_incmg_exne(){
		return this.slip_incmg_exne;
	}

	public String getDrcr_occr_clsf(){
		return this.drcr_occr_clsf;
	}

	public String getDrcr_bal_clsf(){
		return this.drcr_bal_clsf;
	}

	public String getTbs_exne(){
		return this.tbs_exne;
	}

	public String getBalsht_exne(){
		return this.balsht_exne;
	}

	public String getPfls_stat_exne(){
		return this.pfls_stat_exne;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getSupr_acct_cd(){
		return this.supr_acct_cd;
	}

	public String getVip_aset_debt_exne(){
		return this.vip_aset_debt_exne;
	}

	public String getAcct_levl(){
		return this.acct_levl;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getAcct_nm_styl(){
		return this.acct_nm_styl;
	}
}

/* 작성시간 : Wed Apr 01 17:37:53 KST 2009 */