/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2011.02.07
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.tax.rec;


/**
 * 
 */


public class AD_TAX_2700_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String cdnm_cd;
	public String cdabrvnm_cd;

	public AD_TAX_2700_MCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public void setCdabrvnm_cd(String cdabrvnm_cd){
		this.cdabrvnm_cd = cdabrvnm_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}

	public String getCdabrvnm_cd(){
		return this.cdabrvnm_cd;
	}
}

/* 작성시간 : Thu Mar 26 20:15:07 KST 2009 */