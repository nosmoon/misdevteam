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


public class AD_BAS_1300_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_abrv_nm;

	public AD_BAS_1300_MCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getCd(){
		return this.cd; 
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}
}

/* �ۼ��ð� : Wed Jan 14 18:04:01 KST 2009 */