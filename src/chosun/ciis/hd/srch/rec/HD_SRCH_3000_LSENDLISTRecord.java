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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_3000_LSENDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aprv_in_cmpy;
	public String emp;

	public HD_SRCH_3000_LSENDLISTRecord(){}

	public void setAprv_in_cmpy(String aprv_in_cmpy){
		this.aprv_in_cmpy = aprv_in_cmpy;
	}

	public void setEmp(String emp){
		this.emp = emp;
	}

	public String getAprv_in_cmpy(){
		return this.aprv_in_cmpy;
	}

	public String getEmp(){
		return this.emp;
	}
}

/* �ۼ��ð� : Mon Feb 24 11:00:33 KST 2014 */