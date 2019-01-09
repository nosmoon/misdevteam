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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_grp_nm;
	public String ratio_10;
	public String ratio_20;
	public String ratio_30;
	public String ratio_40;
	public String ratio_50;
	public String ratio_60;
	public String ratio_tot;
	public String asst_point;
	public String asst_clsf;
	public String spcl_plus_point;
	public String spcl_minus_point;
	public String db_status;
	public String evlu_grp_cd;

	public HD_EVLU_1401_LCURLISTRecord(){}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setRatio_10(String ratio_10){
		this.ratio_10 = ratio_10;
	}

	public void setRatio_20(String ratio_20){
		this.ratio_20 = ratio_20;
	}

	public void setRatio_30(String ratio_30){
		this.ratio_30 = ratio_30;
	}

	public void setRatio_40(String ratio_40){
		this.ratio_40 = ratio_40;
	}

	public void setRatio_50(String ratio_50){
		this.ratio_50 = ratio_50;
	}

	public void setRatio_60(String ratio_60){
		this.ratio_60 = ratio_60;
	}

	public void setRatio_tot(String ratio_tot){
		this.ratio_tot = ratio_tot;
	}

	public void setAsst_point(String asst_point){
		this.asst_point = asst_point;
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

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getRatio_10(){
		return this.ratio_10;
	}

	public String getRatio_20(){
		return this.ratio_20;
	}

	public String getRatio_30(){
		return this.ratio_30;
	}

	public String getRatio_40(){
		return this.ratio_40;
	}

	public String getRatio_50(){
		return this.ratio_50;
	}

	public String getRatio_60(){
		return this.ratio_60;
	}

	public String getRatio_tot(){
		return this.ratio_tot;
	}

	public String getAsst_point(){
		return this.asst_point;
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

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}
}

/* 작성시간 : Tue Jun 19 16:27:12 KST 2018 */