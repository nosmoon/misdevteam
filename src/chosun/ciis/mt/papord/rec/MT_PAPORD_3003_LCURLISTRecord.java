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


public class MT_PAPORD_3003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String aply_dt;
	public String papcmpy_cd;
	public String fac_clsf;
	public String matr_cd;
	public String matr_nm;
	public double roll_wgt;
	public int roll_cnt;
	public double amss_wgt;

	public MT_PAPORD_3003_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setRoll_wgt(double roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setRoll_cnt(int roll_cnt){
		this.roll_cnt = roll_cnt;
	}

	public void setAmss_wgt(double amss_wgt){
		this.amss_wgt = amss_wgt;
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

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public double getRoll_wgt(){
		return this.roll_wgt;
	}

	public int getRoll_cnt(){
		return this.roll_cnt;
	}

	public double getAmss_wgt(){
		return this.amss_wgt;
	}
}

/* 작성시간 : Wed Apr 08 13:02:06 KST 2009 */