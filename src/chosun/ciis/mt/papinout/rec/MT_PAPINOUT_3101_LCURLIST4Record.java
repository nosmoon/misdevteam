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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_3101_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String sect_cd;
	public String matr_cd;
	public String use_qunt;
	public String roll;

	public MT_PAPINOUT_3101_LCURLIST4Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setUse_qunt(String use_qunt){
		this.use_qunt = use_qunt;
	}

	public void setRoll(String roll){
		this.roll = roll;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getUse_qunt(){
		return this.use_qunt;
	}

	public String getRoll(){
		return this.roll;
	}
}

/* 작성시간 : Tue Nov 03 00:45:43 KST 2009 */