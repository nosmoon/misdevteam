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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4083_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_no;
	public String evnt_proc_clsf_nm;
	public String budg_cd;
	public String budg_cdnm;
	public String befamt;
	public String addamt;
	public String sumamt;

	public MC_BUDG_4083_LCURLISTRecord(){}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setEvnt_proc_clsf_nm(String evnt_proc_clsf_nm){
		this.evnt_proc_clsf_nm = evnt_proc_clsf_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setBefamt(String befamt){
		this.befamt = befamt;
	}

	public void setAddamt(String addamt){
		this.addamt = addamt;
	}

	public void setSumamt(String sumamt){
		this.sumamt = sumamt;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getEvnt_proc_clsf_nm(){
		return this.evnt_proc_clsf_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getBefamt(){
		return this.befamt;
	}

	public String getAddamt(){
		return this.addamt;
	}

	public String getSumamt(){
		return this.sumamt;
	}
}

/* 작성시간 : Mon May 18 14:24:01 KST 2009 */