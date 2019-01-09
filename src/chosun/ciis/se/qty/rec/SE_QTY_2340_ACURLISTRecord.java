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


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_2340_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String chg_prv_area_cd;
	public String chg_prv_srt_seq;
	public String chg_aft_area_cd;
	public String chg_aft_srt_seq;

	public SE_QTY_2340_ACURLISTRecord(){}

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

/* 작성시간 : Wed Mar 11 17:43:09 KST 2009 */