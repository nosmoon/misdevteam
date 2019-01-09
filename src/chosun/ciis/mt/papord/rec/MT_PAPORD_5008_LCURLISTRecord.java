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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_5008_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String a_roll;
	public String c_roll;
	public String b_roll;
	public String car_cnt;

	public MT_PAPORD_5008_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setA_roll(String a_roll){
		this.a_roll = a_roll;
	}

	public void setC_roll(String c_roll){
		this.c_roll = c_roll;
	}

	public void setB_roll(String b_roll){
		this.b_roll = b_roll;
	}

	public void setCar_cnt(String car_cnt){
		this.car_cnt = car_cnt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getA_roll(){
		return this.a_roll;
	}

	public String getC_roll(){
		return this.c_roll;
	}

	public String getB_roll(){
		return this.b_roll;
	}

	public String getCar_cnt(){
		return this.car_cnt;
	}
}

/* 작성시간 : Tue Nov 10 22:52:07 KST 2009 */