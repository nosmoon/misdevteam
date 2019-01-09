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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_7001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String close_yymm;
	public String clos_yn;
	public String redm_yn;
	public String incmg_pers_nm;
	public String incmg_dt_tm;
	public String cmpy_cd;
	public String job_clsf;
	public String cd_clsf;
	public String cd;
	public String sub_cd;
	public String exec_no;

	public MT_ETCCAR_7001_LCURLISTRecord(){}

	public void setClose_yymm(String close_yymm){
		this.close_yymm = close_yymm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setRedm_yn(String redm_yn){
		this.redm_yn = redm_yn;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public String getClose_yymm(){
		return this.close_yymm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getRedm_yn(){
		return this.redm_yn;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getExec_no(){
		return this.exec_no;
	}
}

/* 작성시간 : Mon Apr 09 10:39:40 KST 2012 */