/***************************************************************************************************
* 파일명 : SS_S_BOINFOCURCOMMLIST3Record.java
* 기능 : 지국Info-지국현황-상세-지대를 위한 Record
* 작성일자 : 2004-03-10
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국Info-지국현황-상세-지대를 위한 Record
 */

public class SS_S_BOINFOCURCOMMLIST3Record extends java.lang.Object implements java.io.Serializable{

	public int cho_amt;
	public int boy_amt;
	public int wee_amt;
	public int sch_amt;
	public int tot_amt;

	public SS_S_BOINFOCURCOMMLIST3Record(){}

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

/* 작성시간 : Wed May 12 19:51:04 KST 2004 */