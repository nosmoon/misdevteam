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


public class CO_WORK_1000_MCDCLSFLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clsf;
	public String cd_clsf;
	public String cd_clsf_nm;

	public CO_WORK_1000_MCDCLSFLISTRecord(){}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd_clsf_nm(String cd_clsf_nm){
		this.cd_clsf_nm = cd_clsf_nm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd_clsf_nm(){
		return this.cd_clsf_nm;
	}
}

/* 작성시간 : Thu Jun 04 17:51:12 KST 2009 */