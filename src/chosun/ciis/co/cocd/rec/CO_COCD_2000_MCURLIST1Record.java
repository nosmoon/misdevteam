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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_2000_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cd;

	public CO_COCD_2000_MCURLIST1Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd(){
		return this.cd;
	}
}

/* 작성시간 : Tue Jan 31 11:13:39 KST 2012 */