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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String fac_clsf;
	public String ink_clsf;
	public String ink_clsf_nm;
	public String medi_cd;
	public String sect_cd;
	public String medi_nm;
	public String sect_nm;
	public String bgn_gage;
	public String end_gage;
	public String qunt;

	public MT_SUBMATROUT_1503_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setInk_clsf(String ink_clsf){
		this.ink_clsf = ink_clsf;
	}

	public void setInk_clsf_nm(String ink_clsf_nm){
		this.ink_clsf_nm = ink_clsf_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setBgn_gage(String bgn_gage){
		this.bgn_gage = bgn_gage;
	}

	public void setEnd_gage(String end_gage){
		this.end_gage = end_gage;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getInk_clsf(){
		return this.ink_clsf;
	}

	public String getInk_clsf_nm(){
		return this.ink_clsf_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getBgn_gage(){
		return this.bgn_gage;
	}

	public String getEnd_gage(){
		return this.end_gage;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Wed Oct 07 10:53:45 KST 2009 */