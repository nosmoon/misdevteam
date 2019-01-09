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


public class MT_PRNPAP_3006_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String fac_clsf;
	public String paper_cmpy;
	public String paper_cmpy_nm;
	public String paper_clsf_cd;
	public String matr_cd;
	public String roll_cnt;
	public String wgt;
	public String roll_wgt;

	public MT_PRNPAP_3006_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPaper_cmpy(String paper_cmpy){
		this.paper_cmpy = paper_cmpy;
	}

	public void setPaper_cmpy_nm(String paper_cmpy_nm){
		this.paper_cmpy_nm = paper_cmpy_nm;
	}

	public void setPaper_clsf_cd(String paper_clsf_cd){
		this.paper_clsf_cd = paper_clsf_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_cnt(String roll_cnt){
		this.roll_cnt = roll_cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPaper_cmpy(){
		return this.paper_cmpy;
	}

	public String getPaper_cmpy_nm(){
		return this.paper_cmpy_nm;
	}

	public String getPaper_clsf_cd(){
		return this.paper_clsf_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_cnt(){
		return this.roll_cnt;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* 작성시간 : Sat Aug 29 21:52:45 KST 2009 */