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


public class AD_EVLU_1000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String rvis_end_yn;

	public AD_EVLU_1000_LCURLIST2Record(){}

	public void setRvis_end_yn(String rvis_end_yn){
		this.rvis_end_yn = rvis_end_yn;
	}

	public String getRvis_end_yn(){
		return this.rvis_end_yn;
	}
}

/* 작성시간 : Tue Mar 16 10:49:19 KST 2010 */