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


package chosun.ciis.as.asrd.rec;

import java.sql.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.ds.*;

/**
 * 
 */


public class AS_ASRD_1700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String item_cd;
	public String item_nm;

	public AS_ASRD_1700_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}
}

/* �ۼ��ð� : Thu Feb 26 14:25:39 KST 2009 */