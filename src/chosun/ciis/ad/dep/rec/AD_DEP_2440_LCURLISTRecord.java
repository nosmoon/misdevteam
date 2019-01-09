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


package chosun.ciis.ad.dep.rec;


/**
 * 
 */


public class AD_DEP_2440_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String rcpay_dt;
	public String rcpay_amt;

	public AD_DEP_2440_LCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setRcpay_dt(String rcpay_dt){
		this.rcpay_dt = rcpay_dt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public String getTms(){
		return this.tms;
	}

	public String getRcpay_dt(){
		return this.rcpay_dt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}
}

/* 작성시간 : Fri Jun 26 09:12:34 KST 2009 */