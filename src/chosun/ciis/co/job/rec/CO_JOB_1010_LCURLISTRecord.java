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


package chosun.ciis.co.job.rec;

import java.sql.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.ds.*;

/**
 * 
 */


public class CO_JOB_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String wr_clsf;
	public String titl;
	public String answer_yn;
	public String make_dt;
	public String make_pers;
	public String job_clsf;
	public String cntc_seq;
	public String rmsg_cnt;
	public String answer_cnt;
	public String add_file_nm;

	public CO_JOB_1010_LCURLISTRecord(){}

	public void setWr_clsf(String wr_clsf){
		this.wr_clsf = wr_clsf;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setAnswer_yn(String answer_yn){
		this.answer_yn = answer_yn;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setRmsg_cnt(String rmsg_cnt){
		this.rmsg_cnt = rmsg_cnt;
	}

	public void setAnswer_cnt(String answer_cnt){
		this.answer_cnt = answer_cnt;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public String getWr_clsf(){
		return this.wr_clsf;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getAnswer_yn(){
		return this.answer_yn;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getRmsg_cnt(){
		return this.rmsg_cnt;
	}

	public String getAnswer_cnt(){
		return this.answer_cnt;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}
}

/* 작성시간 : Mon May 11 11:21:01 KST 2009 */