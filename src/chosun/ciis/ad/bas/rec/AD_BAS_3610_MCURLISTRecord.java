/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : KBS
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


public class AD_BAS_3610_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public AD_BAS_3610_MCURLISTRecord(){}

	public void setCd(String cd)
	{
		this.cd = cd;
	}
	public void setCdnm(String cdnm)
	{
		this.cdnm = cdnm;
	}
	public void setCdAbrvNm(String cd_abrv_nm)
	{
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getCd()
	{
		return this.cd;
	}
	public String getCdnm()
	{
		return this.cdnm;
	}
	public String getCdAbrvNm()
	{
		return this.cd_abrv_nm;
	}
}

/* �ۼ��ð� : Fri Jan 30 11:38:39 KST 2009 */