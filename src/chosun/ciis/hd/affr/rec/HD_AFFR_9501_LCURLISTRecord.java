/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String emp_no;
	public String flnm;
	public String memb_clsf;
	public String memb_clsf_nm;
	public String emp_birthday;
	public String dth_yn;
	public String spos_name;
	public String spos_birthday;
	public String spos_yn;
	public String zipcode;
	public String addr;
	public String phon_no;
	public String tel_no;
	public String bank_cd;
	public String bank_nm;
	public String acct_no;
	public String deps_per;
	public String lvcmpy_dty;
	public String lvcmpy_dty_nm;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String lve_yn;
	public String lve_yn_nm;

	public HD_AFFR_9501_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMemb_clsf(String memb_clsf){
		this.memb_clsf = memb_clsf;
	}

	public void setMemb_clsf_nm(String memb_clsf_nm){
		this.memb_clsf_nm = memb_clsf_nm;
	}

	public void setEmp_birthday(String emp_birthday){
		this.emp_birthday = emp_birthday;
	}

	public void setDth_yn(String dth_yn){
		this.dth_yn = dth_yn;
	}

	public void setSpos_name(String spos_name){
		this.spos_name = spos_name;
	}

	public void setSpos_birthday(String spos_birthday){
		this.spos_birthday = spos_birthday;
	}

	public void setSpos_yn(String spos_yn){
		this.spos_yn = spos_yn;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPhon_no(String phon_no){
		this.phon_no = phon_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_per(String deps_per){
		this.deps_per = deps_per;
	}

	public void setLvcmpy_dty(String lvcmpy_dty){
		this.lvcmpy_dty = lvcmpy_dty;
	}

	public void setLvcmpy_dty_nm(String lvcmpy_dty_nm){
		this.lvcmpy_dty_nm = lvcmpy_dty_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setLve_yn(String lve_yn){
		this.lve_yn = lve_yn;
	}

	public void setLve_yn_nm(String lve_yn_nm){
		this.lve_yn_nm = lve_yn_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMemb_clsf(){
		return this.memb_clsf;
	}

	public String getMemb_clsf_nm(){
		return this.memb_clsf_nm;
	}

	public String getEmp_birthday(){
		return this.emp_birthday;
	}

	public String getDth_yn(){
		return this.dth_yn;
	}

	public String getSpos_name(){
		return this.spos_name;
	}

	public String getSpos_birthday(){
		return this.spos_birthday;
	}

	public String getSpos_yn(){
		return this.spos_yn;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPhon_no(){
		return this.phon_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_per(){
		return this.deps_per;
	}

	public String getLvcmpy_dty(){
		return this.lvcmpy_dty;
	}

	public String getLvcmpy_dty_nm(){
		return this.lvcmpy_dty_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getLve_yn(){
		return this.lve_yn;
	}

	public String getLve_yn_nm(){
		return this.lve_yn_nm;
	}
}

/* 작성시간 : Wed Sep 06 17:31:09 KST 2017 */