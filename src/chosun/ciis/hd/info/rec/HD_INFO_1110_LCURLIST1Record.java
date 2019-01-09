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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1110_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String main_insp_ocom;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String main_insp_dt;
	public String prz_pnsh_nm;
	public String prz_grad;
	public String prz_resn_nm;
	public String case_nm;
	public String atic_pubc_dt;
	public String atic_pubc_side;
	public String prz_amt;

	public HD_INFO_1110_LCURLIST1Record(){}

	public void setMain_insp_ocom(String main_insp_ocom){
		this.main_insp_ocom = main_insp_ocom;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setMain_insp_dt(String main_insp_dt){
		this.main_insp_dt = main_insp_dt;
	}

	public void setPrz_pnsh_nm(String prz_pnsh_nm){
		this.prz_pnsh_nm = prz_pnsh_nm;
	}

	public void setPrz_grad(String prz_grad){
		this.prz_grad = prz_grad;
	}

	public void setPrz_resn_nm(String prz_resn_nm){
		this.prz_resn_nm = prz_resn_nm;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setAtic_pubc_dt(String atic_pubc_dt){
		this.atic_pubc_dt = atic_pubc_dt;
	}

	public void setAtic_pubc_side(String atic_pubc_side){
		this.atic_pubc_side = atic_pubc_side;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public String getMain_insp_ocom(){
		return this.main_insp_ocom;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getMain_insp_dt(){
		return this.main_insp_dt;
	}

	public String getPrz_pnsh_nm(){
		return this.prz_pnsh_nm;
	}

	public String getPrz_grad(){
		return this.prz_grad;
	}

	public String getPrz_resn_nm(){
		return this.prz_resn_nm;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getAtic_pubc_dt(){
		return this.atic_pubc_dt;
	}

	public String getAtic_pubc_side(){
		return this.atic_pubc_side;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}
}

/* 작성시간 : Thu Aug 20 10:37:22 KST 2009 */