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


public class AD_DEP_3430_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String misu_amt1;
	public String misu_amt2;
	public String misu_amt3;
	public String misu_amt4;
	public String tot;

	public AD_DEP_3430_LCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setMisu_amt1(String misu_amt1){
		this.misu_amt1 = misu_amt1;
	}

	public void setMisu_amt2(String misu_amt2){
		this.misu_amt2 = misu_amt2;
	}

	public void setMisu_amt3(String misu_amt3){
		this.misu_amt3 = misu_amt3;
	}

	public void setMisu_amt4(String misu_amt4){
		this.misu_amt4 = misu_amt4;
	}

	public void setTot(String tot){
		this.tot = tot;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getMisu_amt1(){
		return this.misu_amt1;
	}

	public String getMisu_amt2(){
		return this.misu_amt2;
	}

	public String getMisu_amt3(){
		return this.misu_amt3;
	}

	public String getMisu_amt4(){
		return this.misu_amt4;
	}

	public String getTot(){
		return this.tot;
	}
}

/* 작성시간 : Fri Apr 17 18:13:32 KST 2009 */