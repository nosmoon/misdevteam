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


public class AS_LEAS_1107_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String ernm;
	public String ern_nm;

	public AS_LEAS_1107_MCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
	}

	public void setErn_nm(String ern_nm){
		this.ern_nm = ern_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErnm(){
		return this.ernm;
	}

	public String getErn_nm(){
		return this.ern_nm;
	}
}

/* 작성시간 : Mon Apr 13 15:19:23 KST 2009 */