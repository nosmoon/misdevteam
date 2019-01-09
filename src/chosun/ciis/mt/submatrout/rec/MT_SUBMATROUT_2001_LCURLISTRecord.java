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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String mov_inout_dt;
	public String mov_in_fac_cd;
	public String mov_out_fac_cd;
	public String mov_out_deptcd;
	public String mov_in_deptcd;
	public String state;
	public String state_nm;

	public MT_SUBMATROUT_2001_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMov_inout_dt(String mov_inout_dt){
		this.mov_inout_dt = mov_inout_dt;
	}

	public void setMov_in_fac_cd(String mov_in_fac_cd){
		this.mov_in_fac_cd = mov_in_fac_cd;
	}

	public void setMov_out_fac_cd(String mov_out_fac_cd){
		this.mov_out_fac_cd = mov_out_fac_cd;
	}

	public void setMov_out_deptcd(String mov_out_deptcd){
		this.mov_out_deptcd = mov_out_deptcd;
	}

	public void setMov_in_deptcd(String mov_in_deptcd){
		this.mov_in_deptcd = mov_in_deptcd;
	}

	public void setState(String state){
		this.state = state;
	}

	public void setState_nm(String state_nm){
		this.state_nm = state_nm;
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

	public String getMov_inout_dt(){
		return this.mov_inout_dt;
	}

	public String getMov_in_fac_cd(){
		return this.mov_in_fac_cd;
	}

	public String getMov_out_fac_cd(){
		return this.mov_out_fac_cd;
	}

	public String getMov_out_deptcd(){
		return this.mov_out_deptcd;
	}

	public String getMov_in_deptcd(){
		return this.mov_in_deptcd;
	}

	public String getState(){
		return this.state;
	}

	public String getState_nm(){
		return this.state_nm;
	}
}

/* 작성시간 : Wed May 27 16:19:06 KST 2009 */