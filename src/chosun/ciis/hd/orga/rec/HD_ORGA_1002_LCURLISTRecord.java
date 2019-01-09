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


package chosun.ciis.hd.orga.rec;

import java.sql.*;
import chosun.ciis.hd.orga.dm.*;
import chosun.ciis.hd.orga.ds.*;

/**
 * 
 */


public class HD_ORGA_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String engl_nm;
	public String insd_dept_cd;
	public String abrv_nm;
	public String use_bgn_dt;
	public String use_end_dt;
	public String natn_cd;
	public String natn_nm;
	public String duty_area;
	public String duty_area_nm;
	public String now_use_yn;
	public String cost_dept_clsf;
	public String make_dept_clsf;
	public String offi_nm;
	public String dept_team_nm;
	public String part_nm;
	public String part_dn_nm;
	public String inhr_seq_1;
	public String inhr_seq_2;
	public String inhr_seq_3;
	public String supr_dept_cd;
	public String srt_seq_1;
	public String srt_seq_2;
	public String cost_dstb_cd;
	public String cost_dstb_cd_1;
	public String cost_dstb_cd_2;
	public String cost_part_cd;
	public String prt_plac_clsf;
	public String dept_team_clsf;
	public String medi_cd;
	public String medi_cd_nm;

	public HD_ORGA_1002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEngl_nm(String engl_nm){
		this.engl_nm = engl_nm;
	}

	public void setInsd_dept_cd(String insd_dept_cd){
		this.insd_dept_cd = insd_dept_cd;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setUse_bgn_dt(String use_bgn_dt){
		this.use_bgn_dt = use_bgn_dt;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public void setDuty_area_nm(String duty_area_nm){
		this.duty_area_nm = duty_area_nm;
	}

	public void setNow_use_yn(String now_use_yn){
		this.now_use_yn = now_use_yn;
	}

	public void setCost_dept_clsf(String cost_dept_clsf){
		this.cost_dept_clsf = cost_dept_clsf;
	}

	public void setMake_dept_clsf(String make_dept_clsf){
		this.make_dept_clsf = make_dept_clsf;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDept_team_nm(String dept_team_nm){
		this.dept_team_nm = dept_team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_dn_nm(String part_dn_nm){
		this.part_dn_nm = part_dn_nm;
	}

	public void setInhr_seq_1(String inhr_seq_1){
		this.inhr_seq_1 = inhr_seq_1;
	}

	public void setInhr_seq_2(String inhr_seq_2){
		this.inhr_seq_2 = inhr_seq_2;
	}

	public void setInhr_seq_3(String inhr_seq_3){
		this.inhr_seq_3 = inhr_seq_3;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setSrt_seq_1(String srt_seq_1){
		this.srt_seq_1 = srt_seq_1;
	}

	public void setSrt_seq_2(String srt_seq_2){
		this.srt_seq_2 = srt_seq_2;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setCost_dstb_cd_1(String cost_dstb_cd_1){
		this.cost_dstb_cd_1 = cost_dstb_cd_1;
	}

	public void setCost_dstb_cd_2(String cost_dstb_cd_2){
		this.cost_dstb_cd_2 = cost_dstb_cd_2;
	}

	public void setCost_part_cd(String cost_part_cd){
		this.cost_part_cd = cost_part_cd;
	}

	public void setPrt_plac_clsf(String prt_plac_clsf){
		this.prt_plac_clsf = prt_plac_clsf;
	}

	public void setDept_team_clsf(String dept_team_clsf){
		this.dept_team_clsf = dept_team_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEngl_nm(){
		return this.engl_nm;
	}

	public String getInsd_dept_cd(){
		return this.insd_dept_cd;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getUse_bgn_dt(){
		return this.use_bgn_dt;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getDuty_area_nm(){
		return this.duty_area_nm;
	}

	public String getNow_use_yn(){
		return this.now_use_yn;
	}

	public String getCost_dept_clsf(){
		return this.cost_dept_clsf;
	}

	public String getMake_dept_clsf(){
		return this.make_dept_clsf;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDept_team_nm(){
		return this.dept_team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getPart_dn_nm(){
		return this.part_dn_nm;
	}

	public String getInhr_seq_1(){
		return this.inhr_seq_1;
	}

	public String getInhr_seq_2(){
		return this.inhr_seq_2;
	}

	public String getInhr_seq_3(){
		return this.inhr_seq_3;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSrt_seq_1(){
		return this.srt_seq_1;
	}

	public String getSrt_seq_2(){
		return this.srt_seq_2;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getCost_dstb_cd_1(){
		return this.cost_dstb_cd_1;
	}

	public String getCost_dstb_cd_2(){
		return this.cost_dstb_cd_2;
	}

	public String getCost_part_cd(){
		return this.cost_part_cd;
	}

	public String getPrt_plac_clsf(){
		return this.prt_plac_clsf;
	}

	public String getDept_team_clsf(){
		return this.dept_team_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}
}

/* 작성시간 : Mon Oct 20 16:56:55 KST 2014 */