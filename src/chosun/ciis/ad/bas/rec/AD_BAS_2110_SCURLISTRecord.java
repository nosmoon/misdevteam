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


public class AD_BAS_2110_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String frdt;
	public String todt;
	public String carr_matt;

	public AD_BAS_2110_SCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setCarr_matt(String carr_matt){
		this.carr_matt = carr_matt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getCarr_matt(){
		return this.carr_matt;
	}
}

/* 작성시간 : Tue Jan 20 16:17:09 KST 2009 */