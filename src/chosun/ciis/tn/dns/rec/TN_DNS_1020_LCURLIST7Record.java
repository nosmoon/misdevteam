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


package chosun.ciis.tn.dns.rec;

import java.sql.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 * 
 */


public class TN_DNS_1020_LCURLIST7Record extends java.lang.Object implements java.io.Serializable{

	public String memberidx;
	public String fundidx;
	public String supportidx;
	public String scheduleprice;
	public String payprice;
	public String acptprice;
	public String status;
	public String errorcode;
	public String isdelete;
	public String paydate;
	public String cardcmpy;
	public String cardno;
	public String cardyymm;
	public String ownername;

	public TN_DNS_1020_LCURLIST7Record(){}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setScheduleprice(String scheduleprice){
		this.scheduleprice = scheduleprice;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setAcptprice(String acptprice){
		this.acptprice = acptprice;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setErrorcode(String errorcode){
		this.errorcode = errorcode;
	}

	public void setIsdelete(String isdelete){
		this.isdelete = isdelete;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setCardcmpy(String cardcmpy){
		this.cardcmpy = cardcmpy;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setCardyymm(String cardyymm){
		this.cardyymm = cardyymm;
	}

	public void setOwnername(String ownername){
		this.ownername = ownername;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getScheduleprice(){
		return this.scheduleprice;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getAcptprice(){
		return this.acptprice;
	}

	public String getStatus(){
		return this.status;
	}

	public String getErrorcode(){
		return this.errorcode;
	}

	public String getIsdelete(){
		return this.isdelete;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getCardcmpy(){
		return this.cardcmpy;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getCardyymm(){
		return this.cardyymm;
	}

	public String getOwnername(){
		return this.ownername;
	}
}

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */