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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_2302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String posi_nm;
	public String year_add_vaca_dds;
	public String use_vaca_dds;
	public String duty_vaca_dds;
	public String rmn_vaca_dds;

	public HD_VACA_2302_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setYear_add_vaca_dds(String year_add_vaca_dds){
		this.year_add_vaca_dds = year_add_vaca_dds;
	}

	public void setUse_vaca_dds(String use_vaca_dds){
		this.use_vaca_dds = use_vaca_dds;
	}

	public void setDuty_vaca_dds(String duty_vaca_dds){
		this.duty_vaca_dds = duty_vaca_dds;
	}

	public void setRmn_vaca_dds(String rmn_vaca_dds){
		this.rmn_vaca_dds = rmn_vaca_dds;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getYear_add_vaca_dds(){
		return this.year_add_vaca_dds;
	}

	public String getUse_vaca_dds(){
		return this.use_vaca_dds;
	}

	public String getDuty_vaca_dds(){
		return this.duty_vaca_dds;
	}

	public String getRmn_vaca_dds(){
		return this.rmn_vaca_dds;
	}
}

/* �ۼ��ð� : Mon Feb 02 15:53:37 KST 2015 */