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


public class AD_EIS_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String advt_amt;

	public AD_EIS_1110_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_amt(String advt_amt){
		this.advt_amt = advt_amt;
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
}

/* �ۼ��ð� : Wed Apr 22 11:43:42 KST 2009 */