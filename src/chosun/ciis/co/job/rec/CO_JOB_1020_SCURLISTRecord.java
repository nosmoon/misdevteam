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


public class CO_JOB_1020_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_cd;
	public String team_nm;
	public String part_cd;
	public String part_nm;
	public String rmsg_pers;
	public String rmsg_pers_nm;
	public String ptph_no;

	public CO_JOB_1020_SCURLISTRecord(){}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setRmsg_pers(String rmsg_pers){
		this.rmsg_pers = rmsg_pers;
	}

	public void setRmsg_pers_nm(String rmsg_pers_nm){
		this.rmsg_pers_nm = rmsg_pers_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getRmsg_pers(){
		return this.rmsg_pers;
	}

	public String getRmsg_pers_nm(){
		return this.rmsg_pers_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}
}

/* 작성시간 : Mon May 11 11:47:53 KST 2009 */