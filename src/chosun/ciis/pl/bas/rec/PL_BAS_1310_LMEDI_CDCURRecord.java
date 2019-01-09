/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1310_LMEDI_CDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_clsf;
	public String issu_cmpy;
	public String issu_cmpy_nm;
	public String medi_cd;
	public String medi_cd_nm;
	public String issu_clsf;
	public String issu_clsf_nm;

	public PL_BAS_1310_LMEDI_CDCURRecord(){}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setIssu_cmpy(String issu_cmpy){
		this.issu_cmpy = issu_cmpy;
	}

	public void setIssu_cmpy_nm(String issu_cmpy_nm){
		this.issu_cmpy_nm = issu_cmpy_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setIssu_clsf_nm(String issu_clsf_nm){
		this.issu_clsf_nm = issu_clsf_nm;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getIssu_cmpy(){
		return this.issu_cmpy;
	}

	public String getIssu_cmpy_nm(){
		return this.issu_cmpy_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getIssu_clsf_nm(){
		return this.issu_clsf_nm;
	}
}

/* 작성시간 : Mon Mar 16 22:13:54 KST 2009 */