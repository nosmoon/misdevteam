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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_usag;
	public String cd_nm;

	public MT_ETCCAR_1002_LCURLISTRecord(){}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}
}

/* 작성시간 : Mon Jul 06 13:39:16 KST 2009 */