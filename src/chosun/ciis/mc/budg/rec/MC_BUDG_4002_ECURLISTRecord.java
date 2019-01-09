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


public class MC_BUDG_4002_ECURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_cd;
	public String clos_yn;
	public String ymjedate;

	public MC_BUDG_4002_ECURLISTRecord(){}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setYmjedate(String ymjedate){
		this.ymjedate = ymjedate;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getYmjedate(){
		return this.ymjedate;
	}
}

/* 작성시간 : Wed May 20 15:28:05 KST 2009 */