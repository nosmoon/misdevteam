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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_dt;
	public String mang_frdt;
	public String mang_todt;
	public String clos_yn;
	public String incmg_pers;

	public IS_DEP_1210_LCURLISTRecord(){}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setMang_frdt(String mang_frdt){
		this.mang_frdt = mang_frdt;
	}

	public void setMang_todt(String mang_todt){
		this.mang_todt = mang_todt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getMang_frdt(){
		return this.mang_frdt;
	}

	public String getMang_todt(){
		return this.mang_todt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}
}

/* 작성시간 : Wed May 16 20:23:40 KST 2012 */