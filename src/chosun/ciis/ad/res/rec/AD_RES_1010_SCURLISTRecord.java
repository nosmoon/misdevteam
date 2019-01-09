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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1010_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String issu_dt;
	public String sect_clas_cd;
	public String sect_nm_cd;
	public String sect_cd;
	public String edt_clsf;
	public String bgn_side;
	public String end_side;
	public String issu_size;
	public String issu_cnt;
	public String tabl_clsf;

	public AD_RES_1010_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSect_clas_cd(String sect_clas_cd){
		this.sect_clas_cd = sect_clas_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setBgn_side(String bgn_side){
		this.bgn_side = bgn_side;
	}

	public void setEnd_side(String end_side){
		this.end_side = end_side;
	}

	public void setIssu_size(String issu_size){
		this.issu_size = issu_size;
	}

	public void setIssu_cnt(String issu_cnt){
		this.issu_cnt = issu_cnt;
	}

	public void setTabl_clsf(String tabl_clsf){
		this.tabl_clsf = tabl_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSect_clas_cd(){
		return this.sect_clas_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getBgn_side(){
		return this.bgn_side;
	}

	public String getEnd_side(){
		return this.end_side;
	}

	public String getIssu_size(){
		return this.issu_size;
	}

	public String getIssu_cnt(){
		return this.issu_cnt;
	}

	public String getTabl_clsf(){
		return this.tabl_clsf;
	}
}

/* 작성시간 : Fri Jul 28 18:11:10 KST 2017 */