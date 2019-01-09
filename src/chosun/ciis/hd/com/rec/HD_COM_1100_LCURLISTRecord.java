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


package chosun.ciis.hd.com.rec;

import java.sql.*;
import chosun.ciis.hd.com.dm.*;
import chosun.ciis.hd.com.ds.*;

/**
 * 
 */


public class HD_COM_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String dept_team_clsf;
	public String abrv_nm;
	public String offi_nm;
	public String dept_team_nm;
	public String part_nm;
	public String part_dn_nm;
	public String use_end_dt;
	public String now_use_yn;

	public HD_COM_1100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public void setDept_team_nm(String dept_team_nm){
		this.dept_team_nm = dept_team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_dn_nm(String part_dn_nm){
		this.part_dn_nm = part_dn_nm;
	}
	
	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}
	
	public void setNow_use_yn(String now_use_yn){
		this.now_use_yn = now_use_yn;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getDept_team_nm(){
		return this.dept_team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getPart_dn_nm(){
		return this.part_dn_nm;
	}
	
	public String getUse_end_dt(){
		return this.use_end_dt;
	}
	
	public String getNow_use_yn(){
		return this.use_end_dt;
	}
}

/* 작성시간 : Fri Aug 28 14:20:15 KST 2009 */