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


public class MC_BUDG_6210_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String code;
	public String codename;

	public MC_BUDG_6210_MCURLISTRecord(){}

	public void setCode(String code){
		this.code = code;
	}

	public void setCodename(String codename){
		this.codename = codename;
	}

	public String getCode(){
		return this.code;
	}

	public String getCodename(){
		return this.codename;
	}
}

/* �ۼ��ð� : Mon May 25 16:40:12 KST 2009 */