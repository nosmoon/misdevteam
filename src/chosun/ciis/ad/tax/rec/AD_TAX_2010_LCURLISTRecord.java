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


public class AD_TAX_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_slip_no;
	public String medi_nm;
	public String dlco_no;
	public String dlco_nm;
	public String agn_fee_pay_yn;
	public String amt;

	public AD_TAX_2010_LCURLISTRecord(){}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAgn_fee_pay_yn(String agn_fee_pay_yn){
		this.agn_fee_pay_yn = agn_fee_pay_yn;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAgn_fee_pay_yn(){
		return this.agn_fee_pay_yn;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Wed Aug 05 13:47:07 KST 2009 */