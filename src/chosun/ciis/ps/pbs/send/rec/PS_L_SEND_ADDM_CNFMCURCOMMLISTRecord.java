/***************************************************************************************************
* 파일명 : PS_L_SEND_ADDM_CNFM.java
* 기능 :  발송-추가발송 발송처리
* 작성일자 : 2004-03-08
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-추가발송 발송처리
 *
 */

public class PS_L_SEND_ADDM_CNFMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String senddt;
	public String medicd;
	public String medinm;
	public String mediser_no;
	public int sendqty;
	public String hdqtesendyn;
	public String hdqtesenddt;

	public PS_L_SEND_ADDM_CNFMCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
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

	public void setSendqty(int sendqty){
		this.sendqty = sendqty;
	}

	public void setHdqtesendyn(String hdqtesendyn){
		this.hdqtesendyn = hdqtesendyn;
	}

	public void setHdqtesenddt(String hdqtesenddt){
		this.hdqtesenddt = hdqtesenddt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSenddt(){
		return this.senddt;
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

	public int getSendqty(){
		return this.sendqty;
	}

	public String getHdqtesendyn(){
		return this.hdqtesendyn;
	}

	public String getHdqtesenddt(){
		return this.hdqtesenddt;
	}
}

/* 작성시간 : Thu Apr 07 21:25:04 KST 2005 */