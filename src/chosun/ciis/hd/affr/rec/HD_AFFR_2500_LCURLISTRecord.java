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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String emp_no;
	public String flnm;
	public String prn;
	public String chk_dt;
	public String chk_yy;
	public String chk_hosp_nm;
	public String kidny;
	public String wgt;
	public String std_wgt;
	public String fatt_prov;
	public String blod_pres_high;
	public String blod_pres_low;
	public String puls;
	public String nkd_sght_lft;
	public String nkd_sght_rht;
	public String rvis_sght_lft;
	public String rvis_sght_rht;
	public String spc_idea;
	public String cmpt_idea_ill_nm_cd_1;
	public String cmpt_idea_remk_1;
	public String cmpt_idea_ill_nm_cd_2;
	public String cmpt_idea_remk_2;
	public String cmpt_idea_ill_nm_cd_3;
	public String cmpt_idea_remk_3;
	public String cmpt_idea_ill_nm_cd_4;
	public String cmpt_idea_remk_4;
	public String cmpt_idea_ill_nm_cd_5;
	public String cmpt_idea_remk_5;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String blod_sug;
	public String a_blod_hep;
	public String b_blod_hep;
	public String adv_cont;

	public HD_AFFR_2500_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setChk_yy(String chk_yy){
		this.chk_yy = chk_yy;
	}

	public void setChk_hosp_nm(String chk_hosp_nm){
		this.chk_hosp_nm = chk_hosp_nm;
	}

	public void setKidny(String kidny){
		this.kidny = kidny;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setStd_wgt(String std_wgt){
		this.std_wgt = std_wgt;
	}

	public void setFatt_prov(String fatt_prov){
		this.fatt_prov = fatt_prov;
	}

	public void setBlod_pres_high(String blod_pres_high){
		this.blod_pres_high = blod_pres_high;
	}

	public void setBlod_pres_low(String blod_pres_low){
		this.blod_pres_low = blod_pres_low;
	}

	public void setPuls(String puls){
		this.puls = puls;
	}

	public void setNkd_sght_lft(String nkd_sght_lft){
		this.nkd_sght_lft = nkd_sght_lft;
	}

	public void setNkd_sght_rht(String nkd_sght_rht){
		this.nkd_sght_rht = nkd_sght_rht;
	}

	public void setRvis_sght_lft(String rvis_sght_lft){
		this.rvis_sght_lft = rvis_sght_lft;
	}

	public void setRvis_sght_rht(String rvis_sght_rht){
		this.rvis_sght_rht = rvis_sght_rht;
	}

	public void setSpc_idea(String spc_idea){
		this.spc_idea = spc_idea;
	}

	public void setCmpt_idea_ill_nm_cd_1(String cmpt_idea_ill_nm_cd_1){
		this.cmpt_idea_ill_nm_cd_1 = cmpt_idea_ill_nm_cd_1;
	}

	public void setCmpt_idea_remk_1(String cmpt_idea_remk_1){
		this.cmpt_idea_remk_1 = cmpt_idea_remk_1;
	}

	public void setCmpt_idea_ill_nm_cd_2(String cmpt_idea_ill_nm_cd_2){
		this.cmpt_idea_ill_nm_cd_2 = cmpt_idea_ill_nm_cd_2;
	}

	public void setCmpt_idea_remk_2(String cmpt_idea_remk_2){
		this.cmpt_idea_remk_2 = cmpt_idea_remk_2;
	}

	public void setCmpt_idea_ill_nm_cd_3(String cmpt_idea_ill_nm_cd_3){
		this.cmpt_idea_ill_nm_cd_3 = cmpt_idea_ill_nm_cd_3;
	}

	public void setCmpt_idea_remk_3(String cmpt_idea_remk_3){
		this.cmpt_idea_remk_3 = cmpt_idea_remk_3;
	}

	public void setCmpt_idea_ill_nm_cd_4(String cmpt_idea_ill_nm_cd_4){
		this.cmpt_idea_ill_nm_cd_4 = cmpt_idea_ill_nm_cd_4;
	}

	public void setCmpt_idea_remk_4(String cmpt_idea_remk_4){
		this.cmpt_idea_remk_4 = cmpt_idea_remk_4;
	}

	public void setCmpt_idea_ill_nm_cd_5(String cmpt_idea_ill_nm_cd_5){
		this.cmpt_idea_ill_nm_cd_5 = cmpt_idea_ill_nm_cd_5;
	}

	public void setCmpt_idea_remk_5(String cmpt_idea_remk_5){
		this.cmpt_idea_remk_5 = cmpt_idea_remk_5;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setBlod_sug(String blod_sug){
		this.blod_sug = blod_sug;
	}

	public void setA_blod_hep(String a_blod_hep){
		this.a_blod_hep = a_blod_hep;
	}

	public void setB_blod_hep(String b_blod_hep){
		this.b_blod_hep = b_blod_hep;
	}

	public void setAdv_cont(String adv_cont){
		this.adv_cont = adv_cont;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getChk_yy(){
		return this.chk_yy;
	}

	public String getChk_hosp_nm(){
		return this.chk_hosp_nm;
	}

	public String getKidny(){
		return this.kidny;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getStd_wgt(){
		return this.std_wgt;
	}

	public String getFatt_prov(){
		return this.fatt_prov;
	}

	public String getBlod_pres_high(){
		return this.blod_pres_high;
	}

	public String getBlod_pres_low(){
		return this.blod_pres_low;
	}

	public String getPuls(){
		return this.puls;
	}

	public String getNkd_sght_lft(){
		return this.nkd_sght_lft;
	}

	public String getNkd_sght_rht(){
		return this.nkd_sght_rht;
	}

	public String getRvis_sght_lft(){
		return this.rvis_sght_lft;
	}

	public String getRvis_sght_rht(){
		return this.rvis_sght_rht;
	}

	public String getSpc_idea(){
		return this.spc_idea;
	}

	public String getCmpt_idea_ill_nm_cd_1(){
		return this.cmpt_idea_ill_nm_cd_1;
	}

	public String getCmpt_idea_remk_1(){
		return this.cmpt_idea_remk_1;
	}

	public String getCmpt_idea_ill_nm_cd_2(){
		return this.cmpt_idea_ill_nm_cd_2;
	}

	public String getCmpt_idea_remk_2(){
		return this.cmpt_idea_remk_2;
	}

	public String getCmpt_idea_ill_nm_cd_3(){
		return this.cmpt_idea_ill_nm_cd_3;
	}

	public String getCmpt_idea_remk_3(){
		return this.cmpt_idea_remk_3;
	}

	public String getCmpt_idea_ill_nm_cd_4(){
		return this.cmpt_idea_ill_nm_cd_4;
	}

	public String getCmpt_idea_remk_4(){
		return this.cmpt_idea_remk_4;
	}

	public String getCmpt_idea_ill_nm_cd_5(){
		return this.cmpt_idea_ill_nm_cd_5;
	}

	public String getCmpt_idea_remk_5(){
		return this.cmpt_idea_remk_5;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getBlod_sug(){
		return this.blod_sug;
	}

	public String getA_blod_hep(){
		return this.a_blod_hep;
	}

	public String getB_blod_hep(){
		return this.b_blod_hep;
	}

	public String getAdv_cont(){
		return this.adv_cont;
	}
}

/* 작성시간 : Wed Dec 18 14:32:19 KST 2013 */