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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1017_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String year_vaca_dds;
	public String add_vaca_dds;
	public String use_vaca_dds;
	public String duty_vaca_dds;

	public HD_LVCMPY_1017_LCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setYear_vaca_dds(String year_vaca_dds){
		this.year_vaca_dds = year_vaca_dds;
	}

	public void setAdd_vaca_dds(String add_vaca_dds){
		this.add_vaca_dds = add_vaca_dds;
	}

	public void setUse_vaca_dds(String use_vaca_dds){
		this.use_vaca_dds = use_vaca_dds;
	}

	public void setDuty_vaca_dds(String duty_vaca_dds){
		this.duty_vaca_dds = duty_vaca_dds;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getYear_vaca_dds(){
		return this.year_vaca_dds;
	}

	public String getAdd_vaca_dds(){
		return this.add_vaca_dds;
	}

	public String getUse_vaca_dds(){
		return this.use_vaca_dds;
	}

	public String getDuty_vaca_dds(){
		return this.duty_vaca_dds;
	}
}

/* 작성시간 : Mon Nov 23 21:02:48 KST 2009 */