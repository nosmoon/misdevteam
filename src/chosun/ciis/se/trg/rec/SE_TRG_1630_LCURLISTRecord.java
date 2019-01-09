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


public class SE_TRG_1630_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String chrg_flnm;
	public String bo_nm;
	public String bo_head_nm;
	public String evlu_grp_nm;
	public String trgt;
	public String tot_rslt;
	public String ufth_dedu;
	public String camp_dedu;
	public String re_free_dedu;
	public String exst_rdr_dedu;
	public String rslt;
	public String scor;
	public String std_scor;

	public SE_TRG_1630_LCURLISTRecord(){}

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

	public void setTrgt(String trgt){
		this.trgt = trgt;
	}

	public void setTot_rslt(String tot_rslt){
		this.tot_rslt = tot_rslt;
	}

	public void setUfth_dedu(String ufth_dedu){
		this.ufth_dedu = ufth_dedu;
	}

	public void setCamp_dedu(String camp_dedu){
		this.camp_dedu = camp_dedu;
	}

	public void setRe_free_dedu(String re_free_dedu){
		this.re_free_dedu = re_free_dedu;
	}

	public void setExst_rdr_dedu(String exst_rdr_dedu){
		this.exst_rdr_dedu = exst_rdr_dedu;
	}

	public void setRslt(String rslt){
		this.rslt = rslt;
	}

	public void setScor(String scor){
		this.scor = scor;
	}

	public void setStd_scor(String std_scor){
		this.std_scor = std_scor;
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

	public String getTrgt(){
		return this.trgt;
	}

	public String getTot_rslt(){
		return this.tot_rslt;
	}

	public String getUfth_dedu(){
		return this.ufth_dedu;
	}

	public String getCamp_dedu(){
		return this.camp_dedu;
	}

	public String getRe_free_dedu(){
		return this.re_free_dedu;
	}

	public String getExst_rdr_dedu(){
		return this.exst_rdr_dedu;
	}

	public String getRslt(){
		return this.rslt;
	}

	public String getScor(){
		return this.scor;
	}

	public String getStd_scor(){
		return this.std_scor;
	}
}

/* 작성시간 : Mon Apr 06 15:30:54 KST 2009 */