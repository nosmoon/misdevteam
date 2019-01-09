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


package chosun.ciis.hd.orga.rec;

import java.sql.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */


public class HD_ORGA_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String seq;
	public String dept_nm;
	public String pre_dept_cd;
	public String pre_dept_nm;
	public String chg_aft_dept_cd;
	public String chg_aft_dept_nm;
	public String dept_clsf;

	public HD_ORGA_1003_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPre_dept_cd(String pre_dept_cd){
		this.pre_dept_cd = pre_dept_cd;
	}

	public void setPre_dept_nm(String pre_dept_nm){
		this.pre_dept_nm = pre_dept_nm;
	}

	public void setChg_aft_dept_cd(String chg_aft_dept_cd){
		this.chg_aft_dept_cd = chg_aft_dept_cd;
	}

	public void setChg_aft_dept_nm(String chg_aft_dept_nm){
		this.chg_aft_dept_nm = chg_aft_dept_nm;
	}

	public void setDept_clsf(String dept_clsf){
		this.dept_clsf = dept_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPre_dept_cd(){
		return this.pre_dept_cd;
	}

	public String getPre_dept_nm(){
		return this.pre_dept_nm;
	}

	public String getChg_aft_dept_cd(){
		return this.chg_aft_dept_cd;
	}

	public String getChg_aft_dept_nm(){
		return this.chg_aft_dept_nm;
	}

	public String getDept_clsf(){
		return this.dept_clsf;
	}
}

/* 작성시간 : Mon Feb 16 13:52:05 KST 2009 */