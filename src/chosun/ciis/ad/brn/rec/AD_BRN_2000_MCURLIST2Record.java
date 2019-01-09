/***************************************************************************************************
* 파일명   : SP_AD_BRN_2000_M.java
* 기능     : 일일보고, 일일보고 등록 초기
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.brn.rec;


/**
 * 기초자료관리-일일보고, 일일보고 등록 초기
 */


public class AD_BRN_2000_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public AD_BRN_2000_MCURLIST2Record(){}

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

/* 작성시간 : Fri Mar 27 14:49:35 KST 2009 */