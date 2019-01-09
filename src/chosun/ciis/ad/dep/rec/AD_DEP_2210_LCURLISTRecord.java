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


public class AD_DEP_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String setl_clsf;
	public String bank_clsf;
	public String rcpm_acct_no;
	public String dlco_no;
	public String dlco_nm;
	public String dlco_clsf;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String strt_dt;

	public AD_DEP_2210_LCURLISTRecord(){}

	public void setSetl_clsf(String setl_clsf){
		this.setl_clsf = setl_clsf;
	}

	public void setBank_clsf(String bank_clsf){
		this.bank_clsf = bank_clsf;
	}

	public void setRcpm_acct_no(String rcpm_acct_no){
		this.rcpm_acct_no = rcpm_acct_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setStrt_dt(String strt_dt){
		this.strt_dt = strt_dt;
	}

	public String getSetl_clsf(){
		return this.setl_clsf;
	}

	public String getBank_clsf(){
		return this.bank_clsf;
	}

	public String getRcpm_acct_no(){
		return this.rcpm_acct_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getStrt_dt(){
		return this.strt_dt;
	}
}

/* 작성시간 : Fri May 29 12:04:05 KST 2009 */