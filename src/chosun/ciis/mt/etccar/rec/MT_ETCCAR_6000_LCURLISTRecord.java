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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public double oil_clsf_1;
	public double oil_clsf_2;
	public double oil_clsf_3;
	public double oil_clsf_4;
	public double oil_clsf_5;
	public double oil_clsf_6;

	public MT_ETCCAR_6000_LCURLISTRecord(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setOil_clsf_1(double oil_clsf_1){
		this.oil_clsf_1 = oil_clsf_1;
	}

	public void setOil_clsf_2(double oil_clsf_2){
		this.oil_clsf_2 = oil_clsf_2;
	}

	public void setOil_clsf_3(double oil_clsf_3){
		this.oil_clsf_3 = oil_clsf_3;
	}

	public void setOil_clsf_4(double oil_clsf_4){
		this.oil_clsf_4 = oil_clsf_4;
	}

	public void setOil_clsf_5(double oil_clsf_5){
		this.oil_clsf_5 = oil_clsf_5;
	}

	public void setOil_clsf_6(double oil_clsf_6){
		this.oil_clsf_6 = oil_clsf_6;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public double getOil_clsf_1(){
		return this.oil_clsf_1;
	}

	public double getOil_clsf_2(){
		return this.oil_clsf_2;
	}

	public double getOil_clsf_3(){
		return this.oil_clsf_3;
	}

	public double getOil_clsf_4(){
		return this.oil_clsf_4;
	}

	public double getOil_clsf_5(){
		return this.oil_clsf_5;
	}

	public double getOil_clsf_6(){
		return this.oil_clsf_6;
	}
}

/* 작성시간 : Thu Apr 23 14:44:34 KST 2009 */