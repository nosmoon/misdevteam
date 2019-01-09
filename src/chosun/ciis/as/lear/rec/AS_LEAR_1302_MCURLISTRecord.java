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


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */


public class AS_LEAR_1302_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_int_rate;

	public AS_LEAR_1302_MCURLISTRecord(){}

	public void setBasi_int_rate(String basi_int_rate){
		this.basi_int_rate = basi_int_rate;
	}

	public String getBasi_int_rate(){
		return this.basi_int_rate;
	}
}

/* 작성시간 : Mon May 04 11:27:11 KST 2009 */