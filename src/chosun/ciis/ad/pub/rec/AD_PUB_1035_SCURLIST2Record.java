/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_1035_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String evnt_nm;
	public String amt;
	public String vat;
	public String tot_amt;
	public String fee;
	public String fee_vat;
	public String tot_fee;

	public AD_PUB_1035_SCURLIST2Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getVat(){
		return this.vat;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getFee(){
		return this.fee;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}
}

/* 작성시간 : Wed Apr 25 17:08:47 KST 2018 */