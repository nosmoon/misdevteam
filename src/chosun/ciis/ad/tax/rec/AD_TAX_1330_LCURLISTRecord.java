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


package chosun.ciis.ad.tax.rec;


/**
 * 
 */


public class AD_TAX_1330_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prof_type_nm;
	public String cnt;
	public String suply_amt;
	public String vat_amt;

	public AD_TAX_1330_LCURLISTRecord(){}

	public void setProf_type_nm(String prof_type_nm){
		this.prof_type_nm = prof_type_nm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public String getProf_type_nm(){
		return this.prof_type_nm;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}
}

/* �ۼ��ð� : Wed Apr 01 13:30:31 KST 2009 */