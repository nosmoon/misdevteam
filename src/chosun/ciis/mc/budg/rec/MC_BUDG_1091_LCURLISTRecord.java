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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_1091_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_cdnm;
	public String prt_clsf_cd;
	public String prt_clsf_cdnm;

	public MC_BUDG_1091_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setPrt_clsf_cd(String prt_clsf_cd){
		this.prt_clsf_cd = prt_clsf_cd;
	}

	public void setPrt_clsf_cdnm(String prt_clsf_cdnm){
		this.prt_clsf_cdnm = prt_clsf_cdnm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getPrt_clsf_cd(){
		return this.prt_clsf_cd;
	}

	public String getPrt_clsf_cdnm(){
		return this.prt_clsf_cdnm;
	}
}

/* �ۼ��ð� : Wed Apr 08 09:51:41 KST 2009 */