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


package chosun.ciis.co.code.rec;

import java.sql.*;
import chosun.ciis.co.code.dm.*;
import chosun.ciis.co.code.ds.*;

/**
 * 
 */


public class CO_COMNCD_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cdflnm;

	public CO_COMNCD_SCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCdflnm(String cdflnm){
		this.cdflnm = cdflnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCdflnm(){
		return this.cdflnm;
	}
}

/* 작성시간 : Sat Feb 07 15:46:21 KST 2009 */