/***************************************************************************************************
* ���ϸ�   : SP_AD_BAS_2700_M.java
* ���     : ��Ʈ���� �ʱ�
* �ۼ����� : 
* �ۼ���   : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;


/**
 * �����ڷ����-��Ʈ���� �ʱ�
 */


public class AD_BAS_2700_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public AD_BAS_2700_MCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
}

/* �ۼ��ð� : Thu Mar 05 20:35:21 KST 2009 */