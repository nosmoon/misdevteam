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


package chosun.ciis.hd.prsn.rec;

import java.sql.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.ds.*;

/**
 * 
 */


public class HD_PRSN_2006_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String annc_clsf;
	public String pgm_id;
	public String pgm_url;
	public String job_clsf_nm;
	public String job_clsf;
	public String pgm_nm;
	public String pgm_id_tm;

	public HD_PRSN_2006_LCURLISTRecord(){}

	public void setAnnc_clsf(String annc_clsf){
		this.annc_clsf = annc_clsf;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_url(String pgm_url){
		this.pgm_url = pgm_url;
	}

	public void setJob_clsf_nm(String job_clsf_nm){
		this.job_clsf_nm = job_clsf_nm;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_id_tm(String pgm_id_tm){
		this.pgm_id_tm = pgm_id_tm;
	}

	public String getAnnc_clsf(){
		return this.annc_clsf;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_url(){
		return this.pgm_url;
	}

	public String getJob_clsf_nm(){
		return this.job_clsf_nm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_id_tm(){
		return this.pgm_id_tm;
	}
}

/* 작성시간 : Tue Apr 14 11:20:53 KST 2009 */