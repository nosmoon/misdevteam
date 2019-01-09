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


public class AD_DEP_1850_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String pubc_slip_no;
	public String dlco_nm;
	public String pubc_tot_amt;
	public String misu_amt;
	public String misu_yb;
	public String gjagferat;
	public String gjagfee;

	public AD_DEP_1850_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setMisu_yb(String misu_yb){
		this.misu_yb = misu_yb;
	}

	public void setGjagferat(String gjagferat){
		this.gjagferat = gjagferat;
	}

	public void setGjagfee(String gjagfee){
		this.gjagfee = gjagfee;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getMisu_yb(){
		return this.misu_yb;
	}

	public String getGjagferat(){
		return this.gjagferat;
	}

	public String getGjagfee(){
		return this.gjagfee;
	}
}

/* 작성시간 : Thu Apr 23 13:21:44 KST 2009 */