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


package chosun.ciis.ad.eis.rec;


/**
 * 
 */


public class AD_EIS_1420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String indt_lcls;
	public String indt_lcls_nm;
	public String advt_fee;
	public String pre_advt_fee;
	public String icdc_amt;
	public String icdc_rate;

	public AD_EIS_1420_LCURLISTRecord(){}

	public void setIndt_lcls(String indt_lcls){
		this.indt_lcls = indt_lcls;
	}

	public void setIndt_lcls_nm(String indt_lcls_nm){
		this.indt_lcls_nm = indt_lcls_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setPre_advt_fee(String pre_advt_fee){
		this.pre_advt_fee = pre_advt_fee;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setIcdc_rate(String icdc_rate){
		this.icdc_rate = icdc_rate;
	}

	public String getIndt_lcls(){
		return this.indt_lcls;
	}

	public String getIndt_lcls_nm(){
		return this.indt_lcls_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getPre_advt_fee(){
		return this.pre_advt_fee;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getIcdc_rate(){
		return this.icdc_rate;
	}
}

/* 작성시간 : Thu Apr 23 17:40:07 KST 2009 */