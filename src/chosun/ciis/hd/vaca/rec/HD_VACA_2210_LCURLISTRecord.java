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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String year_vaca_dds_sum;
	public String add_vaca_dds_sum;
	public String occr_vaca_dds_sum;
	public String use_vaca_dds_sum;
	public String vaca_rmn_dds_sum;
	public String yymm_alon_sum;

	public HD_VACA_2210_LCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setYear_vaca_dds_sum(String year_vaca_dds_sum){
		this.year_vaca_dds_sum = year_vaca_dds_sum;
	}

	public void setAdd_vaca_dds_sum(String add_vaca_dds_sum){
		this.add_vaca_dds_sum = add_vaca_dds_sum;
	}

	public void setOccr_vaca_dds_sum(String occr_vaca_dds_sum){
		this.occr_vaca_dds_sum = occr_vaca_dds_sum;
	}

	public void setUse_vaca_dds_sum(String use_vaca_dds_sum){
		this.use_vaca_dds_sum = use_vaca_dds_sum;
	}

	public void setVaca_rmn_dds_sum(String vaca_rmn_dds_sum){
		this.vaca_rmn_dds_sum = vaca_rmn_dds_sum;
	}

	public void setYymm_alon_sum(String yymm_alon_sum){
		this.yymm_alon_sum = yymm_alon_sum;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getYear_vaca_dds_sum(){
		return this.year_vaca_dds_sum;
	}

	public String getAdd_vaca_dds_sum(){
		return this.add_vaca_dds_sum;
	}

	public String getOccr_vaca_dds_sum(){
		return this.occr_vaca_dds_sum;
	}

	public String getUse_vaca_dds_sum(){
		return this.use_vaca_dds_sum;
	}

	public String getVaca_rmn_dds_sum(){
		return this.vaca_rmn_dds_sum;
	}

	public String getYymm_alon_sum(){
		return this.yymm_alon_sum;
	}
}

/* 작성시간 : Mon May 04 15:46:20 KST 2009 */