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

import java.sql.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.ds.*;

/**
 * 
 */


public class CO_JOB_1000_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String orga_cd;
	public String orga_nm;
	public String supr_orga_cd;

	public CO_JOB_1000_MCURLISTRecord(){}

	public void setOrga_cd(String orga_cd){
		this.orga_cd = orga_cd;
	}

	public void setOrga_nm(String orga_nm){
		this.orga_nm = orga_nm;
	}

	public void setSupr_orga_cd(String supr_orga_cd){
		this.supr_orga_cd = supr_orga_cd;
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
}

/* �ۼ��ð� : Thu Mar 15 15:40:35 KST 2012 */