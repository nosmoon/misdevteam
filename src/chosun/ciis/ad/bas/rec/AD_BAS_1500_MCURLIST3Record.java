/***************************************************************************************************
* 파일명   : SP_AD_BAS_1500_M.java
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


package chosun.ciis.ad.bas.rec;


/**
 * 기초자료관리-일일보고, 일일보고 등록 초기
 */


public class AD_BAS_1500_MCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String acct_id;
	public String acct_nm;

	public AD_BAS_1500_MCURLIST3Record(){}

	public void setAcct_id(String acct_id){
		this.acct_id = acct_id;
	}

	public void setAcct_nm(String acct_nm){
		this.acct_nm = acct_nm;
	}

	public String getAcct_id(){
		return this.acct_id;
	}

	public String getAcct_nm(){
		return this.acct_nm;
	}
}

/* 작성시간 : Fri Mar 27 14:49:35 KST 2009 */