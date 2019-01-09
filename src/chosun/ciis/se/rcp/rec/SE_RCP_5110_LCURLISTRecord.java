/***************************************************************************************************
* 파일명 : SE_RCP_5110_LCURLISTRecord.java
* 기능 : 판매- 입금관리 - 마감관리 - 입금전표생성
* 작성일자 : 2009-05-19
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_5110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd	;
	public String occr_dt	;
	public String dept_cd	;
	public String dept_nm	;
	public String clos_yn	;
	public String cnt_11	;
	public String amt_11	;
	public String cnt_13	;
	public String amt_13	;
	public String cnt_33	;
	public String amt_33	;
	public String cnt_97	;
	public String amt_97	;
	public String cnt_etc	;
	public String amt_etc	;

	public SE_RCP_5110_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setCnt_11(String cnt_11){
		this.cnt_11 = cnt_11;
	}

	public void setAmt_11(String amt_11){
		this.amt_11 = amt_11;
	}

	public void setCnt_13(String cnt_13){
		this.cnt_13 = cnt_13;
	}

	public void setAmt_13(String amt_13){
		this.amt_13 = amt_13;
	}

	public void setCnt_33(String cnt_33){
		this.cnt_33 = cnt_33;
	}

	public void setAmt_33(String amt_33){
		this.amt_33 = amt_33;
	}

	public void setCnt_97(String cnt_97){
		this.cnt_97 = cnt_97;
	}

	public void setAmt_97(String amt_97){
		this.amt_97 = amt_97;
	}

	public void setCnt_etc(String cnt_etc){
		this.cnt_etc = cnt_etc;
	}

	public void setAmt_etc(String amt_etc){
		this.amt_etc = amt_etc;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getCnt_11(){
		return this.cnt_11;
	}

	public String getAmt_11(){
		return this.amt_11;
	}

	public String getCnt_13(){
		return this.cnt_13;
	}

	public String getAmt_13(){
		return this.amt_13;
	}

	public String getCnt_33(){
		return this.cnt_33;
	}

	public String getAmt_33(){
		return this.amt_33;
	}

	public String getCnt_97(){
		return this.cnt_97;
	}

	public String getAmt_97(){
		return this.amt_97;
	}

	public String getCnt_etc(){
		return this.cnt_etc;
	}

	public String getAmt_etc(){
		return this.amt_etc;
	}
}

/* 작성시간 : Tue May 19 13:52:01 KST 2009 */