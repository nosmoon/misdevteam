/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 *
 */

public class HD_VACA_1305_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String aply_yy;
	public String appm_vaca_plan_dt;

	public HD_VACA_1305_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setAppm_vaca_plan_dt(String appm_vaca_plan_dt){
		this.appm_vaca_plan_dt = appm_vaca_plan_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getAppm_vaca_plan_dt(){
		return this.appm_vaca_plan_dt;
	}
}

/* 작성시간 : Thu Jul 16 15:15:06 KST 2009 */