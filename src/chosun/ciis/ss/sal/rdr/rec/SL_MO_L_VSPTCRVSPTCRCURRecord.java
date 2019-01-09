/***************************************************************************************************
* 파일명 :SL_MO_L_VSPTCRVSPTCRCURRecord.java_모바일용
* 기능 : 판매-독자관리-독자정보검색-독자정보조회-구독내역팝업-휴독리스트
* 작성일자 : 2017-02-06
* 작성자 : 장 선 희
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
 *
 */


public class SL_MO_L_VSPTCRVSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String suspfrdt;
	public String susptodt;
	public String medinm;
	public String bonm;
	public String clsfnm;

	public SL_MO_L_VSPTCRVSPTCRCURRecord(){}

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

/* 작성시간 : Mon Feb 06 10:55:12 KST 2017 */