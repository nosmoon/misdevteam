/***************************************************************************************************
* 파일명 : .java
* 기능 : 기초정보관리 - 장표관리
* 작성일자 : 2010-04-12
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_5010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String issu_dt;
	public String fac_clsf;
	public String fac_nm;
	public String issu_pcnt_0100;
	public String issu_pcnt_0200;
	public String issu_pcnt_9999;
	public String issu_pcnt;
	public String basi_yn;

	public MT_COMMATR_5010_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_nm(String fac_nm){
		this.fac_nm = fac_nm;
	}

	public void setIssu_pcnt_0100(String issu_pcnt_0100){
		this.issu_pcnt_0100 = issu_pcnt_0100;
	}

	public void setIssu_pcnt_0200(String issu_pcnt_0200){
		this.issu_pcnt_0200 = issu_pcnt_0200;
	}

	public void setIssu_pcnt_9999(String issu_pcnt_9999){
		this.issu_pcnt_9999 = issu_pcnt_9999;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setBasi_yn(String basi_yn){
		this.basi_yn = basi_yn;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_nm(){
		return this.fac_nm;
	}

	public String getIssu_pcnt_0100(){
		return this.issu_pcnt_0100;
	}

	public String getIssu_pcnt_0200(){
		return this.issu_pcnt_0200;
	}

	public String getIssu_pcnt_9999(){
		return this.issu_pcnt_9999;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getBasi_yn(){
		return this.basi_yn;
	}
}

/* 작성시간 : Mon Apr 12 14:44:41 KST 2010 */