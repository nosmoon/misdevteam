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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String make_dt;
	public String dt_clsf_nm;
	public String dlco;
	public String chrg_pers;
	public String vist_purp;

	public IS_BUS_1110_LCURLISTRecord(){}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDt_clsf_nm(String dt_clsf_nm){
		this.dt_clsf_nm = dt_clsf_nm;
	}

	public void setDlco(String dlco){
		this.dlco = dlco;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setVist_purp(String vist_purp){
		this.vist_purp = vist_purp;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDt_clsf_nm(){
		return this.dt_clsf_nm;
	}

	public String getDlco(){
		return this.dlco;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getVist_purp(){
		return this.vist_purp;
	}
}

/* 작성시간 : Wed Jun 20 09:22:57 KST 2012 */