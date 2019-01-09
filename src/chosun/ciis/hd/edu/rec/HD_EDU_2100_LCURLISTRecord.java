

package chosun.ciis.hd.edu.rec;

import java.sql.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.ds.*;

/**
 * 
 */


public class HD_EDU_2100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String rptv_posi_nm;
	public String cour_yyyymm;
	public String cour_lng_cd_nm;
	public String cour_obj_cd_nm;
	public String cour_tm_cd_nm;
	public String lv_cd_nm;
	public String lv_test_req_cd_nm;
	public String occr_dt;
	public String seq;

	public HD_EDU_2100_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setRptv_posi_nm(String rptv_posi_nm){
		this.rptv_posi_nm = rptv_posi_nm;
	}

	public void setCour_yyyymm(String cour_yyyymm){
		this.cour_yyyymm = cour_yyyymm;
	}

	public void setCour_lng_cd_nm(String cour_lng_cd_nm){
		this.cour_lng_cd_nm = cour_lng_cd_nm;
	}

	public void setCour_obj_cd_nm(String cour_obj_cd_nm){
		this.cour_obj_cd_nm = cour_obj_cd_nm;
	}

	public void setCour_tm_cd_nm(String cour_tm_cd_nm){
		this.cour_tm_cd_nm = cour_tm_cd_nm;
	}

	public void setLv_cd_nm(String lv_cd_nm){
		this.lv_cd_nm = lv_cd_nm;
	}

	public void setLv_test_req_cd_nm(String lv_test_req_cd_nm){
		this.lv_test_req_cd_nm = lv_test_req_cd_nm;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getRptv_posi_nm(){
		return this.rptv_posi_nm;
	}

	public String getCour_yyyymm(){
		return this.cour_yyyymm;
	}

	public String getCour_lng_cd_nm(){
		return this.cour_lng_cd_nm;
	}

	public String getCour_obj_cd_nm(){
		return this.cour_obj_cd_nm;
	}

	public String getCour_tm_cd_nm(){
		return this.cour_tm_cd_nm;
	}

	public String getLv_cd_nm(){
		return this.lv_cd_nm;
	}

	public String getLv_test_req_cd_nm(){
		return this.lv_test_req_cd_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Mon Apr 11 10:23:25 KST 2011 */