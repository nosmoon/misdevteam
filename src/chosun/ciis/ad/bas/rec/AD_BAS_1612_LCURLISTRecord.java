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


public class AD_BAS_1612_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String pre_basi_dt;
	public String next_basi_dt;
	public String dlco_no;

	public AD_BAS_1612_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPre_basi_dt(String pre_basi_dt){
		this.pre_basi_dt = pre_basi_dt;
	}

	public void setNext_basi_dt(String next_basi_dt){
		this.next_basi_dt = next_basi_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPre_basi_dt(){
		return this.pre_basi_dt;
	}

	public String getNext_basi_dt(){
		return this.next_basi_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}
}

/* 작성시간 : Mon May 25 14:24:50 KST 2009 */