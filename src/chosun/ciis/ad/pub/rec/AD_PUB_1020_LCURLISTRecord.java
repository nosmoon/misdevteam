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


package chosun.ciis.ad.pub.rec;


/**
 * 
 */


public class AD_PUB_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String preng_occr_dt;
	public String preng_occr_seq;
	public String sect_nm;
	public String dlco_nm;
	public String advt_cont;
	public String dn_cm;
	public String slcrg_pers_nm;

	public AD_PUB_1020_LCURLISTRecord(){}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setDn_cm(String dn_cm){
		this.dn_cm = dn_cm;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getDn_cm(){
		return this.dn_cm;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}
}

/* 작성시간 : Wed Feb 11 09:09:15 KST 2009 */