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


public class AD_DEP_3010_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String pubc_yymm;
	public String pubc_amt;
	public String rcpm_amt;
	public String pubc_avg;
	public String misu_amt;
	public String dhon_amt;
	public String tot_amt;
	public String sago_avg;
	public String sil_rcpm_avg;

	public AD_DEP_3010_LCURLIST2Record(){}

	public void setPubc_yymm(String pubc_yymm){
		this.pubc_yymm = pubc_yymm;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setPubc_avg(String pubc_avg){
		this.pubc_avg = pubc_avg;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setDhon_amt(String dhon_amt){
		this.dhon_amt = dhon_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setSago_avg(String sago_avg){
		this.sago_avg = sago_avg;
	}

	public void setSil_rcpm_avg(String sil_rcpm_avg){
		this.sil_rcpm_avg = sil_rcpm_avg;
	}

	public String getPubc_yymm(){
		return this.pubc_yymm;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getPubc_avg(){
		return this.pubc_avg;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getDhon_amt(){
		return this.dhon_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getSago_avg(){
		return this.sago_avg;
	}

	public String getSil_rcpm_avg(){
		return this.sil_rcpm_avg;
	}
}

/* 작성시간 : Tue Apr 14 20:42:38 KST 2009 */