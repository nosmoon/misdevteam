/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.dep.rec;


/**
 * 
 */


public class AD_DEP_2330_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String pubc_amt;
	public String rcpm_amt;
	public String tot_rcpm_amt;

	public AD_DEP_2330_LCURLIST2Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setTot_rcpm_amt(String tot_rcpm_amt){
		this.tot_rcpm_amt = tot_rcpm_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getTot_rcpm_amt(){
		return this.tot_rcpm_amt;
	}
}

/* �ۼ��ð� : Mon Jun 22 19:07:27 KST 2009 */