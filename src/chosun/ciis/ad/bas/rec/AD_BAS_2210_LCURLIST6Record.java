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


public class AD_BAS_2210_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String enty_dt;
	public String dlco_nm;
	public String dhon_amt;

	public AD_BAS_2210_LCURLIST6Record(){}

	public void setEnty_dt(String enty_dt){
		this.enty_dt = enty_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDhon_amt(String dhon_amt){
		this.dhon_amt = dhon_amt;
	}

	public String getEnty_dt(){
		return this.enty_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDhon_amt(){
		return this.dhon_amt;
	}
}

/* 작성시간 : Thu Jul 23 16:17:31 KST 2009 */