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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_6161_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deps_isav_clsf_cd_nm;
	public String deps_isav_no;
	public String comp_dt;
	public String mtry_dt;
	public String pymt_mm;

	public FC_FUNC_6161_LCURLISTRecord(){}

	public void setDeps_isav_clsf_cd_nm(String deps_isav_clsf_cd_nm){
		this.deps_isav_clsf_cd_nm = deps_isav_clsf_cd_nm;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPymt_mm(String pymt_mm){
		this.pymt_mm = pymt_mm;
	}

	public String getDeps_isav_clsf_cd_nm(){
		return this.deps_isav_clsf_cd_nm;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPymt_mm(){
		return this.pymt_mm;
	}
}

/* 작성시간 : Tue Mar 03 17:41:42 KST 2009 */