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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_1603_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sel_chk;
	public String dept_cd;
	public String emp_no;
	public String dept_nm;
	public String nm_korn;
	public String dty_nm;
	public String dty_cd;
	public String posi_nm;

	public HD_EVLU_1603_LCURLISTRecord(){}

	public void setSel_chk(String sel_chk){
		this.sel_chk = sel_chk;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public String getSel_chk(){
		return this.sel_chk;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}
}

/* �ۼ��ð� : Thu Mar 20 17:05:44 KST 2014 */