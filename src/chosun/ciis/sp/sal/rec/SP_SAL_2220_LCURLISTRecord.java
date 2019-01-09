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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_yymm;
	public String seq;
	public String rcpm_dt;
	public String purc_adjm_clsf_nm;
	public String c_dlco_no;
	public String c_dlco_nm;
	public String b_dlco_no;
	public String b_dlco_nm;
	public String amt;
	public String rdr_nm;
	public String rdr_addr;

	public SP_SAL_2220_LCURLISTRecord(){}

	public void setWork_yymm(String work_yymm){
		this.work_yymm = work_yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setPurc_adjm_clsf_nm(String purc_adjm_clsf_nm){
		this.purc_adjm_clsf_nm = purc_adjm_clsf_nm;
	}

	public void setC_dlco_no(String c_dlco_no){
		this.c_dlco_no = c_dlco_no;
	}

	public void setC_dlco_nm(String c_dlco_nm){
		this.c_dlco_nm = c_dlco_nm;
	}

	public void setB_dlco_no(String b_dlco_no){
		this.b_dlco_no = b_dlco_no;
	}

	public void setB_dlco_nm(String b_dlco_nm){
		this.b_dlco_nm = b_dlco_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setRdr_addr(String rdr_addr){
		this.rdr_addr = rdr_addr;
	}

	public String getWork_yymm(){
		return this.work_yymm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getPurc_adjm_clsf_nm(){
		return this.purc_adjm_clsf_nm;
	}

	public String getC_dlco_no(){
		return this.c_dlco_no;
	}

	public String getC_dlco_nm(){
		return this.c_dlco_nm;
	}

	public String getB_dlco_no(){
		return this.b_dlco_no;
	}

	public String getB_dlco_nm(){
		return this.b_dlco_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getRdr_addr(){
		return this.rdr_addr;
	}
}

/* 작성시간 : Mon Jul 09 14:20:25 KST 2012 */