/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord.java
* 기능 : 확장용역비용마감 목록을 위한 Record
* 작성일자 : 2003-12-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;

	public SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord(){}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosdt(){
		return this.closdt;
	}
}

/* 작성시간 : Sat Dec 20 20:31:44 KST 2003 */