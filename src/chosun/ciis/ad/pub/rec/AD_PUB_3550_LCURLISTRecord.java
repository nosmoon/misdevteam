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


public class AD_PUB_3550_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String exct_mm;
	public String exct_amt;
	public String fee;
	public String fee_dfn;
	public String easy_amt;
	public String mms_amt;
	public String tot_amt;
	public String mms_fee;
	public String sale_fee;
	public String card_fee;
	public String insur_fee;
	public String tot_fee;
	public String mod_fee;
	public String total;

	public AD_PUB_3550_LCURLISTRecord(){}

	public void setExct_mm(String exct_mm){
		this.exct_mm = exct_mm;
	}

	public void setExct_amt(String exct_amt){
		this.exct_amt = exct_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setFee_dfn(String fee_dfn){
		this.fee_dfn = fee_dfn;
	}

	public void setEasy_amt(String easy_amt){
		this.easy_amt = easy_amt;
	}

	public void setMms_amt(String mms_amt){
		this.mms_amt = mms_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setMms_fee(String mms_fee){
		this.mms_fee = mms_fee;
	}

	public void setSale_fee(String sale_fee){
		this.sale_fee = sale_fee;
	}

	public void setCard_fee(String card_fee){
		this.card_fee = card_fee;
	}

	public void setInsur_fee(String insur_fee){
		this.insur_fee = insur_fee;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setMod_fee(String mod_fee){
		this.mod_fee = mod_fee;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getExct_mm(){
		return this.exct_mm;
	}

	public String getExct_amt(){
		return this.exct_amt;
	}

	public String getFee(){
		return this.fee;
	}

	public String getFee_dfn(){
		return this.fee_dfn;
	}

	public String getEasy_amt(){
		return this.easy_amt;
	}

	public String getMms_amt(){
		return this.mms_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getMms_fee(){
		return this.mms_fee;
	}

	public String getSale_fee(){
		return this.sale_fee;
	}

	public String getCard_fee(){
		return this.card_fee;
	}

	public String getInsur_fee(){
		return this.insur_fee;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getMod_fee(){
		return this.mod_fee;
	}

	public String getTotal(){
		return this.total;
	}
}

/* 작성시간 : Tue Jan 24 16:42:50 KST 2017 */