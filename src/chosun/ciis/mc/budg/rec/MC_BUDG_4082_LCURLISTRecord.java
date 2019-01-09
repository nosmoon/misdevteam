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


public class MC_BUDG_4082_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String befamt_10;
	public String addamt_10;
	public String sumamt_10;
	public String befamt_20;
	public String addamt_20;
	public String sumamt_20;

	public MC_BUDG_4082_LCURLISTRecord(){}

	public void setBefamt_10(String befamt_10){
		this.befamt_10 = befamt_10;
	}

	public void setAddamt_10(String addamt_10){
		this.addamt_10 = addamt_10;
	}

	public void setSumamt_10(String sumamt_10){
		this.sumamt_10 = sumamt_10;
	}

	public void setBefamt_20(String befamt_20){
		this.befamt_20 = befamt_20;
	}

	public void setAddamt_20(String addamt_20){
		this.addamt_20 = addamt_20;
	}

	public void setSumamt_20(String sumamt_20){
		this.sumamt_20 = sumamt_20;
	}

	public String getBefamt_10(){
		return this.befamt_10;
	}

	public String getAddamt_10(){
		return this.addamt_10;
	}

	public String getSumamt_10(){
		return this.sumamt_10;
	}

	public String getBefamt_20(){
		return this.befamt_20;
	}

	public String getAddamt_20(){
		return this.addamt_20;
	}

	public String getSumamt_20(){
		return this.sumamt_20;
	}
}

/* 작성시간 : Mon May 18 14:24:01 KST 2009 */