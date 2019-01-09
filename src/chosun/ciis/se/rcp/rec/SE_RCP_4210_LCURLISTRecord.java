/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_4210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String amt;
	public String rcpm_hang;
	public String rcpm_gb;
	public String slip_no;

	public SE_RCP_4210_LCURLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRcpm_hang(String rcpm_hang){
		this.rcpm_hang = rcpm_hang;
	}

	public void setRcpm_gb(String rcpm_gb){
		this.rcpm_gb = rcpm_gb;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRcpm_hang(){
		return this.rcpm_hang;
	}

	public String getRcpm_gb(){
		return this.rcpm_gb;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Mon May 11 13:23:06 KST 2009 */