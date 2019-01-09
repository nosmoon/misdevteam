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


public class AD_BAS_3150_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String wkdy;
	public String chosun;
	public String jungang;
	public String donga;

	public AD_BAS_3150_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setChosun(String chosun){
		this.chosun = chosun;
	}

	public void setJungang(String jungang){
		this.jungang = jungang;
	}

	public void setDonga(String donga){
		this.donga = donga;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getChosun(){
		return this.chosun;
	}

	public String getJungang(){
		return this.jungang;
	}

	public String getDonga(){
		return this.donga;
	}
}

/* 작성시간 : Mon Apr 20 20:46:33 KST 2009 */