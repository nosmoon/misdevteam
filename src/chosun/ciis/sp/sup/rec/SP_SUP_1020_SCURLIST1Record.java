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


public class SP_SUP_1020_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String step;
	public String cd;
	public String cdnm;
	public String up_cd;
	public String sort;
	public String job_clas;

	public SP_SUP_1020_SCURLIST1Record(){}

	public void setStep(String step){
		this.step = step;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setUp_cd(String up_cd){
		this.up_cd = up_cd;
	}

	public void setSort(String sort){
		this.sort = sort;
	}

	public void setJob_clas(String job_clas){
		this.job_clas = job_clas;
	}

	public String getStep(){
		return this.step;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getUp_cd(){
		return this.up_cd;
	}

	public String getSort(){
		return this.sort;
	}

	public String getJob_clas(){
		return this.job_clas;
	}
}

/* 작성시간 : Wed Jul 18 21:43:01 KST 2012 */