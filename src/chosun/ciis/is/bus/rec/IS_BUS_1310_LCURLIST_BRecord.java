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


public class IS_BUS_1310_LCURLIST_BRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_dept_cd;
	public String chrg_pers;
	public String sub_dept_cd_nm;
	public String chrg_pers_nm;
	public String dm_tgt_amt;
	public String dw_rst_amt;
	public String dm_rst_amt;
	public String dm_tgt_amt2;
	public String dw_rst_amt2;

	public IS_BUS_1310_LCURLIST_BRecord(){}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setDm_tgt_amt(String dm_tgt_amt){
		this.dm_tgt_amt = dm_tgt_amt;
	}

	public void setDw_rst_amt(String dw_rst_amt){
		this.dw_rst_amt = dw_rst_amt;
	}

	public void setDm_rst_amt(String dm_rst_amt){
		this.dm_rst_amt = dm_rst_amt;
	}

	public void setDm_tgt_amt2(String dm_tgt_amt2){
		this.dm_tgt_amt2 = dm_tgt_amt2;
	}

	public void setDw_rst_amt2(String dw_rst_amt2){
		this.dw_rst_amt2 = dw_rst_amt2;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getDm_tgt_amt(){
		return this.dm_tgt_amt;
	}

	public String getDw_rst_amt(){
		return this.dw_rst_amt;
	}

	public String getDm_rst_amt(){
		return this.dm_rst_amt;
	}

	public String getDm_tgt_amt2(){
		return this.dm_tgt_amt2;
	}

	public String getDw_rst_amt2(){
		return this.dw_rst_amt2;
	}
}

/* 작성시간 : Tue Jun 19 21:07:14 KST 2012 */