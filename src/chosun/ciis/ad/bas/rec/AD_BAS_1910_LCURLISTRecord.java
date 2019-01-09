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


public class AD_BAS_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String make_dt;
	public String dlco_no;
	public String dlco_nm;
	public String diary_titl;
	public String make_pers_nm;
	public String dlco_clsf;

	public AD_BAS_1910_LCURLISTRecord(){}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDiary_titl(String diary_titl){
		this.diary_titl = diary_titl;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDiary_titl(){
		return this.diary_titl;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}
}

/* 작성시간 : Wed Jul 29 13:06:47 KST 2009 */