/***************************************************************************************************
* 파일명 : SS_L_MOVM_RDRCURCOMMLISTRecord.java
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class SS_S_MOVM_RDRCURMEDIQTYRecord extends java.lang.Object implements java.io.Serializable{

	public String medinm;
	public int qty;

	public SS_S_MOVM_RDRCURMEDIQTYRecord(){}

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

/* 작성시간 : Mon Aug 10 11:10:26 KST 2015 */