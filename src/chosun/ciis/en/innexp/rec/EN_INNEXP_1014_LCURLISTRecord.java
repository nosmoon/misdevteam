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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1014_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stlm_yn;

	public EN_INNEXP_1014_LCURLISTRecord(){}

	public void setStlm_yn(String stlm_yn){
		this.stlm_yn = stlm_yn;
	}

	public String getStlm_yn(){
		return this.stlm_yn;
	}
}

/* 작성시간 : Tue May 12 09:30:23 KST 2009 */