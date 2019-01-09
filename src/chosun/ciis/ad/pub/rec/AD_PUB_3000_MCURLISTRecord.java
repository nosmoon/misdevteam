/***************************************************************************************************
* 파일명 : .java
* 기능 : 광고매출분석
* 작성일자 : 2010.09.10
* 작성자 : KBS
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


public class AD_PUB_3000_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;

	public AD_PUB_3000_MCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1() {
		return mang_cd_1;
	}

	public void setMang_cd_1(String mang_cd_1) {
		this.mang_cd_1 = mang_cd_1;
	}
}

/* 작성시간 : Wed Mar 04 19:54:56 KST 2009 */