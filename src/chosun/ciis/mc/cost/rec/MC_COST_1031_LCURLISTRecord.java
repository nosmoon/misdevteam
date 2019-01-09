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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_1031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String dept_cdnm;
	public String dept_cd;
	public String budg_cdnm;
	public String excp_dstb_cd;
	public String excp_dstb_cdnm;

	public MC_COST_1031_LCURLISTRecord(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDept_cdnm(String dept_cdnm){
		this.dept_cdnm = dept_cdnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setExcp_dstb_cd(String excp_dstb_cd){
		this.excp_dstb_cd = excp_dstb_cd;
	}

	public void setExcp_dstb_cdnm(String excp_dstb_cdnm){
		this.excp_dstb_cdnm = excp_dstb_cdnm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDept_cdnm(){
		return this.dept_cdnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getExcp_dstb_cd(){
		return this.excp_dstb_cd;
	}

	public String getExcp_dstb_cdnm(){
		return this.excp_dstb_cdnm;
	}
}

/* 작성시간 : Wed Apr 29 09:51:09 KST 2009 */