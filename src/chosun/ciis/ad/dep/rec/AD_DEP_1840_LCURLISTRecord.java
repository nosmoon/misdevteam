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


public class AD_DEP_1840_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String rcpm_slip_no;
	public String rcpm_clsf_nm;
	public String magi_dt;
	public String issu_pers_nm;
	public String amt;

	public AD_DEP_1840_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setRcpm_clsf_nm(String rcpm_clsf_nm){
		this.rcpm_clsf_nm = rcpm_clsf_nm;
	}

	public void setMagi_dt(String magi_dt){
		this.magi_dt = magi_dt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getRcpm_clsf_nm(){
		return this.rcpm_clsf_nm;
	}

	public String getMagi_dt(){
		return this.magi_dt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu Apr 23 15:26:26 KST 2009 */