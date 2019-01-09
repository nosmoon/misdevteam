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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_3101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String amt1;
	public String amt2;
	public String amt3;
	public String amt4;
	public String amt5;
	public String tot_amt;

	public EN_INNEXP_3101_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Wed Apr 29 17:27:55 KST 2009 */