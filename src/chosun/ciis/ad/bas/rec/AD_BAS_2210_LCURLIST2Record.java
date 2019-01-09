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


public class AD_BAS_2210_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String advt_fee;

	public AD_BAS_2210_LCURLIST2Record(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}
}

/* 작성시간 : Thu Jul 23 16:17:31 KST 2009 */