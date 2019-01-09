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


public class MC_BUDG_2241_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String code1;
	public String code2;
	public String exec_no;
	public String dept_nm;
	public String clos_yn;
	public String to_char_incmg_dt_tm;
	public String cnt;

	public MC_BUDG_2241_LCURLISTRecord(){}

	public void setCode1(String code1){
		this.code1 = code1;
	}

	public void setCode2(String code2){
		this.code2 = code2;
	}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setTo_char_incmg_dt_tm(String to_char_incmg_dt_tm){
		this.to_char_incmg_dt_tm = to_char_incmg_dt_tm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getCode1(){
		return this.code1;
	}

	public String getCode2(){
		return this.code2;
	}

	public String getExec_no(){
		return this.exec_no;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getTo_char_incmg_dt_tm(){
		return this.to_char_incmg_dt_tm;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Thu Jul 16 10:45:23 KST 2009 */