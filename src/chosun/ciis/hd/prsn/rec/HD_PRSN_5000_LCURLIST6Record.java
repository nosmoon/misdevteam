

package chosun.ciis.hd.prsn.rec;

import java.sql.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.ds.*;

/**
 * 
 */


public class HD_PRSN_5000_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String eip_cnt;
	public String erp_cnt;

	public HD_PRSN_5000_LCURLIST6Record(){}

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

	public void setEip_cnt(String eip_cnt){
		this.eip_cnt = eip_cnt;
	}

	public void setErp_cnt(String erp_cnt){
		this.erp_cnt = erp_cnt;
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

	public String getEip_cnt(){
		return this.eip_cnt;
	}

	public String getErp_cnt(){
		return this.erp_cnt;
	}
}

/* 작성시간 : Tue May 31 16:44:37 KST 2011 */