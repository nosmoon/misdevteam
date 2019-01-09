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


public class MC_BUDG_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_item_cd;
	public String mang_item_nm;
	public String mang_item_val;
	public String acct_yn;

	public MC_BUDG_1002_LCURLISTRecord(){}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setMang_item_nm(String mang_item_nm){
		this.mang_item_nm = mang_item_nm;
	}

	public void setMang_item_val(String mang_item_val){
		this.mang_item_val = mang_item_val;
	}

	public void setAcct_yn(String acct_yn){
		this.acct_yn = acct_yn;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getMang_item_nm(){
		return this.mang_item_nm;
	}

	public String getMang_item_val(){
		return this.mang_item_val;
	}

	public String getAcct_yn(){
		return this.acct_yn;
	}
}

/* 작성시간 : Tue Mar 17 18:36:16 KST 2009 */