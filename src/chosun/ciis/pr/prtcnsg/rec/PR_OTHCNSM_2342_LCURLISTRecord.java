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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_2342_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String ink_nm;
	public String ink_clsf;
	public String ink_matr;
	public String matr_nm;
	public String ink_uprc;

	public PR_OTHCNSM_2342_LCURLISTRecord(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setInk_nm(String ink_nm){
		this.ink_nm = ink_nm;
	}

	public void setInk_clsf(String ink_clsf){
		this.ink_clsf = ink_clsf;
	}

	public void setInk_matr(String ink_matr){
		this.ink_matr = ink_matr;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setInk_uprc(String ink_uprc){
		this.ink_uprc = ink_uprc;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getInk_nm(){
		return this.ink_nm;
	}

	public String getInk_clsf(){
		return this.ink_clsf;
	}

	public String getInk_matr(){
		return this.ink_matr;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getInk_uprc(){
		return this.ink_uprc;
	}
}

/* 작성시간 : Wed Sep 23 15:00:21 KST 2009 */