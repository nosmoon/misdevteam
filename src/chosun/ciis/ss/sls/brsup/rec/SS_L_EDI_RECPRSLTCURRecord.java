/***************************************************************************************************
* 파일명 : SS_L_EDI_RECPRSLTCURRecord.java
* 기능 : 지로EDI 수납결과현황 목록조회
* 작성일자 : 2004-03-06
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
 * 지로EDI 수납결과현황 목록조회
 *
 */


public class SS_L_EDI_RECPRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String acqno;
	public String girono;
	public String normnoit;
	public String rejectnoit;
	public String bocd;
	public String bonm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String jynm;

	public SS_L_EDI_RECPRSLTCURRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setNormnoit(String normnoit){
		this.normnoit = normnoit;
	}

	public void setRejectnoit(String rejectnoit){
		this.rejectnoit = rejectnoit;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public void setJynm(String jynm){
		this.jynm = jynm;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAcqno(){
		return this.acqno;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getNormnoit(){
		return this.normnoit;
	}

	public String getRejectnoit(){
		return this.rejectnoit;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
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

	public String getJynm(){
		return this.jynm;
	}
}

/* 작성시간 : Mon Mar 08 22:06:16 KST 2004 */