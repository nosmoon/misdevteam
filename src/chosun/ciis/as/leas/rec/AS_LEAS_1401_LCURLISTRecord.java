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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_yy;
	public String basi_qq;
	public String basi_int_rate;

	public AS_LEAS_1401_LCURLISTRecord(){}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBasi_qq(String basi_qq){
		this.basi_qq = basi_qq;
	}

	public void setBasi_int_rate(String basi_int_rate){
		this.basi_int_rate = basi_int_rate;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBasi_qq(){
		return this.basi_qq;
	}

	public String getBasi_int_rate(){
		return this.basi_int_rate;
	}
}

/* 작성시간 : Sat May 09 12:20:21 KST 2009 */