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


package chosun.ciis.ad.eis.rec;


/**
 * 
 */


public class AD_EIS_1200_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sect_nm_cd;
	public String sect_nm;

	public AD_EIS_1200_MCURLISTRecord(){}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}
}

/* 작성시간 : Wed Apr 22 15:08:41 KST 2009 */