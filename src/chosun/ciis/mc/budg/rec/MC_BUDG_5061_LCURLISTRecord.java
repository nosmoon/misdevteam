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


public class MC_BUDG_5061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String budg_cd;
	public String t1_sjamt;
	public String jpamt;
	public String budg_cndt_amt;
	public String cha2;

	public MC_BUDG_5061_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setT1_sjamt(String t1_sjamt){
		this.t1_sjamt = t1_sjamt;
	}

	public void setJpamt(String jpamt){
		this.jpamt = jpamt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setCha2(String cha2){
		this.cha2 = cha2;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getT1_sjamt(){
		return this.t1_sjamt;
	}

	public String getJpamt(){
		return this.jpamt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getCha2(){
		return this.cha2;
	}
}

/* 작성시간 : Mon Apr 20 10:17:51 KST 2009 */