/***************************************************************************************************
* ���ϸ� : .java
* ��� : �λ�-�޿�����-�Ѻ��� ���� �� ��ȸ(TV������)
* �ۼ����� : 2014-10-15
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.edu.rec;

import java.sql.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String posi_nm;


	public HD_EDU_1610_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	
}

/* �ۼ��ð� : Tue Nov 04 09:42:54 KST 2014 */