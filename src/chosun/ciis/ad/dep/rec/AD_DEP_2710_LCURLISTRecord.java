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


public class AD_DEP_2710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String pubc_dt;
	public String pubc_amt;
	public String rcpm_amt;
	public String tot_rcpm_amt;
	public String avg_rcpm_amt;
	public String lack_amt;

	public AD_DEP_2710_LCURLISTRecord(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
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

	public void setAvg_rcpm_amt(String avg_rcpm_amt){
		this.avg_rcpm_amt = avg_rcpm_amt;
	}

	public void setLack_amt(String lack_amt){
		this.lack_amt = lack_amt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
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

	public String getAvg_rcpm_amt(){
		return this.avg_rcpm_amt;
	}

	public String getLack_amt(){
		return this.lack_amt;
	}
}

/* �ۼ��ð� : Fri Apr 10 13:19:50 KST 2009 */