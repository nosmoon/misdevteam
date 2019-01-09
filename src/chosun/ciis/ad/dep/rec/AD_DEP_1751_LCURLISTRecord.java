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
 * 		A.OCCR_DT,
        A.SLIP_CLSF,
        A.SEQ,
        A.SUBSEQ,
        A.RCPM_SLIP_NO,
        A.MEDI_CD,
        A.MEDI_NM,
        A.RCPM_PLAC_CLSF,
        A.RCPM_PLAC_CLSF_NM,
        B.DLCO_NO,
        B.DLCO_NM,
        B.AMT TOTAL_AMT,
        A.RCPM_CLSF,
        A.RCPM_CLSF_NM,
        A.AMT,
        B.ADVT_AMT,
        A.MANG_CHRG_PERS,
        A.MANG_CHRG_PERS_NM,
        A.RCPM_ACCT, A.SALE_APRV_NO
 */


public class AD_DEP_1751_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String subseq;
	public String rcpm_slip_no;
	public String medi_cd;
	public String medi_nm;
	public String rcpm_plac_clsf;
	public String rcpm_plac_clsf_nm;
	public String dlco_no;
	public String dlco_nm;
	public String total_amt;
	public String rcpm_clsf;
	public String rcpm_clsf_nm;
	public String note_clsf_cd;
	public String amt;
	public String advt_amt;
	public String mchrg_pers;
	public String mchrg_pers_nm;
	public String rcpm_acct;
	public String rcpm_acct_nm;
	public String sale_aprv_no;
	
	public AD_DEP_1751_LCURLISTRecord(){}

	public String getAdvt_amt() {
		return advt_amt;
	}

	public void setAdvt_amt(String advt_amt) {
		this.advt_amt = advt_amt;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getDlco_nm() {
		return dlco_nm;
	}

	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}

	public String getDlco_no() {
		return dlco_no;
	}

	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}

	public String getMchrg_pers() {
		return mchrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}

	public String getMchrg_pers_nm() {
		return mchrg_pers_nm;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm) {
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public String getMedi_cd() {
		return medi_cd;
	}

	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}

	public String getMedi_nm() {
		return medi_nm;
	}

	public void setMedi_nm(String medi_nm) {
		this.medi_nm = medi_nm;
	}

	public String getOccr_dt() {
		return occr_dt;
	}

	public void setOccr_dt(String occr_dt) {
		this.occr_dt = occr_dt;
	}

	public String getRcpm_acct() {
		return rcpm_acct;
	}

	public void setRcpm_acct(String rcpm_acct) {
		this.rcpm_acct = rcpm_acct;
	}

	public String getRcpm_acct_nm() {
		return rcpm_acct_nm;
	}

	public void setRcpm_acct_nm(String rcpm_acct_nm) {
		this.rcpm_acct_nm = rcpm_acct_nm;
	}

	public String getRcpm_clsf() {
		return rcpm_clsf;
	}

	public void setRcpm_clsf(String rcpm_clsf) {
		this.rcpm_clsf = rcpm_clsf;
	}

	public String getRcpm_clsf_nm() {
		return rcpm_clsf_nm;
	}

	public void setRcpm_clsf_nm(String rcpm_clsf_nm) {
		this.rcpm_clsf_nm = rcpm_clsf_nm;
	}

	public String getRcpm_plac_clsf() {
		return rcpm_plac_clsf;
	}

	public void setRcpm_plac_clsf(String rcpm_plac_clsf) {
		this.rcpm_plac_clsf = rcpm_plac_clsf;
	}

	public String getRcpm_plac_clsf_nm() {
		return rcpm_plac_clsf_nm;
	}

	public void setRcpm_plac_clsf_nm(String rcpm_plac_clsf_nm) {
		this.rcpm_plac_clsf_nm = rcpm_plac_clsf_nm;
	}

	public String getRcpm_slip_no() {
		return rcpm_slip_no;
	}

	public void setRcpm_slip_no(String rcpm_slip_no) {
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public String getSale_aprv_no() {
		return sale_aprv_no;
	}

	public void setSale_aprv_no(String sale_aprv_no) {
		this.sale_aprv_no = sale_aprv_no;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getSlip_clsf() {
		return slip_clsf;
	}

	public void setSlip_clsf(String slip_clsf) {
		this.slip_clsf = slip_clsf;
	}

	public String getSubseq() {
		return subseq;
	}

	public void setSubseq(String subseq) {
		this.subseq = subseq;
	}

	public String getTotal_amt() {
		return total_amt;
	}

	public void setTotal_amt(String total_amt) {
		this.total_amt = total_amt;
	}

	public String getNote_clsf_cd() {
		return note_clsf_cd;
	}

	public void setNote_clsf_cd(String note_clsf_cd) {
		this.note_clsf_cd = note_clsf_cd;
	}
	
	
}