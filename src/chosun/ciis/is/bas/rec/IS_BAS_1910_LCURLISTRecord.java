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


public class IS_BAS_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String trgt_mm;
	public String sale_clsf;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String trgt_sale_amt;
	public String remk;
	public String chg_dt_tm;
	public String chg_pers;

	public IS_BAS_1910_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTrgt_mm(String trgt_mm){
		this.trgt_mm = trgt_mm;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setTrgt_sale_amt(String trgt_sale_amt){
		this.trgt_sale_amt = trgt_sale_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTrgt_mm(){
		return this.trgt_mm;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
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

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getTrgt_sale_amt(){
		return this.trgt_sale_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}
}

/* 작성시간 : Tue Apr 24 17:42:47 KST 2012 */