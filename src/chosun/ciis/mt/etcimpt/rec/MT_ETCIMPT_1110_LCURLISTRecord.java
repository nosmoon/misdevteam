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


package chosun.ciis.mt.etcimpt.rec;

import java.sql.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.ds.*;

/**
 * 
 */


public class MT_ETCIMPT_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_no;
	public String leas_clsf_nm;
	public String reg_dt;
	public String case_nm;
	public String matr_ptcr;
	public String impt_resn;
	public String offer_pric;
	public String yy;
	public String seq;
	public String leas_clsf;

	public MT_ETCIMPT_1110_LCURLISTRecord(){}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setLeas_clsf_nm(String leas_clsf_nm){
		this.leas_clsf_nm = leas_clsf_nm;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setMatr_ptcr(String matr_ptcr){
		this.matr_ptcr = matr_ptcr;
	}

	public void setImpt_resn(String impt_resn){
		this.impt_resn = impt_resn;
	}

	public void setOffer_pric(String offer_pric){
		this.offer_pric = offer_pric;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getLeas_clsf_nm(){
		return this.leas_clsf_nm;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getMatr_ptcr(){
		return this.matr_ptcr;
	}

	public String getImpt_resn(){
		return this.impt_resn;
	}

	public String getOffer_pric(){
		return this.offer_pric;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}
}

/* 작성시간 : Fri Jul 03 11:36:32 KST 2009 */