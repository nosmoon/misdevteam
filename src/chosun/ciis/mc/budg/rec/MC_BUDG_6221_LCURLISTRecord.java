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


public class MC_BUDG_6221_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sect_cd;
	public String sect_cdnm;
	public String sect_nm_cd;
	public String sect_nm;
	public String excl_clsf;

	public MC_BUDG_6221_LCURLISTRecord(){}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_cdnm(String sect_cdnm){
		this.sect_cdnm = sect_cdnm;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setExcl_clsf(String excl_clsf){
		this.excl_clsf = excl_clsf;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_cdnm(){
		return this.sect_cdnm;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getExcl_clsf(){
		return this.excl_clsf;
	}
}

/* �ۼ��ð� : Fri May 22 09:27:04 KST 2009 */