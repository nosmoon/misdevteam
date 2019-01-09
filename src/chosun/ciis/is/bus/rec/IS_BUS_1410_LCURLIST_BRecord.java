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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1410_LCURLIST_BRecord extends java.lang.Object implements java.io.Serializable{

	public String mi_amt_1;
	public String mi_amt_2;
	public String mi_amt_3;
	public String mi_amt_4;
	public String np_amt;
	public String t_amt;

	public IS_BUS_1410_LCURLIST_BRecord(){}

	public void setMi_amt_1(String mi_amt_1){
		this.mi_amt_1 = mi_amt_1;
	}

	public void setMi_amt_2(String mi_amt_2){
		this.mi_amt_2 = mi_amt_2;
	}

	public void setMi_amt_3(String mi_amt_3){
		this.mi_amt_3 = mi_amt_3;
	}

	public void setMi_amt_4(String mi_amt_4){
		this.mi_amt_4 = mi_amt_4;
	}

	public void setNp_amt(String np_amt){
		this.np_amt = np_amt;
	}

	public void setT_amt(String t_amt){
		this.t_amt = t_amt;
	}

	public String getMi_amt_1(){
		return this.mi_amt_1;
	}

	public String getMi_amt_2(){
		return this.mi_amt_2;
	}

	public String getMi_amt_3(){
		return this.mi_amt_3;
	}

	public String getMi_amt_4(){
		return this.mi_amt_4;
	}

	public String getNp_amt(){
		return this.np_amt;
	}

	public String getT_amt(){
		return this.t_amt;
	}
}

/* 작성시간 : Mon Jun 18 10:01:57 KST 2012 */