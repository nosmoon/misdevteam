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


package chosun.ciis.ad.common.rec;


/**
 * 
 */


public class AD_CO_1001_LCURLIS2Record extends java.lang.Object implements java.io.Serializable{

	public String major;
	public String cd;
	public String cdnm;

	public AD_CO_1001_LCURLIS2Record(){}

	public void setMajor(String major){
		this.major = major;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getMajor(){
		return this.major;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* �ۼ��ð� : Mon Feb 02 14:51:47 KST 2009 */