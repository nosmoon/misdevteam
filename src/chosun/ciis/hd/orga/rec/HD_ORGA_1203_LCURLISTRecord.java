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


package chosun.ciis.hd.orga.rec;

import java.sql.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */


public class HD_ORGA_1203_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String lvl;
	public String dept_nm;
	public String dept_cd;

	public HD_ORGA_1203_LCURLISTRecord(){}

	public void setLvl(String lvl){
		this.lvl = lvl;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getLvl(){
		return this.lvl;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}
}

/* �ۼ��ð� : Wed Feb 18 19:19:57 KST 2009 */