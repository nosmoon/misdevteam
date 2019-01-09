

package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_2401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String offi_nm;
	public String dept_nm;
	public String dept_cdnm;
	public String emp_nm;
	public String emp_no;
	public String emp_clsf_nm;
	public String emp_cost_dstb_cd;
	public String emp_dstb_clsf;
	public String qunt;

	public HD_SALY_2401_LCURLISTRecord(){}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cdnm(String dept_cdnm){
		this.dept_cdnm = dept_cdnm;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_cost_dstb_cd(String emp_cost_dstb_cd){
		this.emp_cost_dstb_cd = emp_cost_dstb_cd;
	}

	public void setEmp_dstb_clsf(String emp_dstb_clsf){
		this.emp_dstb_clsf = emp_dstb_clsf;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cdnm(){
		return this.dept_cdnm;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_cost_dstb_cd(){
		return this.emp_cost_dstb_cd;
	}

	public String getEmp_dstb_clsf(){
		return this.emp_dstb_clsf;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Fri Jul 30 17:52:32 KST 2010 */