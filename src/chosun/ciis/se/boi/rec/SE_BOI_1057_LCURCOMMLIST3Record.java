/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1057_LCURCOMMLIST3Record extends java.lang.Object implements java.io.Serializable{

	public int cho_amt;
	public int boy_amt;
	public int wee_amt;
	public int sch_amt;
	public int tot_amt;

	public SE_BOI_1057_LCURCOMMLIST3Record(){}

	public void setCho_amt(int cho_amt){
		this.cho_amt = cho_amt;
	}

	public void setBoy_amt(int boy_amt){
		this.boy_amt = boy_amt;
	}

	public void setWee_amt(int wee_amt){
		this.wee_amt = wee_amt;
	}

	public void setSch_amt(int sch_amt){
		this.sch_amt = sch_amt;
	}

	public void setTot_amt(int tot_amt){
		this.tot_amt = tot_amt;
	}

	public int getCho_amt(){
		return this.cho_amt;
	}

	public int getBoy_amt(){
		return this.boy_amt;
	}

	public int getWee_amt(){
		return this.wee_amt;
	}

	public int getSch_amt(){
		return this.sch_amt;
	}

	public int getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Tue Mar 24 16:06:46 KST 2009 */