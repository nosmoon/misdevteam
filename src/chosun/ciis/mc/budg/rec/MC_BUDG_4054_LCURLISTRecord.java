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


public class MC_BUDG_4054_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fix_asin_amt;

	public MC_BUDG_4054_LCURLISTRecord(){}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}
}

/* 작성시간 : Fri May 29 19:39:59 KST 2009 */