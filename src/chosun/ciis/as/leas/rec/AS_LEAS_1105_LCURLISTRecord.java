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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_nm;
	public String aset_no;

	public AS_LEAS_1105_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getAset_no(){
		return this.aset_no;
	}
}

/* �ۼ��ð� : Tue Apr 07 11:20:13 KST 2009 */