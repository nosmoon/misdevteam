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


public class MC_BUDG_6044_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_cd;
	public String exec_no;

	public MC_BUDG_6044_LCURLISTRecord(){}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getExec_no(){
		return this.exec_no;
	}
}

/* �ۼ��ð� : Fri May 15 17:30:54 KST 2009 */