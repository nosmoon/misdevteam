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


public class HD_VACA_1611_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String rptv_posi_cd;
	public String rptv_posi_nm;
	public String year_add_vaca;
	public String use_vaca_dds;
	public String rmn_vaca_dds;
	public String alvc_vaca_cnt;
	public String duty_vaca_dds;
	public String rotate_duty_yn;

	public HD_VACA_1611_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setRptv_posi_nm(String rptv_posi_nm){
		this.rptv_posi_nm = rptv_posi_nm;
	}

	public void setYear_add_vaca(String year_add_vaca){
		this.year_add_vaca = year_add_vaca;
	}

	public void setUse_vaca_dds(String use_vaca_dds){
		this.use_vaca_dds = use_vaca_dds;
	}

	public void setRmn_vaca_dds(String rmn_vaca_dds){
		this.rmn_vaca_dds = rmn_vaca_dds;
	}

	public void setAlvc_vaca_cnt(String alvc_vaca_cnt){
		this.alvc_vaca_cnt = alvc_vaca_cnt;
	}

	public void setDuty_vaca_dds(String duty_vaca_dds){
		this.duty_vaca_dds = duty_vaca_dds;
	}

	public void setRotate_duty_yn(String rotate_duty_yn){
		this.rotate_duty_yn = rotate_duty_yn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getRptv_posi_nm(){
		return this.rptv_posi_nm;
	}

	public String getYear_add_vaca(){
		return this.year_add_vaca;
	}

	public String getUse_vaca_dds(){
		return this.use_vaca_dds;
	}

	public String getRmn_vaca_dds(){
		return this.rmn_vaca_dds;
	}

	public String getAlvc_vaca_cnt(){
		return this.alvc_vaca_cnt;
	}

	public String getDuty_vaca_dds(){
		return this.duty_vaca_dds;
	}

	public String getRotate_duty_yn(){
		return this.rotate_duty_yn;
	}
}

/* 작성시간 : Wed Oct 24 10:55:13 KST 2018 */