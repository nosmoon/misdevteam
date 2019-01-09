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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_7001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String date1;
	public String date2;
	public String date3;
	public String date4;
	public String date5;
	public String date6;
	public String date7;

	public MT_PAPORD_7001_LCURLISTRecord(){}

	public void setDate1(String date1){
		this.date1 = date1;
	}

	public void setDate2(String date2){
		this.date2 = date2;
	}

	public void setDate3(String date3){
		this.date3 = date3;
	}

	public void setDate4(String date4){
		this.date4 = date4;
	}

	public void setDate5(String date5){
		this.date5 = date5;
	}

	public void setDate6(String date6){
		this.date6 = date6;
	}

	public void setDate7(String date7){
		this.date7 = date7;
	}

	public String getDate1(){
		return this.date1;
	}

	public String getDate2(){
		return this.date2;
	}

	public String getDate3(){
		return this.date3;
	}

	public String getDate4(){
		return this.date4;
	}

	public String getDate5(){
		return this.date5;
	}

	public String getDate6(){
		return this.date6;
	}

	public String getDate7(){
		return this.date7;
	}
}

/* 작성시간 : Fri Apr 17 18:51:29 KST 2009 */