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


package chosun.ciis.ad.common.rec;


/**
 * 
 */


public class AD_CO_1001_LCURLIS2Record extends java.lang.Object implements java.io.Serializable{

	public String major;
	public String cd;
	public String cdnm;

	public AD_CO_1001_LCURLIS2Record(){}

	public void setMajor(String major){
		this.major = major;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getMajor(){
		return this.major;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* 작성시간 : Mon Feb 02 14:51:47 KST 2009 */