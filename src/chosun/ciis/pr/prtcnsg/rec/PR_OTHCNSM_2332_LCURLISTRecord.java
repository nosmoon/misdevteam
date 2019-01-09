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


public class PR_OTHCNSM_2332_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String sect_cd;
	public String sect_nm;
	public String psplat_clsf;
	public String psplat_fee;
	public String gnaw_fee;
	public String fac_clsf;
	public String aply_dt;

	public PR_OTHCNSM_2332_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPsplat_clsf(String psplat_clsf){
		this.psplat_clsf = psplat_clsf;
	}

	public void setPsplat_fee(String psplat_fee){
		this.psplat_fee = psplat_fee;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPsplat_clsf(){
		return this.psplat_clsf;
	}

	public String getPsplat_fee(){
		return this.psplat_fee;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}
}

/* 작성시간 : Thu Sep 24 20:18:33 KST 2009 */