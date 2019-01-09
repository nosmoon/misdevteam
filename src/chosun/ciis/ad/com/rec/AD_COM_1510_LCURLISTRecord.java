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


package chosun.ciis.ad.com.rec;


/**
 * 
 */


public class AD_COM_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yyyy;
	public String seq;
	public String doc_no;
	public String rcv_plac;
	public String titl;
	public String make_dt;
	public String make_pers;

	public AD_COM_1510_LCURLISTRecord(){}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDoc_no(String doc_no){
		this.doc_no = doc_no;
	}

	public void setRcv_plac(String rcv_plac){
		this.rcv_plac = rcv_plac;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDoc_no(){
		return this.doc_no;
	}

	public String getRcv_plac(){
		return this.rcv_plac;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_pers(){
		return this.make_pers;
	}
}

/* 작성시간 : Thu Apr 30 14:14:54 KST 2009 */