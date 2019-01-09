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


public class SE_TRG_1620_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String chrg_flnm;
	public String bo_nm;
	public String bo_head_nm;
	public String evlu_grp_nm;
	public String cmpt_acpn;
	public String borank;
	public String prz_amt;
	public String scor1;
	public String std_scor1;
	public String scor2;
	public String std_scor2;

	public SE_TRG_1620_LCURLIST2Record(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setCmpt_acpn(String cmpt_acpn){
		this.cmpt_acpn = cmpt_acpn;
	}

	public void setBorank(String borank){
		this.borank = borank;
	}

	public void setPrz_amt(String prz_amt){
		this.prz_amt = prz_amt;
	}

	public void setScor1(String scor1){
		this.scor1 = scor1;
	}

	public void setStd_scor1(String std_scor1){
		this.std_scor1 = std_scor1;
	}

	public void setScor2(String scor2){
		this.scor2 = scor2;
	}

	public void setStd_scor2(String std_scor2){
		this.std_scor2 = std_scor2;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getCmpt_acpn(){
		return this.cmpt_acpn;
	}

	public String getBorank(){
		return this.borank;
	}

	public String getPrz_amt(){
		return this.prz_amt;
	}

	public String getScor1(){
		return this.scor1;
	}

	public String getStd_scor1(){
		return this.std_scor1;
	}

	public String getScor2(){
		return this.scor2;
	}

	public String getStd_scor2(){
		return this.std_scor2;
	}
}

/* 작성시간 : Mon Apr 06 15:30:33 KST 2009 */