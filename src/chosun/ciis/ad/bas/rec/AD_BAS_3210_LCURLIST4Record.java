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


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_3210_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String tot_pcnt;
	public String tot_clas;
	public String asum_pubc_amt;

	public AD_BAS_3210_LCURLIST4Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTot_pcnt(String tot_pcnt){
		this.tot_pcnt = tot_pcnt;
	}

	public void setTot_clas(String tot_clas){
		this.tot_clas = tot_clas;
	}

	public void setAsum_pubc_amt(String asum_pubc_amt){
		this.asum_pubc_amt = asum_pubc_amt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTot_pcnt(){
		return this.tot_pcnt;
	}

	public String getTot_clas(){
		return this.tot_clas;
	}

	public String getAsum_pubc_amt(){
		return this.asum_pubc_amt;
	}
}

/* �ۼ��ð� : Tue Jul 07 14:11:18 KST 2009 */