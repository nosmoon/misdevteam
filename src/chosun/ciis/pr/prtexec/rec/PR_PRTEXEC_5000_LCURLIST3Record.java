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


public class PR_PRTEXEC_5000_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String sect_nm;
	public String prt_clsf;
	public String pap_std;
	public String papcmpy_cd;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String slip_qty;
	public String is_cnt_ex_yn;
	public String is_qty_inc_yn;
	public String add_prt_seq;
	public String dual_out_clsf;
	public String dual_out_nm;
	public String duty_ovt_prt_yn;
	public String remk;
	public String clos_clsf;

	public PR_PRTEXEC_5000_LCURLIST3Record(){}

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

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
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

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setDual_out_nm(String dual_out_nm){
		this.dual_out_nm = dual_out_nm;
	}

	public void setDuty_ovt_prt_yn(String duty_ovt_prt_yn){
		this.duty_ovt_prt_yn = duty_ovt_prt_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
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

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
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

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getDual_out_nm(){
		return this.dual_out_nm;
	}

	public String getDuty_ovt_prt_yn(){
		return this.duty_ovt_prt_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}
}

/* 작성시간 : Wed Sep 09 00:29:08 KST 2009 */