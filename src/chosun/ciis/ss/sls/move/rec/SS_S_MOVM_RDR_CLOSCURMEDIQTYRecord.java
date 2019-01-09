/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * 
 */


public class SS_S_MOVM_RDR_CLOSCURMEDIQTYRecord extends java.lang.Object implements java.io.Serializable{

	public String medinm;
	public int qty;

	public SS_S_MOVM_RDR_CLOSCURMEDIQTYRecord(){}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getQty(){
		return this.qty;
	}
}

/* 작성시간 : Fri Jul 25 13:52:11 KST 2014 */