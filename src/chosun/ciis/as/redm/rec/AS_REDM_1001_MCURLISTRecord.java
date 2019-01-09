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


package chosun.ciis.as.redm.rec;

import java.sql.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */


public class AS_REDM_1001_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String redm_yymm;

	public AS_REDM_1001_MCURLISTRecord(){}

	public void setRedm_yymm(String redm_yymm){
		this.redm_yymm = redm_yymm;
	}

	public String getRedm_yymm(){
		return this.redm_yymm;
	}
}

/* 작성시간 : Sat May 09 12:50:54 KST 2009 */