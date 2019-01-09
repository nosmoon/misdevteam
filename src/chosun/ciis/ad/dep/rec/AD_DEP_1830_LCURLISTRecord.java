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


public class AD_DEP_1830_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String pubc_slip_no;
	public String dlco_nm;
	public String pubc_tot_amt;
	public String setoff_tot_pubc_amt;
	public String fee_rate;
	public String fee;
	public String igcymd;

	public AD_DEP_1830_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setSetoff_tot_pubc_amt(String setoff_tot_pubc_amt){
		this.setoff_tot_pubc_amt = setoff_tot_pubc_amt;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setIgcymd(String igcymd){
		this.igcymd = igcymd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getSetoff_tot_pubc_amt(){
		return this.setoff_tot_pubc_amt;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getFee(){
		return this.fee;
	}

	public String getIgcymd(){
		return this.igcymd;
	}
}

/* 작성시간 : Thu Apr 23 15:10:51 KST 2009 */