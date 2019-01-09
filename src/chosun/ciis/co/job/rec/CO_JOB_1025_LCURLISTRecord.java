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


public class CO_JOB_1025_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clsf;
	public String cntc_seq;
	public String rmsg_seq;
	public String rmsg_pers_nm;
	public String answer_cont;
	public String add_file_nm;
	public String answer_dt;
	public String team_nm;
	public String part_nm;

	public CO_JOB_1025_LCURLISTRecord(){}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCntc_seq(String cntc_seq){
		this.cntc_seq = cntc_seq;
	}

	public void setRmsg_seq(String rmsg_seq){
		this.rmsg_seq = rmsg_seq;
	}

	public void setRmsg_pers_nm(String rmsg_pers_nm){
		this.rmsg_pers_nm = rmsg_pers_nm;
	}

	public void setAnswer_cont(String answer_cont){
		this.answer_cont = answer_cont;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAnswer_dt(String answer_dt){
		this.answer_dt = answer_dt;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCntc_seq(){
		return this.cntc_seq;
	}

	public String getRmsg_seq(){
		return this.rmsg_seq;
	}

	public String getRmsg_pers_nm(){
		return this.rmsg_pers_nm;
	}

	public String getAnswer_cont(){
		return this.answer_cont;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getAnswer_dt(){
		return this.answer_dt;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}
}

/* 작성시간 : Fri May 22 11:36:12 KST 2009 */