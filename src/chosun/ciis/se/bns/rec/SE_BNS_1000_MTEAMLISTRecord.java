/***************************************************************************************************
* ���ϸ� : SE_BNS_1000_MTEAMLISTRecord.java
* ��� : �Ǹ�-���˹����� - ���˹��̼�����Ȳ
* �ۼ����� : 2009-04-28
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1000_MTEAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SE_BNS_1000_MTEAMLISTRecord(){}

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

/* �ۼ��ð� : Tue Apr 28 13:21:45 KST 2009 */