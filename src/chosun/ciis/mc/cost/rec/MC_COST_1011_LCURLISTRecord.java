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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String offi_nm;
	public String dept_cd;
	public String abrv_nm;
	public String cost_dstb_cd;
	public String cost_dstb_cdnm;
	public String cost_dstb_cd_1;
	public String cost_dstb_cdnm_1;
	public String cost_dstb_cd_2;
	public String cost_dstb_cdnm_2;
	public String cost_dept_clsf;
	public String prt_plac_yn;

	public MC_COST_1011_LCURLISTRecord(){}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_cdnm(String cost_dstb_cdnm){
		this.cost_dstb_cdnm = cost_dstb_cdnm;
	}

	public void setCost_dstb_cd_1(String cost_dstb_cd_1){
		this.cost_dstb_cd_1 = cost_dstb_cd_1;
	}

	public void setCost_dstb_cdnm_1(String cost_dstb_cdnm_1){
		this.cost_dstb_cdnm_1 = cost_dstb_cdnm_1;
	}

	public void setCost_dstb_cd_2(String cost_dstb_cd_2){
		this.cost_dstb_cd_2 = cost_dstb_cd_2;
	}

	public void setCost_dstb_cdnm_2(String cost_dstb_cdnm_2){
		this.cost_dstb_cdnm_2 = cost_dstb_cdnm_2;
	}

	public void setCost_dept_clsf(String cost_dept_clsf){
		this.cost_dept_clsf = cost_dept_clsf;
	}

	public void setPrt_plac_yn(String prt_plac_yn){
		this.prt_plac_yn = prt_plac_yn;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_cdnm(){
		return this.cost_dstb_cdnm;
	}

	public String getCost_dstb_cd_1(){
		return this.cost_dstb_cd_1;
	}

	public String getCost_dstb_cdnm_1(){
		return this.cost_dstb_cdnm_1;
	}

	public String getCost_dstb_cd_2(){
		return this.cost_dstb_cd_2;
	}

	public String getCost_dstb_cdnm_2(){
		return this.cost_dstb_cdnm_2;
	}

	public String getCost_dept_clsf(){
		return this.cost_dept_clsf;
	}

	public String getPrt_plac_yn(){
		return this.prt_plac_yn;
	}
}

/* 작성시간 : Fri Apr 24 15:29:39 KST 2009 */