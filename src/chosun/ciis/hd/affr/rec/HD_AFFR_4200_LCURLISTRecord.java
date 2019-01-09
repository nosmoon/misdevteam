/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 *
 */

public class HD_AFFR_4200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String use_dt;
	public String use_plac;
	public String indt_cd;
	public String indt_nm;
	public String category_clsf_nm;
	public String use_amt;
	public String aprv_dt;

	public HD_AFFR_4200_LCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setUse_plac(String use_plac){
		this.use_plac = use_plac;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIndt_nm(String indt_nm){
		this.indt_nm = indt_nm;
	}

	public void setCategory_clsf_nm(String category_clsf_nm){
		this.category_clsf_nm = category_clsf_nm;
	}

	public void setUse_amt(String use_amt){
		this.use_amt = use_amt;
	}

	public void setAprv_dt(String aprv_dt){
		this.aprv_dt = aprv_dt;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getUse_plac(){
		return this.use_plac;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIndt_nm(){
		return this.indt_nm;
	}

	public String getCategory_clsf_nm(){
		return this.category_clsf_nm;
	}

	public String getUse_amt(){
		return this.use_amt;
	}

	public String getAprv_dt(){
		return this.aprv_dt;
	}
}

/* 작성시간 : Mon Jul 06 20:23:25 KST 2009 */