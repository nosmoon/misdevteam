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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_3101_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String title;

	public MT_PAPINOUT_3101_LCURLIST1Record(){}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return this.title;
	}
}

/* 작성시간 : Tue Nov 03 00:45:43 KST 2009 */