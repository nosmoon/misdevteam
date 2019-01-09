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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3000_MCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String roll_wgt;

	public MT_PRNPAP_3000_MCURLIST4Record(){}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* 작성시간 : Tue Apr 28 09:37:40 KST 2009 */