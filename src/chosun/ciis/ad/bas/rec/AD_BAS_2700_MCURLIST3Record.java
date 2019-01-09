/***************************************************************************************************
* 파일명   : SP_AD_BAS_2700_M.java
* 기능     : 파트관리 초기
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;


/**
 * 기초자료관리-파트관리 초기
 */


public class AD_BAS_2700_MCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public AD_BAS_2700_MCURLIST3Record(){}

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
}

/* 작성시간 : Wed Mar 11 10:30:02 KST 2009 */