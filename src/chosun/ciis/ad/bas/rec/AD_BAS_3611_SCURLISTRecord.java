/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ŷ�ó�ι�����
* �ۼ����� : 2010.07.16
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


public class AD_BAS_3611_SCURLISTRecord extends java.lang.Object implements java.io.Serializable
{
	public String seq;
	public String frdt;
	public String todt;
	public String memo;

	public AD_BAS_3611_SCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMemo(){
		return this.memo;
	}
}

/* �ۼ��ð� : Tue Jan 20 16:17:09 KST 2009 */