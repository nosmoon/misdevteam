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


public class MC_BUDG_4030_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dd;
	public String dd_nm;

	public MC_BUDG_4030_MCURLISTRecord(){}

	public void setDd(String dd){
		this.dd = dd;
	}

	public void setDd_nm(String dd_nm){
		this.dd_nm = dd_nm;
	}

	public String getDd(){
		return this.dd;
	}

	public String getDd_nm(){
		return this.dd_nm;
	}
}

/* �ۼ��ð� : Wed Apr 15 20:54:21 KST 2009 */