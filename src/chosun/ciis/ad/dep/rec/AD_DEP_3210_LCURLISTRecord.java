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


public class AD_DEP_3210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cash_amt;
	public String note3;
	public String note4;
	public String note5;
	public String note6;
	public String note_amt;
	public String fee;
	public String etc_amt;
	public String tot_amt;

	public AD_DEP_3210_LCURLISTRecord(){}

	public void setCash_amt(String cash_amt){
		this.cash_amt = cash_amt;
	}

	public void setNote3(String note3){
		this.note3 = note3;
	}

	public void setNote4(String note4){
		this.note4 = note4;
	}

	public void setNote5(String note5){
		this.note5 = note5;
	}

	public void setNote6(String note6){
		this.note6 = note6;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getCash_amt(){
		return this.cash_amt;
	}

	public String getNote3(){
		return this.note3;
	}

	public String getNote4(){
		return this.note4;
	}

	public String getNote5(){
		return this.note5;
	}

	public String getNote6(){
		return this.note6;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getFee(){
		return this.fee;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Mon Apr 20 17:58:03 KST 2009 */