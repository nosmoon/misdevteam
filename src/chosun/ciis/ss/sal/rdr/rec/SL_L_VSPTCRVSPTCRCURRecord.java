/***************************************************************************************************
* 파일명 : SL_L_VSPTCRVSPTCRCURRecord.java
* 기능 : 독자정보관리-구독내역팝업-휴독내역-목록
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자정보관리-구독내역팝업-휴독내역-목록
 *
 */


public class SL_L_VSPTCRVSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String suspfrdt;
	public String susptodt;
	public String medinm;
	public String bonm;
	public String clsfnm;

	public SL_L_VSPTCRVSPTCRCURRecord(){}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setClsfnm(String clsfnm){
		this.clsfnm = clsfnm;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getClsfnm(){
		return this.clsfnm;
	}
}

/* 작성시간 : Mon Dec 29 11:39:03 KST 2003 */