/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Աݰ���
* �ۼ����� : 2011.10.17
* �ۼ��� : KBS
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


public class AD_DEP_4400_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;

	public AD_DEP_4400_MCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	
	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1() {
		return mang_cd_1;
	}

	public void setMang_cd_1(String mang_cd_1) {
		this.mang_cd_1 = mang_cd_1;
	}
	
	
}

