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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clas;
	public String job_clas_nm;
	public String tot_cnt;
	public String cnt;

	public SP_SUP_1120_LCURLISTRecord(){}

	public void setJob_clas(String job_clas){
		this.job_clas = job_clas;
	}

	public void setJob_clas_nm(String job_clas_nm){
		this.job_clas_nm = job_clas_nm;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getJob_clas(){
		return this.job_clas;
	}

	public String getJob_clas_nm(){
		return this.job_clas_nm;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* 작성시간 : Thu Jul 05 14:09:56 KST 2012 */