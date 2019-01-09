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


public class AD_PUB_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String sect_nm;
	public String dlco_nm;
	public String advt_cont;
	public String dn_cm;
	public String slcrg_pers_nm;
	public String pre_preng_yn;

	public AD_PUB_1030_LCURLISTRecord(){}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
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

	public void setPre_preng_yn(String pre_preng_yn){
		this.pre_preng_yn = pre_preng_yn;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
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

	public String getPre_preng_yn(){
		return this.pre_preng_yn;
	}
}

/* 작성시간 : Wed Jul 29 10:41:46 KST 2009 */