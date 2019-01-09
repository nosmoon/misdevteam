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


public class EN_INNEXP_1401_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String evnt_yy;

	public EN_INNEXP_1401_MCURLIST2Record(){}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}
}

/* 작성시간 : Wed May 20 13:47:23 KST 2009 */