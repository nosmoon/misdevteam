/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_CYBCLOSCURCOMMLISTRecord.java
* 기능 : 확장현황-사이버확장-대회관리-비용 목록
* 작성일자 : 2004-04-07
* 작성자 : 고윤홍
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
 * 확장현황-사이버확장-대회관리-비용 목록
 *
 */

public class SS_L_RDR_EXTN_CYBCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;

	public SS_L_RDR_EXTN_CYBCLOSCURCOMMLISTRecord(){}

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

/* 작성시간 : Wed Apr 07 20:46:39 KST 2004 */