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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3304_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String pap_cmpy;
	public String paper_clsf_cd;
	public String matr_cd;
	public String fr_roll;
	public String fr_wt;
	public String rem_qunt_cnt;
	public String rem_qunt_wgt;
	public String somo_roll;
	public String somo_wgt;
	public String ewh_roll_cnt;
	public String ewh_wgt;
	public String ewh_roll_cnt_to;
	public String ewh_wgt_to;
	public String cnsm_qunt;
	public String wht_pj_retngod_wgt;
	public String sum_wht_pj_retngod_wgt;
	public String occr_dt;
	public String seq;
	public String roll_wgt;

	public MT_PRNPAP_3304_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPap_cmpy(String pap_cmpy){
		this.pap_cmpy = pap_cmpy;
	}

	public void setPaper_clsf_cd(String paper_clsf_cd){
		this.paper_clsf_cd = paper_clsf_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setFr_roll(String fr_roll){
		this.fr_roll = fr_roll;
	}

	public void setFr_wt(String fr_wt){
		this.fr_wt = fr_wt;
	}

	public void setRem_qunt_cnt(String rem_qunt_cnt){
		this.rem_qunt_cnt = rem_qunt_cnt;
	}

	public void setRem_qunt_wgt(String rem_qunt_wgt){
		this.rem_qunt_wgt = rem_qunt_wgt;
	}

	public void setSomo_roll(String somo_roll){
		this.somo_roll = somo_roll;
	}

	public void setSomo_wgt(String somo_wgt){
		this.somo_wgt = somo_wgt;
	}

	public void setEwh_roll_cnt(String ewh_roll_cnt){
		this.ewh_roll_cnt = ewh_roll_cnt;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setEwh_roll_cnt_to(String ewh_roll_cnt_to){
		this.ewh_roll_cnt_to = ewh_roll_cnt_to;
	}

	public void setEwh_wgt_to(String ewh_wgt_to){
		this.ewh_wgt_to = ewh_wgt_to;
	}

	public void setCnsm_qunt(String cnsm_qunt){
		this.cnsm_qunt = cnsm_qunt;
	}

	public void setWht_pj_retngod_wgt(String wht_pj_retngod_wgt){
		this.wht_pj_retngod_wgt = wht_pj_retngod_wgt;
	}

	public void setSum_wht_pj_retngod_wgt(String sum_wht_pj_retngod_wgt){
		this.sum_wht_pj_retngod_wgt = sum_wht_pj_retngod_wgt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPap_cmpy(){
		return this.pap_cmpy;
	}

	public String getPaper_clsf_cd(){
		return this.paper_clsf_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getFr_roll(){
		return this.fr_roll;
	}

	public String getFr_wt(){
		return this.fr_wt;
	}

	public String getRem_qunt_cnt(){
		return this.rem_qunt_cnt;
	}

	public String getRem_qunt_wgt(){
		return this.rem_qunt_wgt;
	}

	public String getSomo_roll(){
		return this.somo_roll;
	}

	public String getSomo_wgt(){
		return this.somo_wgt;
	}

	public String getEwh_roll_cnt(){
		return this.ewh_roll_cnt;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getEwh_roll_cnt_to(){
		return this.ewh_roll_cnt_to;
	}

	public String getEwh_wgt_to(){
		return this.ewh_wgt_to;
	}

	public String getCnsm_qunt(){
		return this.cnsm_qunt;
	}

	public String getWht_pj_retngod_wgt(){
		return this.wht_pj_retngod_wgt;
	}

	public String getSum_wht_pj_retngod_wgt(){
		return this.sum_wht_pj_retngod_wgt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* 작성시간 : Wed Mar 08 17:53:16 KST 2017 */