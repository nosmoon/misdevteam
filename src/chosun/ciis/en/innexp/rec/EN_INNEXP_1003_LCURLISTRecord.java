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


public class EN_INNEXP_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_seq;

	public EN_INNEXP_1003_LCURLISTRecord(){}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}
}

/* 작성시간 : Mon Apr 06 19:08:23 KST 2009 */