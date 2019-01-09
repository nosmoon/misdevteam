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


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1002_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String make_pers;
	public String make_pers_nm;
	public String weth;
	public String ser_no;
	public String side1_atic;
	public String rept_matt;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bk_pcnt;

	public PR_SENDMG_1002_LCURLIST1Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setWeth(String weth){
		this.weth = weth;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setSide1_atic(String side1_atic){
		this.side1_atic = side1_atic;
	}

	public void setRept_matt(String rept_matt){
		this.rept_matt = rept_matt;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBk_pcnt(String bk_pcnt){
		this.bk_pcnt = bk_pcnt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getWeth(){
		return this.weth;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getSide1_atic(){
		return this.side1_atic;
	}

	public String getRept_matt(){
		return this.rept_matt;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBk_pcnt(){
		return this.bk_pcnt;
	}
}

/* 작성시간 : Thu Nov 05 09:36:45 KST 2009 */