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


public class TN_DNS_1020_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String receiverinfo;
	public String status;
	public String sendtype;
	public String senddate;
	public String failreason;
	public String umsidx;

	public TN_DNS_1020_LCURLIST6Record(){}

	public void setReceiverinfo(String receiverinfo){
		this.receiverinfo = receiverinfo;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setSendtype(String sendtype){
		this.sendtype = sendtype;
	}

	public void setSenddate(String senddate){
		this.senddate = senddate;
	}

	public void setFailreason(String failreason){
		this.failreason = failreason;
	}

	public void setUmsidx(String umsidx){
		this.umsidx = umsidx;
	}

	public String getReceiverinfo(){
		return this.receiverinfo;
	}

	public String getStatus(){
		return this.status;
	}

	public String getSendtype(){
		return this.sendtype;
	}

	public String getSenddate(){
		return this.senddate;
	}

	public String getFailreason(){
		return this.failreason;
	}

	public String getUmsidx(){
		return this.umsidx;
	}
}

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */