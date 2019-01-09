/***************************************************************************************************
* 파일명 : 
* 기능 :  발송-일일발송 발송처리
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
 * 발송-일일발송 발송처리
 *
 */

public class PS_L_SEND_DD_PROCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String senddt;
	public String medinm;
	public String bocd;
	public String medicd;
	public String mediser;
	public String mediser_no;
	public String sendmthdnm;
	public String sendkindnm;
	public String sendmthdcd;
	public String sendkindcd;
	public int sendqty;

	public PS_L_SEND_DD_PROCCURCOMMLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediser(String mediser){
		this.mediser = mediser;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setSendmthdnm(String sendmthdnm){
		this.sendmthdnm = sendmthdnm;
	}

	public void setSendkindnm(String sendkindnm){
		this.sendkindnm = sendkindnm;
	}

	public void setSendmthdcd(String sendmthdcd){
		this.sendmthdcd = sendmthdcd;
	}

	public void setSendkindcd(String sendkindcd){
		this.sendkindcd = sendkindcd;
	}

	public void setSendqty(int sendqty){
		this.sendqty = sendqty;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediser(){
		return this.mediser;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSendmthdnm(){
		return this.sendmthdnm;
	}

	public String getSendkindnm(){
		return this.sendkindnm;
	}

	public String getSendmthdcd(){
		return this.sendmthdcd;
	}

	public String getSendkindcd(){
		return this.sendkindcd;
	}

	public int getSendqty(){
		return this.sendqty;
	}
}

/* 작성시간 : Tue Mar 09 15:48:51 KST 2004 */