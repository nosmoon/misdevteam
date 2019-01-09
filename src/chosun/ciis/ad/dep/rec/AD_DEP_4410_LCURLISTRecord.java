/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.rec;


public class AD_DEP_4410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String seq;
	public String rcpm_shet_no;
	public String medi_nm;
	public String mang_chrg_pers_nm;
	public String dlco_nm;
	public String rcpm_clsf_nm;
	public String amt;
	public String note_no;
	public String bank_nm;
	public String note_clsf_nm;
	public String mtry_dt;
	public String issu_pers_nm;
	
	public AD_DEP_4410_LCURLISTRecord(){}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getBank_nm() {
		return bank_nm;
	}

	public void setBank_nm(String bank_nm) {
		this.bank_nm = bank_nm;
	}

	public String getDlco_nm() {
		return dlco_nm;
	}

	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}

	public String getIssu_pers_nm() {
		return issu_pers_nm;
	}

	public void setIssu_pers_nm(String issu_pers_nm) {
		this.issu_pers_nm = issu_pers_nm;
	}

	public String getMang_chrg_pers_nm() {
		return mang_chrg_pers_nm;
	}

	public void setMang_chrg_pers_nm(String mang_chrg_pers_nm) {
		this.mang_chrg_pers_nm = mang_chrg_pers_nm;
	}

	public String getMedi_nm() {
		return medi_nm;
	}

	public void setMedi_nm(String medi_nm) {
		this.medi_nm = medi_nm;
	}

	public String getMtry_dt() {
		return mtry_dt;
	}

	public void setMtry_dt(String mtry_dt) {
		this.mtry_dt = mtry_dt;
	}

	public String getNote_clsf_nm() {
		return note_clsf_nm;
	}

	public void setNote_clsf_nm(String note_clsf_nm) {
		this.note_clsf_nm = note_clsf_nm;
	}

	public String getNote_no() {
		return note_no;
	}

	public void setNote_no(String note_no) {
		this.note_no = note_no;
	}

	public String getRcpm_clsf_nm() {
		return rcpm_clsf_nm;
	}

	public void setRcpm_clsf_nm(String rcpm_clsf_nm) {
		this.rcpm_clsf_nm = rcpm_clsf_nm;
	}

	public String getRcpm_shet_no() {
		return rcpm_shet_no;
	}

	public void setRcpm_shet_no(String rcpm_shet_no) {
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	
	
	
}