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


public class SE_TRG_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String evlu_grp_nm;
	public String trgt;
	public String rslt;
	public String ufth_dedu;
	public String re_free_dedu;
	public String camp_dedu;
	public String exst_rdr_dedu;

	public SE_TRG_1510_LCURLISTRecord(){}

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

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setTrgt(String trgt){
		this.trgt = trgt;
	}

	public void setRslt(String rslt){
		this.rslt = rslt;
	}

	public void setUfth_dedu(String ufth_dedu){
		this.ufth_dedu = ufth_dedu;
	}

	public void setRe_free_dedu(String re_free_dedu){
		this.re_free_dedu = re_free_dedu;
	}

	public void setCamp_dedu(String camp_dedu){
		this.camp_dedu = camp_dedu;
	}

	public void setExst_rdr_dedu(String exst_rdr_dedu){
		this.exst_rdr_dedu = exst_rdr_dedu;
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

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getTrgt(){
		return this.trgt;
	}

	public String getRslt(){
		return this.rslt;
	}

	public String getUfth_dedu(){
		return this.ufth_dedu;
	}

	public String getRe_free_dedu(){
		return this.re_free_dedu;
	}

	public String getCamp_dedu(){
		return this.camp_dedu;
	}

	public String getExst_rdr_dedu(){
		return this.exst_rdr_dedu;
	}
}

/* 작성시간 : Fri Apr 03 17:51:09 KST 2009 */