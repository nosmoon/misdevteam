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


public class AD_BAS_2510_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String pubc_cnt;
	public String issu_side;
	public String addn;

	public AD_BAS_2510_LCURLIST5Record(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_cnt(String pubc_cnt){
		this.pubc_cnt = pubc_cnt;
	}

	public void setIssu_side(String issu_side){
		this.issu_side = issu_side;
	}

	public void setAddn(String addn){
		this.addn = addn;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_cnt(){
		return this.pubc_cnt;
	}

	public String getIssu_side(){
		return this.issu_side;
	}

	public String getAddn(){
		return this.addn;
	}
}

/* �ۼ��ð� : Fri May 01 15:02:52 KST 2009 */