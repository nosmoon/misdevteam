/***************************************************************************************************
* 파일명 : SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord.java
* 기능 : 확장현황-사이버확장-대회 상세 매체,수당 목록을 위한 Record
* 작성일자 : 2004-07-24
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
 * 확장현황-사이버확장-대회 상세 매체,수당 목록을 위한 Record
 */


public class SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public int alonamt;
	public int cnvsalonamt;

	public SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public void setCnvsalonamt(int cnvsalonamt){
		this.cnvsalonamt = cnvsalonamt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getAlonamt(){
		return this.alonamt;
	}

	public int getCnvsalonamt(){
		return this.cnvsalonamt;
	}
}

/* 작성시간 : Sat Aug 07 14:15:15 KST 2004 */