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


public class MT_PAPORD_8008_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String pap_row;
	public String car_cnt_c;
	public String car_cnt_b;
	public String car_cnt_a;

	public MT_PAPORD_8008_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setPap_row(String pap_row){
		this.pap_row = pap_row;
	}

	public void setCar_cnt_c(String car_cnt_c){
		this.car_cnt_c = car_cnt_c;
	}

	public void setCar_cnt_b(String car_cnt_b){
		this.car_cnt_b = car_cnt_b;
	}

	public void setCar_cnt_a(String car_cnt_a){
		this.car_cnt_a = car_cnt_a;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getPap_row(){
		return this.pap_row;
	}

	public String getCar_cnt_c(){
		return this.car_cnt_c;
	}

	public String getCar_cnt_b(){
		return this.car_cnt_b;
	}

	public String getCar_cnt_a(){
		return this.car_cnt_a;
	}
}

/* 작성시간 : Thu Jan 19 16:34:54 KST 2017 */