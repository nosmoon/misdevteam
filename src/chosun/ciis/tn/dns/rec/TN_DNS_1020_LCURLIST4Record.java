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


public class TN_DNS_1020_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String memberidx;
	public String fundidx;
	public String supportidx;
	public String scheduleprice;
	public String payprice;
	public String bankcode;
	public String bankaccount;
	public String bankaccountowner;
	public String his_type;
	public String status;
	public String errorcode;
	public String isdelete;
	public String paydate;
	public String writedate;

	public TN_DNS_1020_LCURLIST4Record(){}

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

	public void setBankcode(String bankcode){
		this.bankcode = bankcode;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setBankaccountowner(String bankaccountowner){
		this.bankaccountowner = bankaccountowner;
	}

	public void setHis_type(String his_type){
		this.his_type = his_type;
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

	public void setWritedate(String writedate){
		this.writedate = writedate;
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

	public String getBankcode(){
		return this.bankcode;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getBankaccountowner(){
		return this.bankaccountowner;
	}

	public String getHis_type(){
		return this.his_type;
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

	public String getWritedate(){
		return this.writedate;
	}
}

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */