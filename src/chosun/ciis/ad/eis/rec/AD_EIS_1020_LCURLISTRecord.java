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


public class AD_EIS_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String advt_amt;
	public String pubc_amt;
	public String rate;

	public AD_EIS_1020_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_amt(String advt_amt){
		this.advt_amt = advt_amt;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_amt(){
		return this.advt_amt;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRate(){
		return this.rate;
	}
}

/* �ۼ��ð� : Wed Apr 22 11:20:31 KST 2009 */