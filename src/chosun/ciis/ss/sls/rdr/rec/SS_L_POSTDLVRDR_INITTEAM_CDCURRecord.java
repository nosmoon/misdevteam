/***************************************************************************************************
* ���ϸ� : SS_L_POSTDLVRDR_INITTEAM_CDCURRecord.java
* ��� : ���ڰ��� ��۵��ڰ��� �ʱ�ȭ��
* �ۼ����� : 2015-06-17
* �ۼ��� : �� �� �� 
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ :  
* �������� : 
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 
 */


public class SS_L_POSTDLVRDR_INITTEAM_CDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;

	public SS_L_POSTDLVRDR_INITTEAM_CDCURRecord(){}

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

/* �ۼ��ð� : Wed Jun 17 09:49:10 KST 2015 */