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


public class MT_PRNPAP_3202_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String wgt;

	public MT_PRNPAP_3202_MCURLISTRecord(){}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getWgt(){
		return this.wgt;
	}
}

/* 작성시간 : Mon Jun 22 10:53:35 KST 2009 */