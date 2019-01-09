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


package chosun.ciis.en.comm.rec;

import java.sql.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */


public class EN_COMM_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String value1;
	public String value2;
	public String value3;
	public String value4;

	public EN_COMM_1001_LCURLISTRecord(){}

	public void setValue1(String value1){
		this.value1 = value1;
	}

	public void setValue2(String value2){
		this.value2 = value2;
	}

	public void setValue3(String value3){
		this.value3 = value3;
	}

	public void setValue4(String value4){
		this.value4 = value4;
	}

	public String getValue1(){
		return this.value1;
	}

	public String getValue2(){
		return this.value2;
	}

	public String getValue3(){
		return this.value3;
	}

	public String getValue4(){
		return this.value4;
	}
}

/* 작성시간 : Thu Feb 12 10:10:27 KST 2009 */