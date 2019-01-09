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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2012_1233_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String payment_sum;

	public HD_YADJM_2012_1233_LCURLISTRecord(){}

	public void setPayment_sum(String payment_sum){
		this.payment_sum = payment_sum;
	}

	public String getPayment_sum(){
		return this.payment_sum;
	}
}

/* 작성시간 : Tue Jan 08 20:55:57 KST 2013 */