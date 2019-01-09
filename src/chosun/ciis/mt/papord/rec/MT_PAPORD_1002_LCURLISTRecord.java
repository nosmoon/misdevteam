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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int cnt;

	public MT_PAPORD_1002_LCURLISTRecord(){}

	public void setCnt(int cnt){
		this.cnt = cnt;
	}

	public int getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Mon Apr 06 16:45:43 KST 2009 */