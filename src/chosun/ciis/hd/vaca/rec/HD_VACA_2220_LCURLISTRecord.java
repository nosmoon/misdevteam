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


public class HD_VACA_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String in_cmpy_dt;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String year_vaca_dds_sum;
	public String add_vaca_dds_sum;
	public String occr_vaca_dds_sum;
	public String use_vaca_dds_sum;
	public String base_saly_sum;
	public String posk_saly_sum;
	public String mm_ordy_wag_sum;
	public String dd_basi_wag_sum;
	public String vaca_rmn_dds_sum;
	public String yymm_alon_sum;

	public HD_VACA_2220_LCURLISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
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

	public void setBase_saly_sum(String base_saly_sum){
		this.base_saly_sum = base_saly_sum;
	}

	public void setPosk_saly_sum(String posk_saly_sum){
		this.posk_saly_sum = posk_saly_sum;
	}

	public void setMm_ordy_wag_sum(String mm_ordy_wag_sum){
		this.mm_ordy_wag_sum = mm_ordy_wag_sum;
	}

	public void setDd_basi_wag_sum(String dd_basi_wag_sum){
		this.dd_basi_wag_sum = dd_basi_wag_sum;
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

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
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

	public String getBase_saly_sum(){
		return this.base_saly_sum;
	}

	public String getPosk_saly_sum(){
		return this.posk_saly_sum;
	}

	public String getMm_ordy_wag_sum(){
		return this.mm_ordy_wag_sum;
	}

	public String getDd_basi_wag_sum(){
		return this.dd_basi_wag_sum;
	}

	public String getVaca_rmn_dds_sum(){
		return this.vaca_rmn_dds_sum;
	}

	public String getYymm_alon_sum(){
		return this.yymm_alon_sum;
	}
}

/* 작성시간 : Thu Jul 02 21:38:04 KST 2009 */