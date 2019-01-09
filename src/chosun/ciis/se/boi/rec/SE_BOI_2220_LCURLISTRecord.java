/***************************************************************************************************
* 파일명 : .java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
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


public class SE_BOI_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_nm;
	public String bo_addr;
	public String ratio;
	public String apt_cnt;
	public String hous_cnt;
	public String shop_cnt;
	public String offi_cnt;
	public String tot_cnt;
	public String popl_cnt;

	public SE_BOI_2220_LCURLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setRatio(String ratio){
		this.ratio = ratio;
	}

	public void setApt_cnt(String apt_cnt){
		this.apt_cnt = apt_cnt;
	}

	public void setHous_cnt(String hous_cnt){
		this.hous_cnt = hous_cnt;
	}

	public void setShop_cnt(String shop_cnt){
		this.shop_cnt = shop_cnt;
	}

	public void setOffi_cnt(String offi_cnt){
		this.offi_cnt = offi_cnt;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setPopl_cnt(String popl_cnt){
		this.popl_cnt = popl_cnt;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getRatio(){
		return this.ratio;
	}

	public String getApt_cnt(){
		return this.apt_cnt;
	}

	public String getHous_cnt(){
		return this.hous_cnt;
	}

	public String getShop_cnt(){
		return this.shop_cnt;
	}

	public String getOffi_cnt(){
		return this.offi_cnt;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getPopl_cnt(){
		return this.popl_cnt;
	}
}

/* 작성시간 : Thu May 28 14:47:03 KST 2009 */