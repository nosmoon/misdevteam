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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4050_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_team_clsf;
	public String abrv_nm;
	public String offi_nm;
	public String part_nm;
	public String part_dn_nm;
	public String use_bgn_dt;
	public String use_end_dt;

	public MC_BUDG_4050_MCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_team_clsf(String dept_team_clsf){
		this.dept_team_clsf = dept_team_clsf;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_dn_nm(String part_dn_nm){
		this.part_dn_nm = part_dn_nm;
	}

	public void setUse_bgn_dt(String use_bgn_dt){
		this.use_bgn_dt = use_bgn_dt;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_team_clsf(){
		return this.dept_team_clsf;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getPart_dn_nm(){
		return this.part_dn_nm;
	}

	public String getUse_bgn_dt(){
		return this.use_bgn_dt;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}
}

/* 작성시간 : Fri May 29 19:39:59 KST 2009 */