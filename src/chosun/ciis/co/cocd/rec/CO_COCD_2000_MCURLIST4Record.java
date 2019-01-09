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


public class CO_COCD_2000_MCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd1;

	public CO_COCD_2000_MCURLIST4Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd1(String cd1){
		this.cd1 = cd1;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd1(){
		return this.cd1;
	}
}

/* 작성시간 : Tue Jan 31 11:13:39 KST 2012 */