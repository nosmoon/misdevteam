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


package chosun.ciis.as.redm.rec;

import java.sql.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */


public class AS_REDM_1302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String redm_mthd_cd;
	public String cont_yys;
	public String redm_rate;
	public String incmg_dt_tm;
	public String incmg_pers_nm;
	public String cmpy_cd;

	public AS_REDM_1302_LCURLISTRecord(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setCont_yys(String cont_yys){
		this.cont_yys = cont_yys;
	}

	public void setRedm_rate(String redm_rate){
		this.redm_rate = redm_rate;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getCont_yys(){
		return this.cont_yys;
	}

	public String getRedm_rate(){
		return this.redm_rate;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
}

/* 작성시간 : Thu May 07 10:00:06 KST 2009 */