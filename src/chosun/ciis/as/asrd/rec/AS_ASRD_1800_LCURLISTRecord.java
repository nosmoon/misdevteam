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


public class AS_ASRD_1800_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String bund_cd;
	public String bund_nm;

	public AS_ASRD_1800_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBund_cd(String bund_cd){
		this.bund_cd = bund_cd;
	}

	public void setBund_nm(String bund_nm){
		this.bund_nm = bund_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBund_cd(){
		return this.bund_cd;
	}

	public String getBund_nm(){
		return this.bund_nm;
	}
}

/* �ۼ��ð� : Thu Feb 26 16:09:10 KST 2009 */