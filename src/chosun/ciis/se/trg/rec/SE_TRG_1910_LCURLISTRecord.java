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


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String chrg_pers_nm;
	public String ufth_dedu;
	public String remk;

	public SE_TRG_1910_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
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

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setUfth_dedu(String ufth_dedu){
		this.ufth_dedu = ufth_dedu;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getUfth_dedu(){
		return this.ufth_dedu;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Apr 10 15:29:04 KST 2009 */