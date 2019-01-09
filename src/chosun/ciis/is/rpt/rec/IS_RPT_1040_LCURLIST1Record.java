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


public class IS_RPT_1040_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String sub_dept_cd;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String m_rd_amt;
	public String m_cd_amt;
	public String m_tm_amt;
	public String m_rm_amt;
	public String s_rd_amt;
	public String s_cd_amt;
	public String s_tm_amt;
	public String s_rm_amt;

	public IS_RPT_1040_LCURLIST1Record(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setM_rd_amt(String m_rd_amt){
		this.m_rd_amt = m_rd_amt;
	}

	public void setM_cd_amt(String m_cd_amt){
		this.m_cd_amt = m_cd_amt;
	}

	public void setM_tm_amt(String m_tm_amt){
		this.m_tm_amt = m_tm_amt;
	}

	public void setM_rm_amt(String m_rm_amt){
		this.m_rm_amt = m_rm_amt;
	}

	public void setS_rd_amt(String s_rd_amt){
		this.s_rd_amt = s_rd_amt;
	}

	public void setS_cd_amt(String s_cd_amt){
		this.s_cd_amt = s_cd_amt;
	}

	public void setS_tm_amt(String s_tm_amt){
		this.s_tm_amt = s_tm_amt;
	}

	public void setS_rm_amt(String s_rm_amt){
		this.s_rm_amt = s_rm_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getM_rd_amt(){
		return this.m_rd_amt;
	}

	public String getM_cd_amt(){
		return this.m_cd_amt;
	}

	public String getM_tm_amt(){
		return this.m_tm_amt;
	}

	public String getM_rm_amt(){
		return this.m_rm_amt;
	}

	public String getS_rd_amt(){
		return this.s_rd_amt;
	}

	public String getS_cd_amt(){
		return this.s_cd_amt;
	}

	public String getS_tm_amt(){
		return this.s_tm_amt;
	}

	public String getS_rm_amt(){
		return this.s_rm_amt;
	}
}

/* 작성시간 : Mon Jun 04 14:25:41 KST 2012 */