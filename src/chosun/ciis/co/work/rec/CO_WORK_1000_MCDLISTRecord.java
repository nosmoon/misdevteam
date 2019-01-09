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


package chosun.ciis.co.work.rec;

import java.sql.*;
import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.ds.*;

/**
 * 
 */


public class CO_WORK_1000_MCDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clsf;
	public String cd_clsf;
	public String cd;
	public String cd_nm;

	public CO_WORK_1000_MCDLISTRecord(){}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}
}

/* 작성시간 : Thu Jun 04 17:51:11 KST 2009 */