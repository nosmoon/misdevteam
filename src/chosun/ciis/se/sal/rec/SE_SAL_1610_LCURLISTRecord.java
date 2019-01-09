/***************************************************************************************************
* 파일명 : SE_SAL_1610_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 정정
* 작성일자 : 2009-04-15
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd			;
	public String bo_seq		;
	public String slip_occr_dt	;
	public String slip_clsf_cd	;
	public String slip_seq		;
	public String dept_nm		;
	public String part_nm		;
	public String area_nm		;
	public String bo_nm			;
	public String bo_head_nm	;
	public String ern_be		;
	public String make_dt		;
	public String issu_clsf		;
	public String ern			;
	public String bo_cd_seq		;
	public String prof_type_cd	;
	
	public String getProf_type_cd() {
		return prof_type_cd;
	}

	public void setProf_type_cd(String prof_type_cd) {
		this.prof_type_cd = prof_type_cd;
	}

	public SE_SAL_1610_LCURLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

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

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setErn_be(String ern_be){
		this.ern_be = ern_be;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setBo_cd_seq(String bo_cd_seq){
		this.bo_cd_seq = bo_cd_seq;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
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

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getErn_be(){
		return this.ern_be;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getBo_cd_seq(){
		return this.bo_cd_seq;
	}
}

/* 작성시간 : Wed Apr 15 10:11:29 KST 2009 */