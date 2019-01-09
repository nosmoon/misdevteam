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


public class AD_DEP_2910_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String issu_dt;
	public String issu_side;

	public AD_DEP_2910_LCURLIST2Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_side(String issu_side){
		this.issu_side = issu_side;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_side(){
		return this.issu_side;
	}
}

/* 작성시간 : Tue Apr 14 11:45:19 KST 2009 */