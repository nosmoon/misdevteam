/***************************************************************************************************
 * 파일명   : SP_SS_P_SEND_PBLMEDISENDBO
 * 기능     : 지국경영-주간조선발송관리
 * 작성일자 : 2007/04/24
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_P_SEND_PBLMEDISENDBO
**/

public class SS_P_SEND_PBLMEDISENDBOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hbiscnm;
	public String bhnscd;
	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String medicd;
	public String medinm;
	public String mediser_no;
	public String hdqtsenddt;
	public String boinsdseq;
	public int sendqty;
	public int sendresvqty;

	public SS_P_SEND_PBLMEDISENDBOCURCOMMLISTRecord(){}

	public void setHbiscnm(String hbiscnm){
		this.hbiscnm = hbiscnm;
	}

	public void setBhnscd(String bhnscd){
		this.bhnscd = bhnscd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setHdqtsenddt(String hdqtsenddt){
		this.hdqtsenddt = hdqtsenddt;
	}

	public void setBoinsdseq(String boinsdseq){
		this.boinsdseq = boinsdseq;
	}

	public void setSendqty(int sendqty){
		this.sendqty = sendqty;
	}

	public void setSendresvqty(int sendresvqty){
		this.sendresvqty = sendresvqty;
	}

	public String getHbiscnm(){
		return this.hbiscnm;
	}

	public String getBhnscd(){
		return this.bhnscd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getHdqtsenddt(){
		return this.hdqtsenddt;
	}

	public String getBoinsdseq(){
		return this.boinsdseq;
	}

	public int getSendqty(){
		return this.sendqty;
	}

	public int getSendresvqty(){
		return this.sendresvqty;
	}
}

/* 작성시간 : Tue Apr 24 15:27:10 KST 2007 */