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


package chosun.ciis.is.com.rec;

import java.sql.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

/**
 * 
 */


public class IS_COM_1000_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public IS_COM_1000_MCURLIST1Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* 작성시간 : Tue Apr 17 14:43:38 KST 2012 */