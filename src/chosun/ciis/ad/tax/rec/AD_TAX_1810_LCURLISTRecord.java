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


package chosun.ciis.ad.tax.rec;


/**
 * 
 */


public class AD_TAX_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_slip_no;
	public String advt_fee;
	public String vat;
	public String rcpm_amt;
	public String fee;

	public AD_TAX_1810_LCURLISTRecord(){}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getFee(){
		return this.fee;
	}
}

/* 작성시간 : Tue Mar 31 18:03:48 KST 2009 */