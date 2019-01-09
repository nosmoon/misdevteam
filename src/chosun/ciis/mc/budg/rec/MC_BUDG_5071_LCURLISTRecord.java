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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_5071_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String checked;
	public String brnm1;
	public String brcd;
	public String brnm;
	public String blank;
	public String budg_cndt_amt;
	public String tms;
	public String budg_cndt_amt1;
	public String insc_amt;
	public String budg_cndt_incamt;
	public String budg_cndt_rate;

	public MC_BUDG_5071_LCURLISTRecord(){}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setBrnm1(String brnm1){
		this.brnm1 = brnm1;
	}

	public void setBrcd(String brcd){
		this.brcd = brcd;
	}

	public void setBrnm(String brnm){
		this.brnm = brnm;
	}

	public void setBlank(String blank){
		this.blank = blank;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setBudg_cndt_amt1(String budg_cndt_amt1){
		this.budg_cndt_amt1 = budg_cndt_amt1;
	}

	public void setInsc_amt(String insc_amt){
		this.insc_amt = insc_amt;
	}

	public void setBudg_cndt_incamt(String budg_cndt_incamt){
		this.budg_cndt_incamt = budg_cndt_incamt;
	}

	public void setBudg_cndt_rate(String budg_cndt_rate){
		this.budg_cndt_rate = budg_cndt_rate;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getBrnm1(){
		return this.brnm1;
	}

	public String getBrcd(){
		return this.brcd;
	}

	public String getBrnm(){
		return this.brnm;
	}

	public String getBlank(){
		return this.blank;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getTms(){
		return this.tms;
	}

	public String getBudg_cndt_amt1(){
		return this.budg_cndt_amt1;
	}

	public String getInsc_amt(){
		return this.insc_amt;
	}

	public String getBudg_cndt_incamt(){
		return this.budg_cndt_incamt;
	}

	public String getBudg_cndt_rate(){
		return this.budg_cndt_rate;
	}
}

/* 작성시간 : Fri Apr 17 13:41:04 KST 2009 */