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


package chosun.ciis.ad.eis.rec;


/**
 * 
 */


public class AD_EIS_1425_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String pubc_amt;
	public String pre_pubc_amt;
	public String icdc_amt;
	public String icdc_rate;

	public AD_EIS_1425_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setPre_pubc_amt(String pre_pubc_amt){
		this.pre_pubc_amt = pre_pubc_amt;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setIcdc_rate(String icdc_rate){
		this.icdc_rate = icdc_rate;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getPre_pubc_amt(){
		return this.pre_pubc_amt;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getIcdc_rate(){
		return this.icdc_rate;
	}
}

/* �ۼ��ð� : Thu Apr 23 17:54:21 KST 2009 */