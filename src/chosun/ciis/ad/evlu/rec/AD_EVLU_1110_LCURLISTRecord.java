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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String remk;

	public AD_EVLU_1110_LCURLISTRecord(){}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Mar 19 13:26:23 KST 2010 */