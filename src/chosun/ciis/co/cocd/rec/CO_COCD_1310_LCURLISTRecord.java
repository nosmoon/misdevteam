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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String pgm_id;
	public String var_nm;
	public String var_val;
	public String descri;
	public String menu_id;
	public String menu_nm;
	public String chg_pers;
	public String chg_dt_tm;

	public CO_COCD_1310_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setVar_nm(String var_nm){
		this.var_nm = var_nm;
	}

	public void setVar_val(String var_val){
		this.var_val = var_val;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setMenu_id(String menu_id){
		this.menu_id = menu_id;
	}

	public void setMenu_nm(String menu_nm){
		this.menu_nm = menu_nm;
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

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getVar_nm(){
		return this.var_nm;
	}

	public String getVar_val(){
		return this.var_val;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getMenu_id(){
		return this.menu_id;
	}

	public String getMenu_nm(){
		return this.menu_nm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Mon Dec 26 19:40:40 KST 2011 */