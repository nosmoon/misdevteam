/***************************************************************************************************
* 파일명 : SS_L_CLAM_SSUMRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-청구결과관리-지국별청구결과요약
* 작성일자 : 2004-04-15
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-청구결과관리-지국별청구결과요약
 *
 */


public class SS_L_CLAM_SSUMRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String areacd;
	public String areanm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public int normcnt;
	public int errcnt;

	public SS_L_CLAM_SSUMRSLTCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public void setNormcnt(int normcnt){
		this.normcnt = normcnt;
	}

	public void setErrcnt(int errcnt){
		this.errcnt = errcnt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public int getNormcnt(){
		return this.normcnt;
	}

	public int getErrcnt(){
		return this.errcnt;
	}
}

/* 작성시간 : Thu Apr 15 15:37:28 KST 2004 */