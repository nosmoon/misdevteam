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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String dept_cd;

	public AD_EVLU_1020_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}
}

/* �ۼ��ð� : Mon Mar 22 19:58:11 KST 2010 */