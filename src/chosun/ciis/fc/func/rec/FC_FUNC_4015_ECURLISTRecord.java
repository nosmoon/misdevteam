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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_4015_ECURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_amt;

	public FC_FUNC_4015_ECURLISTRecord(){}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}
}

/* 작성시간 : Sat Mar 07 17:36:41 KST 2009 */