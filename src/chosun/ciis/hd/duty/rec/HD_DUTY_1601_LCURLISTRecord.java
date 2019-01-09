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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clndr_ma;
	public String clndr_a;
	public String clndr_wkdy;
	public String clndr_b;
	public String hody_clsf;
	public String clndr_c;
	public String vaca_cd;

	public HD_DUTY_1601_LCURLISTRecord(){}

	public void setClndr_ma(String clndr_ma){
		this.clndr_ma = clndr_ma;
	}

	public void setClndr_a(String clndr_a){
		this.clndr_a = clndr_a;
	}

	public void setClndr_wkdy(String clndr_wkdy){
		this.clndr_wkdy = clndr_wkdy;
	}

	public void setClndr_b(String clndr_b){
		this.clndr_b = clndr_b;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setClndr_c(String clndr_c){
		this.clndr_c = clndr_c;
	}

	public void setVaca_cd(String vaca_cd){
		this.vaca_cd = vaca_cd;
	}

	public String getClndr_ma(){
		return this.clndr_ma;
	}

	public String getClndr_a(){
		return this.clndr_a;
	}

	public String getClndr_wkdy(){
		return this.clndr_wkdy;
	}

	public String getClndr_b(){
		return this.clndr_b;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getClndr_c(){
		return this.clndr_c;
	}

	public String getVaca_cd(){
		return this.vaca_cd;
	}
}

/* 작성시간 : Wed Apr 01 21:03:07 KST 2009 */