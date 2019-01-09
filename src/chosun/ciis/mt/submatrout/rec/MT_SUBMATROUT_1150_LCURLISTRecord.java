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


public class MT_SUBMATROUT_1150_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String owh_dt;
	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String std_modl;

	public MT_SUBMATROUT_1150_LCURLISTRecord(){}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getStd_modl(){
		return this.std_modl;
	}
}

/* 작성시간 : Tue Nov 03 15:13:11 KST 2009 */