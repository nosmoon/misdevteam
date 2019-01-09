/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_1030_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String sub_dept_cd;
	public String sale_clsf;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String sale_clsf_nm;
	public String mc_amt;
	public String im_amt;
	public String im_rate;

	public IS_RPT_1030_LCURLIST1Record(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setMc_amt(String mc_amt){
		this.mc_amt = mc_amt;
	}

	public void setIm_amt(String im_amt){
		this.im_amt = im_amt;
	}

	public void setIm_rate(String im_rate){
		this.im_rate = im_rate;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getMc_amt(){
		return this.mc_amt;
	}

	public String getIm_amt(){
		return this.im_amt;
	}

	public String getIm_rate(){
		return this.im_rate;
	}
}

/* 작성시간 : Mon Jun 04 14:13:10 KST 2012 */