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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String trgt_clamt;
	public String ig_amt;
	public String ig_rate;

	public IS_DEP_2810_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setTrgt_clamt(String trgt_clamt){
		this.trgt_clamt = trgt_clamt;
	}

	public void setIg_amt(String ig_amt){
		this.ig_amt = ig_amt;
	}

	public void setIg_rate(String ig_rate){
		this.ig_rate = ig_rate;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
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

	public String getTrgt_clamt(){
		return this.trgt_clamt;
	}

	public String getIg_amt(){
		return this.ig_amt;
	}

	public String getIg_rate(){
		return this.ig_rate;
	}
}

/* 작성시간 : Wed May 23 20:19:09 KST 2012 */