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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1820_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String decid_pre_seq;
	public String decid_pers_dty_cd;
	public String decid_pers;
	public String decid_pers_nm;
	public String aprv_step_yn;
	public String chg_pers;
	public String chg_dt_tm;

	public IS_BAS_1820_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDecid_pre_seq(String decid_pre_seq){
		this.decid_pre_seq = decid_pre_seq;
	}

	public void setDecid_pers_dty_cd(String decid_pers_dty_cd){
		this.decid_pers_dty_cd = decid_pers_dty_cd;
	}

	public void setDecid_pers(String decid_pers){
		this.decid_pers = decid_pers;
	}

	public void setDecid_pers_nm(String decid_pers_nm){
		this.decid_pers_nm = decid_pers_nm;
	}

	public void setAprv_step_yn(String aprv_step_yn){
		this.aprv_step_yn = aprv_step_yn;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDecid_pre_seq(){
		return this.decid_pre_seq;
	}

	public String getDecid_pers_dty_cd(){
		return this.decid_pers_dty_cd;
	}

	public String getDecid_pers(){
		return this.decid_pers;
	}

	public String getDecid_pers_nm(){
		return this.decid_pers_nm;
	}

	public String getAprv_step_yn(){
		return this.aprv_step_yn;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Apr 24 10:35:34 KST 2012 */