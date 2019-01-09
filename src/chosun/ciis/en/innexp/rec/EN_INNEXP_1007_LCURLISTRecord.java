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


public class EN_INNEXP_1007_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_ern;

	public EN_INNEXP_1007_LCURLISTRecord(){}

	public void setDlco_ern(String dlco_ern){
		this.dlco_ern = dlco_ern;
	}

	public String getDlco_ern(){
		return this.dlco_ern;
	}
}

/* 작성시간 : Fri Apr 10 13:49:34 KST 2009 */