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


package chosun.ciis.ad.dep.rec;


/**
 * 
 */


public class AD_DEP_3110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String per_per_pubc_amt;
	public String pre_pubc_amt;
	public String pubc_amt;
	public String next_pubc_amt;
	public String tot_amt;

	public AD_DEP_3110_LCURLISTRecord(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setPer_per_pubc_amt(String per_per_pubc_amt){
		this.per_per_pubc_amt = per_per_pubc_amt;
	}

	public void setPre_pubc_amt(String pre_pubc_amt){
		this.pre_pubc_amt = pre_pubc_amt;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setNext_pubc_amt(String next_pubc_amt){
		this.next_pubc_amt = next_pubc_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getPer_per_pubc_amt(){
		return this.per_per_pubc_amt;
	}

	public String getPre_pubc_amt(){
		return this.pre_pubc_amt;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getNext_pubc_amt(){
		return this.next_pubc_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Fri Apr 17 10:06:44 KST 2009 */