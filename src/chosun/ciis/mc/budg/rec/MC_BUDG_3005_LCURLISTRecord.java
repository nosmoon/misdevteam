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


public class MC_BUDG_3005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String tms_nm;

	public MC_BUDG_3005_LCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setTms_nm(String tms_nm){
		this.tms_nm = tms_nm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getTms_nm(){
		return this.tms_nm;
	}
}

/* �ۼ��ð� : Mon Jul 13 11:38:18 KST 2009 */