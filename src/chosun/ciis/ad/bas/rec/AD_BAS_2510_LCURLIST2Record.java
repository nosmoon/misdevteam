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


public class AD_BAS_2510_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String yoil;
	public String pubc_side;
	public String dn;
	public String amt;

	public AD_BAS_2510_LCURLIST2Record(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setYoil(String yoil){
		this.yoil = yoil;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getYoil(){
		return this.yoil;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getDn(){
		return this.dn;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Fri May 01 15:02:52 KST 2009 */