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


package chosun.ciis.ad.pub.rec;


/**
 * 
 */


public class AD_PUB_1800_MCURLIST10Record extends java.lang.Object implements java.io.Serializable{

	public String sect_cd;
	public String sect_seq;

	public AD_PUB_1800_MCURLIST10Record(){}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}
}

/* 작성시간 : Mon Jun 08 16:40:23 KST 2009 */