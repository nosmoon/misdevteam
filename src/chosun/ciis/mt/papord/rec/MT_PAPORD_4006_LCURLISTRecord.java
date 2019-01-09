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


public class MT_PAPORD_4006_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String pcnt;
	public String dual_out_clsf;
	public String std;
	public String prt_clsf;
	public int slip_qty;
	public String fac_clsf_nm;
	public String medi_nm;
	public String sect_nm;
	public String dual_out_nm;
	public String tot_wgt;
	public String b_yn;
	public String b_wgt;
	public String c_yn;
	public String c_wgt;
	public String a_wgt;

	public MT_PAPORD_4006_LCURLISTRecord(){}

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

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}
	
	public void setStd(String std){
		this.std = std;
	}
	
	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}
	
	public void setSlip_qty(int slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setDual_out_nm(String dual_out_nm){
		this.dual_out_nm = dual_out_nm;
	}

	public void setTot_wgt(String tot_wgt){
		this.tot_wgt = tot_wgt;
	}

	public void setB_yn(String b_yn){
		this.b_yn = b_yn;
	}

	public void setB_wgt(String b_wgt){
		this.b_wgt = b_wgt;
	}

	public void setC_yn(String c_yn){
		this.c_yn = c_yn;
	}

	public void setC_wgt(String c_wgt){
		this.c_wgt = c_wgt;
	}

	public void setA_wgt(String a_wgt){
		this.a_wgt = a_wgt;
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

	public String getPcnt(){
		return this.pcnt;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getStd(){
		return this.std;
	}
	
	public String getPrt_clsf(){
		return this.prt_clsf;
	}
	
	public int getSlip_qty(){
		return this.slip_qty;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getDual_out_nm(){
		return this.dual_out_nm;
	}

	public String getTot_wgt(){
		return this.tot_wgt;
	}

	public String getB_yn(){
		return this.b_yn;
	}

	public String getB_wgt(){
		return this.b_wgt;
	}

	public String getC_yn(){
		return this.c_yn;
	}

	public String getC_wgt(){
		return this.c_wgt;
	}

	public String getA_wgt(){
		return this.a_wgt;
	}
}

/* 작성시간 : Thu Jul 02 20:00:26 KST 2009 */