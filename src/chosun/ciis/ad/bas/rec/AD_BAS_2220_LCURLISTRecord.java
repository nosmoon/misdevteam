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


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String make_dt;
	public String dlco_nm;
	public String chrg_pers;
	public String insupd_clsf;

	public AD_BAS_2220_LCURLISTRecord(){}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setInsupd_clsf(String insupd_clsf){
		this.insupd_clsf = insupd_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getInsupd_clsf(){
		return this.insupd_clsf;
	}
}

/* 작성시간 : Thu Apr 23 14:30:43 KST 2009 */