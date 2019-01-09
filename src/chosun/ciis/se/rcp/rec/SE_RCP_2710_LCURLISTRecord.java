/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String bo_cd;
	public String bo_head_nm;
	public String pr_cntr_gurt_amt_stot;
	public String acml_trgt_amt;
	public String cr_rcpm_amt;
	public String cr_cntr_gurt_amt_stot;

	public SE_RCP_2710_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}
	
	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setPr_cntr_gurt_amt_stot(String pr_cntr_gurt_amt_stot){
		this.pr_cntr_gurt_amt_stot = pr_cntr_gurt_amt_stot;
	}

	public void setAcml_trgt_amt(String acml_trgt_amt){
		this.acml_trgt_amt = acml_trgt_amt;
	}

	public void setCr_rcpm_amt(String cr_rcpm_amt){
		this.cr_rcpm_amt = cr_rcpm_amt;
	}

	public void setCr_cntr_gurt_amt_stot(String cr_cntr_gurt_amt_stot){
		this.cr_cntr_gurt_amt_stot = cr_cntr_gurt_amt_stot;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}
	
	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getPr_cntr_gurt_amt_stot(){
		return this.pr_cntr_gurt_amt_stot;
	}

	public String getAcml_trgt_amt(){
		return this.acml_trgt_amt;
	}

	public String getCr_rcpm_amt(){
		return this.cr_rcpm_amt;
	}

	public String getCr_cntr_gurt_amt_stot(){
		return this.cr_cntr_gurt_amt_stot;
	}
}

/* 작성시간 : Fri Apr 24 10:56:43 KST 2009 */