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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_4000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String fac_clsf;
	public String days;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String sect_type;
	public String pap_std;
	public String issu_pcnt;
	public String clr_pcnt;
	public String slip_qty;
	public String dual_out_clsf;
	public String duty_ovt_prt_yn;
	public String all_slip_qty;
	public String all_slip_qty_1;
	public String seq;

	public PR_PAPMAKE_4000_LCURLIST1Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDays(String days){
		this.days = days;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setSect_type(String sect_type){
		this.sect_type = sect_type;
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

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setDuty_ovt_prt_yn(String duty_ovt_prt_yn){
		this.duty_ovt_prt_yn = duty_ovt_prt_yn;
	}

	public void setAll_slip_qty(String all_slip_qty){
		this.all_slip_qty = all_slip_qty;
	}

	public void setAll_slip_qty_1(String all_slip_qty_1){
		this.all_slip_qty_1 = all_slip_qty_1;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDays(){
		return this.days;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getSect_type(){
		return this.sect_type;
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

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getDuty_ovt_prt_yn(){
		return this.duty_ovt_prt_yn;
	}

	public String getAll_slip_qty(){
		return this.all_slip_qty;
	}

	public String getAll_slip_qty_1(){
		return this.all_slip_qty_1;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue Aug 25 15:07:42 KST 2009 */