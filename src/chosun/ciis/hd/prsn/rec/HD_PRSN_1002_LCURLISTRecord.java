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


public class HD_PRSN_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pgm_id;
	public String pgm_nm;
	public String pgm_url;
	public String job_clsf;
	public String annc_link_clsf;

	public HD_PRSN_1002_LCURLISTRecord(){}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_url(String pgm_url){
		this.pgm_url = pgm_url;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAnnc_link_clsf(String annc_link_clsf){
		this.annc_link_clsf = annc_link_clsf;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_url(){
		return this.pgm_url;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAnnc_link_clsf(){
		return this.annc_link_clsf;
	}
}

/* 작성시간 : Sun Apr 12 13:03:06 KST 2009 */