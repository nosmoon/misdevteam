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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String pap_std;
	public String issu_pcnt;
	public String slip_qty;
	public String pap_model;
	public String a_wgt;
	public String b_wgt;
	public String c_wgt;
	public String wk_pap_std;
	public String wk_issu_pcnt;
	public String wk_slip_qty;
	public String occr_dt;
	public String seq;

	public MT_PAPORD_1410_LCURLISTRecord(){}

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

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setPap_model(String pap_model){
		this.pap_model = pap_model;
	}

	public void setA_wgt(String a_wgt){
		this.a_wgt = a_wgt;
	}

	public void setB_wgt(String b_wgt){
		this.b_wgt = b_wgt;
	}

	public void setC_wgt(String c_wgt){
		this.c_wgt = c_wgt;
	}

	public void setWk_pap_std(String wk_pap_std){
		this.wk_pap_std = wk_pap_std;
	}

	public void setWk_issu_pcnt(String wk_issu_pcnt){
		this.wk_issu_pcnt = wk_issu_pcnt;
	}

	public void setWk_slip_qty(String wk_slip_qty){
		this.wk_slip_qty = wk_slip_qty;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getPap_model(){
		return this.pap_model;
	}

	public String getA_wgt(){
		return this.a_wgt;
	}

	public String getB_wgt(){
		return this.b_wgt;
	}

	public String getC_wgt(){
		return this.c_wgt;
	}

	public String getWk_pap_std(){
		return this.wk_pap_std;
	}

	public String getWk_issu_pcnt(){
		return this.wk_issu_pcnt;
	}

	public String getWk_slip_qty(){
		return this.wk_slip_qty;
	}
	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

}

/* 작성시간 : Thu Jul 02 20:00:26 KST 2009 */