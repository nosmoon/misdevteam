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


public class MC_BUDG_2243_UCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rv_i;
	public String rv_s;
	public String rv_f;

	public MC_BUDG_2243_UCURLISTRecord(){}

	public void setRv_i(String rv_i){
		this.rv_i = rv_i;
	}

	public void setRv_s(String rv_s){
		this.rv_s = rv_s;
	}

	public void setRv_f(String rv_f){
		this.rv_f = rv_f;
	}

	public String getRv_i(){
		return this.rv_i;
	}

	public String getRv_s(){
		return this.rv_s;
	}

	public String getRv_f(){
		return this.rv_f;
	}
}

/* 작성시간 : Wed May 06 15:53:15 KST 2009 */