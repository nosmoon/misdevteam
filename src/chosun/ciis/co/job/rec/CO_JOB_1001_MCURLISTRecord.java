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


package chosun.ciis.co.job.rec;


/**
 * 
 */


public class CO_JOB_1001_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String orga_cd;
	public String orga_nm;
	public String supr_orga_cd;
	public String depth;

	public CO_JOB_1001_MCURLISTRecord(){}

	public void setOrga_cd(String orga_cd){
		this.orga_cd = orga_cd;
	}

	public void setOrga_nm(String orga_nm){
		this.orga_nm = orga_nm;
	}

	public void setSupr_orga_cd(String supr_orga_cd){
		this.supr_orga_cd = supr_orga_cd;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public String getOrga_cd(){
		return this.orga_cd;
	}

	public String getOrga_nm(){
		return this.orga_nm;
	}

	public String getSupr_orga_cd(){
		return this.supr_orga_cd;
	}

	public String getDepth(){
		return this.depth;
	}
}

/* �ۼ��ð� : Thu May 07 09:44:36 KST 2009 */