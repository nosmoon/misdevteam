/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp_cd;
	public String evlu_grp_nm;
	public String asst_clsf;
	public String spcl_plus_point;
	public String spcl_minus_point;
	public String db_status;
	public String evlu_lcls_grp_cd;
	public String evlu_grp_cd_2tms;

	public HD_EVLU_1201_LCURLISTRecord(){}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setAsst_clsf(String asst_clsf){
		this.asst_clsf = asst_clsf;
	}

	public void setSpcl_plus_point(String spcl_plus_point){
		this.spcl_plus_point = spcl_plus_point;
	}

	public void setSpcl_minus_point(String spcl_minus_point){
		this.spcl_minus_point = spcl_minus_point;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public void setEvlu_lcls_grp_cd(String evlu_lcls_grp_cd){
		this.evlu_lcls_grp_cd = evlu_lcls_grp_cd;
	}

	public void setEvlu_grp_cd_2tms(String evlu_grp_cd_2tms){
		this.evlu_grp_cd_2tms = evlu_grp_cd_2tms;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getAsst_clsf(){
		return this.asst_clsf;
	}

	public String getSpcl_plus_point(){
		return this.spcl_plus_point;
	}

	public String getSpcl_minus_point(){
		return this.spcl_minus_point;
	}

	public String getDb_status(){
		return this.db_status;
	}

	public String getEvlu_lcls_grp_cd(){
		return this.evlu_lcls_grp_cd;
	}

	public String getEvlu_grp_cd_2tms(){
		return this.evlu_grp_cd_2tms;
	}
}

/* 작성시간 : Thu Oct 15 21:24:52 KST 2009 */