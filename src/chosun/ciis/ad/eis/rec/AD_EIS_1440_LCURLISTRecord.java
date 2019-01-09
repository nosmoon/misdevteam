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


public class AD_EIS_1440_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String agn_nm;
	public String pubc_amt;
	public String pre_pubc_amt;
	public String icdc_amt;
	public String icdc_rate;

	public AD_EIS_1440_LCURLISTRecord(){}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setPre_pubc_amt(String pre_pubc_amt){
		this.pre_pubc_amt = pre_pubc_amt;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setIcdc_rate(String icdc_rate){
		this.icdc_rate = icdc_rate;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getPre_pubc_amt(){
		return this.pre_pubc_amt;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getIcdc_rate(){
		return this.icdc_rate;
	}
}

/* 작성시간 : Thu Apr 23 19:15:42 KST 2009 */