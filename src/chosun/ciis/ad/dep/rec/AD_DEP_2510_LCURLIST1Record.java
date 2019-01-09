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


public class AD_DEP_2510_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String note_amt;
	public String rcpay_amt;
	public String amt;

	public AD_DEP_2510_LCURLIST1Record(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Mon Apr 06 10:38:27 KST 2009 */