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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_5000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String pap_std;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String slip_qty;
	public String is_cnt_ex_yn;
	public String is_qty_inc_yn;
	public String add_prt_yn;
	public String qunt_out_yn;
	public String duty_ovt_prt_yn;
	public String remk;

	public PR_PRTEXEC_5000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setIs_cnt_ex_yn(String is_cnt_ex_yn){
		this.is_cnt_ex_yn = is_cnt_ex_yn;
	}

	public void setIs_qty_inc_yn(String is_qty_inc_yn){
		this.is_qty_inc_yn = is_qty_inc_yn;
	}

	public void setAdd_prt_yn(String add_prt_yn){
		this.add_prt_yn = add_prt_yn;
	}

	public void setQunt_out_yn(String qunt_out_yn){
		this.qunt_out_yn = qunt_out_yn;
	}

	public void setDuty_ovt_prt_yn(String duty_ovt_prt_yn){
		this.duty_ovt_prt_yn = duty_ovt_prt_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getIs_cnt_ex_yn(){
		return this.is_cnt_ex_yn;
	}

	public String getIs_qty_inc_yn(){
		return this.is_qty_inc_yn;
	}

	public String getAdd_prt_yn(){
		return this.add_prt_yn;
	}

	public String getQunt_out_yn(){
		return this.qunt_out_yn;
	}

	public String getDuty_ovt_prt_yn(){
		return this.duty_ovt_prt_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Apr 27 19:33:59 KST 2009 */