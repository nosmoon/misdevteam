/***************************************************************************************************
* 파일명 : SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord.java
* 기능 :  아파트의 정보, 투입률조사에 필요한 매체리스트_모바일용
* 작성일자 : 2017-01-13
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String mediycd;
	public String mediynm;

	public SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMediycd(String mediycd){
		this.mediycd = mediycd;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMediycd(){
		return this.mediycd;
	}

	public String getMediynm(){
		return this.mediynm;
	}
}

/* 작성시간 : Thu Jan 12 17:26:47 KST 2017 */