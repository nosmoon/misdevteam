/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String part_cd;
	public String part_nm;
	public String acct_cd;
	public String empno;
	public String nm;

	public SE_COMM_1010_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setEmpno(String empno){
		this.empno = empno;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getEmpno(){
		return this.empno;
	}

	public String getNm(){
		return this.nm;
	}
}

/* �ۼ��ð� : Mon Mar 23 20:17:06 KST 2009 */