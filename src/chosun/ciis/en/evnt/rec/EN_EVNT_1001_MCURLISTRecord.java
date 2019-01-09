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


package chosun.ciis.en.evnt.rec;

import java.sql.*;
import chosun.ciis.en.evnt.dm.*;
import chosun.ciis.en.evnt.ds.*;

/**
 * 
 */


public class EN_EVNT_1001_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_yy;

	public EN_EVNT_1001_MCURLISTRecord(){}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}
}

/* 작성시간 : Mon Feb 09 21:05:03 KST 2009 */