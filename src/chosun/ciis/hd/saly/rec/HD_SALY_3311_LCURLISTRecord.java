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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3311_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_nm;
	public String pay_yy;

	public HD_SALY_3311_LCURLISTRecord(){}

	public void setPay_nm(String pay_nm){
		this.pay_nm = pay_nm;
	}

	public void setPay_yy(String pay_yy){
		this.pay_yy = pay_yy;
	}

	public String getPay_nm(){
		return this.pay_nm;
	}

	public String getPay_yy(){
		return this.pay_yy;
	}
}

/* 작성시간 : Fri May 22 13:56:54 KST 2009 */