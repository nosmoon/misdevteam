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


public class AD_TAX_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_dt;
	public String mang_frdt;
	public String mang_todt;
	public String clos_proc_dt;

	public AD_TAX_1410_LCURLISTRecord(){}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setMang_frdt(String mang_frdt){
		this.mang_frdt = mang_frdt;
	}

	public void setMang_todt(String mang_todt){
		this.mang_todt = mang_todt;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getMang_frdt(){
		return this.mang_frdt;
	}

	public String getMang_todt(){
		return this.mang_todt;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}
}

/* �ۼ��ð� : Wed Apr 01 12:21:35 KST 2009 */