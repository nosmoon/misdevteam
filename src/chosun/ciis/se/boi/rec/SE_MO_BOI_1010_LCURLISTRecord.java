/***************************************************************************************************
* 파일명 : SE_MO_BOI_1010_LDataSet.java_모바일용
* 기능 : 센터관리-센터정보관리-리스트
* 작성일자 : 2017-02-07
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */


public class SE_MO_BOI_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String bo_head_prn;
	public String chrg_flnm;
	public String bo_telno;
	public String bo_cntr_dt;
	public String cntr_statnm;
	public String bo_reg_clsf;
	public String bo_reg_clsf_nm;
	public String ern;

	public SE_MO_BOI_1010_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setBo_telno(String bo_telno){
		this.bo_telno = bo_telno;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setCntr_statnm(String cntr_statnm){
		this.cntr_statnm = cntr_statnm;
	}

	public void setBo_reg_clsf(String bo_reg_clsf){
		this.bo_reg_clsf = bo_reg_clsf;
	}

	public void setBo_reg_clsf_nm(String bo_reg_clsf_nm){
		this.bo_reg_clsf_nm = bo_reg_clsf_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
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

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getBo_telno(){
		return this.bo_telno;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getCntr_statnm(){
		return this.cntr_statnm;
	}

	public String getBo_reg_clsf(){
		return this.bo_reg_clsf;
	}

	public String getBo_reg_clsf_nm(){
		return this.bo_reg_clsf_nm;
	}

	public String getErn(){
		return this.ern;
	}
}

/* 작성시간 : Tue Feb 07 14:46:04 KST 2017 */