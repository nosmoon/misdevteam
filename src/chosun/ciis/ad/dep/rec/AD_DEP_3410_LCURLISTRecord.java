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


public class AD_DEP_3410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String advt_amt;
	public String in_advt_fee;
	public String misu_amt;
	public String misu_rate;

	public AD_DEP_3410_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setAdvt_amt(String advt_amt){
		this.advt_amt = advt_amt;
	}

	public void setIn_advt_fee(String in_advt_fee){
		this.in_advt_fee = in_advt_fee;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setMisu_rate(String misu_rate){
		this.misu_rate = misu_rate;
	}

	public String getCd(){
		return this.cd;
	}

	public String getAdvt_amt(){
		return this.advt_amt;
	}

	public String getIn_advt_fee(){
		return this.in_advt_fee;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getMisu_rate(){
		return this.misu_rate;
	}
}

/* 작성시간 : Fri Apr 17 18:09:32 KST 2009 */