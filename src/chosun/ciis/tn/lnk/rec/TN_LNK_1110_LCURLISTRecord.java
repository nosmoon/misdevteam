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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String excl_pmnt_idx;
	public String excl_type_nm;
	public String dept_idx_nm;
	public String title;
	public String dtl_cnt;
	public String insrt_dt;
	public String adminidx;
	public String excl_type;
	public String dept_idx;
	public String isupload;

	public TN_LNK_1110_LCURLISTRecord(){}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setExcl_type_nm(String excl_type_nm){
		this.excl_type_nm = excl_type_nm;
	}

	public void setDept_idx_nm(String dept_idx_nm){
		this.dept_idx_nm = dept_idx_nm;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setDtl_cnt(String dtl_cnt){
		this.dtl_cnt = dtl_cnt;
	}

	public void setInsrt_dt(String insrt_dt){
		this.insrt_dt = insrt_dt;
	}

	public void setAdminidx(String adminidx){
		this.adminidx = adminidx;
	}

	public void setExcl_type(String excl_type){
		this.excl_type = excl_type;
	}

	public void setDept_idx(String dept_idx){
		this.dept_idx = dept_idx;
	}

	public void setIsupload(String isupload){
		this.isupload = isupload;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getExcl_type_nm(){
		return this.excl_type_nm;
	}

	public String getDept_idx_nm(){
		return this.dept_idx_nm;
	}

	public String getTitle(){
		return this.title;
	}

	public String getDtl_cnt(){
		return this.dtl_cnt;
	}

	public String getInsrt_dt(){
		return this.insrt_dt;
	}

	public String getAdminidx(){
		return this.adminidx;
	}

	public String getExcl_type(){
		return this.excl_type;
	}

	public String getDept_idx(){
		return this.dept_idx;
	}

	public String getIsupload(){
		return this.isupload;
	}
}

/* 작성시간 : Thu Jul 28 16:49:19 KST 2016 */