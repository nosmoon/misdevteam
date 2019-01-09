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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String chrg_pers;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String chg_prv_area_cd;
	public String chg_prv_srt_seq;
	public String chg_aft_area_cd;
	public String chg_aft_srt_seq;

	public SE_BOI_1110_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
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

	public void setChg_prv_area_cd(String chg_prv_area_cd){
		this.chg_prv_area_cd = chg_prv_area_cd;
	}

	public void setChg_prv_srt_seq(String chg_prv_srt_seq){
		this.chg_prv_srt_seq = chg_prv_srt_seq;
	}

	public void setChg_aft_area_cd(String chg_aft_area_cd){
		this.chg_aft_area_cd = chg_aft_area_cd;
	}

	public void setChg_aft_srt_seq(String chg_aft_srt_seq){
		this.chg_aft_srt_seq = chg_aft_srt_seq;
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

	public String getChrg_pers(){
		return this.chrg_pers;
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

	public String getChg_prv_area_cd(){
		return this.chg_prv_area_cd;
	}

	public String getChg_prv_srt_seq(){
		return this.chg_prv_srt_seq;
	}

	public String getChg_aft_area_cd(){
		return this.chg_aft_area_cd;
	}

	public String getChg_aft_srt_seq(){
		return this.chg_aft_srt_seq;
	}
}

/* 작성시간 : Mon Aug 31 17:04:12 KST 2009 */