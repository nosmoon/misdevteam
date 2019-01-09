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


public class AD_DEP_2620_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String pubc_slip_no;
	public String dlco_nm;
	public String pubc_tot_amt;
	public String mi_amt;
	public String gjfee_rate;
	public String gjfee_amt;

	public AD_DEP_2620_LCURLISTRecord(){}

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

	public void setMi_amt(String mi_amt){
		this.mi_amt = mi_amt;
	}

	public void setGjfee_rate(String gjfee_rate){
		this.gjfee_rate = gjfee_rate;
	}

	public void setGjfee_amt(String gjfee_amt){
		this.gjfee_amt = gjfee_amt;
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

	public String getMi_amt(){
		return this.mi_amt;
	}

	public String getGjfee_rate(){
		return this.gjfee_rate;
	}

	public String getGjfee_amt(){
		return this.gjfee_amt;
	}
}

/* 작성시간 : Thu Apr 09 14:15:38 KST 2009 */