/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 2017-01-05
* �ۼ��� : �� �� ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :  
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_3000_ATEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_BOI_3000_ATEAMLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
}

/* �ۼ��ð� : Wed Jun 28 09:53:49 KST 2017 */