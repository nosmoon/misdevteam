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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1017_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String base_saly;
	public String posk_saly;

	public HD_LVCMPY_1017_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}
}

/* �ۼ��ð� : Mon Nov 23 21:02:48 KST 2009 */