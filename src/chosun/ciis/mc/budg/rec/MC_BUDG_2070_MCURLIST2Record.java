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


public class MC_BUDG_2070_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String max_yy;

	public MC_BUDG_2070_MCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMax_yy(String max_yy){
		this.max_yy = max_yy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMax_yy(){
		return this.max_yy;
	}
}

/* �ۼ��ð� : Fri Apr 03 14:16:20 KST 2009 */