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


package chosun.ciis.ad.res.rec;


/**
 * 
 */


public class AD_RES_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String preng_occr_dt;
	public String dlco_nm;
	public String preng_occr_seq;
	public String cm;
	public String dn;
	public String chro_clsf_nm;
	public String uprc;
	public String advt_fee;
	public String slcrg_nm;
	public String hndl_plac_nm;
	public String advt_cont;
	public String remk;

	public AD_RES_1510_LCURLISTRecord(){}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setChro_clsf_nm(String chro_clsf_nm){
		this.chro_clsf_nm = chro_clsf_nm;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setSlcrg_nm(String slcrg_nm){
		this.slcrg_nm = slcrg_nm;
	}

	public void setHndl_plac_nm(String hndl_plac_nm){
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public void setAdvt_cont(String advt_cont){
		System.out.println(advt_cont);
		this.advt_cont = advt_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getChro_clsf_nm(){
		return this.chro_clsf_nm;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}

	public String getHndl_plac_nm(){
		return this.hndl_plac_nm;
	}

	public String getAdvt_cont(){
		System.out.println(this.advt_cont);
		return this.advt_cont;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Apr 29 19:02:12 KST 2009 */