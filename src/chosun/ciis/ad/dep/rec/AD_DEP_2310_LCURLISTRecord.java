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


public class AD_DEP_2310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mchrg_pers_nm;
	public String mchrg_pers;
	public String pubc_dt;
	public String gjamt;
	public String igamt;
	public String janamt;
	public String avg_pay;

	public AD_DEP_2310_LCURLISTRecord(){}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setGjamt(String gjamt){
		this.gjamt = gjamt;
	}

	public void setIgamt(String igamt){
		this.igamt = igamt;
	}

	public void setJanamt(String janamt){
		this.janamt = janamt;
	}

	public void setAvg_pay(String avg_pay){
		this.avg_pay = avg_pay;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getGjamt(){
		return this.gjamt;
	}

	public String getIgamt(){
		return this.igamt;
	}

	public String getJanamt(){
		return this.janamt;
	}

	public String getAvg_pay(){
		return this.avg_pay;
	}
}

/* 작성시간 : Fri Apr 03 17:11:34 KST 2009 */