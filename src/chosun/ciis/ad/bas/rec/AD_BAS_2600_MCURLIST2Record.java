/***************************************************************************************************
* ���ϸ�   : SP_AD_BAS_2600_M.java
* ���     : ��ǥ���� �ʱ�
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
 * �����ڷ����-��ǥ���� �ʱ�
 */


public class AD_BAS_2600_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public AD_BAS_2600_MCURLIST2Record(){}

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

/* �ۼ��ð� : Wed Mar 11 20:32:40 KST 2009 */