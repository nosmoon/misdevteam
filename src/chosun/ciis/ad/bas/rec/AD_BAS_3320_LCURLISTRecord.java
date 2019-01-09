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


public class AD_BAS_3320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String dlco_no;
	public String ern;
	public String presi_nm;
	public String zip;
	public String addr;
	public String tel_no;

	public AD_BAS_3320_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}
}

/* 작성시간 : Thu Apr 02 13:18:29 KST 2009 */