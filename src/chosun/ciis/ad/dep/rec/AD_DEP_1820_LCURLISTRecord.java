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


public class AD_DEP_1820_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_yymm;
	public String medi_nm;
	public String prvmm_unrcp_amt;
	public String pubc_amt;
	public String rcpm_amt;
	public String unrcp_amt;
	public String giil;
	public String note_tot_amt;
	public String cash_deps_tot_amt;
	public String avg_dds;

	public AD_DEP_1820_LCURLISTRecord(){}

	public void setPubc_yymm(String pubc_yymm){
		this.pubc_yymm = pubc_yymm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPrvmm_unrcp_amt(String prvmm_unrcp_amt){
		this.prvmm_unrcp_amt = prvmm_unrcp_amt;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setGiil(String giil){
		this.giil = giil;
	}

	public void setNote_tot_amt(String note_tot_amt){
		this.note_tot_amt = note_tot_amt;
	}

	public void setCash_deps_tot_amt(String cash_deps_tot_amt){
		this.cash_deps_tot_amt = cash_deps_tot_amt;
	}

	public void setAvg_dds(String avg_dds){
		this.avg_dds = avg_dds;
	}

	public String getPubc_yymm(){
		return this.pubc_yymm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPrvmm_unrcp_amt(){
		return this.prvmm_unrcp_amt;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getGiil(){
		return this.giil;
	}

	public String getNote_tot_amt(){
		return this.note_tot_amt;
	}

	public String getCash_deps_tot_amt(){
		return this.cash_deps_tot_amt;
	}

	public String getAvg_dds(){
		return this.avg_dds;
	}
}

/* 작성시간 : Mon Jul 06 17:35:09 KST 2009 */