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


public class AD_DEP_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String pubc_yymm;
	public String advt_fee;
	public String rcpm_yymm;
	public String rcpm_amt;
	public String altn_amt;
	public String rate;
	public String bal;

	public AD_DEP_2110_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_yymm(String pubc_yymm){
		this.pubc_yymm = pubc_yymm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setRcpm_yymm(String rcpm_yymm){
		this.rcpm_yymm = rcpm_yymm;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setAltn_amt(String altn_amt){
		this.altn_amt = altn_amt;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_yymm(){
		return this.pubc_yymm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getRcpm_yymm(){
		return this.rcpm_yymm;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getAltn_amt(){
		return this.altn_amt;
	}

	public String getRate(){
		return this.rate;
	}

	public String getBal(){
		return this.bal;
	}
}

/* 작성시간 : Fri Apr 03 14:55:06 KST 2009 */