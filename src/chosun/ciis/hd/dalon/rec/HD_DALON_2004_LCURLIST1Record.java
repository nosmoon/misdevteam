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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_2004_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String cnt;

	public HD_DALON_2004_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* �ۼ��ð� : Mon May 11 14:31:34 KST 2009 */