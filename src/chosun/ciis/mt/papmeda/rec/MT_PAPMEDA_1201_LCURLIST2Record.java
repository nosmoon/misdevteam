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


package chosun.ciis.mt.papmeda.rec;

import java.sql.*;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

/**
 * 
 */


public class MT_PAPMEDA_1201_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String meda_yymm;

	public MT_PAPMEDA_1201_LCURLIST2Record(){}

	public void setMeda_yymm(String meda_yymm){
		this.meda_yymm = meda_yymm;
	}

	public String getMeda_yymm(){
		return this.meda_yymm;
	}
}

/* 작성시간 : Fri May 08 19:35:30 KST 2009 */